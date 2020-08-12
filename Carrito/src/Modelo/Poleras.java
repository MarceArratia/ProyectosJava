package Modelo;

public class Poleras extends Producto {
	String color;
	
	public Poleras(int precio, String nombre, int codigo, int talla, String marca,String color) {
		super(precio, nombre, codigo, talla, marca);
		this.color = color;
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


}
