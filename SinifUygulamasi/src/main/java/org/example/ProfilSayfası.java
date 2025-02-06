package org.example;

import javax.swing.*;

public class ProfilSayfası {
    JFrame frame;
    JLabel isimLabel = new JLabel("İsim : Mehmet Kemal Koç");

    ProfilSayfası(){
        frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(isimLabel);
        frame.setVisible(true);
    }
}
