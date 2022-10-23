package exemple_3;

import org.testng.annotations.Test;

public class testNG_Annotations {

	@Test(priority = 0)
	public void CloseBrowser() {
		 
		System.out.println("pour fermer le navigateur ");
	}

	@Test(priority = -1)
	public void OpenBrowser() {
		System.out.println("pour ouvrir le navigateur");
		 
	}

	@Test
	public void AccountTest() {
		System.out.println("Quelques tests pour le compte client");
	}
	
	/*
	 * Notez que la méthode AccountTest s’est exécutée avant CloseBrowser même sans avoir de priorité, car les
	 *  deux ensembles de priorité = 0 et, par conséquent, ils s’exécutent par ordre alphabétique.
	 */

}
