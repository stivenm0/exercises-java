
package clase;
import javax.swing.*;
import java.awt.event.*;
public  class principal extends JFrame implements ActionListener {
    private JButton boton1;
    private JLabel label1;
    private JTextField fiel1;
    

public principal(){
    setLayout(null);
    boton1= new JButton("mostrar");
    boton1.setBounds(50,100,80,30);
    add(boton1);
    boton1.addActionListener(this);
    
    label1= new JLabel("texto");
    label1.setBounds(10,20,50,15);
    add(label1); 

   fiel1= new JTextField();
   fiel1.setBounds(100,20,90,20);
   add(fiel1);
  }

@Override
    public void actionPerformed(ActionEvent e) {
   if(e.getSource()==boton1){
    String cad= new String ();
   cad= fiel1.getText();
   JOptionPane.showMessageDialog(null, cad);
   }
}
public static void main(String arg[]){
   principal p= new principal();
   p.setBounds(0,0,300,200);
   p.setLocationRelativeTo(null);
   p.setVisible(true);
    
 }

    
    }


