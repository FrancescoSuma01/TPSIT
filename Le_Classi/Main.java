public class Main{
    public static void main(String[] args){
        
        Persona p1 = new Persona("Francesco", "Suma", 17, "Verde");
        Persona p2 = new Persona("Pippo", "Paperino", 18, "Blu");

        System.out.println("----Persona 1----");
        p1.saluta();
        System.out.println("----Persona 2----");
        p2.saluta();

    }
}