package exemple_4;

import org.testng.annotations.Test;

public class sauter_des_tests {

	/*
	 * Souvent, nous devons simplement sauter une méthode de cas de test et
	 * effectuer des tests. Il saute, et nous le transmettons via le paramètre «
	 * enabled ».
	 */

	@Test(priority = 0)
	public void CloseBrowser() {
		 
		System.out.println("pour fermer le navigateur ");
	}

	@Test(priority = -1)
	public void OpenBrowser() {
		System.out.println("pour ouvrir le navigateur");
		 
	}

	@Test(enabled = false)
	public void AccountTest() {
		System.out.println("Quelques tests pour le compte client");
	}
}
