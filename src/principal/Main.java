package principal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// La lista de los usuarios que forman parte de la red social
		List<Usuario> usersList = new ArrayList<>();
		// Usuarios
		Usuario pepe = new Usuario("pepe");
		Usuario manolita = new Usuario("manolita");
		Usuario juan = new Usuario("juan");
		Usuario julia = new Usuario("julia");
		Usuario sandra = new Usuario("sandra");
		Usuario diego = new Usuario("diego");
		Usuario carlos = new Usuario("carlos");

		// seguidores de pepe
		ArrayList<Usuario> followedpepe = new ArrayList<>();
		followedpepe.add(manolita);
		followedpepe.add(diego);
		// seguidores de manolita
		ArrayList<Usuario> followedmanolita = new ArrayList<>();
		followedmanolita.add(juan);
		followedmanolita.add(diego);

		// post de pepe
		Post imagpepe = new ImagePost(LocalDate.of(2022, 5, 4), new ArrayList<Comentario>(), "Selfie.jpg", 400, 450);
		Post textpepe = new TextPost(LocalDate.of(2022, 4, 1), new ArrayList<Comentario>(), "Hoy salí de acampada");
		ArrayList<Post> postlistpepe = new ArrayList<>();
		postlistpepe.add(imagpepe);
		postlistpepe.add(textpepe);

		// comentarios de diego y manolita en el post de pepe
		Comentario commenttextpepediego = new Comentario("Menuda suerte", LocalDate.of(2022, 4, 2), diego);
		Comentario commenttextpepemanolita = new Comentario("Espero que no lloviese", LocalDate.of(2022, 4, 2),
				manolita);
		ArrayList<Comentario> commentlist = new ArrayList<>();
		commentlist.add(commenttextpepemanolita);
		commentlist.add(commenttextpepediego);
		// añadimos los comentarios al post de pepe
		textpepe.setCommentlist(commentlist);
		// añadimos la lista de post a pepe
		pepe.setListPost(postlistpepe);
		// añadimos amigos de pepe a pepe
		pepe.setFollowed(followedpepe);
		// añadimos amigos de manolita a manolita
		manolita.setFollowed(followedmanolita);

		// añadimos los usuarios a la lista de usuarios de la red social
		usersList.add(diego);
		usersList.add(carlos);
		usersList.add(pepe);
		usersList.add(manolita);
		usersList.add(julia);
		usersList.add(sandra);
		usersList.add(juan);


		// en el menú se llaman a las funcionalidades descritas en el pdf

		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		boolean end = false;
		boolean existe = false;
		int option;
		String nombre;
		String user;
		Usuario c;
		ArrayList <String> followed = new ArrayList<>();

		while (!end) {
			System.out.println("______________________________________________");
			System.out.println("1. Añadir usuario");
			System.out.println("2. Comenzar a seguir usuario");
			System.out.println("3. Dejar de seguir usuario");
			System.out.println("4. Eliminar usuario");
			System.out.println("5. Muro de usuario");
			System.out.println("6. Comentarios de usuario");
			System.out.println("7. Añadir post");
			System.out.println("8. Eliminar post");
			System.out.println("9. Añadir comentario");
			System.out.println("10. Eliminar comentario");
			System.out.println("11. Mostras número de comentarios de un post");
			System.out.println("12. Cerrar sesión");
			System.out.println("______________________________________________");

			try {
				System.out.println("¿Qué función quieres realizar?");
				option = sc.nextInt();

				switch (option) {
				case 1:
					System.out.println("Introduzca un nombre");
					nombre = sc.next();
					for (int i = 0; i < usersList.size(); i++) {
						if (nombre.equalsIgnoreCase(usersList.get(i).getNombre())) {
							existe = true;
						}
					}
					
					if(existe == true){
						System.out.println("Este usuario ya existe");
						existe = false;
					}	else {
						c = new Usuario(nombre);
						usersList.add(c);
						System.out.println("El usuario ha sido añadido correctamente");
					}
					
					break;
					
				case 2:
					System.out.println("Introduzca su nombre de usuario");
					user = sc.next();
					for (int i = 0; i < usersList.size(); i++) {
						if (user.equalsIgnoreCase(usersList.get(i).getNombre())) {
							existe = true;
						}
					}
					
					if (existe == true) {
						System.out.println("Introduzca el nombre del usuario al que desea seguir");
						nombre=sn.next();
						existe = false;
						for (int i = 0; i < usersList.size(); i++) {
							if (user.equalsIgnoreCase(usersList.get(i).getNombre())) {
								existe = true;
							}
						}
						if (existe == true) {
							followed.add(nombre);
							System.out.println("Se ha seguido al usuario " + nombre + " correctamente.");
							existe = false;
						} else {
							System.out.println("Este usuario no existe");
						}
						
					} else {
						System.out.println("Usuario incorrecto");
					}
					

					break;
					
					
				case 3:
					System.out.println("Introduzca su nombre de usuario");
					user = sc.next();
					for (int i = 0; i < usersList.size(); i++) {
						if (user.equalsIgnoreCase(usersList.get(i).getNombre())) {
							existe = true;
						}
					}
					
					if (existe == true) {
						System.out.println("Introduzca el nombre del usuario al que desea dejar de seguir");
						nombre=sn.next();
						existe = false;
						for (int i = 0; i < usersList.size(); i++) {
							if (user.equalsIgnoreCase(usersList.get(i).getNombre())) {
								existe = true;
								followed.remove(i);
							}
						}
						if (existe == true) {
							System.out.println("Se ha dejado de seguir al usuario " + nombre + " correctamente.");
							existe = false;
						} else {
							System.out.println("Este usuario no existe");
						}
						
					} else {
						System.out.println("Usuario incorrecto");
					}
					
					break;
					
					
				case 4:

					System.out.println("Introduzca un nombre");
					nombre = sc.next();
					existe = false;
					for (int i = 0; i < usersList.size(); i++) {
						if (nombre.equalsIgnoreCase(usersList.get(i).getNombre())) {
							existe = true;
							usersList.remove(i);
						}
					}
					if (existe == true) {
						System.out.println("El usuario se ha eliminado correctamente");
					} else {
						System.out.println("El usuario indicado no existe");
					}

					break;
				case 5:

					break;
				case 6:

					break;
				case 7:

					break;
				case 8:

					break;
				case 9:

					break;
				case 10:
					
					for (int i = 0; i < followed.size(); i++) {
						System.out.println(followed.get(i));
					}

					break;
				case 11:

					for (int i = 0; i < usersList.size(); i++) {
						System.out.println(usersList.get(i).getNombre());
					}

					break;
				case 12:
					end = true;
					System.out.println("La sesión ha sido cerrada correctamente");
					break;
				default:
					System.out.println("Solo opciones entre 1 y 12");

				}
			} catch (InputMismatchException e) {
				System.out.println("Debes insertar un número");
				sc.next();
			}
		}

}}
