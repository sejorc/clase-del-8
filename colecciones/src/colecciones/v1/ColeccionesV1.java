/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.v1;

import java.util.ArrayList;

/**
 *
 * @author DAW07-Sergio
 */
public class ColeccionesV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> shopping_list = new ArrayList<>();

        shopping_list.add("Lechuga");
        shopping_list.add("Salmon");
        shopping_list.add("Cebolla");
        shopping_list.add("Pan");

        for (int i = 0; i < shopping_list.size(); i++) {
            System.out.println(shopping_list.get(i));
        }

        shopping_list.set(2, "Cereales");

        System.out.println("=========");
        for (int i = 0; i < shopping_list.size(); i++) {
            System.out.println(shopping_list.get(i));
        }

        shopping_list.add(2, "Chocolate");

        System.out.println("==========");
        for (String food_item : shopping_list) {
            System.out.println(food_item);
        }

        shopping_list.clear;
        System.out.println("==========");
        for (String food_item : shopping_list) {
            System.out.println(food_item);
        }
    }

}
