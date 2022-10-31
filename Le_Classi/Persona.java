public class Persona {
    String nome;
    String cognome;
    int eta;
    String colorePreferito;

    Persona(String nome, String cognome, int eta, String colorePreferito){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.colorePreferito = colorePreferito;
    }

    void saluta(){
        System.out.println("Ciao sono " + nome + cognome + " di età " + eta + " il mio colore preferito è il "+ colorePreferito);
    }

    void cammina(){
        System.out.println("Sto camminando...");
    }

}
