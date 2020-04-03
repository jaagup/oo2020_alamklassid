public class Kaivitaja1{
	public static void main(String[] arg) throws Exception{
		TekstiUurija t=(TekstiUurija)Class.forName("TekstiUurijaRobin").newInstance();
		System.out.println(t.loenda("Ahoi", 'i'));
	}
}