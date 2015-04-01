package iut.tdd;

public class Convert {
	public static String num2text(String input) {
		String[] text = new String[]{"zéro","un","deux","trois","quatre","cinq","six","sept","huit","neuf"};
		String[] num = new String[]{"0","1","2","3","4","5","6","7","8","9"};
		
		for (int i = 0; i < text.length; i++) {
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