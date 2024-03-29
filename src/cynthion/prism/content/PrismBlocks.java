package cynthion.prism.content;

import arc.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.struct.*;
import mindustry.content.*;
//import mindustry.ctype.*;
import mindustry.entities.bullet.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.experimental.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
import static mindustry.type.ItemStack.*;

import cynthion.prism.entities.bullets.*;
import cynthion.prism.content.*;
import cynthion.prism.content.PrismUnitTypes.*;
import cynthion.prism.world.*;

public class PrismBlocks /*implements ContentList*/{

  // factorys
  public static Block
   dcompressor, dextractor, dfilter, scrapfilter;

  // Turrets
  public static Block
   vibrocannon;

   //Unit Factorys
   public static Block
    seigefactory;

  public static void load(){

    // factorys

    dcompressor = new GenericCrafter("dcompressor"){{
      requirements(Category.crafting, with(Items.lead, 120, Items.copper, 60, Items.titanium, 100, Items.silicon, 40));

      size = 2;
      hasPower = true;
      hasLiquids = true;
      hasItems = true;
      craftTime = 90;
      craftEffect = Fx.smeltsmoke;
      outputItem = new ItemStack(PrismItems.diron, 1);

      consumes.power(1.8f);
      consumes.liquid(PrismLiquids.dwave, 0.2f);
      consumes.items(with(Items.titanium, 2));


      itemCapacity = 30;
			liquidCapacity = 30;
    }};



    scrapfilter = new GenericCrafter("scrapfilter"){{

        health = 60;
        size = 2;

        requirements(Category.crafting, with(Items.lead, 35, Items.copper, 10));

        hasPower = true;
        hasItems = true;
        craftTime = 3;
        craftEffect = Fx.pulverize;
        outputItem = new ItemStack(Items.scrap, 1);

        drawer = new DrawSpin();

        consumes.power(0.5f);
        consumes.items(with(Items.sand, 4));


        itemCapacity = 10;
      }};


    dextractor = new SolidPump("dextractor"){{
      size = 3;
      pumpAmount = 0.1f;
      requirements(Category.production, ItemStack.with(Items.copper, 200, Items.lead, 70, Items.thorium, 100, Items.titanium, 70));

      result = PrismLiquids.impuredwave;
      liquidCapacity = 20.0F;
      rotateSpeed = 1.4F;
      attribute = Attribute.water;
      consumes.power(3f);
    }};


    dfilter = new LiquidConverter("dfilter"){{
      requirements(Category.crafting, with(Items.lead, 50, Items.copper, 120, Items.thorium, 80, Items.titanium, 60));

      size = 3;
      hasPower = true;
      hasLiquids = true;
      craftTime = 3;
      craftEffect = Fx.purify;

      drawer = new DrawMixer();

      outputLiquid = new LiquidStack(PrismLiquids.dwave, 6f);
      consumes.power(1.8f);
      consumes.liquid(PrismLiquids.impuredwave, 0.1f);


			liquidCapacity = 60;
    }};

    // Turrets
    vibrocannon = new LiquidTurret("vibrocannon"){{

      requirements(Category.turret, with(Items.lead, 150, Items.titanium, 50, Items.thorium, 20, Items.graphite, 60, Items.silicon, 120, PrismItems.diron, 20));

      ammo (
        PrismLiquids.dwave, new ShockwaveBulletType(4.5f, 40f, PrismStatusEffects.crippled) {{
              fromColor = toColor = Color.valueOf("ff33cc");
              lifetime = 70f;
              ammoMultiplier = 1.5f;
              reloadMultiplier = 0.5f;
        }}
      );

      size = 4;

      recoilAmount = 0.5f;
      liquidCapacity = 30f;
      health = 1125;

      reloadTime = 2.5f;

      extinguish = false;

      range = 350f;



    }};

    // Drone factorys
    seigefactory = new UnitFactory("seigefactory"){{

      requirements(Category.units, with(Items.copper, 250, Items.lead, 6790, Items.silicon, 4620, Items.thorium, 2400, Items.plastanium, 1500, Items.phaseFabric, 1200, PrismItems.diron, 1200));

      size = 9;

      plans = Seq.with(
        new UnitPlan(PrismUnitTypes.seigeengine, 60f * 200, with(Items.silicon, 2000, Items.lead, 5700, Items.phaseFabric, 760, PrismItems.diron, 1500, Items.thorium, 780, Items.titanium, 1200))
      );

      consumes.power(20f);
      consumes.liquid(PrismLiquids.dwave, 3f);

    }};


  }


}
