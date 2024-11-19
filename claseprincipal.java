
public class claseprincipal {import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        GestionEstudiantes gestion = new GestionEstudiantes(10);

        while (true) {
           
            System.out.println("EduPilo S.A. ");
            System.out.println(" MENÚ GESTIÓN ESTUDIANTES ");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar todos los estudiantes");
            System.out.println("3. Buscar Estudiante por Nombre");
            System.out.println("4. Calcular el promedio general");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
           
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    
                    System.out.print("Introduce el nombre del estudiante: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Introduce la edad del estudiante: ");
                    int edad = scanner.nextInt();
                    System.out.print("Introduce el promedio del estudiante: ");
                    double promedio = scanner.nextDouble();
                    scanner.nextLine(); 
                    gestion.agregarEstudiante(nombre, edad, promedio);
                    break;
                case 2:
                    
                    gestion.mostrarEstudiantes();
                    break;
                case 3:
                    
                    System.out.print("Introduce el nombre del estudiante a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    gestion.buscarPorNombre(nombreBuscar);
                    break;
                case 4:
                    
                    gestion.calcularPromedioGeneral();
                    break;
                case 5:
                    
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    return; 
                default:
                    System.out.println("Opción no válida, por favor selecciona una opción correcta.");
            }
        }
    }
}
    
    
}
