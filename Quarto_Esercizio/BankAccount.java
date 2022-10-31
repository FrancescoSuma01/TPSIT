
import java.util.ArrayList;

public class BankAccount {
    private ArrayList<String> bankAccount = new ArrayList<String>();
    private ArrayList<Double> balance = new ArrayList<Double>();
    private ArrayList<Integer> accountNumber = new ArrayList<Integer>();

    //metodo che crea in ogni arrayList una casella contenente rispettivamente: nome dell'intestatario del conto, bilancio, numero del conto generato casualmente
    void addAccount(Double initialBalance, String name){
        double doubleRandomNumber = Math.random() * 5;

        bankAccount.add(name);
        balance.add(initialBalance);
        accountNumber.add((int)doubleRandomNumber);

        System.out.println("\n-------- ATTENZIONE --------");
        System.out.println("Il tuo numero di conto è: " + (int)doubleRandomNumber);
        System.out.println("\n----------------------------");

    }

    //metodo che deposita sul conto una somma di denaro inserita dall'utente
    void deposit(int AccountNumber, Double amount){
        
        int i = 0;

        while(accountNumber.contains(AccountNumber)) {
            i+=1;
        }

        if (i == accountNumber.size()) {
            System.out.println("Account non trovato");
        } else {
            double bilancio = balance.get(i);
            bilancio += amount;
            balance.set(i, bilancio);
        }

    }

    //metodo che preleva dal conto una somma di denaro inserita dall'utente
    void withdraw(int AccountNumber, Double amount){
        
        int i = 0;

        while(accountNumber.contains(AccountNumber)) {
            i+=1;
        }

        if (i == accountNumber.size()) {
            System.out.println("Account non trovato");
        } else {
            double bilancio = balance.get(i);
            bilancio -= amount;
            balance.set(i, bilancio);
        }

    }

    double getBalance(int AccountNumber){

        balance.get(AccountNumber);

        return balance.get(AccountNumber);
    }

    void transfer(int fromAccNumber, int toAccNumber, double amount){

        int posFrom = 0;
        int posTo = 0;

        while(accountNumber.contains(fromAccNumber)) {
            posFrom+=1;
        }

        while(accountNumber.contains(toAccNumber)) {
            posTo+=1;
        }

        if (posFrom == accountNumber.size() || posTo == accountNumber.size()) {
            System.out.println("Account non trovato");
        } else {
            double bilancio = balance.get(posFrom);
            double somma = bilancio - amount;

            balance.set(posFrom, somma);

            bilancio = 0;
            somma = 0;

            bilancio = balance.get(posTo);
            somma = bilancio + amount;

        }

    }

}
