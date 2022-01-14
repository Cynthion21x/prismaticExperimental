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

public class StrikeMissileBulletType extends BulletType {

    public String sprite = "prism-missile";
    public TextureRegion region;

    public StrikeMissileBulletType(float speed, float damage, StatusEffect status){

      this.speed = speed;
      this.damage = damage;
      this.status = status;

      pierce = pierceBuilding = false;
      absorbable = hittable = collidesTiles = reflectable = true;

      homingRange = 80f;
      homingDelay = 40f;
      homingPower = 100f;

      hitShake = 0.5f;

      lifetime = 70f;
      hitSize = 15f;
      lightRadius = 5f;

      drawSize = 6f;

      splashDamage = damage * 0.25f;
      splashDamageRadius = 50f;

      //scaleVelocity = true;

      lightColor = hitColor = trailColor = status.color;

      shootEffect = smokeEffect = Fx.none;
      despawnEffect = PrismFX.missileStrike;

      trailEffect = Fx.missileTrail;
      trailLength = 10;

      hitEffect = PrismFX.missileStrike;

    }

   @Override
    public void load(){
        super.load();
        region = atlas.find(sprite);
    }

    /* @Override
    public void draw(Bullet b){
        super.draw(b);

        Draw.rect(region, b.x, b.y, region.width / 6, region.height / 6, -90f + b.rotation());
        Draw.reset();
    } */

}
