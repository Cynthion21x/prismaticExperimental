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

      length = 460f;
      width = 43f;

      lifetime = 130f;
      lightningSpacing = 35f;
      lightningLength = 8;
      lightningDelay = 2.3f;
      lightningLengthRand = 15;

      lightningDamage = damage * 3.5f;
      lightningAngleRand = 40f;

      largeHit = true;
      sideAngle = 15f;

      sideWidth = 0f;
      sideLength = 0f;

      lightColor = lightningColor = Color.valueOf("#FF33CC");

      //#f542e9
      colors = new Color[]{Color.valueOf("#F542E9"), Color.valueOf("#FF33CC"), Color.white};

    }

   @Override
    public void load(){
        super.load();
    }
}
