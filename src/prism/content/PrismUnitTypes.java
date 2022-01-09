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

  // Units
  public static @EntityDef(value = {Unitc.class, Legsc.class}, legacy = true) UnitType seigeengine;

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
