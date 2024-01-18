package software.ulpgc.kata;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        new JFrame() {
            {
                setTitle("Hello world!!");
                setSize(800,600);
                setLocationRelativeTo(null);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        }.setVisible(true);
    }
}
