package prism.content;

import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.type.*;

public class PrismItems implements ContentList{
	public static Liquid dwave;

	@Override
    public void load(){
    	dwave = new Liquid("dwave", Color.valueOf("ff33cc")){{
        temperature = 1f;
        viscosity = 0.4f;
        heatCapacity = 1.4f;


      }};


    }
}
