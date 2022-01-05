package prism;



import arc.graphics.*;
import arc.math.*;
import arc.struct.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.ctype.*;
import mindustry.entities.bullet.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.production.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
import af.world.draw.*;

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
