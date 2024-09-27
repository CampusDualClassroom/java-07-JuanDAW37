package com.campusdual.classroom;


import java.util.ArrayList;
import java.util.List;

public class Exercise07 {

    public static void main(String[] args) {
        positionInAList(7);
        positionInAList(11);
        sumFirstNaturalNumbers(6);
        showFirstNaturalNumbers(8);
    }

    //TODO ↓
    // ESTE MÉTODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {
        String mensaje = "";
        List<Integer> n = new ArrayList<>();
        for(int i = 10 ; i > 0; i--){
            n.add(i);
        }
        for(int numero :n){
            if(numero == num){
                mensaje = "El elemento " + num + " se encuentra en la posición: " + n.indexOf(num-1);
                break;
            }else{
                mensaje = "";
            }
        }
        if(mensaje.isEmpty()){
            System.out.println("El elemento " + num + " no se encuentra en la lista.");
        }else{
            System.out.println(mensaje);
        }
    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
        int suma = 0;
        if(num > 0){
            for(int i = 0; i <= num; i++){
                if(i > 0){
                    suma +=i;
                }
            }
        }
        System.out.println(suma);
    }

    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        if(num > 0){
            for(int i = 0; i <= num; i++){
                if(i > 0){
                    System.out.print(i + ",");
                }
            }
        }
    }
}
