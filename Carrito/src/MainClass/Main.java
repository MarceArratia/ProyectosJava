package MainClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Modelo.Pantalon;
import Modelo.Poleras;
import Modelo.TipoPago;
import Modelo.Zapato;

public class Main {

	public static void main(String[] args) {
		int totalCompra=0;
		
		
		ArrayList<Pantalon> pantalon = new ArrayList<Pantalon>();
		pantalon.add(new Pantalon(15000, "Variant Caqui Corto", 1000, 30, "Variant", "Caqui", 2));
		pantalon.add(new Pantalon(16000, "Variant Caqui Largo", 1002, 30, "Variant", "Caqui", 3));
		pantalon.add(new Pantalon(19000, "Variant Negro Largo", 1001, 30, "Variant", "Negro", 2));
		
		ArrayList<Poleras> polera = new ArrayList<Poleras>();
		polera.add(new Poleras(9000, "Variant Rojo", 2002, 29, "Variant", "Rojo"));
		
		ArrayList<Zapato> zapato = new ArrayList<Zapato>();
		zapato.add(new Zapato(25000, "Mega CZ50", 3003, 34, "Mega", "CZ50"));
		zapato.add(new Zapato(20000, "Mega CX50", 3004, 40, "Mega", "CX50"));
		
		ArrayList<String> carrito = new ArrayList<String>();
		
		boolean salir = false;
		while(salir == false) {
			 System.out.println("- - - Menú - - -");
			 System.out.println("1. Mostrar productos disponibles");
			 System.out.println("2. Agregar producto al carrito");
			 System.out.println("3. Pagar");
			 System.out.println("4. Salir");
			 
			 Scanner sc = new Scanner(System.in);
			 int opcionElegida =0;
			 try {
				 opcionElegida= Integer.parseInt(sc.nextLine());
			 }
			 catch(Exception e) {
				 System.out.println("Solo debe ingresar números del 1 al 4");
			 }
				
				
				
				//opcion 1 Mostrar productos disponibles  Salir Menu principal
				if(opcionElegida == 1) {
					System.out.println("****** Mostrar productos disponibles ******\n");
				for(Pantalon elemento : pantalon) {
					System.out.println("Código: "+elemento.getCodigo()+"  "+"Color: "+elemento.getColor()+"  "+"Cantidad de bolsillos: "+elemento.getBolsillos()+"  "+
				    "Talla: "+elemento.getTalla()+"  "+"Marca: "+elemento.getMarca()+"  "+"Precio: "+elemento.getPrecio()+"  "+"Nombre: "+elemento.getNombre());
				}
				for(Poleras elemento : polera) {
					System.out.println("Código: "+elemento.getCodigo()+"  "+"Color: "+elemento.getColor()+"  "+"Talla: "+elemento.getTalla()+"  "+"Marca: "+elemento.getMarca()+"  "+"Precio: "+elemento.getPrecio()+"  "+"Nombre: "+elemento.getNombre());
				}
				for(Zapato elemento : zapato) {
					System.out.println("Código: "+elemento.getCodigo()+" "+"Modelo: "+elemento.getModelo()+"  "+"Talla: "+elemento.getTalla()+"  "+"Marca: "+elemento.getMarca()+"  "+"Precio: "+elemento.getPrecio()+"  "+"Nombre: "+elemento.getNombre());
				}
				//opcion 2 Agregar producto al carrito  Salir Menu principal
				}else if(opcionElegida == 2) {
						 System.out.println("****** Agregar producto al carrito ******\n");
						 System.out.println("Ingrese el código del articulo que desea agregar");
						 int codigo = 0;
						 try {
							 codigo = Integer.parseInt(sc.nextLine());
						 }catch(Exception e) {
							 System.out.println("Debe ingresar código que corresponde");
						 }
						 for (Pantalon elemento : pantalon) {
							 if(elemento.getCodigo() == codigo) {
								 System.out.println("¿Está seguro de agregar "+elemento.getNombre()+" al carrito por "+ elemento.getPrecio()+"? Ingrese Y para agregar o N para no agregar");
								 
								 sc = new Scanner(System.in);
								 String opcion = sc.nextLine();
								 if(opcion.toUpperCase().contains("Y")) {
									 System.out.println(elemento.getNombre()+" agregado correctamente.");
									 carrito.add(String.valueOf(codigo));
									 totalCompra+= elemento.getPrecio();
								 }
							 }
							
						 }
						 for (Poleras elemento : polera) {
							 if(elemento.getCodigo() == codigo) {
								 System.out.println("¿Está seguro de agregar "+elemento.getNombre()+" al carrito por "+ elemento.getPrecio()+"? Ingrese Y para agregar o N para no agregar");
								 sc = new Scanner(System.in);
								 String opcion = sc.nextLine();
								 if(opcion.toUpperCase().contains("Y") ) {
									 System.out.println(elemento.getNombre()+" agregado correctamente.");
									 carrito.add(String.valueOf(codigo));
									 totalCompra+= elemento.getPrecio();
								 }
							 }
							
						 }for (Zapato elemento : zapato) {
							 if(elemento.getCodigo() == codigo) {
								 System.out.println("¿Está seguro de agregar "+elemento.getNombre()+" al carrito por "+ elemento.getPrecio()+"? Ingrese Y para agregar o N para no agregar");
								 sc = new Scanner(System.in);
								 String opcion = sc.nextLine();
								 if(opcion.toUpperCase().contains("Y") ) {
									 System.out.println(elemento.getNombre()+" agregado correctamente.");
									 carrito.add(String.valueOf(codigo));
									 totalCompra+= elemento.getPrecio();
									 
								 }
							 }
							
						 }
						 
						//opcion  3 Pago  Salir Menu principal
						}else if(opcionElegida == 3) {
							
							boolean cancelar = true;
							while(cancelar)	{
								
								 System.out.println("¿Cuál es su medio de pago?");
								 System.out.println("1. Crédito");
								 System.out.println("2. Débito");
								 System.out.println("3. Cancelar");
								 System.out.println(carrito);
								  sc = new Scanner(System.in);
									int opcionPago = Integer.parseInt(sc.nextLine());
									//opcion 1 Credito
									if(opcionPago == 1) {
										System.out.println("¿Está seguro que desea pagar con Crédito el total de "+totalCompra+"? Ingrese Y para agregar o N para no agregar");
										sc = new Scanner(System.in);
										 String opcion = sc.nextLine();
										 if(opcion.toUpperCase().contains("Y")) {
											 System.out.println("¿Con cuantas cuotas desea pagar? (0-24)");
											 sc = new Scanner(System.in);
											 try {
												 int cuotas = sc.nextInt();
												 if(cuotas <= 24 && cuotas > 0) {
													 System.out.println("¿Está seguro que desea pagar con " + cuotas +" cuotas? Ingrese Y para pagar o N para no");
													 sc = new Scanner(System.in);
													 String opcionUno = sc.nextLine();
													 if(opcion.toUpperCase().contains("Y")) {
														 System.out.println("¿Cuál es la dirección de despacho a dejar?");
														 String direccion = sc.nextLine();
														 System.out.println("¿Cuál es el nombre de quien recibe el producto??");
														 String recibe = sc.nextLine();
														 System.out.println(direccion);
														 System.out.println(recibe);
														 System.out.println("Orden de despacho generada correctamente");
														 TipoPago objTipoPago = new TipoPago();
															objTipoPago.exportarExcel(recibe,direccion,totalCompra,carrito);
															 try {
																	Runtime.getRuntime().exec("cmd /c start "+"Carrito.csv");
																} catch (IOException e) {
																	// TODO Auto-generated catch block
																	e.printStackTrace();
																}
														  }else if(opcionUno.contains("N")) {
															  System.out.println("Pago cancelado");
													 }
												 }else {
													 System.out.println("Error al ingresar cuotas.");
												 }
											 }catch(Exception e) {
												 System.out.println("Ingrese sólo números del 1 al 24");
											 }
										 }
										//opcion 2 debito
									}else if(opcionPago == 2) {
										System.out.println("¿Está seguro que desea pagar con Débito el total de "+totalCompra+"? Ingrese Y(Si) para pagar o N(No)");
										sc = new Scanner(System.in);
										 String opcion2 = sc.nextLine();
										 if(opcion2.toUpperCase().contains("Y")) {
											 sc = new Scanner(System.in);
											 System.out.println("¿Cuál es la dirección de despacho?");
											 String direccion = sc.nextLine();
											 System.out.println("¿Cuál es el nombre de quien recibe el producto??");
											 String recibe = sc.nextLine();
											 System.out.println(direccion);
											 System.out.println(recibe);
											 System.out.println("Orden de despacho generada correctamente");
											 TipoPago objTipoPago = new TipoPago();
												objTipoPago.exportarExcel(recibe,direccion,totalCompra,carrito);
												 try {
													Runtime.getRuntime().exec("cmd /c start "+"Carrito.csv");
												} catch (IOException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
										 }else if(opcion2.contains("N")) {
											 System.out.println("Pago cancelado");
										 }else {
											 sc = new Scanner(System.in);
											 System.out.println("Opción inválida");
										 }
										 
									}
									else if(opcionPago == 3) { 
										cancelar=false;
									 }
							}
						
							//opcion 4 Salir Menu principal
						}else if(opcionElegida == 4) {
							salir = true;
						}else {
						 System.out.println("Opción desconocida");
						}
			 
		
		
		
		}
	}

}