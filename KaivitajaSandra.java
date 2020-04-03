public class KaivitajaSandra{
	public static void main(String[] arg) throws Exception{
		if(arg.length==2){
 		  TekstiUurija t=(TekstiUurija)Class.forName(arg[0]).newInstance();
		  System.out.println(t.t2htedeArv(arg[1]));
		}
	}
	//Koostage omanimeline käivitaja (nt. KaivitajaJaagup), kuhu 
	//käsurealt antakse ette soovitud uuriva klassi nimi ning üks sõna
	//Klassi eksemplari töö abiga väljastatakse selle sõna tähtede arv
}