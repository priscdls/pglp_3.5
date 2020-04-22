package priscille.pglp_3_5;

import org.junit.Test;

public class UneClasseMetierTest {

	@Test
	public void test() {
		UneClasseMetier ucm = new UneClasseMetier();
		ucm.uneMethodeMetier();
	}
	
	@Test
	public void test2() {
		UneClasseMetier ucm2 = new UneClasseMetier(new UneClasseAffichage());
		ucm2.uneMethodeMetier();
	}

}
