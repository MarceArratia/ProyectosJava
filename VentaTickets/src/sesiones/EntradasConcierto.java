package sesiones;
public class EntradasConcierto{
private String titularEntrada;
private String nombreArtista;
private String ubicacion;
private java.util.Date fechaConcierto;
public String getTitularEntrada() {
return titularEntrada;
}
public void setTitularEntrada(String titularEntrada) {
this.titularEntrada = titularEntrada;
}
public String getNombreArtista() {
return nombreArtista;
}
public void setNombreArtista(String nombreArtista) {
this.nombreArtista = nombreArtista;
}
public String getUbicacion() {
return ubicacion;
}
public void setUbicacion(String ubicacion) {
this.ubicacion = ubicacion;
}
public java.util.Date getFechaConcierto() {
return fechaConcierto;
}
public void setFechaConcierto(java.util.Date date) {
this.fechaConcierto =  date;
}
}