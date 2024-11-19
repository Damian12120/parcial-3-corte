
public class clasegestionestudiantes {
    public class GestionEstudiantes {
    
    private Estudiante[] estudiantes;
    private int cantidadActual;
    private final int capacidadMax;

    
    public GestionEstudiantes(int capacidadMax) {
        this.capacidadMax = capacidadMax;
        this.estudiantes = new Estudiante[capacidadMax];
        this.cantidadActual = 0;
    }

    
    public void agregarEstudiante(String nombre, int edad, double promedio) {
        if (cantidadActual < capacidadMax) {
            Estudiante nuevoEstudiante = new Estudiante(nombre, edad, promedio);
            estudiantes[cantidadActual] = nuevoEstudiante;
            cantidadActual++;
            System.out.println("Estudiante agregado exitosamente.");
        } else {
            System.out.println("No hay más espacio para agregar estudiantes.");
        }
    }

    
    public void mostrarEstudiantes() {
        if (cantidadActual == 0) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            for (int i = 0; i < cantidadActual; i++) {
                System.out.println(estudiantes[i]);
            }
        }
    }

    
    public void buscarPorNombre(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < cantidadActual; i++) {
            if (estudiantes[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(estudiantes[i]);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Estudiante no encontrado.");
        }
    }

    
    public void calcularPromedioGeneral() {
        if (cantidadActual == 0) {
            System.out.println("No hay estudiantes registrados para calcular el promedio.");
        } else {
            double sumaPromedios = 0;
            for (int i = 0; i < cantidadActual; i++) {
                sumaPromedios += estudiantes[i].getPromedio();
            }
            double promedioGeneral = sumaPromedios / cantidadActual;
            System.out.println("Promedio general de los estudiantes: " + promedioGeneral);
        }
    }
}
}
