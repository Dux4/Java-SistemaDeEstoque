package estoque.com;

public abstract class Peca {
	public String descricao;
	public int quantidade, estoqueMinimo, estoqueMaximo;
	
	public Peca(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
		this.descricao = descricao;
		this.quantidade = quantidade; 
		this.estoqueMinimo = estoqueMinimo;
		this.estoqueMaximo = estoqueMaximo;
	}
	
	public abstract void venda();
	
	public void reposicaoEstoque() {
		if(this.quantidade < this.estoqueMinimo) {
			this.quantidade = this.estoqueMaximo;
			System.out.println("O estoque foi reposto");
		}else {
			System.out.println("Nada foi feito");
		}
	}
	
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}

	public int getEstoqueMaximo() {
		return estoqueMaximo;
	}

	public void setEstoqueMaximo(int estoqueMaximo) {
		this.estoqueMaximo = estoqueMaximo;
	}

	public void getQuantidadeTOTAL() {
	//	System.out.println("PASSOU");
	}
	
	
	
}
