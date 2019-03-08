package ordenacion;



public class Persona  {

	private String nombre;
	private int edad;
	private int altura;
	private int peso;
	

	
	
	public Persona(String nombre,int edad,
					int altura,int peso) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
	}

	
	
	@Override
	public String toString() {
		return nombre+" ("+edad+"y,"+altura+"cm,"+peso+"K)";
	}
		
	
	

	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
}
