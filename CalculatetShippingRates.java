import javax.swing.*;
import java.awt.event.*;
import java.text.*;
public class CalculatetShippingRates
{
  public static void main(String[] args)
  {
      JFrame f=new JFrame("Nikhil Batta first project in Java");

      JLabel lb1 = new JLabel("Enter item weight");
      lb1.setBounds(5,50,125,20);
      JTextField tf1=new JTextField();
      tf1.setBounds(150,50,150,20);
 
      JLabel lb2 = new JLabel("Enter shipping rate");
      lb2.setBounds(5,75,125,20);
      JTextField tf2=new JTextField();
      tf2.setBounds(150,75, 150,20);

      JTextField tf3=new JTextField();
      tf3.setBounds(100,240, 150,30);
      tf3.setEditable(false);
		
   JButton b2 =new JButton("Internation Shipping Costs");
     b2.setBounds(100,175,150,30);
    b2.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            double a = Double.parseDouble(tf1.getText());
            double b = Double.parseDouble(tf2.getText());
            DecimalFormat dF = new DecimalFormat("$###,##0.00");
            tf3.setText("The international rate is" + dF.format(calculateInternationalShippingRate(a,b)));
         }
      });
                        
      JButton b1=new JButton("Calculate Shipping Rate");
      b1.setBounds(100,275,150,30);
      b1.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
            {
             double a = Double.parseDouble(tf1.getText());
             double b = Double.parseDouble(tf2.getText());
             DecimalFormat dF = new DecimalFormat("$###,##0.00");
             tf3.setText("The rate is " + dF.format(calculateShippingRate(a, b)));
            }
      });
      JButton xb=new JButton("Close Window");
      xb.setBounds(100,325,150,30);
      xb.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
            {
               System.exit(1);
            }
      });
      f.add(b1);
      f.add(b2);
      f.add(lb1);
      f.add(tf1);
      f.add(lb2);
      f.add(tf2);
      f.add(tf3);
      f.add(xb);
      f.setSize(400,400);
      f.setLayout(null);
      f.setVisible(true);
  }
  public static double calculateShippingRate(double weight, double rate)
  {
    return weight*rate;
  }
  public static double calculateInternationalShippingRate(double weight, double rate)
   {
      return weight*rate + 29.95;
   }
                        
}