package principal;

import java.time.LocalDate;


public class VideoPost extends Post{
	
	private String titulo;
	private String calidad;
	private int duraciónSegundos;
	
	public VideoPost(LocalDate fechaPublicacion, String titulo, String calidad, int duraciónSegundos) {
		super(fechaPublicacion);
		this.titulo = titulo;
		this.calidad = calidad;
		this.duraciónSegundos = duraciónSegundos;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCalidad() {
		return calidad;
	}
	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}
	public int getDuraciónSegundos() {
		return duraciónSegundos;
	}
	public void setDuraciónSegundos(int duraciónSegundos) {
		this.duraciónSegundos = duraciónSegundos;
	}
	
	

}
