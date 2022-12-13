import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Cartella extends JFrame implements ActionListener{
    
    Random nRandom = new Random();
    JLabel textLabel;
    JPanel pannello;
    JButton[][] pulsantiNumeri;

    Cartella(){

        this.setTitle("Cartella - FS"); //titolo della finestra
        this.setLayout(new BorderLayout()); //imposta come layout il border layout
        this.setSize(900, 400); //imposta la dimensione della finestra
        this.setLocationRelativeTo(null); //imposta la posizione della scheda

        createLabelCartella();

        pannello = new JPanel(); //crea un JPanel che conterrà la tabella
        pulsantiNumeri = new JButton[3][9]; //crea una matrice di pulsanti

        //riempimento dei 27 bottoni
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                pulsantiNumeri[i][j] = new JButton();
                pulsantiNumeri[i][j].setFont(new Font("Times New Roman", Font.BOLD, 45));
                //numbers[i][j].setSize(20, 20);
                pulsantiNumeri[i][j].setBorder(BorderFactory.createLineBorder(Color.red, 2));
                pulsantiNumeri[i][j].setOpaque(true);
                pulsantiNumeri[i][j].setFocusable(false);
                pulsantiNumeri[i][j].addActionListener(this);
                pannello.add(pulsantiNumeri[i][j]);
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                int n;
                do{
                    n = nRandom.nextInt(0, 10);
                    n = n == 0 && i == 0 ? n + 1 : n;
                    n = n + (i * 10);
                }while(String.valueOf(n).equals(pulsantiNumeri[0][i].getText()) || String.valueOf(n).equals(pulsantiNumeri[1][i].getText()) || String.valueOf(n).equals(pulsantiNumeri[2][i].getText()));

                pulsantiNumeri[j][i].setText(String.valueOf(n));
            }
        }

        for(int j=0;j<3;j++) {
            for (int i = 0; i < 4; i++) {
                int r;
                do {
                    r = nRandom.nextInt(0, 9);
                } while (pulsantiNumeri[j][r].getText() == "");

                pulsantiNumeri[j][r].setText("");
                pulsantiNumeri[j][r].setEnabled(false);
            }
        }

        pannello.setLayout(new GridLayout(3,9));
        this.add(textLabel,BorderLayout.NORTH);
        this.add(pannello,BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void createLabelCartella(){
        //crea la label con scritto Cartella in bianco con sfondo rosso
        textLabel = new JLabel("Cartella", SwingConstants.CENTER);
        textLabel.setBackground(Color.RED);
        textLabel.setForeground(Color.WHITE);
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setFont(new Font("Times New Roman", Font.PLAIN, 62));
        textLabel.setOpaque(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
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
