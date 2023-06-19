package main;

import mcsinos.Kds;
import produto.Pedido;
import produto.Produto;
import produto.TipoProduto;

public class Main {
	public static void main(String[] args) {
	Produto p1=new Produto("Xis",12.50,TipoProduto.SANDUICHES);
	Produto p2=new Produto("Refri",5.0,TipoProduto.BEBIDAS);
	Pedido p=new Pedido();
	p.adicionarProduto(p1);
	p.adicionarProduto(p2);
	
	Kds k= new Kds();
	
	k.solicitaPedido(p);
	k.mostrarFila();
	k.entregaPedido();

}
}
