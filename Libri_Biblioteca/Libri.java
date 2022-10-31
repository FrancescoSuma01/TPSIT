public class Libri {
   
    private String titolo;
    private String autore;
    private String numPagine;
    private String casaEditrice;
    private String genere;

    void setTitolo(String titolo){
            this.titolo = titolo;
    }

    String getTitolo(){
        return titolo;
    }

    void setAutore(String autore){
        this.autore = autore;
    }    

    String getAutore(){
        return autore;
    }

    void setPagine(String numPagine){
        this.numPagine = numPagine;
    }

    String getPagine(){
        return numPagine;
    }

    void setCasaEditrice(String casaEditrice){
        this.casaEditrice = casaEditrice;
    }

    String getCasaEditrice(){
        return casaEditrice;
    }

    void setGenere(String genere){
        this.genere = genere;
    }

    String getGenere(){
        return genere;
    }
}
