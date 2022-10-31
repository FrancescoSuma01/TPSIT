public class Main{
    public static void main(String[] args){
        
        
        Biblioteca biblioteca = new Biblioteca("Biblioteca Pietro Gatti", "Ceglie Messapica", "Chiesa", 11);

        System.out.println("------Libro 1------");

        biblioteca.addLibro("Il Piccolo Principe", "Antoine de Saint-Exupéry", "Favola", 1943, 100, "9783140464079", 'y');

        biblioteca.printLibro("Il Piccolo Principe", "Antoine de Saint-Exupéry");

        System.out.println("Prestito:");

        biblioteca.prestaLibro("Il Piccolo Principe", "Antoine de Saint-Exupéry");

        biblioteca.printLibro("Il Piccolo Principe", "Antoine de Saint-Exupéry");

        System.out.println("Restituzione:");

        biblioteca.restitusciLibro("Il Piccolo Principe", "Antoine de Saint-Exupéry");

        biblioteca.printLibro("Il Piccolo Principe", "Antoine de Saint-Exupéry");


    }
}