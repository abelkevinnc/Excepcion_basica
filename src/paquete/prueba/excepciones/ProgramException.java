package paquete.prueba.excepciones;

public class ProgramException extends Exception {
	public ProgramException(String e) {
	    super(e);
	}

	public String getMessage() {
	    return super.getMessage();
	}
}
