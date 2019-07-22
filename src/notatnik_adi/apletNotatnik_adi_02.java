package notatnik_adi;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
* @author Adrian
* copyright MIT
*/

public class apletNotatnik_adi_02 extends Applet implements ActionListener
{
    private Label       notatka; 
    private TextArea    notatki;
    private Button      zapisz;

    public apletNotatnik_adi_02()
    {
        //tworzenie obiektow
        notatka     = new Label("Notatka:");
        notatki     = new TextArea( 15,15 );
        zapisz      = new Button("           Zapisz             ");
        add(notatka);
        add(notatki);
        add(zapisz);
        zapisz.addActionListener(this);
    }
    public void actionPerformed(ActionEvent event)
    {
        String  notka;       
        notka = notatki.getText();
        System.out.println(notka);       
       // doLayout( );
    }
}