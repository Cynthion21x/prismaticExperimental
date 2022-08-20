package cynthion.prism.content;

import arc.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.util.*;
import mindustry.content.*;
import mindustry.entities.abilities.*;
import mindustry.entities.units.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.meta.*;
import mindustry.ctype.*;

import static mindustry.Vars.*;

import cynthion.prism.content.*;

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

        /*init(() -> {

          affinity(StatusEffects.blasted, (unit, result, time) -> {
              unit.damagePierce(transitionDamage);
              result.set(shatter, time + result.time);
          });

        });*/

    }};


    charge = new StatusEffect("charge") {{
        localizedName = "charge";

        transitionDamage = 20f;

        speedMultiplier = 0f;
        buildSpeedMultiplier = 0f;
        healthMultiplier = 2f;
        
        color = Color.valueOf("#BA03FC");

    }};


    shatter = new StatusEffect("shatter") {{

      healthMultiplier = 0.7f;
      reloadMultiplier = 0.5f;

      localizedName = "shatter";
      color = Color.valueOf("#42ECF5");

    }};

  }
}
