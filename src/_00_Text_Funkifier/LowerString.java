package _00_Text_Funkifier;

public class LowerString extends SpecialString {
	public LowerString(String s) {
		super(s);

	}

	@Override
	public String funkifyText(String s) {
String sRet= "";
for (int i = 0; i < s.length(); i++) {
	char c= s.charAt(i);
	if(i%1==0) {
		sRet+= Character.toLowerCase(c);
	}
}
		return sRet;
	}

}
