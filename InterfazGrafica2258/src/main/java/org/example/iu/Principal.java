package org.example.iu;

import org.example.iu.eventos.EventosRaton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Principal extends Frame {
    private Label lblNombre;
    private TextField txtNombre;
    private Button btnBtoton1;


    public Principal(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 600);
        this.setLayout(new FlowLayout());
        lblNombre = new Label("Nombre:");
        this.add(lblNombre);
        txtNombre = new TextField(30);
        this.add(txtNombre);
        btnBtoton1 = new Button("saludar");
        //btnBtoton1.addMouseListener(new EventosRaton());
        btnBtoton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(txtNombre.getText());
                JOptionPane.showConfirmDialog(null,"Hola "+ txtNombre.getText());
            }
        });
        this.add(btnBtoton1);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setVisible(true);
    }

}
