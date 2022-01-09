package prism.content;

import arc.graphics.*;
import arc.struct.*;
import mindustry.ai.types.*;
import mindustry.ctype.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.meta.*;
import mindustry.content.*;
import mindustry.graphics.Drawf;
import mindustry.graphics.Layer;
import mindustry.graphics.MultiPacker;
import mindustry.graphics.Pal;
import mindustry.type.UnitType;
import mindustry.type.Weapon;
import mindustry.type.ammo.ItemAmmoType;
import mindustry.type.ammo.PowerAmmoType;
import mindustry.type.weapons.PointDefenseWeapon;
import mindustry.type.weapons.RepairBeamWeapon;
import static mindustry.Vars.*;

public class PrismUnitTypes implements ContentList{

  // Units
  public static UnitType seigeengine;

   @Override
   public void load(){

    seigeengine = new UnitType("seigeengine"){{
      constructor = LegsUnit::create;
      hitSize = 42f;
      health = 20000f;
      armor = 4f;

      landShake = 1.5f;
      rotateSpeed = 1.5f;

      commandLimit = 0;

      legCount = 4;
      legLength = 14f;
      legBaseOffset = 11f;
      legMoveSpace = 1.5f;
      legTrns = 0.58f;
      hovering = true;
      visualElevation = 0.2f;

      ammoType = new PowerAmmoType(8000);

      groundLayer = Layer.legUnit;

      speed = 0.3f;

      drawShields = false;

    }};

  }

}
