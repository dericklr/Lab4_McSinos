package mcsinos;

import java.util.LinkedList;
import java.util.Queue;

import produto.Pedido;
import produto.Produto;

public class Kds {
	private Queue<Pedido> filaPedidos;
	
	
	public Kds() {
		this.filaPedidos=new LinkedList<>();
		
	}
	
	public void mostrarFila() {
		if(filaPedidos.isEmpty()) {
			System.out.println("Não há pedidos listados...");
		}else {
			int numPedido=1;
			System.out.println("Fila de pedidos:");
			for(Pedido p:filaPedidos){
				System.out.println("Pedido "+ numPedido);
				for(Produto produto:p.getProdutos()) {
					System.out.println(produto.getNome()+": R$"+produto.getPreco());
				}
				System.out.println("Total: R$"+ p.calcularTotal());
				System.out.println();
				numPedido++;
				
			}
		}
	}
	
	public void solicitaPedido(Pedido p) {
		filaPedidos.add(p);
	}
	
	public void entregaPedido() {
		if(filaPedidos.isEmpty()) {
			System.out.println("Não há pedidos a serem entregues...");
		}else {
			Pedido pedido=filaPedidos.poll();
			System.out.println("Pedido entregue!");
			for(Produto produto:pedido.getProdutos()) {
				System.out.println(produto.getNome()+": R$"+produto.getPreco());
			}
			System.out.println("Total: R$"+pedido.calcularTotal());

			
		}
	}
	
	

}
