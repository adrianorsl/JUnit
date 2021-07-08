import Class.ScriptDB;
import Enum.Tipos;

public class Main {

	public static void main(String[] args) {
				
				// autoIngrement e notNull 1 true 0 false;
				ScriptDB scpt = new ScriptDB();
				scpt.setNome("codigo");
				scpt.setTipo(Tipos.INT);
				
				
				
				System.out.println(scpt.CriarScript(scpt.getNome(), scpt.getTipo(), 1, 1));
	}

}
