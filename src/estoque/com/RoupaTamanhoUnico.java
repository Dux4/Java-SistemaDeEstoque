package estoque.com;

public class RoupaTamanhoUnico extends Peca implements Item{

	public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
		super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
	}
	
	@Override
	public void venda() {
		setQuantidade(getQuantidade() - 1);
		System.out.println("Temos " + getQuantidade() + " quantidade de Saída de praia no estoque!");
	}



} 
