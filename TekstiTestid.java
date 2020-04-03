import org.junit.*;
import static org.junit.Assert.*;
public class TekstiTestid{
	TekstiUurija t;
	@Test
	public void pikkus(){
		assertEquals(4, t.t2htedeArv("tere"));
	}
}