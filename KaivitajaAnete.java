public class KaivitajaAnete{
	public static void main(String[] arg) throws Exception{
		if(arg.length==3){
 		  TekstiUurija t=(TekstiUurija)Class.forName(arg[0]).newInstance();
		  System.out.println(t.loenda(arg[1], arg[2].charAt(0)));
		}
	}
}