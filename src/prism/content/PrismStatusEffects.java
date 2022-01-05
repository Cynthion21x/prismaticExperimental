package prism.content;

import arc.Core;
import arc.graphics.Color;
import arc.graphics.Pixmaps;
import arc.graphics.g2d.Draw;
import arc.graphics.g2d.Lines;
import arc.graphics.g2d.TextureAtlas;
import arc.graphics.g2d.TextureRegion;
import arc.math.Interp;
import arc.math.Mathf;
import mindustry.ctype.ContentList;
import mindustry.entities.Effect;
import mindustry.entities.effect.MultiEffect;
import mindustry.gen.Unit;
import mindustry.graphics.Layer;
import mindustry.graphics.MultiPacker;
import mindustry.graphics.Pal;
import mindustry.type.StatusEffect;

import prism.Prismatic;

public class PrismStatusEffects implements ContentList{

    public static StatusEffect
      crippled;

    @Override public void load(){

      crippled = new PrismStatusEffect("Crippled") {{

        damage = 5f;
        speedMultiplier = 0.5f;
        buildSpeedMultiplier = 0.5f;
        healthMultiplier = 0.8f;

        textureColor = color = PrismColours.hotPink;

      }};

      public class PrismStatusEffect extends StatusEffect {

          public colour textureColour = null;

          public PrismStatusEffect(String name){

              super(name);

          }

          @Override
          public void createIcons(MultiPacker packer) {

            if((fullIcon != null && fullIcon.found() && fullIcon instanceof TextureAtlas.AtlasRegion)){

      				if(textureColor != null){

      					packer.add(MultiPacker.PageType.main, name + "-full", NHPixmap.fillColor(Core.atlas.getPixmap(fullIcon), textureColor).outline(Color.valueOf("404049"), 3));

      				} else {

      					packer.add(MultiPacker.PageType.main, name + "-full", Pixmaps.outline(Core.atlas.getPixmap(fullIcon), Color.valueOf("404049"), 3));
      				}
      			}

          }

      }
    }

}
