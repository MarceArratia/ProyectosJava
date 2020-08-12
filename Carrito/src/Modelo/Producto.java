package Modelo;

public class Producto {
	int precio;
	String nombre;
	int codigo;
	int talla;
	String marca;
	
	public Producto(int precio,String nombre, int codigo, int talla, String marca) {
		this.precio = precio;
		this.nombre = nombre;
		this.codigo = codigo;
		this.talla = talla;
		this.marca = marca;
		
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getTalla() {
		return talla;
	}
	
	public void setTalla(int talla) {
		this.talla = talla;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
}
