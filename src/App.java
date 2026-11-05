import java.util.List;

import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        List<Persona> personas = List.of(
            new Persona("Juan", 30, "Male"),
            new Persona("Maria", 25, "Female"),
            new Persona("Pedro", 35, "Male"),
            new Persona("Ana", 30, "Female")
        );
        BusquedaLineal busqueda = new BusquedaLineal(personas);
        // 1. Busqueda de una persona con nombre "Maria"
        // Retorna la persona si la encuntra
        Persona persona1 = busqueda.buscarPersona("Maria");
        System.out.println("Persona encontrda:" + persona1);
        // 2. Busqueda de la persona con nombre "Diego"
        // Retorna la posición si la encuentra
        int posicion2 = busqueda.buscarPosicion("Diego");
        if (posicion2 != -1) {
            System.out.println("Persona encontrda en la posición:" + posicion2);
        }
        // 3. Busqueda de la persona con nombre "Ana"
        // Imprimir la posocion de la persona si la encuentra
        int posicion3 = busqueda.buscarPosicion("Ana");
        if (posicion3 != -1) {
            System.out.println("Persona encontrda en la posición:" + posicion3);
        }

    }
}
