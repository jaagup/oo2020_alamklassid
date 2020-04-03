import org.junit.*;
import static org.junit.Assert.*;
public class TekstiTestid{
	TekstiUurija t;
	@Test
	public void pikkus(){
		assertEquals(2, t.t2htedeArv("tere"));
	}
	@Test
	public void loendamine1(){
		assertEquals(2, t.loenda("tere", 'e'));
	}
}