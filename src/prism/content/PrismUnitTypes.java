package prism.content;

import arc.Core;
import arc.graphics.Blending;
import arc.graphics.Color;
import arc.graphics.g2d.Draw;
import arc.graphics.g2d.Fill;
import arc.graphics.g2d.Lines;
import arc.graphics.g2d.TextureRegion;
import arc.math.Angles;
import arc.math.Interp;
import arc.math.Mathf;
import arc.math.Rand;
import arc.math.geom.Vec2;
import arc.struct.ObjectSet;
import arc.struct.Seq;
import arc.util.Time;
import arc.util.Tmp;
import mindustry.ai.types.BuilderAI;
import mindustry.ai.types.MinerAI;
import mindustry.audio.SoundLoop;
import mindustry.content.Fx;
import mindustry.content.StatusEffects;
import mindustry.ctype.ContentList;
import mindustry.entities.Damage;
import mindustry.entities.Effect;
import mindustry.entities.Units;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.MultiEffect;
import mindustry.entities.units.WeaponMount;
import mindustry.game.Team;
import mindustry.gen.*;
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

import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.*;
import static arc.math.Angles.*;
import static mindustry.Vars.*;

public class PrismUnitTypes implements ContentList{

  // Legs
  public static UnitType
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
