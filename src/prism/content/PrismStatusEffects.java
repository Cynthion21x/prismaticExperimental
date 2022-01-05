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

  public static StatusEffect crippled;

  @Override
  public void load() {

    crippled = new StatusEffect("crippled") {
      {
        damage = 5f;
        speedMultiplier = 0.5f;
        buildSpeedMultiplier = 0f;
        healthMultiplier = 0.8f;

        // Color = PrismColours.hotPink;
        color = Color.valueOf("#FF33CC");
      }
    };

  }
}
