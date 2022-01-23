package prism.content;

import arc.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.core.*;
import mindustry.ctype.ContentList;
import mindustry.entities.*;
import mindustry.entities.units.WeaponMount;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.StatusEffect;
import mindustry.ui.*;
import mindustry.world.meta.*;

import prism.Prismatic;
import prism.content.*;

public class PrismStatusEffects implements ContentList {

  public static StatusEffect shatter, crippled, sink, charge;

  //#ba03fc

  @Override
  public void load() {

    crippled = new StatusEffect("crippled") {{
        damage = 5f;
        speedMultiplier = 0.5f;
        buildSpeedMultiplier = 0.5f;
        healthMultiplier = 0.8f;
        color = Color.valueOf("#FF33CC");

        init(() -> {

          affinity(StatusEffects.blasted, (unit, result, time) -> {
              unit.damagePierce(transitionDamage);
              result.set(shatter, time + result.time);
          });

      });

    }};


    charge = new StatusEffect("charge") {{
        localizedName = "charge";

        damage = 5f;
        speedMultiplier = 0f;
        buildSpeedMultiplier = 0f;
        healthMultiplier = 2f;
        color = Color.valueOf("#BA03FC");

    }};


    shatter = new StatusEffect("shatter") {{

      localizedName = "shatter";
      color = Color.valueOf("#42ECF5");

    }};

  }
}
