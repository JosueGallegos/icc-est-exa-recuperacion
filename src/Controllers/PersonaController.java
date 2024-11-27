package Controllers;

import Models.Persona;
//import javax.print.attribute.standard.Media;

/**
 * Controlador para manejar la lógica de operaciones sobre arrays de Carross.
 * 
 * 
 * Generar los metdoos necesarions para ordenar un array de personas por edad en
 * orden descendente
 * y para la busqueda binaria de una persona por edad.
 * 
 */
public class PersonaController {

    public void ordenarPorEdadDescendente(Persona [] persona){
        int n = persona.length;
        for(int i = 0 ; i < n; i++){
            int indmax = i;
            for(int j = i + 1;j < n ; j++ ){
                if(persona[j].getEdad() > persona[indmax].getEdad()){
                    indmax = j;

                }
            }
            Persona temp = persona[i];
            persona[i]= persona[indmax];
            persona[indmax] = temp;

        }
     
    }

    public int buscarPorEdad(Persona [] persona, int edad){
        int inicio = 0;
        int fin = persona.length;
        
        while (inicio <= fin) {
            int medio = (inicio + fin )/2;
            if(persona[medio].getEdad() == edad){
                return  medio;
            } else if(persona[medio].getEdad()> edad){
                inicio = medio + 1;

            }else{
                fin = medio -1;
            }
            
        }
        return -1;

    }

    public void ordenarPorNombreAscendente(Persona[]personas){
        int n = personas.length;
        for(int i = 1 ; i < n ; i++){
            Persona clave = personas[i];

            int j = i -1;
            while (j >= 0 && personas[j].getNombre().compareTo(clave.getNombre()) > 0) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = clave;


        }

    }

    public int buscarPorNombre(Persona[]personas, String nombre){
        int inicio =0;
        int fin = personas.length;

        while (inicio <= fin) {
            int medio = (inicio + fin)/2;
            int comparar = personas[medio].getNombre().compareTo(nombre);
            if(comparar == 0){
                return medio;
            }else if (comparar< 0) {
                inicio= medio +1;
            }else{
                fin = medio -1;
            }
            
        }
        return -1;
    }
    
}
