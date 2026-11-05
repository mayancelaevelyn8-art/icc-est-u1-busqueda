import java.util.List;
import models.Persona;

// BusquedaLineal class represents a linear search algorithm for a list of Persona objects al

public class BusquedaLineal {
    private List<Persona> personas;

    public BusquedaLineal(List<Persona> personas) {
        this.personas = personas;
    }
    //Buscar una persona
    //Retorne la persona si la encuentra 
    //Retorne ---null--- si  no la encuentra

    public Persona findByName (String name){
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getName().equals(name)) {
                return personas.get(i);
            }
        }
        return null;
    }

    //Buscar la pos una persona
    //Retorne la pos persona si la encuentra
    //Retorne ___-1___ si no la encuentra
    

    public int findPositionByName (String name){

        for (Persona persona : personas) {
            if (persona.getName().equals(name)) {
                return personas.indexOf(persona);
            }
        }

        
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
    
}