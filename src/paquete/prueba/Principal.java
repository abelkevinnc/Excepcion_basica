package paquete.prueba;

import paquete.prueba.excepciones.ProgramException;

public class Principal {
	public static void main(String[] args) {
		Granja g = new Granja();

		Animal a1 = new Animal("felino");
		Animal a2 = new Animal("canino");

		try {
			g.addAnimales(null); //si este cumple con el error solo se muestra el mensaje de esta linea
			g.verAnimal(-1);
		} catch (ProgramException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		try {
//			g.verAnimal(-1);
//		} catch (ProgramException e) {
//			System.out.println(e.getMessage());
//		}

		System.out.println("Yo me ejecuto porque se trata la excepcion");

	}
}
