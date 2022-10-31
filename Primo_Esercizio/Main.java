/*
 * autor: Francesco SUMA
 * classe: 5BIA
 * data: 21/09/2022
 * esercizio: calcolo IMC
*/

package Primo_Esercizio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Calcolo IMC ---");

        System.out.println("Come ti chiami?");
        String nome = scanner.nextLine();

        System.out.println("Qual'è il tuo cognome?");
        String cognome = scanner.nextLine();

        System.out.println("Quanti anni hai?\n");
        int eta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("----------------------------------------------------\n");

        System.out.println("Inserisci la tua altezza(la tua altezza va inserita in m): ");
        float altezza = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Inserisci il tuo peso(il tuo peso va inserito in kg): \n");
        float peso = scanner.nextFloat();
        scanner.nextLine();

        float IMC = peso / (altezza * altezza);

        System.out.println("----------------------------------------------------\n");

        System.out.println(nome + " " + cognome + " di età: " + eta + " la tua IMC è: " + IMC);
        if (IMC <= 16) {
            System.out.println("Sei Anoressico");
        } else if (IMC > 16 && IMC <= 19) {
            System.out.println("Sei Sottopeso");
        } else if(IMC > 19 && IMC <= 24){
            System.out.println("Sei Normopeso");
        } else if(IMC > 25 && IMC <= 30){
            System.out.println("Sei Normopeso");
        }else if(IMC > 30){
            System.out.println("Sei Obeso");
        }

    }
}