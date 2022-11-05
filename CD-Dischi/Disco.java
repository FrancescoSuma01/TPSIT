public class Disco {
    
    private String titolo;      //album
    private String cantante;    //titolo del cantante
    private int numeroTracce;   //numero di tracce presenti sul cd
    private float durata;       //durata totale delle tracce
    private int quantita;       //numero di CD disponibili in store
    private int numeroGiri;     //numero di giri


    //Costruttore
    Disco(String titolo, String cantante, int numeroTracce, float durata, int numeroGiri, int quantita){

        this.titolo = titolo;
        this.cantante = cantante;
        this.numeroTracce = numeroTracce;
        this.durata = durata;
        this.quantita = quantita;
        this.numeroGiri = numeroGiri;

    }

    //-----Metodi Setter-----

    public void setTitolo(String titolo){
        this.titolo = titolo;
    }

    public void setCantante(String cantante){
        this.cantante = cantante;
    }

    public void setNTracce(int numeroTracce){
        this.numeroTracce = numeroTracce;
    }

    public void setDurata(float durata){
        this.durata = durata;
    }
    
    public void setNGiri(int quantita){
        this.numeroGiri = numeroGiri;
    }

    public void setQuantita(int quantita){
        this.quantita = quantita;
    }

    //-----Metodi Getter-----

    public String getTitolo(){
        return titolo;
    }

    public String getCantante(){
        return cantante;
    }

    public int getNTracce(){
        return numeroTracce;
    }

    public float getDurata(){
        return durata;
    }

    public int getNGiri(){
        return numeroGiri;
    }

    public int getQuantita(){
        return quantita;
    }

}
