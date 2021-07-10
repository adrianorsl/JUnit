import Class.ScriptDB;
import Enum.Tipos;

public class Main {

	public static void main(String[] args) {
				
				// autoIngrement e notNull 1 true 0 false;
				ScriptDB scpt = new ScriptDB();
				
				
				System.out.println(scpt.CriarScript("codigo", Tipos.INT, 1, 1));
				
	}

}
