package principal;

import java.util.ArrayList;

public class Usuario {

	private String nombre;
	private ArrayList<Usuario> followed;
	private ArrayList<Post> listPost;
	

	public Usuario(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Usuario> getFollowed() {
		return followed;
	}

	public void setFollowed(ArrayList<Usuario> followed) {
		this.followed = followed;
	}

	public ArrayList<Post> getListPost() {
		return listPost;
	}

	public void setListPost(ArrayList<Post> listPost) {
		this.listPost = listPost;
	}
	


	public void unfollow() {

	}

	public void follow() {
		this.followed.add(null);

	}


	public void listarPost() {

	}

	public void listarComentarios() {

	}

}
