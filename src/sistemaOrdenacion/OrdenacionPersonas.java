package sistemaOrdenacion;

import java.util.Comparator;
import ordenacion.Persona;

public class OrdenacionPersonas implements Comparator<Persona> {

	
	/*
	 * Guardamos en dos atributos la posible configuración del comparador
	 * para que ordene de manera primaria y secundaria
	 * 
	 * 
	 * */
	private int metodoOrdenacionPrimario;
	private int metodoOrdenacionSecundario;
	
	
	/*
	 * Establecemos los sistemas de ordenación
	 * 
	 * 
	 * */
	public static final int ORDENA_ALTURA_ASC = 1;
	public static final int ORDENA_ALTURA_DESC = 2;
	public static final int ORDENA_PESO_ASC = 3;
	public static final int ORDENA_PESO_DESC = 4;
	public static final int ORDENA_EDAD_ASC = 5;
	public static final int ORDENA_EDAD_DESC = 6;
	
	
	
	/**
	 * Constructor con los sistemas de ordenación por defecto
	 * 
	 */
	public OrdenacionPersonas() {
		
		metodoOrdenacionPrimario = ORDENA_ALTURA_ASC;
		metodoOrdenacionSecundario = ORDENA_PESO_ASC;
	}
	
	
	
	
	
	/*
	 * Setters para poder cambiar los sistemas de ordenación
	 * 
	 * 
	 * */
	public void setMetodoOrdenacionSecundario(int metodoOrdenacionSecundario) {
		this.metodoOrdenacionSecundario = metodoOrdenacionSecundario;
	}
	public void setMetodoOrdenacion(int metodoOrdenacion) {
		this.metodoOrdenacionPrimario = metodoOrdenacion;
	}








	/**
	 * Método del interfaz COMPARATOR que sobreescribimos 
	 * 
	 */
	@Override
	public int compare(Persona p1, Persona p2) {
		
		int resultadoComparacion;
		
		switch(metodoOrdenacionPrimario) {

			case ORDENA_ALTURA_ASC: resultadoComparacion = (p1.getAltura()-p2.getAltura()); break;
			case ORDENA_ALTURA_DESC: resultadoComparacion = (p2.getAltura()-p1.getAltura()); break;
			case ORDENA_PESO_ASC:	resultadoComparacion = (p1.getPeso()-p2.getPeso()); break;
			case ORDENA_PESO_DESC:	resultadoComparacion = (p2.getPeso()-p1.getPeso()); break;
			case ORDENA_EDAD_ASC: resultadoComparacion = (p1.getEdad()-p2.getEdad()); break;
			case ORDENA_EDAD_DESC: resultadoComparacion = (p2.getEdad()-p1.getEdad()); break;
			default: resultadoComparacion = (p1.getAltura()-p2.getAltura());
		}
		
		// si el resultado de la comparación es 0 entra en juego el método
		// secundario para comparar
		if(resultadoComparacion == 0) {
			
			switch(metodoOrdenacionSecundario) {

				case ORDENA_ALTURA_ASC: resultadoComparacion = (p1.getAltura()-p2.getAltura()); break;
				case ORDENA_ALTURA_DESC: resultadoComparacion = (p2.getAltura()-p1.getAltura()); break;
				case ORDENA_PESO_ASC:	resultadoComparacion = (p1.getPeso()-p2.getPeso()); break;
				case ORDENA_PESO_DESC:	resultadoComparacion = (p2.getPeso()-p1.getPeso()); break;
				case ORDENA_EDAD_ASC: resultadoComparacion = (p1.getEdad()-p2.getEdad()); break;
				case ORDENA_EDAD_DESC: resultadoComparacion = (p2.getEdad()-p1.getEdad()); break;
				default: resultadoComparacion = (p1.getAltura()-p2.getAltura()); 
			}			
		}
		
		return resultadoComparacion;
	}



	
	
}
