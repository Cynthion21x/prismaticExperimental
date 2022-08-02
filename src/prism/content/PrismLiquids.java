package prism.content;

import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.type.*;

public class PrismLiquids implements ContentList{
	public static Liquid dwave, impuredwave;

	   @Override
    public void load(){
    	dwave = new Liquid("dwave", Color.valueOf("ff33cc")){{
				temperature = 0.4f;
				viscosity = 0.2f;
				heatCapacity = 0.5f;
				explosiveness = 2.5f;
				flammability = 0.9f;

      }};
			impuredwave = new Liquid("impuredwave", Color.valueOf("385947")){{
        temperature = 1f;
        viscosity = 0.8f;
        heatCapacity = 1.4f;


      }};


    }
}
