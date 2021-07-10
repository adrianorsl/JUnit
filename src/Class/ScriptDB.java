package Class;

import Enum.Tipos;

public class ScriptDB {

	private String nome;
	private Tipos tipo;
	private int autoIngrement;
	private int notNull;


	
	

	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Tipos getTipo() {
		return tipo;
	}


	public void setTipo(Tipos i) {
		
			this.tipo = i;
	}


	public int getAutoIngrement() {
		return autoIngrement;
	}


	public void setAutoIngrement(int autoIngrement) {
		if ((autoIngrement == 1) || (autoIngrement == 0))
			this.autoIngrement = autoIngrement;
	}


	public int getNotNull() {
		return notNull;
	}


	public void setNotNull(int notNull) {
		if ((notNull == 1) || (notNull == 0))
			this.notNull = notNull;
	}

	// autoIngrement e notNull 1 true 0 false;
	public String CriarScript(String nome, Tipos tipo, int autoIngrement, int notNull) {
		String script = "'" + nome + "'" + " " + tipo;
		if (notNull == 1) {
			 script = script + " NOT NULL";
		}else {

		}
		if (autoIngrement == 1) {
			script = script + " AUTO_INCREMENT";
		}else {
			
		}
		return script + ",";			
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ScriptDB [nome=");
		builder.append(nome);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}
}
