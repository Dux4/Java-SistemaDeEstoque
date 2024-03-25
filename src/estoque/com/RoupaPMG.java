package estoque.com;

import java.util.Scanner;

public class RoupaPMG extends Peca implements Item{

	private String descricao;
	private int quantidadeP, quantidadeM, quantidadeG, estoqueMax, estoqueMin;
	
	public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMax,
			int estoqueMin) {
		super(descricao, estoqueMin, estoqueMin, estoqueMin); 
		this.descricao = descricao;
		this.quantidadeP = quantidadeP;
		this.quantidadeM = quantidadeM;
		this.quantidadeG = quantidadeG;
		this.estoqueMax = estoqueMax;
		this.estoqueMin = estoqueMin;
	}

	public void venda() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o tamanho da roupa que você quer: ");
		String tamanho = scan.nextLine();
		
		if(tamanho.equalsIgnoreCase("P")) {
			System.out.println("Voce comprou uma camisa P, parabens pela compra!");
			this.setQuantidadeP( this.getQuantidadeP()-1); 
			System.out.println("Agora temos "+ this.getQuantidadeP() + " camisas P");
		
		}else if(tamanho.equalsIgnoreCase("M")){
			System.out.println("Você comprou uma camisa M, parabens!");
			this.setQuantidadeM(this.getQuantidadeM() - 1);
			System.out.println("Agora temos " + this.getQuantidadeM() + " camisas M");
		
		}else if(tamanho.equalsIgnoreCase("G")){
			System.out.println("Voce comprou uma camisa G, parabens pela compra!");
			this.setQuantidadeG(this.getQuantidadeG() - 1);
			System.out.println("Agora temos " + this.getQuantidadeG() + " camisas G");
		
		}else {
			System.out.println(" ");
			System.out.println("----------------------------ERROR 404-------------------------------");
			System.out.println("| Por favor, digite um tamanho de roupa no modelo: 'P', 'M' ou 'G' |");
			System.out.println("--------------------------------------------------------------------");
		}
	}
	
	public void reposicaoEstoque() {
		if(this.quantidadeP == this.getEstoqueMin()) {
			System.out.println("O estoque das roupas P foi reposto com sucesso!");
			this.setQuantidadeP(this.getEstoqueMax()+ 10);
		}else {
			System.out.println("Não é possível repor o estoque das roupas P no momento, tente novamente mais tarde.");
		}
		
		if(this.quantidadeM == this.getEstoqueMin()) {
			System.out.println("O estoque das roupas M foi reposto com sucesso!");
			this.setQuantidadeM(this.getEstoqueMax());
		}else {
			System.out.println("Não é possível repor o estoque das roupas M no momento, tente novamente mais tarde.");
		}
		
		if( this.quantidadeG == this.getEstoqueMin()) {
			System.out.println("O estoque das roupas G foi reposto com sucesso!");
			this.setQuantidadeG(this.getEstoqueMax());
		}else {
			System.out.println("Não é possível repor o estoque das roupas G no momento, tente novamente mais tarde.");
		}
		
	}
	

	public void getQuantidadeTOTAL() {
	//	System.out.println("------------------------------------------------");
		System.out.println("Temos " + this.getQuantidadeP() + " P");
		System.out.println("Temos " + this.getQuantidadeM() + " M");
		System.out.println("Temos " + this.getQuantidadeG() + " G");
		System.out.println("------------------------------------------------");
	}
	

	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public int getQuantidadeP() {
		return quantidadeP;
	}


	public void setQuantidadeP(int quantidadeP) {
		this.quantidadeP = quantidadeP;
	}


	public int getQuantidadeM() {
		return quantidadeM;
	}


	public void setQuantidadeM(int quantidadeM) {
		this.quantidadeM = quantidadeM;
	}


	public int getQuantidadeG() {
		return quantidadeG;
	}


	public void setQuantidadeG(int quantidadeG) {
		this.quantidadeG = quantidadeG;
	}


	public int getEstoqueMax() {
		return estoqueMax;
	}


	public void setEstoqueMax(int estoqueMax) {
		this.estoqueMax = estoqueMax;
	}


	public int getEstoqueMin() {
		return estoqueMin;
	}


	public void setEstoqueMin(int estoqueMin) {
		this.estoqueMin = estoqueMin;
	}


}
