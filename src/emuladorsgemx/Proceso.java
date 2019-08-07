
package emuladorsgemx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;


public class Proceso extends Thread {
    public Proceso(String msg){
        super(msg);
    }
    public void run(){
        while(true){
         try{
                Process process = Runtime.getRuntime().exec(this.getName());
                InputStreamReader entrada = new InputStreamReader(process.getInputStream());
                BufferedReader salida = new BufferedReader(entrada);
                String i = null;
                while ((i = salida.readLine()) != null){
                    System.out.println(i);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }   
        
        }
    }
}
