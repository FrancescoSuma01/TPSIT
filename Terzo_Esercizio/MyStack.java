import java.util.ArrayList;

public class MyStack {

    private ArrayList<String> stack = new ArrayList<String>();

    MyStack(){
        System.out.println("Chiamata al Costruttore di default");
    }

    void pop(){
        stack.remove(stack.size()-1);
    }

    void push(String stringa){
        stack.add(stringa);
    }

    int getCount(){
        return stack.size();
    }

    void stampa(){
        int i = 0;
        
        System.out.println("Il contenuto dell'ArrayList è: ");
        
        for (String string : stack) {
            System.out.println(i + "] " + string);

            i++;
        }
    }
}
