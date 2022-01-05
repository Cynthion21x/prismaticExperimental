package prism;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class Prismatic extends Mod{

  public Prismatic(){

      Log.info("Loaded Prismatic constructor.");


      Events.on(ClientLoadEvent.class, e -> {

          //change Log

          Time.runTask(10f, () -> {
              BaseDialog dialog = new BaseDialog("Change Log");

              dialog.cont.add("- Port from Hjosn to Java").row();

              dialog.cont.button("Confirm", dialog::hide).size(100f, 50f);
              dialog.show();
          });
      });
  }

  private static final ContentList[] PrismaticContent = {
    new PrismStatusEffects(),
    new PrismColours()
  };

  @Override
  public void loadContent(){
      Log.info("Loading content..");

      //load
      for(ContentList list : PrismaticContent) {

        list.load();

      }

      Log.info("Content Loaded!");
  }

}
