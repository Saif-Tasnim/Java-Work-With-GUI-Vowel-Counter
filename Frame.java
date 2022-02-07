package VowelCounter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame {
    Container c;
    JTextArea ta;
    JLabel l, a, ve, i, o, u, total;
    JScrollPane scroll;
    JButton bt;
    Font f = new Font("Times New Roman", Font.BOLD, 16);
    int total_vowel = 0;
    int letter_a = 0;
    int letter_e = 0;
    int letter_i = 0;
    int letter_o = 0;
    int letter_u = 0;

    Frame() {
        containerAdd();
        labelDesign();
        textAreaDesign();
        buttonDesign();
        addingWithContainer();
        keyListener();
    }

    public void containerAdd() {
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        c.setFont(f);
    }

    void labelDesign() {
        l = new JLabel("Enter text here : ");
        l.setBounds(60, 30, 100, 30);
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setForeground(Color.BLACK);

        total = new JLabel("Total Number Of Vowels : ");
        total.setBounds(90, 350, 200, 30);
        total.setFont(f);

        a = new JLabel("a : ");
        a.setBounds(90, 380, 100, 30);
        a.setFont(f);

        ve = new JLabel("e : ");
        ve.setBounds(90, 410, 100, 30);
        ve.setFont(f);

        i = new JLabel("i : ");
        i.setBounds(90, 440, 100, 30);
        i.setFont(f);

        o = new JLabel("o : ");
        o.setBounds(90, 470, 100, 30);
        o.setFont(f);

        u = new JLabel("u : ");
        u.setBounds(90, 500, 100, 30);
        u.setFont(f);

    }

    void textAreaDesign() {
        ta = new JTextArea();
        ta.setWrapStyleWord(true);
        ta.setLineWrap(true);
        scroll = new JScrollPane(ta);
        scroll.setBounds(165, 30, 500, 300);


    }

    void  buttonDesign(){
        bt = new JButton("Reset");
        bt.setBounds(600,340,80,30);
        bt.setFont(f);
    }

    void keyListener() {
        ta.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getSource() == ta) {
                    if (e.VK_A == e.getKeyCode()) {
                        total_vowel++;
                        letter_a++;
                    }
                    if (e.VK_I == e.getKeyCode()) {
                        total_vowel++;
                        letter_i++;
                    }
                    if (e.VK_O == e.getKeyCode()) {
                        total_vowel++;
                        letter_o++;
                    }
                    if (e.VK_E == e.getKeyCode()) {
                        total_vowel++;
                        letter_e++;
                    }
                    if (e.VK_U == e.getKeyCode()) {
                        total_vowel++;
                        letter_u++;
                    }

                    total.setText("Total Number of Vowels :  " + total_vowel);
                    a.setText("A :  " + letter_a);
                    ve.setText("E :  " + letter_e);
                    i.setText("I :  " + letter_i);
                    o.setText("O :  " + letter_o);
                    u.setText("U :  " + letter_u);


                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setText("");
                total_vowel=0;
                letter_a =0;
                letter_e =0;
                letter_i =0;
                letter_o =0;
                letter_u =0;
                total.setText("Total Number of Vowels :  " + total_vowel);
                a.setText("A :  " + letter_a);
                ve.setText("E :  " + letter_e);
                i.setText("I :  " + letter_i);
                o.setText("O :  " + letter_o);
                u.setText("U :  " + letter_u);

            }
        });

    }


    void addingWithContainer() {
        c.add(l);
        c.add(scroll);
        c.add(bt);
        c.add(total);
        c.add(a);
        c.add(ve);
        c.add(i);
        c.add(o);
        c.add(u);

    }
}
