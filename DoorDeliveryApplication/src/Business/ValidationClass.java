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
        
        try{
            phone = 0;
            zipcode = 0;
        }catch(NumberFormatException e){
            e.printStackTrace();
        }
        
        if(name.isEmpty() || email.isEmpty() || location.isEmpty() || address.isEmpty() || username.isEmpty() || password.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "The fields cannot be empty", "Warining", JOptionPane.WARNING_MESSAGE);
        }
        else{
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
            
            
        }
    }
    
}
