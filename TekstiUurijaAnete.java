public class TekstiUurijaAnete implements TekstiUurija{
	public int t2htedeArv(String s){
		return s.length();
	}

	int loendur;
	public int loenda(String s, char c){
		for(int i = 0; i< s.length(); i++){
			if(s.charAt(i) == c){
				loendur++;
			}
		}
		return loendur;
	}
}