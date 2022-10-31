/*
 * author: Francesco Suma
 * class: 5BIA
 * data: 19.10.2022
 * es: Eserciazio Biblioteca
*/

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("-----Biblioteca-----");

        int scelta = 0;

        do {

            System.out.println("Se vuoi vedere la lista dei libri presenti in biblioteca (digita '1'), altrimenti se vuoi inserire un libro (digita '2')");
            scelta = scanner.nextInt();
            scanner.nextLine();

            Biblioteca book = new Biblioteca();
            
            if (scelta == 1) {
                
                book.insertBook("Topolino", "Disney", "130", "Disney", "Fumetto");
                book.showBook();

            } else if (scelta == 2){
                
                System.out.println("--------------------------");
                System.out.print("Inserisci il titolo del libro: ");
                String titolo = scanner.nextLine();
                System.out.print("Inserisci il nome dell'autore: ");
                String autore = scanner.nextLine();
                System.out.print("Inserisci il numero di pagine: ");
                String numPagine = scanner.nextLine();
                System.out.print("Inserisci la casa editrice: ");
                String casaEditrice = scanner.nextLine();
                System.out.print("Inserisci il genere: ");
                String genere = scanner.nextLine();

                book.insertBook(titolo, autore, numPagine, casaEditrice, genere);
                book.showBook();

            }
            
        } while (scelta!=1 && scelta!=2);

    }
}
