package estoque.com;

//Antes dentro do switch case sempre era chamado o metodo escolha();. Por isso as vendas sempre reiniciavam kkkkkkkk
//No PDF, quando o usuario escolhe a opcao 5 para sair é pedido que se exiba os estoques. Tem um bug nas roupas P M G q nao aparece o estoque. Mas agora a mimir

import java.util.Scanner;

public class Aplication implements Item{

    public static void main(String[] args) {
        escolha();
    }

    public static void escolha() {
        Scanner scan = new Scanner(System.in);

        Peca i[] = new Peca[5];
        i[0] = new RoupaPMG("Camisas floridas e sem estampas do seu tamanho!", 10, 15, 10, 35, 3);
        i[1] = new RoupaPMG("Saias lindas, de vários tamanhos! P, M e G!", 10, 15, 10, 35, 3);
       i[2] = new Acessorio("Um cinto top de couro de segunda linha.", 10, 1, 10);
        i[3] = new Acessorio("Uma linda pulseira de conchas exportadas do Himalaia.", 9, 1, 10);
        i[4] = new RoupaTamanhoUnico("Uma linda saída de praia por apenas 19,99! TAMANHO UNICO!", 15, 2, 20);

        int opcao;

        //Antes dentro do switch case sempre era chamado o metodo escolha();. Por isso as vendas sempre reiniciavam kkkkkkkk
        
        do {
            System.out.println("BEM-VINDOS A NOSSA LOJA! ESCOLHA UM TIPO DE ITEM ABAIXO PARA CONTINUAR! \n"
                    + "--------------MENU--------------- \n"
                    + "| 0 – Camisa                    | \n"
                    + "| 1 – Saia                      | \n"
                    + "| 2 – Cinto                     | \n"
                    + "| 3 – Pulseira                  | \n"
                    + "| 4 – Saída de praia            | \n"
                    + "| 5 – Sair do sistema           |");
            System.out.println("---------------------------------");
            System.out.print("Escolha uma das opcoes acima: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 0:
                    i[0].venda();
                    // i[0].reposicaoEstoque();
                    break;

                case 1:
                     i[1].venda();
                    // i[1].reposicaoEstoque();
                    break;

                case 2:
                   i[2].venda();
                    break;

                case 3:
                     i[3].venda();
                    break;

                case 4:
                    System.out.println("ATENÇÃO! Saída de praia é um item de tamanho único!");
                     i[4].venda();
                    break;
            }

        } while (opcao != 5);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("| Saindo do sistema... |");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=");
        
        
       
        
        //Exibindo o estoque
        System.out.println(" ");
        System.out.println(" ");
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("| Estoque Final... |");
        
		System.out.println("|CAMISAS|");
        i[0].getQuantidadeTOTAL(); // Era pra mostrar a quantidade de P | M | G 
        
        System.out.println(" ");
        System.out.println(" ");
        
		System.out.println("|Saias|");
        i[1].getQuantidadeTOTAL(); // Era pra mostrar a quantidade de P | M | G 
        
        System.out.println(" ");
        
        System.out.println("Temos no estoque " + i[2].getQuantidade()  + " " + i[2].getDescricao() );
        System.out.println("Temos no estoque " + i[3].getQuantidade()  + " " + i[3].getDescricao() );
        System.out.println("Temos no estoque " + i[4].getQuantidade() + " " + i[4].getDescricao());    
        
    }
    
    
}
