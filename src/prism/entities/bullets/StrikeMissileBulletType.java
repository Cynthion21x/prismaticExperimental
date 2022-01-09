package prism.entities.bullets;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.util.*;
import prism.content.PrismFX;
import prism.content.*;
import mindustry.content.*;
import mindustry.entities.bullet.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;

import static arc.Core.atlas;

public class StrikeMissileBulletType extends BulletType {

    public StrikeMissileBulletType(float speed, float damage, StatusEffect status){

      this.speed = speed;
      this.damage = damage;
      this.status = status;

      pierce = pierceBuilding = false;

      absorbable = true;
      hittable = true;
      collidesTiles = false;
      lifetime = 120f;
      hitSize = 15f;
      lightRadius = 5f;

      lightColor = hitColor;

      buildingDamageMultiplier = 0f;

      shootEffect = smokeEffect = PrismFX.none;
      despawnEffect = PrismFX.missileStrike;

    }

}
