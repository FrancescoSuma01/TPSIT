import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    Scanner scanner = new Scanner(System.in);
    
    private ArrayList<Libro> libri = new ArrayList<Libro>();

    private String biblioteca; //nome della biblioteca
    private String citta;      //citta della biblioteca
    private String via;        //via della biblioteca
    private int numeroCivico;  //numero civico della biblioteca

    public Biblioteca(String biblioteca, String citta, String via, int numeroCivico){
        
        this.biblioteca = biblioteca;
        this.citta = citta;
        this.via = via;
        this.numeroCivico = numeroCivico;

    }

    //metodo che aggiunge un libro
    public void addLibro(String titolo, String autore, String genere, int anno, int pagine, String ISBN, char disponibile){
        
        Libro libro = new Libro(titolo, autore, genere, anno, pagine, ISBN, disponibile);
        libri.add(libro);

        System.out.println("\nLibro Aggiunto con successo!\n");

    }

    //ricerca di un libro per titolo
    public void trovaTitolo(String titolo){
        
        for (int i = 0; i < libri.size(); i++) {

            if (libri.get(i).getTitolo() == titolo) {
                
                printLibro(libri.get(i).getTitolo(), libri.get(i).getAutore());

            }else if(i == libri.size() - 1){

                System.out.println("Questo libro non è disponibile");

            }
        }

    }

    //ricerca dei libri di un autore
    public void trovaAutore(String autore){
        
        for (int i = 0; i < libri.size(); i++) {

            if (libri.get(i).getAutore() == autore) {
                
                printLibro(libri.get(i).getTitolo(), libri.get(i).getAutore());

            }else if(i == libri.size() - 1){

                System.out.println("Questo libro non è disponibile");

            }

        }

    }

    //ricerca di un libro per ISBN
    public void trovaISBN(String ISBN){
        
        for (int i = 0; i < libri.size(); i++) {

            if (libri.get(i).getISBN() == ISBN) {
                
                printLibro(libri.get(i).getTitolo(), libri.get(i).getAutore());
                break;

            }else if(i == libri.size() - 1){

                System.out.println("Questo libro non è disponibile");

            }
        }

    }

    public void verificaDisponibilita(String titolo, char disponibile){

        for (int i = 0; i < libri.size(); i++) {

            if (libri.get(i).getTitolo() == titolo && libri.get(i).getDisponibile() == 'y') {

                System.out.println("Il libro " + libri.get(i).getTitolo() + " è disponibile");
                System.out.println("Vuoi che venga prestato? s/n");
                
                String scelta;

                do {

                    scelta = scanner.nextLine();
                    if (scelta == "s"){

                        prestaLibro(libri.get(i).getTitolo(), libri.get(i).getAutore());

                    }else{

                        break;

                    }

                } while (scelta != "s" && scelta != "n");

            }else if (libri.get(i).getTitolo() == titolo && libri.get(i).getDisponibile() == 'n') {

                System.out.println("Il libro " + libri.get(i).getTitolo() + " è attualmente in prestito");

            }
        }

    }

    public void prestaLibro(String titolo, String autore){

        for (int i = 0; i < libri.size(); i++) {

            if (libri.get(i).getTitolo() == titolo && libri.get(i).getAutore() == autore) {
                
                libri.get(i).setDisponibile('p');

            }else if(i == libri.size() - 1){

                System.out.println("Questo libro non è disponibile");

            }
        }

    }

    public void restitusciLibro(String titolo, String autore){

        for (int i = 0; i < libri.size(); i++) {

            if (libri.get(i).getTitolo() == titolo && libri.get(i).getAutore() == autore) {
                
                libri.get(i).setDisponibile('y');

            }else if(i == libri.size() - 1){

                System.out.println("Questo libro non è disponibile");

            }

        }

    }

    public void printLibro(String titolo, String autore){

        for (int i = 0; i < libri.size(); i++) {

            if (libri.get(i).getTitolo() == titolo && libri.get(i).getAutore() == autore) {
                
                System.out.println("Titolo: " + libri.get(i).getTitolo());
                System.out.println("Autore: " + libri.get(i).getAutore());
                System.out.println("Numero pagine: " + libri.get(i).getPagine());
                System.out.println("ISBN: " + libri.get(i).getISBN());
                System.out.println("Disponibilità: " + libri.get(i).getDisponibile());
                System.out.println("\n");

    
            }
        }
        
    }

    public void printAll(){

        for (int i = 0; i < libri.size(); i++) { 

            System.out.println("Titolo: " + libri.get(i).getTitolo());
            System.out.println("Autore: " + libri.get(i).getAutore());
            System.out.println("Numero pagine: " + libri.get(i).getPagine());
            System.out.println("ISBN: " + libri.get(i).getISBN());
            System.out.println("Disponibilità: " + libri.get(i).getDisponibile());

        }
        
    }

}