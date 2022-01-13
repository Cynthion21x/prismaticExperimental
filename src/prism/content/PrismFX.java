package prism.content;

import arc.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import mindustry.entities.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.Block;

import static arc.graphics.g2d.Draw.rect;
import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.*;
import static arc.math.Angles.*;
import static mindustry.Vars.*;

public class PrismFX{

  public static final Effect missileStrike



  missileStrike = new Effect(40f, 100f, e -> {
      color(Color.valueOf("#FF33CC"));
      stroke(e.fout() * 2f);
      float circleRad = 4f + e.finpow() * 65f;
      Lines.circle(e.x, e.y, circleRad);

      color(Color.valueOf("#FF33CC"));
      for(int i = 0; i < 4; i++){
          Drawf.tri(e.x, e.y, 6f, 100f * e.fout(), i*90);
      }

      color();
      for(int i = 0; i < 4; i++){
          Drawf.tri(e.x, e.y, 3f, 35f * e.fout(), i*90);
      }

      Drawf.light(e.x, e.y, circleRad * 1.6f, Pal.heal, e.fout());
  });

}
