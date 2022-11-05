import java.util.ArrayList;
import java.util.Scanner;

public class NegozioDischi{

    Scanner scanner = new Scanner(System.in);
    
    ArrayList<CD> cd = new ArrayList<CD>();
    ArrayList<Disco> dischi = new ArrayList<Disco>();

    private String nome;
    private String citta;
    private String via;
    private int numeroCivico;

    NegozioDischi(String nome, String citta, String via, int numeroCivico){

        this.nome = nome;
        this.citta = citta;
        this.via = via;
        this.numeroCivico = numeroCivico;

    }

    //metodo che aggiunge un CD
    public void addCD(String titolo, String cantante, int numeroTracce, float durata, int quantita){

        CD cd1 = new CD(titolo, cantante, numeroTracce, durata, quantita);
        cd.add(cd1);

    }

    //metodo che aggiunge un disco
    public void addDisco(String titolo, String cantante, int numeroTracce, float durata, int numeroGiri, int quantita){

        Disco disco = new Disco(titolo, cantante, numeroTracce, durata, numeroGiri, quantita);
        dischi.add(disco);

    }

    //metodo che vende un CD
    public void vendiCD(String titolo, String cantante){

        int quantita = 0;

        for (int i = 0; i < cd.size(); i++) {
            if (cd.get(i).getTitolo() == titolo && cd.get(i).getCantante() == cantante) {
                
                quantita = cd.get(i).getQuantita();
                cd.get(i).setQuantita(quantita - 1);

            }
        }

    }

    //metodo che vende un disco
    public void vendiDischi(String titolo, String cantante){

        int quantita = 0;

        for (int i = 0; i < cd.size(); i++) {
            if (dischi.get(i).getTitolo() == titolo && dischi.get(i).getCantante() == cantante) {
                
                quantita = dischi.get(i).getQuantita();
                dischi.get(i).setQuantita(quantita - 1);

            }
        }

    }
    
    //metodo che verifica la disponibilità di un CD
    public void verificaDisponibilitaCD(String titolo, String cantante){

        String scelta;

        for (int i = 0; i < cd.size(); i++) {

            if (cd.get(i).getTitolo() == titolo && cd.get(i).getCantante() == cantante && cd.get(i).getQuantita() > 0) {
                
                System.out.println("Questo CD è disponibile");

                do {
                    
                    System.out.println("Vuoi venderne 1? s/n");
                    scelta = scanner.nextLine();

                } while (scelta != "s" && scelta != "n");
                
                if (scelta == "s") {
                    
                    vendiCD(titolo, cantante);

                }

            }else{
                System.out.println("Questo CD non è disponibile");
            }

        }

    }

    //metodo che verifica la disponibilità di un disco
    public void verificaDisponibilitaDischi(String titolo, String cantante){

        String scelta;

        for (int i = 0; i < dischi.size(); i++) {

            if (dischi.get(i).getTitolo() == titolo && dischi.get(i).getCantante() == cantante && dischi.get(i).getQuantita() > 0) {
                
                System.out.println("Questo Vinile è disponibile");

                do {
                    
                    System.out.println("Vuoi venderne 1? s/n");
                    scelta = scanner.nextLine();

                } while (scelta != "s" && scelta != "n");
                
                if (scelta == "s") {
                    
                    vendiDischi(titolo, cantante);

                }

            }else{
                System.out.println("Questo CD non è disponibile");
            }

        }

    }

    public void stampaCD(String titolo, String cantante){

        for (int i = 0; i < cd.size(); i++) {

            if (cd.get(i).getTitolo() == titolo && cd.get(i).getCantante() == cantante) {
                
                System.out.println("\nTitolo: " + cd.get(i).getTitolo());
                System.out.println("Cantante: " + cd.get(i).getCantante());
                System.out.println("Numero di Tracce: " + cd.get(i).getNTracce());
                System.out.println("Durata: " + cd.get(i).getDurata());
                System.out.println("Quantità: " + cd.get(i).getQuantita() + "\n");

            }else{
                System.out.println("Questo CD non è disponibile");
            }

        }

    }
    
    public void stampaDisco(String titolo, String cantante){

        for (int i = 0; i < dischi.size(); i++) {

            if (dischi.get(i).getTitolo() == titolo && dischi.get(i).getCantante() == cantante) {
                
                System.out.println("\nTitolo: " + dischi.get(i).getTitolo());
                System.out.println("Cantante: " + dischi.get(i).getCantante());
                System.out.println("Numero di Tracce: " + dischi.get(i).getNTracce());
                System.out.println("Durata: " + dischi.get(i).getDurata());
                System.out.println("Numero giri: " + dischi.get(i).getNGiri());
                System.out.println("Quantità: " + dischi.get(i).getQuantita() + "\n");

            }else{
                System.out.println("Questo disco non è disponibile");
            }

        }

    }

    public void ricercaCDCantante(String cantante){

        for (int i = 0; i < cd.size(); i++) {

            System.out.println("Di questo autore sono disponibili: ");

            if (cd.get(i).getCantante() == cantante) {
                
                stampaCD(cd.get(i).getTitolo(), cd.get(i).getCantante());

            }else if(i==cd.size()){

                System.out.println("Di questo cantante non sono disponibili CD");


            }

        }

    }

    public void ricercaDiscoCantante(String cantante){

        System.out.println("Di questo autore sono disponibili: ");

        for (int i = 0; i < dischi.size(); i++) {

            if (dischi.get(i).getCantante() == cantante) {
                
                stampaDisco(dischi.get(i).getTitolo(), dischi.get(i).getCantante());

            }else if(i==dischi.size()){

                System.out.println("Di questo cantante non sono disponibili dischi");


            }

        }

    }

    public void riassortimentoCD(String titolo, String cantante, int quantita){

        for (int i = 0; i < cd.size(); i++) {

            if (cd.get(i).getCantante() == cantante && cd.get(i).getTitolo() == titolo) {
                
                int quantita1 = cd.get(i).getQuantita();
                
                cd.get(i).setQuantita(quantita + quantita1);

            }

        }


    }

    public void riassortimentoDischi(String titolo, String cantante, int quantita){

        for (int i = 0; i < dischi.size(); i++) {

            if (dischi.get(i).getCantante() == cantante && dischi.get(i).getTitolo() == titolo) {
                
                int quantita1 = dischi.get(i).getQuantita();
                
                dischi.get(i).setQuantita(quantita + quantita1);

            }

        }


    }

}
