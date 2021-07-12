
package javapoo_guanabara.testes;

import java.util.Scanner;

public class Sala_Main {

    public static void main(String[] args) throws InterruptedException {
        
        Scanner leia = new Scanner(System.in);
        int r1, r2, r3 = 0;
        Sala s = new Sala();
        do {
            do {
                System.out.println("==================================================");
                System.out.println("Você está fora da sala, deseja entrar?");
                System.out.println("1. Sim         2.Não");
                r1 = leia.nextInt();
                System.out.println("==================================================");


                if (r1==1) {
                    System.out.println("Oh não! A porta está trancada");
                    System.out.println("Deseja destrancar?");
                    System.out.println("1.Sim     2.Não");
                }
                else{
                    System.out.println("Colabora aí, digita 1! (─__─')");
                    new Thread().sleep(1000);
                    System.out.println("\n\n\n");
                }
            } while (r1 != 1);


            r2 = leia.nextInt();
            if(r2 == 1){
                s.Abrir();
                System.out.println("Destrancada");
                new Thread().sleep(1000);
                System.out.println("");

                System.out.println("Agora deseja entrar?");
                System.out.println("1.Sim      2.Não");
                r3 = leia.nextInt();

                if(r3==1){
                    System.out.println("");
                    System.out.println("Agora que está na sala, me diga...");
                    System.out.println("Qual a cor da sala?");
                    s.cor = leia.next();
                    System.out.println("Quantas carteiras tem?");
                    s.carteiras = leia.nextInt();
                    System.out.println("Quantas janelas tem?");
                    s.janelas = leia.nextInt();
                }
                else{
                    new Thread().sleep(1000);
                    System.out.println("ué kkkkkkkkkk");
                    new Thread().sleep(1000);
                    System.out.println("Tá vamos denovo");
                    new Thread().sleep(1000);
                    System.out.print(".");
                    new Thread().sleep(1000);
                    System.out.print("..");
                    new Thread().sleep(1000);
                    new Thread().sleep(1000);
                    System.out.print("...");
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    
                }
            }
            else{
                System.out.println("\n");
                System.out.println("Você precisa destrancar a porta para entrar...");
                new Thread().sleep(1000);
                System.out.println("\n\n\n\n\n\n\n\n\n\n");
            }

            
        }while(r3 !=1);
        System.out.println("\n\n\n");
        s.Status();
    }
    
}
