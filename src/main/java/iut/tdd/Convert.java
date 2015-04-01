package iut.tdd;

import java.util.ArrayList;
import java.util.List;

public class Convert {
	public static String num2text(String input) {
		String[] text_unité = new String[]{"zéro","un","deux","trois","quatre","cinq","six","sept","huit","neuf"};
		String[] text_dix = new String[]{"dix","vinght","trente","quarante","cinquante",
				"soixante", "soixante-dix", "quatre-vinght", "quatre-vinght-dix"};
		String[] text_galere = new String[]{"onze","douze","treize","quatorze","quinze","seize",
				text_dix[0] + " " + text_unité[7],text_dix[0] + " " + text_unité[8],text_dix[0] + " " + text_unité[9]};
		String[] num_Unité = new String[]{"0","1","2","3","4","5","6","7","8","9"};
		
		String[] num_Dix = new String[]{"10","20","30","40","50","60","70","80","90"};
		
		for (int i = 0; i < text_unité.length; i++) {
			if (num_Unité[i].equals(input)) {
				return text_unité[i];
			}
		}
		return null;
	}
	public static String text2num(String input) {
		return null;
	}
}