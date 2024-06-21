/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iphone.Musica;

/**
 *
 * @author Pichau
 */
public class ReprodutorMusical implements IReprodutorMusical {
    
    @Override
    public void tocar(){
        
        System.out.println("A musica esta tocando");
        
    }
    
    @Override
    public void pausar(){
        
        System.out.println("A musica foi pausada");
    }
    
    @Override

    public void selecionarMusica(String musica){
        
        System.out.println("A musica "+musica +" foi selecionada");
        
    }
    
}
