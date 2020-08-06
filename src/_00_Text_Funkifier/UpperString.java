package _00_Text_Funkifier;

public class UpperString extends SpecialString {

	public UpperString(String s) {
		super(s);

	}

	@Override
	public String funkifyText(String s) {
		String sRET = "";

		for (int j = 0; j < s.length(); j++) {
			char c = s.charAt(j);
			if (j % 1 == 0) {
				sRET += Character.toUpperCase(c);
			} 

		}

		return sRET;
	}

}
