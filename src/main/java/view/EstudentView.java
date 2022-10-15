package view;

import javax.swing.JOptionPane;
import java.util.Scanner;
import controllers.UsuarioController;

public class EstudentView {
	public static void main(String[] args) {
		
		int op=0;
		int id=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("seleccione una opcion.");
		
		do {
			System.out.println("1 - Crear");
            System.out.println("2 - Actualizar");
            System.out.println("3 - Listar");
            System.out.println("4 - Eliminar");
            System.out.println("5 - Salir");
            
            System.out.println("\n");
            System.out.println("Digite la opcion");
            op = teclado.nextInt();
            
            switch (op) {
			case 1:
				String estudent = new 
				UsuarioController().createUsuario("Ana", "Vilma", "ana@gmail", "direccion", 51);
				
				System.out.println(estudent);
				break;
				
			case 2:
				System.out.println("\n");
	            System.out.println("Digite el id a actualizar");
				id = teclado.nextInt();
				
				String studentUpdate = new
				UsuarioController().updateUsuario(id, "Nombre actualizado");
				
				System.out.println(studentUpdate);
				break;
				
			case 3:
				System.out.println("\n");
	            System.out.println("Digite el id a buscar");
	            id = teclado.nextInt();
	            
	            String studentget = new
	    				UsuarioController().getUsuario(id);
	    				
	    		System.out.println(studentget);
				break;
				
			case 4:
				String estudentdelete = new 
				UsuarioController().deleteUsuario(3);
				
				System.out.println(estudentdelete);
				break;
			default:
				break;
			}
			
		} while (op == 5);
		JOptionPane.showMessageDialog(null, "Programa finalizado", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
	}
}
