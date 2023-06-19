package produto;

import java.util.List;
import java.util.ArrayList;


public class Pedido {
	public List<Produto> produtos;
	
	public Pedido(){
		this.produtos=new ArrayList<>();
		
	}
	
	public void adicionarProduto(Produto p) {
		produtos.add(p);
	}
	
	public List<Produto> getProdutos(){
		return produtos;
	}
	
	public double calcularTotal() {
		double total=0;
		for(Produto p: produtos) {
			total+=p.getPreco();
		}
		
		return total;
	}

}
