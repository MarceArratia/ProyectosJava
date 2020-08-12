package Modelo;

public class Zapato extends Producto{
	String modelo;
	
public Zapato(int precio, String nombre, int codigo, int talla, String marca,String modelo) {
		super(precio, nombre, codigo, talla, marca);
		this.modelo = modelo;
	}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}


}
