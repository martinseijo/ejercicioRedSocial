package principal;

import java.time.LocalDate;
import java.util.ArrayList;


public class TextPost extends Post {
	
	private String contenido;
	
	public TextPost(LocalDate fechaPublicacion, ArrayList<Comentario> ArrayList, String contenido) {
		super(fechaPublicacion);
		this.contenido = contenido;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	


}
