package notatnik_adi;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.applet.*;

/*
* @author 
* created Adrian
* copyright MIT
*/

public class apletNotatnik_adi extends Applet implements ActionListener
{

	  private TextField notatnik;
	  private Button zapisz;

   

    public apletNotatnik_adi()
    {
    	notatnik = new TextField(100);
        zapisz  = new Button("           zapisz             ");
        
  
       
        add(notatnik);
        add(zapisz);
  
        zapisz.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent event)
    {
       zapisz();
  
    }
 

    private void zapisz()
    {	String notatki;
    	notatki = notatnik.getText();
        System.out.println(notatki);
       
    }


}