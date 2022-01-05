package prism;


import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.type.*;


public class prismLiquids implements ContentList{
  public static Liquid
  //Resource
  dwave;
  @Override
  public void load(){

      dwave = new Item("d-wave", Color.valueOf("ff33cc")){{
      temperature: 1f;
      viscosity: 0.4f;
      heatCapacity: 1.4f;
      alwaysUnlocked = true;

    }};

  }

}
