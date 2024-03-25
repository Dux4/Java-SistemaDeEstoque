package estoque.com;

import java.util.Scanner;

public class Acessorio extends Peca implements Item{


	

	public Acessorio(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
		super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
	}

	@Override
	public void venda() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite a quantidade de acessorios que você quer: ");
		int qntd = scan.nextInt();
		if(this.getQuantidade() >= qntd) {
			this.setQuantidade(getQuantidade() - qntd);
			System.out.println("Parabéns! Você comprou um item na nossa loja! Volte sempre!");
			System.out.println("Temos " + super.getQuantidade());
		}else {
			System.out.println("Não é possível vendermos " + qntd + " acessorios, pois só temos" + this.getQuantidade());
		}
	}





}

