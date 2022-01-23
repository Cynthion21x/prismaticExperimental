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

    charge = new StatusEffect("charge") {{

        //disarm = true;
        speedMultiplier = 0.0f;
        healthMultiplier = 2f;
        buildSpeedMultiplier = 0f;

        transitionDamage = 90f;

        color = Color.valueOf("#BA03fC");
    }};

    shatter = new StatusEffect("shatter") {{

        //disarm = true;
        show = true;

        reloadMultiplier = 0.2f;
        buildSpeedMultiplier = 1f;
        damageMultiplier = 0.8f;

        transitionDamage = 146f;

        color = Color.valueOf("#A1FFFF");
    }};


    crippled = new StatusEffect("crippled") {{
        damage = 5f;
        speedMultiplier = 0.5f;
        buildSpeedMultiplier = 0.5f;
        healthMultiplier = 0.8f;

        // Color = PrismColours.hotPink;
        color = Color.valueOf("#FF33CC");

        init(() -> {

          affinity(StatusEffects.blasted, (unit, result, time) -> {
              unit.damagePierce(transitionDamage);
              result.set(shatter, time + result.time);
          });

      });

    }};

    sink = new StatusEffect("sink") {{
        show = true;

        reloadMultiplier = 0.5f;
        speedMultiplier = 0.3f;
        buildSpeedMultiplier = 0f;
        healthMultiplier = 0.5f;

        color = Color.valueOf("#120054");
    }};

  }
}
