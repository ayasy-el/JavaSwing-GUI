/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author M S I
 */
import javax.swing.*;
import java.awt.event.*;

public class EventHandlingExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contoh Event Handling");
        JButton button = new JButton("Klik Saya");

        // Menambahkan ActionListener ke tombol
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Tindakan yang dilakukan saat tombol diklik
                JOptionPane.showMessageDialog(null, "Tombol telah diklik!");
            }
        });

        // Pengaturan Frame
        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
