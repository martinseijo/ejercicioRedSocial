package principal;

import java.time.LocalDate;
import java.util.ArrayList;


public class Post {

	protected LocalDate fechaPublicacion;

	private ArrayList<Comentario> commentlist;
	
	public Post(LocalDate fechaPublicacion) {
		super();
		this.fechaPublicacion = fechaPublicacion;
	}
	
	
	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}


	public void setFechaPublicacion(LocalDate fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	
	public ArrayList<Comentario> getCommentlist() {
		return commentlist;
	}


	public void setCommentlist(ArrayList<Comentario> commentlist) {
		this.commentlist = commentlist;
	}


	public void añadirPost() {

	}

	public void eliminarPost() {

	}
	
	public void mostrarComentarios() {
		
	}

}
