package Class;

import Enum.Tipos;
import junit.framework.TestCase;

public class JUnitTeste extends TestCase {
	
	ScriptDB scptTeste = new ScriptDB();


	
	public void teste1() {
		assertEquals("'codigo' INT NOT NULL AUTO_INCREMENT,", scptTeste.CriarScript("codigo", Tipos.INT, 1, 1));	
	}
	
	//teste falhou porque o AUTO_INCREMENT de acordo com o método e o primeiro número neste caso ficaria 'codigo' INT AUTO_INCREMENT,
	public void teste2() {
		assertEquals("'codigo' INT NOT NULL,", scptTeste.CriarScript("codigo", Tipos.INT, 1, 0));	
	}
	
	public void teste3() {
		assertEquals("'codigo' INT NOT NULL,", scptTeste.CriarScript("codigo", Tipos.INT, 0, 1));	
	}
	// nome com letras diferentes  
	public void teste4() {
		assertEquals("'letra' CHAR NOT NULL,", scptTeste.CriarScript("Letra", Tipos.CHAR, 0, 1));	
	}
	
}
