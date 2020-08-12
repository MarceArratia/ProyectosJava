package Modelo;

public class Pantalon extends Producto {
	String color;
	int bolsillos;
	
	public Pantalon(int precio, String nombre, int codigo, int talla, String marca,String color,int bolsillos) {
		super(precio, nombre, codigo, talla, marca);
		this.color = color;
		this.bolsillos = bolsillos;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBolsillos() {
		return bolsillos;
	}

	public void setBolsillos(int bolsillos) {
		this.bolsillos = bolsillos;
	}
		
	}

