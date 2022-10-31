public class Biblioteca {

    Libri libro = new Libri();

    //ArrayList<Libri> libri = new ArrayList<Libri>();

    void insertBook(String titolo, String autore, String numPagine, String casaEditrice, String genere){
        
        libro.setTitolo(titolo);
        libro.setAutore(autore);
        libro.setPagine(numPagine);
        libro.setCasaEditrice(casaEditrice);
        libro.setGenere(genere);
        
    }

    void showBook(){

        System.out.println("---------------------------");
        System.out.println("Titolo: " + libro.getTitolo());
        System.out.println("Autore: " + libro.getAutore());
        System.out.println("Numero Pagine: " + libro.getPagine());
        System.out.println("Casa Editrice: " + libro.getCasaEditrice());
        System.out.println("Genere: " + libro.getGenere());

    }


}
