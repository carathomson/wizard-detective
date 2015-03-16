/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.control;

/**
 *
 * @author carathomson
 */
public class NotebookControl {

    public static String[] arraySort(String[] array) {
        int i = 0; 
        for (String s: array) {
            int smallestIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[smallestIndex]) < 0) {
                    smallestIndex = j;
                }
            }
            String temp = array[i];
            array[i] = array[smallestIndex];
            array[smallestIndex] = temp;
            i++;
        }
        return array;
    }

    public static void main(String[] a) {
        String[] b = {"z", "r", "b", "a"};
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + ' ');
        }
        System.out.println();
        b = arraySort(b);
        for (int i = 0; i < b.length; i++) {
            System.err.print(b[i] + ' ');
        }
    }
}
