/*
 * author: Francesco SUMA
 * class: 4BIA
 * data: 24/09/2022
 * es: ordina due array
 */

import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] primoArray = new int[10];
        int [] secondoArray = new int[10];

        riempimento(primoArray);
        riempimento(secondoArray);

        System.out.println("---Prima dell'ordinamento---");
        System.out.print("Primo Array: ");
        stampa(primoArray);
        System.out.print("Secondo Array: ");
        stampa(secondoArray);

        System.out.print("------------------------------");

        System.out.println("---Dopo dell'ordinamento---");
        System.out.print("Primo Array: ");
        bubbleSort(primoArray);
        stampa(primoArray);
        System.out.print("Secondo Array: ");
        quickSort(secondoArray, 0, 9);
        stampa(secondoArray);

        
    }

    static void riempimento(int[] array){
        Random gen = new Random ();
        for(int i=0; i<10; i++) {
            array[i] = gen.nextInt (10);
        }
    }

    static void bubbleSort(int[] array){
        for(int a = 0; a<array.length; a++){
            int b = 0;
            for(int c = a + 1; c < array.length; c++){
                if(array[a]>array[c]){
                    b = array[a];
                    array[a] = array[c];
                    array[c] = b;
                }
            }
        }
    }

    static void quickSort(int[] array, int l, int r){
        if (l<r){
            int p= partition(array, l, r);
            
            quickSort(array,l,p-1);
            quickSort(array,p+1,r);
        }
    }

    static int partition(int[] array, int left, int right){
        int p = (left+right)/2; //trovo il pivot facendo la media aritmetica dei due estremi
        int  i=left, j=right;
        int temp;
        while (i<j){//leggo elementi inferiori al pivot
            while (array[i]<array[p]){
                i++;
            }
            while (array[j]>array[p]){ //leggo elementi maggiori al pivot
                j--;
            }
            
            //effettuo lo swap delle variabili
            temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            
            if (i==p){
                p=j; 
                i++; 
            }else if (j==p){
                p=i;
                j--;
            }else {
                i++;
                j--;
            }
        }
        return p;
    }

    static void stampa(int[] array){
        System.out.println(Arrays.toString(array));
    }

}