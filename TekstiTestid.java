import org.junit.*;
import static org.junit.Assert.*;
public class TekstiTestid{
	TekstiUurija t;
	@Test
	public void pikkus(){
		assertEquals(7, t.t2htedeArv("telefon"));
	}
}