package prism;

// Arc Package
import arc.*;
import arc.util.*;
// Mindustry Package
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
// Vanilla Upgraded Package
import prism.content.*;

public class Prismatic extends Mod{


      public Prismatic(){}

      @Override
      public void loadContent(){
          new PrismStatusEffects().load();
          new PrismItems().load();
          new PrismBlocks().load();

      }



}
