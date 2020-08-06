package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String sRET = "";

		for (int j = 0; j < s.length(); j++) {
			char c = s.charAt(j);
			if (j % 2 == 0) {
				sRET += Character.toLowerCase(c);
			} else {
				sRET += Character.toUpperCase(c);
			}

		}

		return sRET;
	}

}
