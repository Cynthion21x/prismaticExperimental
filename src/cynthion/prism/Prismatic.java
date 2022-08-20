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
// Prism Content Package
import cynthion.prism.content.*;

public class Prismatic extends Mod{

      public Prismatic(){}

      @Override
      public void loadContent(){

          new PrismStatusEffects().load();
          new PrismItems().load();
          new PrismLiquids().load();
          new PrismBullets().load();
          new PrismUnitTypes().load();
          new PrismBlocks().load();


      }

}
