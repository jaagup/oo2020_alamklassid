public class TekstiUurijaSandra implements TekstiUurija{
	public int t2htedeArv(String s){
		return s.length();
	}
	public int loenda(String sona, char c){
		int charCount = 0;
		for(int i = 0; i < sona.length(); i++){
			if(sona.charAt(i) == c){
				charCount++;
			}
		}
		return charCount;
	}
}