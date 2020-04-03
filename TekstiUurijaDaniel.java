public class TekstiUurijaDaniel implements TekstiUurija{
	public int t2htedeArv(String s){
		return s.length();
    }
    public int loenda(String s, char c){
        int j = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == c){
                j++;
            }
        }
        return j;
    }
}