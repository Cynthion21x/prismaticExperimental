package prism.content;

import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.type.*;

public class PrismItems implements ContentList{
	public static Item diron;

	@Override
    public void load(){
    	diron = new Item("D-Iron", Color.valueOf("c42b9e")){{
            cost = 2f;
        }};


    }
}
