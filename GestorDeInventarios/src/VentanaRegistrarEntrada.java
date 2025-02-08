import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.IOException;

import helper_classes.*;

public class VentanaRegistrarEntrada {
 String texto = "";

  public  VentanaRegistrarEntrada() {

    


     JFrame frame = new JFrame("Registrar Entrada de Material");
     frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     frame.setSize(469, 254);
     JPanel panel = new JPanel();
     panel.setLayout(null);
     panel.setBackground(Color.decode("#1e1e1e"));

     JTextField element2 = new JTextField("");
     element2.setBounds(35, 100, 400, 21);
     element2.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element2.setBackground(Color.decode("#B2B2B2"));
     element2.setForeground(Color.decode("#656565"));
     element2.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
     OnFocusEventHelper.setOnFocusText(element2, "Your Input!", Color.decode("#353535"),   Color.decode("#656565"));
     panel.add(element2);

     JButton Registrar = new JButton("Registrar MAP");
     Registrar.setBounds(180, 22, 106, 28);
     Registrar.setBackground(Color.decode("#2e2e2e"));
     Registrar.setForeground(Color.decode("#D9D9D9"));
     Registrar.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     Registrar.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     Registrar.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(Registrar, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(Registrar);

     Registrar.addActionListener((ActionEvent e) -> {
      texto= ( texto + "\n" + element2.getText());
      EscribirEnBaseDeDatos escribir = new EscribirEnBaseDeDatos(texto);

      JOptionPane.showMessageDialog(null, "Se ha registrado la entrada de material con éxito");
      element2.setText("");
 
    });
    

     frame.add(panel);

    



     frame.setVisible(true);


  }
  //getters and setters
  public String getTexto() {
    return texto;
  }

}
