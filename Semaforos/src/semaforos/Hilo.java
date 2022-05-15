/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package semaforos;

import java.awt.Color;
import static java.lang.Thread.sleep;
import javax.swing.*;

public class Hilo implements Runnable{
    
    JButton rojo1;
    JButton amarillo1;
    JButton verde1;
    JButton rojo2;
    JButton amarillo2;
    JButton verde2;
    
    
    public Hilo(JButton s1Rojo, JButton s1Amarillo, JButton s1Verde, JButton s2Rojo, JButton s2Amarillo, JButton s2Verde){
        this.rojo1=s1Rojo;
        this.amarillo1=s1Amarillo;
        this.verde1=s1Verde;
        this.rojo2=s2Rojo;
        this.amarillo2=s2Amarillo;
        this.verde2=s2Verde;
    }

    @Override
    public void run(){
        
        while(true){
            
            rojo1.setBackground(Color.gray);
            amarillo1.setBackground(Color.gray);
            verde1.setBackground(Color.green);
            rojo2.setBackground(Color.red);
            amarillo2.setBackground(Color.gray);
            verde2.setBackground(Color.gray);
                
            try{
                sleep(5000);
            }catch (InterruptedException e){

            }
            
            rojo1.setBackground(Color.gray);
            amarillo1.setBackground(Color.yellow);
            verde1.setBackground(Color.gray);
                
            try{
                sleep(2000);
            }catch (InterruptedException e){

            }
            
            rojo1.setBackground(Color.red);
            amarillo1.setBackground(Color.gray);
            verde1.setBackground(Color.gray);
            
            rojo2.setBackground(Color.gray);
            amarillo2.setBackground(Color.gray);
            verde2.setBackground(Color.green);
                    
            try{
                sleep(5000);
            }catch (InterruptedException e){

            }
            
            rojo2.setBackground(Color.gray);
            amarillo2.setBackground(Color.yellow);
            verde2.setBackground(Color.gray);
            try{
                sleep(2000);
            }catch (InterruptedException e){

            }
            
        }
    }
    
    public void start(){
        new Thread(this).start();
    }
}
