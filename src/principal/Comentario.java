package principal;

import java.time.LocalDate;

public class Comentario {

	private String contenido;
	private LocalDate fechaPublicacion;
	private Usuario propietario;

	public Comentario(String contenido, LocalDate fechaPublicacion, Usuario propietario) {
		super();
		this.contenido = contenido;
		this.fechaPublicacion = fechaPublicacion;
		this.propietario = propietario;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(LocalDate fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public Usuario getPropietario() {
		return propietario;
	}

	public void setPropietario(Usuario propietario) {
		this.propietario = propietario;
	}

	public void añadirComentario() {

	}

	public void eliminarComentario() {

	}

}
