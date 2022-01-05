package prism;


import arc.graphics.*;
import arc.math.*;
import arc.struct.*;
import mindustry.*;
import mindustry.ctype.*;
import mindustry.entities.*;
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
import mindustry.world.blocks.legacy.*;
import mindustry.liquid.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

import static mindustry.type.ItemStack.*;


public class prismBlocks implements ContentList{
  public static Block
  //Crafting
  Dcompressor;


@Override
public void load(){

  //region crafting

    Dcompressor = new GenericCrafter("d-compressor"){{
    requirements(Category.crafting, with(
      Items.lead, 120,
      Items.titanium, 100,
      Items.copper, 60,
      Items.silicon, 40
    ));

    craftEffect = Fx.fuelburn;
    outputItem = new ItemStack(Items.diron, 1);
    craftTime  = 60f;
    size = 2;
    hasPower = hasItems = hasLiquids = true;
    itemCapacity = 10;


    consumes.liquid(Liquids.dwave, 0.2f);
    consumes.power(3f);
    consumes.item(Items.titanium, 2);
  }};

  }
}
