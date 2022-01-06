package prism.content;

import arc.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.struct.*;
import mindustry.content.*;
import mindustry.ctype.*;
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

public class PrismBlocks implements ContentList{

  public static Block dcompressor, dextractor, dfilter, vibrocannon;

  @Override
  public void load(){

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
      outputLiquid = new LiquidStack(PrismLiquids.dwave, 6f);
      consumes.power(1.8f);
      consumes.liquid(PrismLiquids.impuredwave, 0.1f);


			liquidCapacity = 60;
    }};



    /*vibrocannon = new LiquidTurret("vibrocannon"){{
      requirements(Category.turret, with(Items.lead, 150, Items.titanium, 50, Items.thorium, 20, Items.graphite, 60, Items.silicon, 120, PrismItems.diron, 20));



    }};
    */
  }


}
