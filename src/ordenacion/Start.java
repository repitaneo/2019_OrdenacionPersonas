package ordenacion;

import java.util.ArrayList;

import sistemaOrdenacion.OrdenacionPersonas;

public class Start {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Lucas",19,145,65);
		Persona p2 = new Persona("Marta",26,190,45);
		Persona p3 = new Persona("Javier",20,165,55);
		Persona p4 = new Persona("Luisa",36,165,70);
		
		ArrayList<Persona> lista = new ArrayList();
		
		lista.add(p1);
		lista.add(p4);
		lista.add(p2);
		lista.add(p3);
		for(Persona p:lista) {
			
			System.out.println(p);
		}	
		
		OrdenacionPersonas op = new OrdenacionPersonas();
		op.setMetodoOrdenacion(OrdenacionPersonas.ORDENA_ALTURA_ASC);
		op.setMetodoOrdenacionSecundario(OrdenacionPersonas.ORDENA_PESO_DESC);
		lista.sort(op);
		
		System.out.println("\n***************\n");
		for(Persona p:lista) {
			
			System.out.println(p);
		}		
		
	}

}
