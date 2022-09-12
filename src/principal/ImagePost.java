package principal;

import java.time.LocalDate;
import java.util.ArrayList;


public class ImagePost extends Post{
	
	private String titulo;
	private int width;
	private int length;
	
	public ImagePost(LocalDate fechaPublicacion, ArrayList<Comentario> ArrayList, String titulo, int width, int length) {
		super(fechaPublicacion);
		this.titulo = titulo;
		this.width = width;
		this.length = length;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}

	
	

}
