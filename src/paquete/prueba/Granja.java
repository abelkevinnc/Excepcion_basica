package paquete.prueba;

import java.util.ArrayList;
import java.util.List;

import paquete.prueba.excepciones.ProgramException;

public class Granja {
	public List<Animal> animales;
	
	public Granja() {
		this.animales = new ArrayList<>();
	}

	public List<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(List<Animal> animales) {
		this.animales = animales;
	}
	
	public void addAnimales(Animal a) throws ProgramException{
		if (a == null)
	        throw new ProgramException("excepcion por animal null");
	    else
	    	this.animales.add(a);
	}
	
	public Animal verAnimal(int index) throws Exception {
	   /* if (index < 0 || index >= this.animales.size())
	        throw new IllegalArgumentException("Indice fuera de los límites");
	    return animales.get(index);*/
		
		if (index < 0 || index >= this.animales.size()) {
	        throw new Exception("excepcion por indice negativo");
	    } else {
	        return animales.get(index);
	    }
	    
	    
	}
	
}
