public class Libro {

    private String titolo;    //titolo del libro
    private String autore;    //nome e cognome autore del libro
    private String genere;    //genere del libro
    private int anno;         //anno di pubblicazione del libro
    private int pagine;       //numero di pagine del libro
    private String ISBN;      //ISBN del libro
    private char disponibile; //disponibilità del libro in biblioteca (y = disponibile - n = attualmente in prestito)


    //Costruttore
    Libro(String titolo, String autore, String genere, int anno, int pagine, String ISBN, char disponibile){
        this.titolo = titolo;
        this.autore = autore;
        this.genere = genere;
        this.anno = anno;
        this.pagine = pagine;
        this.ISBN = ISBN;
        this.disponibile = disponibile;
    }

    //----Metodi Setter----

    public void setTitolo(String titolo){
            this.titolo = titolo;
    }

    public void setAutore(String autore){
        this.autore = autore;
    }

    public void setGenere(String genere){
        this.genere = genere;
    }

    public void setAnno(int anno){
        this.anno = anno;
    }

    public void setPagine(int pagine){
        this.pagine = pagine;
    }

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    public void setDisponibile(char disponibile){
        this.disponibile = disponibile;
    }


    //----Metodi Getter----

    public String getTitolo(){
        return titolo;
    }

    public String getAutore(){
        return autore;
    }

    public String getGenere(){
        return genere;
    }

    public int getAnno(){
        return anno;
    }

    public int getPagine(){
        return pagine;
    }

    public String getISBN(){
        return ISBN;
    }

    public char getDisponibile(){
        return disponibile;
    }
    
}
