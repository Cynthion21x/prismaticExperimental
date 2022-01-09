package prism.content;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.struct.*;
import mindustry.ai.types.*;
import mindustry.annotations.Annotations.*;
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

import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.*;
import static arc.math.Angles.*;
import static mindustry.Vars.*;

public class PrismUnitTypes implements ContentList{

  // Legs
  public static @EntityDef({Unitc.class, Legsc.class}) UnitType
   seigeengine;

  @Override
  public void load(){

    seigeengine = new UnitType("seigeengine"){{

      hitSize = 42f;
      health = 20000f;
      armor = 4f;

      landShake = 1.5f;
      rotateSpeed = 1.5f;
      drownTimeMultiplier = 10f;

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

      weapons.add(new Weapon("seigeengine-weapon"){{

        shootSound = Sounds.laserblast;
        chargeSound = Sounds.lasercharge;

        top = false;
        mirror = false;

        x = y = 0;
        reload = 600f;
        recoil = 0f;

        cooldownTime = 350f;

        shootStatusDuration = 60f * 2f;
        shootStatus = StatusEffects.unmoving;

        bullet = new LaserBulletType(){{
          length = 460f;
          damage = 560f;
          width = 75f;

          lifetime = 65f;

          lightningSpacing = 35f;
          lightningLength = 5;
          lightningDelay = 1.1f;
          lightningLengthRand = 15;
          lightningDamage = 50;
          lightningAngleRand = 40f;
          largeHit = true;
          lightColor = lightningColor = Pal.heal;

          shootEffect = Fx.greenLaserCharge;

          healPercent = 25f;
          collidesTeam = true;

          sideAngle = 15f;
          sideWidth = 0f;
          sideLength = 0f;
          colors = new Color[]{Pal.heal.cpy().a(0.4f), Pal.heal, Color.white};
        }};
      }});

    }};

  }

}
