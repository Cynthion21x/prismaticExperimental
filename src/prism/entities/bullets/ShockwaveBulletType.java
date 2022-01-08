package prism.entities.bullets;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.util.*;
import prism.content.*;
import mindustry.content.*;
import mindustry.entities.bullet.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;

import static arc.Core.atlas;

public class ShockwaveBulletType extends BulletType {

  public Color fromColor = Pal.accent, toColor = Pal.remove;
  public String sprite = "prism-soundwave";
  public TextureRegion region;

  public ShockwaveBulletType(float speed, float damage, StatusEffect status){

    this.speed = speed;
    this.damage = damage;
    this.status = status;

    pierce = pierceBuilding = true;

    absorbable = false;
    hittable = false;
    collidesTiles = false;
    lifetime = 120f;
    hitSize = 15f;
    lightRadius = 0f;
    lightColor = hitColor;
    buildingDamageMultiplier = 0f;

    shootEffect = smokeEffect = despawnEffect = Fx.none;

  }

  @Override
  public void load(){
      super.load();
      region = atlas.find(sprite);
  }

  @Override
  public void update(Bullet b){

  }

  @Override
  public void draw(Bullet b){
      super.draw(b);

      float growx = 0.5f;

      float xscale = (1f - growx + b.fslope() * (growx)), yscale = (1f + growx + b.fslope() * (growx)), rot = b.rotation();

      Draw.color(fromColor, toColor, Mathf.absin(7f, 1f));

      Draw.rect(region, b.x, b.y, region.width * xscale * 2, region.height / 4f * 2, -90f + b.rotation());
      Draw.reset();
  }

}
