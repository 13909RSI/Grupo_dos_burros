import java.util.Scanner;

public class Projeto_ {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int escolha;
        

        System.out.println("\n");
        System.out.println ("Projeto Criado por: \n\n" +
                "Diogo Vareda, nº: 13900 \n" +
                "Miguel Pereira, nº: 13909 \n" +
                "Rúben Silva, nº: 13898.\n");


        System.out.println("MENU:");
        System.out.println("Escolha o jogo que quer jogar (tem de introduzir o número que aparece antes do nome do jogo)." +
                "\n" +
                "(1) Desenho de figuras geométricas;\n" +
                "(2) Desenho de trangulos lado a lado; \n" +
                "(3) Jogo do Galo; \n" +
                "(4) Sair");

        do{

            System.out.print("\nEscolha o seu Jogo: ");
            
            escolha = ler.nextInt();

            if (escolha < 1 || escolha > 4) {

                System.out.print("Número inválido.");

            }


        }while (escolha < 1 || escolha > 4);
            
        if(escolha == 1){
            
            System.out.println("Desenho de figuras geométricas iniciado.");


        }
        if (escolha == 2){

            System.out.println("Desenho de triangulos lado a lado iniciado.");

        }
        if(escolha == 3){
            
            System.out.println("Jogo do Galo iniciado");

        }
        if(escolha == 4){
            System.out.println("A sair do executavél.");
            System.exit(0);
        }

        
        //escolha = ler.nextInt();


        
        System.out.println("Resposta inválida");
        

    }
}
