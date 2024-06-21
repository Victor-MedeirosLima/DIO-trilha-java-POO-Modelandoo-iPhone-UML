package Aparelho;


import iphone.Musica.IReprodutorMusical;
import iphone.Musica.ReprodutorMusical;
import iphone.Navegador.INavegadorInternet;
import iphone.Navegador.NavegadorInternet;
import iphone.Telefone.AparelhoTelefonico;
import iphone.Telefone.IAparelhoTelefonico;

public class Iphone{
    
    
    
    public static void main(String[] args) {
        
        IReprodutorMusical repMusica = new ReprodutorMusical();
        
        
        repMusica.selecionarMusica("Macarena");
        repMusica.tocar();
        repMusica.pausar();
        
        
        IAparelhoTelefonico  telefone = new AparelhoTelefonico();
        
        telefone.ligar("99814-5688");
        telefone.atender();
        telefone.iniciarCorreioVoz();
        
        INavegadorInternet navegador = new NavegadorInternet();
        
        navegador.adicionarNovaAba();
        navegador.exibirPaginar("Google");
        navegador.atualizarPagina();
        
        
        
        
        
        
        
    }
    
}