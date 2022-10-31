/*
 * author: Francesco Suma
 * class: 5BIA
 * data: 01.10.2022
 * es: Eserciazio ArrayList in Java
*/

/*
 * Traccia: Si realizzi una classe MyStack che, facendo uso di un’istanza della classe ArrayList, implementi il comportamento di uno stack. La classe deve implementare, 
 * oltre ai metodi push e pop, anche un costruttore (senza parametri) e un metodo getCount che restituisce il numero di elementi contenuti nello stack. Si implementi un 
 * metodo main che inserisca nello stack due stringhe e poi le estragga dallo stack per stamparle a video.
*/

public class Main {
    public static void main(String[] args) {

        MyStack S1 = new MyStack();

        System.out.println("-----------------------");

        S1.push("Ciao");
        S1.push("Hello");

        int lunghezza = S1.getCount();
        System.out.println("Nell'ArrayList ci sono " + lunghezza + " stringhe");

        System.out.println("-----------------------");

        S1.stampa();

    }
}