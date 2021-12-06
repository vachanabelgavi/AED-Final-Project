/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author vachanabelgavi
 */
public class ValidationClass {
    
    String name;
    String email;
    String location;
    String address;
    String username;
    String password;
    int phone;
    int zipcode;
    
    public void ValidateFields(){
        
        Pattern p;
        
            String nameValidate = "[A-Za-z]{1,100}";
            p = Pattern.compile(nameValidate);
            
            if(!p.matcher(name).matches()){
                JOptionPane.showMessageDialog(null, "Entered name is not correct!!", "Warining", JOptionPane.WARNING_MESSAGE); 
            }
            
            String emailvalidate = "[a-z0-9!-_.&#*]{2,100}[@][a-z]{3,100}[.][a-z]{3}";
            p = Pattern.compile(emailvalidate);
            
            if(!p.matcher(email).matches()){
                JOptionPane.showMessageDialog(null, "Email format : someone@email.com", "Warining", JOptionPane.WARNING_MESSAGE);
            }
            
            String addressValidate = "[0-9]{1,3}\\s[A-Za-z]{1,30}\\s[A-Za-z]{1,30}\\s[A-Za-z]{1,30}";
            p = Pattern.compile(addressValidate);
            
            if(!p.matcher(address).matches()){
                JOptionPane.showMessageDialog(null, "Enter the street number, lane and city.", "Warining", JOptionPane.WARNING_MESSAGE); 
            }
            
            String uservalidate = "[a-zA-Z0-9!@_]{4,100}";
            p = Pattern.compile(uservalidate);
            
            if(!p.matcher(username).matches()){
                JOptionPane.showMessageDialog(null, "Username should be atleast 5 characters.", "Warining", JOptionPane.WARNING_MESSAGE);
            }
            
            String passvalidate = "[a-zA-Z0-9!@_*$#%&^()-]{4,100}";
            p = Pattern.compile(passvalidate);
            
            if(!p.matcher(password).matches()){
                JOptionPane.showMessageDialog(null, "Username should be atleast 5 characters.", "Warining", JOptionPane.WARNING_MESSAGE);
            }
            
            String locvalidate = "[a-zA-Z]{1,100}";
            p = Pattern.compile(locvalidate);
            
            if(!p.matcher(location).matches()){
                JOptionPane.showMessageDialog(null, "Username should be atleast 5 characters.", "Warining", JOptionPane.WARNING_MESSAGE);
            }
            
            if(String.valueOf(phone).length() != 10){
                JOptionPane.showMessageDialog(null, "Phone Number must be 10 digits", "Warining", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            if(String.valueOf(zipcode).length() < 5 || String.valueOf(zipcode).length() >= 6){
                JOptionPane.showMessageDialog(null, "Zip code must be 5 digits", "Warining", JOptionPane.WARNING_MESSAGE);
                return;
            }
    }
    
}
