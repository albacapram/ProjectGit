/*
    Date: 04.02.2020
    Author: Alba Caparrós
    Pide el DNI (numeros) y di la letra
 */
package DNI;

public class DNI {

    public static void main(String[] args) {
        // pregunta dni:
        int dni = 23920381;
        char letter = DNIletter(dni);
        System.out.println(dni + "" + letter);

    }
    
    private static char DNIletter(int dni){
        return "TRWAGMYFPDXBNJZSQVHLCKE".charAt(dni % 23);
    }
}