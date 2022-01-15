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

public class SeigeRailBulletType extends LaserBulletType {

    public SeigeRailBulletType(float damage){

      this.damage = damage;

      pierceBuilding = pierce = hittable = reflectable = absorbable = false;

     shootEffect = PrismFX.SeigeCharge;

      lifetime = 9f;

      length = 760f;
      width = 50f;

      lightningDelay = 8f;
      lightningAngleRand = 3f;
      lightningSpacing = 8f;
      largeHit = true;

      lightningDamage = damage * 4;

    }

   @Override
    public void load(){
        super.load();
    }
}
