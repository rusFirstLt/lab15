package lab15;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab15 extends JFrame{
    public lab15(){
        super("lab15");
        setSize(270,250);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        JButton plus = new JButton("+1");
        plus.setBounds(115,75,75,25);

        JButton minus = new JButton("-1");
        minus.setBounds(115,100,75,25);

        JTextField nol = new JTextField("0");
        nol.setBounds(75,75,115,25);

        JLabel label = new JLabel("Число");
        label.setBounds(25,75,50,25);

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = Integer.parseInt(nol.getText());
                if(x<3) x++;
                nol.setText(Integer.toString(x));
            }
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = Integer.parseInt(nol.getText());
                if(x>-5) x--;
                nol.setText(Integer.toString(x));
            }
        });

        add(plus);
        add(minus);
        add(nol);
        add(label);
        setVisible(true);
    }

    public static void main(String[] args) {
        new lab15();
    }
}