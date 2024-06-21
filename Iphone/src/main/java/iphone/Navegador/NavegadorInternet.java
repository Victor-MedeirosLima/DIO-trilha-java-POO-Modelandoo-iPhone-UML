/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iphone.Navegador;

/**
 *
 * @author Pichau
 */
public class NavegadorInternet implements INavegadorInternet{
    
    @Override
    public void exibirPaginar(String url){
        
        System.out.println("Abriu a pagina "+url+"");

        
    }
    
    @Override
    public void adicionarNovaAba(){
        
        System.out.println("Adicionou uma nova aba");

    }
    
    @Override
    public void atualizarPagina(){
        
        System.out.println("A pagina foi atualizada");

    }
    
}
