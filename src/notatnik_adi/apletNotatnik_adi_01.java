package notatnik_adi;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
* @author Weronika Głąbik
* created 14.04.2018 17:04
* copyright MIT
*/

public class apletNotatnik_adi_01 extends Applet implements ActionListener
{

    private Label      wzrost;
    private Label      waga;
    private Label      bmi; 

    private TextField  wprowadzWzrost;
    private TextField  wprowadzWage; 

    private Button     licz;

    public apletNotatnik_adi_01()
    {
        //tworzenie obiektow
        wzrost    = new Label("Twoj wzrost (w centymetrach, np. 173):");
        wprowadzWzrost    = new TextField( 15 );
        waga    = new Label("Twoja waga (w kilogramach, np. 55):");
        wprowadzWage    = new TextField( 15 );
        licz  = new Button("           Przelicz BMI             ");
        bmi       = new Label("Twoje BMI wynosi");
  
       
        add(wzrost);
        add(wprowadzWzrost);
  
        add(waga);
        add(wprowadzWage);
  
        add(licz);
  
        add(bmi);
  
        licz.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent event)
    {
        String  wzrostNapis, wagaNapis, wynik;
        double  wzrost, waga;
        int     BMI;
  
        //pobranie wartosci
        wzrostNapis = wprowadzWzrost.getText();
        wagaNapis = wprowadzWage.getText();
  
        //zamienienie wartosci pobranych na typu double
        wzrost = zmianaNaDouble(wzrostNapis);
        waga = zmianaNaDouble(wagaNapis);
  
        //wyliczenie BMI
        BMI = liczBMI(wzrost, waga);
  
        //wyswietlenie wyniku BMI
        wynik = "Twoje BMI:  " + BMI;
        bmi.setText(wynik);
        
        add( bmi );
        doLayout( );
  
    }
 

    private int liczBMI( double wzrost, double waga)
    {
        int BMI;
        wzrost = wzrost/100;
        BMI = (int) Math.round( waga / (wzrost*wzrost) );
        
        return BMI; 
    }
    

    private double zmianaNaDouble( String str )
    {
        Double doubleObj = new Double( str );
        return doubleObj.doubleValue( );
        
    }


}