package salud.isa.gsonMedDB;

import java.io.IOException;

import com.google.gson.stream.JsonReader;

public abstract class Cadena {

	protected Cadena next;
	protected String respuesta;
	
	public void setSucessor(Cadena s) {
		next=s;
	}
	
	abstract public String analisis( String name, JsonReader reader) throws IOException;

	

	
}
