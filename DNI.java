/*
    Date: 04.02.2020
    Author: Alba Caparrós
    Pide el DNI (numeros) y di la letra
 */
package javaapplication16;

public class DNI {

    public static void main(String[] args) {
        // pregunta dni:
        int dni = 23920381;
        char letter = DNIletter(dni);
        System.out.println(dni + ":" + letter);

    }

    //funcion que recibe dni y devuelve la letra
    private static char DNIletter(int dni) {
        char letter='T';
        String letters = "TRWAGMYFPDXBNJZSQVHLCKE";
        int res = dni % 23;
        letter = letters.charAt(res);
        return letter;
    }
    
    private static char DNIletter2(int dni){
        return "TRWAGMYFPDXBNJZSQVHLCKE".charAt(dni % 23);
    }
}
