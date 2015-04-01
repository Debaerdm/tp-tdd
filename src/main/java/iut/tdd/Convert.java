package iut.tdd;

public class Convert {
	public static String num2text(String input) {
		String[] text = new String[]{"zéro"};
		String[] num = new String[]{"0"};
		
		for (int i = 0; i < num.length; i++) {
			if (num[i].equals(input)) {
				return text[i];
			}
		}
		return null;
	}
	public static String text2num(String input) {
		return null;
	}
}