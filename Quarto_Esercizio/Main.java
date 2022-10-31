
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BankAccount bk1 = new BankAccount();
        
        System.out.println("---Creazione nuovo conto Bancario---");
        System.out.println("Inserisci il nome dell'intestatario del conto: ");
        String name = scanner.nextLine();
        System.out.println("Inserisci la somma di denaro iniziale: ");
        double importo = scanner.nextDouble();
        scanner.nextLine();

        bk1.addAccount(importo, name);

        System.out.println("--------------------------------------");
        System.out.println("Quale operazione vuoi effettuare?");
        System.out.println("1: Per depositare");
        System.out.println("2: Per prelevare");
        System.out.println("3: Per sapere il tuo bilancio");
        System.out.println("4: Per effettuare un trasferimento");
        System.out.println("5: Per creare un nuovo conto");

        int scelta = scanner.nextInt();
        scanner.nextLine();

        switch (scelta) {
            //depositare
            case 1:
                System.out.println("Inserisci il numero conto su cui depositare: ");
                int account = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Inserisci la somma di denaro da depositare: ");
                Double denaro = scanner.nextDouble();
                scanner.nextLine();

                bk1.deposit(account, denaro);

                break;
            
            //prelevare
            case 2:
                System.out.println("Inserisci il numero conto su cui depositare: ");
                account = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Inserisci la somma di denaro da depositare: ");
                denaro = scanner.nextDouble();;
                scanner.nextLine();

                bk1.withdraw(account, denaro);

                break;

            //bilancio
            case 3:
                System.out.println("Inserisci il numero conto di cui sapere il bilancio: ");
                account = scanner.nextInt();
                scanner.nextLine();

                bk1.getBalance(account);

                break;

            //trasferimento
            case 4:
                System.out.println("Inserisci il numero conto da cui prendere il denaro: ");
                int accountFrom = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Inserisci il numero conto su cui depositare il denaro: ");
                int accountTo = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Inserisci il numero conto su cui depositare il denaro: ");
                denaro = scanner.nextDouble();
                scanner.nextLine();

                bk1.transfer(accountFrom, accountTo, denaro);
                break;
        
            case 5:
                BankAccount bk2 = new BankAccount();
            
                System.out.println("---Creazione nuovo conto Bancario---");
                System.out.println("Inserisci il nome dell'intestatario del conto: ");
                name = scanner.nextLine();
                System.out.println("Inserisci la somma di denaro iniziale: ");
                importo = scanner.nextDouble();
                scanner.nextLine();
        
                bk2.addAccount(importo, name);
                break;
        
            default:
                System.out.println("Non è possibile svolgere quest'operazione");
                break;
        }
    }
}