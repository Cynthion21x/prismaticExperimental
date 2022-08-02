package prism.content;

import arc.graphics.*;
import mindustry.type.*;

public class PrismItems{
	public static Item diron;

	@Override
    public static void load(){
    	diron = new Item("diron", Color.valueOf("c42b9e")){{
            cost = 2f;
            explosiveness = 1.3f;
            radioactivity = 1f;
            flammability = 0.4f;
        }};


    }
}
