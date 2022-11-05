public class Main{
    public static void main(String[] args){
    
        
        NegozioDischi store = new NegozioDischi("CD/Dischi", "Ceglie Messapica", "Corso Garibaldi", 14);

        System.out.println("---Creazione del primo disco---");

        store.addDisco("L'amour Toujours", "Gigi D'Agostino", 23, 120, 33, 4);

        store.stampaDisco("L'amour Toujours", "Gigi D'Agostino");
        
 
        System.out.println("\n----------------------------------------------------------\n");

        System.out.println("---Creazione del primo CD---");

        store.addCD("Will of the People", "MUSE", 10, 37, 7);

        store.stampaCD("Will of the People", "MUSE");

        System.out.println("\n----------------------------------------------------------\n");

        System.out.println("---Vendita di un CD---");

        store.vendiCD("Will of the People", "MUSE");

        store.stampaCD("Will of the People", "MUSE");

        System.out.println("\n----------------------------------------------------------\n");

        System.out.println("---Riassortimento CD---");

        store.riassortimentoCD("Will of the People", "MUSE", 3);

        store.stampaCD("Will of the People", "MUSE");

    }
}
