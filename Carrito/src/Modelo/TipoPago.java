package Modelo;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;

public class TipoPago {
	String tarjCredito;
	String tarjDebito;
	
	
	public void exportarExcel(String nombreCliente, String direccionDespacho, int totalCompra,
			ArrayList<String> carrito) {

		String nombre = "Carrito.csv";

		FileWriter archivo = null;
		PrintWriter pw = null;
		try {
			archivo = new FileWriter(nombre);
			pw = new PrintWriter(archivo);
			LocalDate today = LocalDate.now();
			pw.println("Nombre quien recibe: " + nombreCliente);
			pw.println("Dirección de Despacho: " + direccionDespacho);
			pw.println("Monto tota: " + totalCompra);
			pw.println("Fecha de compra: " + today.toString());
			for (String item : carrito) {
				pw.print(item + ",");
			}
			pw.close();
			archivo.close();
		} catch (Exception e) {
			System.out.println("Fichero " + nombre + "no se pudo crear" + e);
		}

	}

}
