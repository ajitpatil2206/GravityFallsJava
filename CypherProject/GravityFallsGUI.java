import gravityfalls.CaesarCipher;
import gravityfalls.AtbashCipher;
import gravityfalls.VigenereCipher;
import java.awt.*;
import java.awt.event.*;

public class GravityFallsGUI extends WindowAdapter implements ActionListener {
    Frame frame;
    Label l1, l2, l3;
    TextField t1, t2;
    Button b1, b2, b3, b4, b5;

    GravityFallsGUI() {
        frame = new Frame("Gravity Falls");

        l1 = new Label("Ciphers", Label.CENTER);
        b1 = new Button("Caesar Cipher");
        b2 = new Button("Atbash Cipher");
        b3 = new Button("Vigenere Cipher");

        frame.add(l1);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        frame.addWindowListener(this);

        frame.setLayout(new GridLayout(0, 1));
        frame.setSize(250, 400);
        frame.setVisible(true);
        frame.setResizable(false); 
    }

    public void windowClosing(WindowEvent e) {
        frame.dispose(); /* System.exit(0); */
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Caesar Cipher")) {
            frame.remove(b1);
            frame.remove(b2);
            frame.remove(b3);

            l1.setText("Caesar Cipher");
            l2 = new Label("Enter message here", Label.CENTER);
            l3 = new Label("Encrypted message", Label.CENTER);

            t1 = new TextField(20);
            t2 = new TextField(20);

            b4 = new Button("Encrypt");
            b5 = new Button("Back");

            frame.add(l2);
            frame.add(t1);
            frame.add(b4);
            frame.add(l3);
            frame.add(t2);
            frame.add(b5);
            
            b4.addActionListener(this);
            b5.addActionListener(this);
            frame.addWindowListener(this);

            frame.setLayout(new GridLayout(0, 1));
            frame.setSize(250, 400);
            frame.setVisible(true);
            frame.setResizable(false); 
        }
        if (ae.getActionCommand().equals("Atbash Cipher")) {
            frame.remove(b1);
            frame.remove(b2);
            frame.remove(b3);

            l1.setText("Atbash Cipher");
            l2 = new Label("Enter message here", Label.CENTER);
            l3 = new Label("Encrypted message", Label.CENTER);

            t1 = new TextField(20);
            t2 = new TextField(20);

            b4 = new Button("Encrypt");
            b5 = new Button("Back");

            frame.add(l2);
            frame.add(t1);
            frame.add(b4);
            frame.add(l3);
            frame.add(t2);
            frame.add(b5);
            
            b4.addActionListener(this);
            b5.addActionListener(this);
            frame.addWindowListener(this);

            frame.setLayout(new GridLayout(0, 1));
            frame.setSize(250, 400);
            frame.setVisible(true);
            frame.setResizable(false);
        }
        if (ae.getActionCommand().equals("Vigenere Cipher")) {
            frame.remove(b1);
            frame.remove(b2);
            frame.remove(b3);

            l1.setText("Vigenere Cipher");
            l2 = new Label("Enter message here", Label.CENTER);
            l3 = new Label("Encrypted message", Label.CENTER);

            t1 = new TextField(20);
            t2 = new TextField(20);

            b4 = new Button("Encrypt");
            b5 = new Button("Back");

            frame.add(l2);
            frame.add(t1);
            frame.add(b4);
            frame.add(l3);
            frame.add(t2);
            frame.add(b5);
            
            b4.addActionListener(this);
            b5.addActionListener(this);
            frame.addWindowListener(this);

            frame.setLayout(new GridLayout(0, 1));
            frame.setSize(250, 400);
            frame.setVisible(true);
            frame.setResizable(false);
        }
        if (ae.getActionCommand().equals("Encrypt")) {
            if (l1.getText().equals("Caesar Cipher")) {
                String plainText = t1.getText();
                int shift = 2;
                CaesarCipher cipher = new CaesarCipher(plainText, shift);
                t2.setText(cipher.getEncrypted());
            }
            else if (l1.getText().equals("Atbash Cipher")) {
                String plainText = t1.getText();
                AtbashCipher cipher = new AtbashCipher(plainText);
                t2.setText(cipher.getEncrypted());
            }
            else if (l1.getText().equals("Vigenere Cipher")) {
                String plainText = t1.getText(), key = "abc";
                VigenereCipher cipher = new VigenereCipher(plainText, key);
                t2.setText(cipher.getEncrypted());
            }
        }
        if (ae.getActionCommand().equals("Back")) {
            Component[] components = frame.getComponents();
            int count = frame.getComponentCount();

            for (int i=0; i<count; i++) {
                frame.remove(components[i]);
            }

            l1 = new Label("Ciphers", Label.CENTER);
            b1 = new Button("Caesar Cipher");
            b2 = new Button("Atbash Cipher");
            b3 = new Button("Vigenere Cipher");

            frame.add(l1);
            frame.add(b1);
            frame.add(b2);
            frame.add(b3);

            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            frame.addWindowListener(this);

            frame.setLayout(new GridLayout(0, 1));
            frame.setSize(250, 400);
            frame.setVisible(true);
            frame.setResizable(false); 
        }
    }

    public static void main(String[] args) {
        new GravityFallsGUI();
    }
}