package view;

import javax.swing.JOptionPane;
import java.util.Scanner;
import controllers.UsuarioController;

public class EstudentView {
	public static void main(String[] args) {
		
		int op=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("seleccione una opcion.");
		
		do {
			System.out.println("1 - Crear");
            System.out.println("2 - Actualizar");
            System.out.println("3 - Listar");
            System.out.println("4 - Eliminar");
            
            op = teclado.nextInt();
            
            switch (op) {
			case 1:
				
				break;

			default:
				break;
			}
			
		} while (op == 7);
		
		// String estudent = new 
				//UsuarioController().createUsuario("Carlos", "Hernandez", "carlos@gmail", "direccion", 23);
		
		String estudent = new 
				UsuarioController().deleteUsuario(1);
		
		System.out.println(estudent);
		JOptionPane.showMessageDialog(null, "Estudiante eliminado", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
	}
}
