/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iphone.Telefone;

/**
 *
 * @author Pichau
 */
public class AparelhoTelefonico implements IAparelhoTelefonico {

    @Override
    public void ligar(String numero){
        
        System.out.println("Ligando para "+numero+"");
    }
        
    @Override
    public void atender(){
        
        System.out.println("Atendendo a ligacao");
        
    }
    
    @Override
    public void iniciarCorreioVoz(){
        
        System.out.println("Iniciando o correio de voz");
        
    }
    
}
