package principal;

import java.time.LocalDate;


public class VideoPost extends Post{
	
	private String titulo;
	private String calidad;
	private int duraci�nSegundos;
	
	public VideoPost(LocalDate fechaPublicacion, String titulo, String calidad, int duraci�nSegundos) {
		super(fechaPublicacion);
		this.titulo = titulo;
		this.calidad = calidad;
		this.duraci�nSegundos = duraci�nSegundos;
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
	public int getDuraci�nSegundos() {
		return duraci�nSegundos;
	}
	public void setDuraci�nSegundos(int duraci�nSegundos) {
		this.duraci�nSegundos = duraci�nSegundos;
	}
	
	

}
