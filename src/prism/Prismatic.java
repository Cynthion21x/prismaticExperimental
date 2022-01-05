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

  private final contentList[] prismContent = {

    new prismBlocks()

  };






    @Override
    public void loadContent(){
        for(contentList : List Prismcontent){
            list.load();

        }



        Log.info("Your gonna burn alright");
    }


}
