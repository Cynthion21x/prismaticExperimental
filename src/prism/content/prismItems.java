package prism;


import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.type.*;


public class prismItems implements ContentList{
  public static Item
  //Resource
  diron;
  @Override
  public void load(){

    diron = new Item("d-iron", Color.valueOf("c42b9e")){{
      explosiveness = 1.3f;
      radioactivity = 1f;
      flammability = 0.4f;
      alwaysUnlocked = true;

    }};

  }

}
