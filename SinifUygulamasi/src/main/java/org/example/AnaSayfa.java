package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnaSayfa implements ActionListener {
    JFrame frame;
    JButton button;
    AnaSayfa(){
        frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));


        button = new JButton("Profil Sayfası");
        button.setSize(50,50);
        button.setFocusable(false);
        button.addActionListener(this);


        frame.add(button);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ProfilSayfası a = new ProfilSayfası();
    }
}
