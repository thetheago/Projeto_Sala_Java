
package javapoo_guanabara.testes;
public class Sala {

    boolean aberta;
    String cor;
    int carteiras;
    int janelas;
    int r1;
    void Status(){
        
        aberta = true;
        System.out.println("A sala está aberta? " + aberta);
        System.out.println("Que cor é a sala? " + cor);
        System.out.println("Quantas carteiras tem na sala? " + carteiras);
        System.out.println("Quantas janelas tem na sala? " + janelas);
        
    }
    
    void Abrir(){
        aberta = true;
    }
    void Fechar(){
        this.aberta = false;
    }
    void Entrar(){
        if(aberta == true){
            System.out.println("Você entrou na sala!");
        }
        else{
            System.out.println("A sala está fechada!");
        }
    }
}

