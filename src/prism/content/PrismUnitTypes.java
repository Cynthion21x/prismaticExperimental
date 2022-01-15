package prism.content;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.struct.*;
import mindustry.ai.types.*;
import mindustry.ctype.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.ammo.*;
import mindustry.type.weapons.*;
import mindustry.world.meta.*;
import mindustry.content.*;

import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.*;
import static arc.math.Angles.*;
import static mindustry.Vars.*;

import prism.entities.bullets.*;

import static arc.Core.atlas;
import prism.content.*;

public class PrismUnitTypes implements ContentList{

  // Units
  public static UnitType seigeengine;

   @Override
   public void load(){

    seigeengine = new UnitType("seigeengine"){{
      constructor = LegsUnit::create;
      hitSize = 42f;
      health = 21000f;
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

      mechStepParticles = true;

      strafePenalty = 0.15f;

      forceMultiTarget = true;

      ammoType = new PowerAmmoType(8000);

      groundLayer = Layer.legUnit;

      speed = 0.3f;

      drawShields = true;

      weapons.add(

        new Weapon("prism-SalvoCannon"){{
          //name = "Salvo";

          controllable = false;
          autoTarget = true;
          //predictTarget = true;

          shots = 3;
          shotDelay = 5f;

          reload = 70f;
          y = -10f;
          x = -9f;
          rotateSpeed = 25f;
          rotate = true;

          inaccuracy = 13f;

          mirror = true;

          shootSound = Sounds.missile;

          bullet = new StrikeMissileBulletType(4f, 135f, PrismStatusEffects.crippled){{

            buildingDamageMultiplier = 1.5f;

          }};

        }},

        new Weapon("chaoscannon"){{

          shootSound = Sounds.laserblast;

          controllable = true;
          autoTarget = rotate = mirror = top = false;

          x = y = 0;

          reload = 70f;

          inaccuracy = 0f;

          shootStatusDuration = PrismFX.SeigeCharge.lifetime;
          shootStatus = StatusEffects.unmoving;

          firstShotDelay = PrismFX.SeigeCharge.lifetime;

          bullet = new SeigeRailBulletType(400f){{

            buildingDamageMultiplier = 2f;

          }};

        }}

      );
    }};

  }

}
