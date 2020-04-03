import java.io.*;
public class TekstiUurijaJaagup implements TekstiUurija{
	String fnimi;
	public int t2htedeArv(String s){
		return s.length();
	}
	public int loenda(String s, char c){
		int loendur=0;
		for(char abi: s.toCharArray()){
			if(abi==c){loendur++;}
		}
		return loendur;
	}
	public void loeFailist(String failinimi){
		fnimi=failinimi;
	}
	String kysiTekst(){
	  String v="";
	  try{
		  BufferedReader br=new BufferedReader(new FileReader(fnimi));
		  for(String rida=br.readLine();rida!=null; rida=br.readLine()){
			  v+=rida+" ";
		  }
		  br.close();
	  } catch(Exception ex){ex.printStackTrace();}
      return v;
	}
	public int sonadeArv(){
		return kysiTekst().split(" ").length;
	}
	public int loenda(char c){
		return -1;
	}
}