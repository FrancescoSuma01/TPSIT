package Tabellone;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Tabellone extends JFrame implements ActionListener{
    
    Random nRandom = new Random();
    JLabel textLabel;
    JPanel pannello;
    JButton[][] pulsantiNumeri;

    Tabellone(){

        this.setTitle("Tabellone - FS"); //titolo della finestra
        this.setLayout(new BorderLayout()); //imposta come layout il border layout
        this.setSize(1000, 700); //imposta la dimensione della finestra
        this.setLocationRelativeTo(null); //imposta la posizione della scheda

        createLabelTabellone();

        pannello = new JPanel(); //crea un JPanel che conterrà la tabella
        pulsantiNumeri = new JButton[9][10]; //crea una matrice di pulsanti

        int n = 1;
        String numero;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 10; j++) {
                pulsantiNumeri[i][j] = new JButton();
                pulsantiNumeri[i][j].setFont(new Font("Times New Roman", Font.BOLD, 45));
                //numbers[i][j].setSize(20, 20);
                pulsantiNumeri[i][j].setBorder(BorderFactory.createLineBorder(Color.red, 2));
                pulsantiNumeri[i][j].setOpaque(true);
                pulsantiNumeri[i][j].setFocusable(false);
                pulsantiNumeri[i][j].addActionListener(this);
                numero = Integer.toString(n);
                pulsantiNumeri[i][j].setText(numero);
                n++;
                pannello.add(pulsantiNumeri[i][j]);
                
            }
        }

        pannello.setLayout(new GridLayout(9,10));
        this.add(textLabel,BorderLayout.NORTH);
        this.add(pannello,BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void createLabelTabellone(){
        //crea la label con scritto Cartella in bianco con sfondo rosso
        textLabel = new JLabel("Tabellone", SwingConstants.CENTER);
        textLabel.setBackground(Color.RED);
        textLabel.setForeground(Color.WHITE);
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setFont(new Font("Times New Roman", Font.PLAIN, 62));
        textLabel.setOpaque(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 10; j++) {
                if(e.getSource()==pulsantiNumeri[i][j]){
                    if(pulsantiNumeri[i][j].getBackground()!=(Color.green)){
                        pulsantiNumeri[i][j].setBackground(Color.green);
                    }else{
                        pulsantiNumeri[i][j].setBackground(null);
                    }
                }
            }
        }
    }
}