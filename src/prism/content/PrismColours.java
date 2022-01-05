package prism.content;

import arc.graphics.Color;
import arc.graphics.Colors;
import mindustry.graphics.Pal;

public class PrismColors{

	public static Color

		hotPink = Color.valueOf("#ff33cc"),
		impureGreen = Color.valueOf("#385947");

	static{
		Colors.put("heal", Pal.heal);
	}
}
