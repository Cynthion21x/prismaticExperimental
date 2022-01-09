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

      absorbable = true;
      hittable = true;
      collidesTiles = true;
      lifetime = 70f;
      hitSize = 15f;
      lightRadius = 5f;

      lightColor = hitColor;

      shootEffect = smokeEffect = PrismFX.none;
      despawnEffect = PrismFX.missileStrike;

    }

    @Override
    public void load(){
        super.load();
        region = atlas.find(sprite);
    }

    @Override
    public void draw(Bullet b){
        super.draw(b);

        Draw.rect(region, b.x, b.y, region.width / 4, region.height / 4, -90f + b.rotation());
        Draw.reset();
    }

}
