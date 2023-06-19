package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import produto.Pedido;
import produto.Produto;
import produto.TipoProduto;
import mcsinos.Kds;

class McsinosTest {
	

	    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	    @BeforeEach
	     void setUp() {
	        System.setOut(new PrintStream(outputStreamCaptor));
	    }

	    @Test
	     void testAdicionarProdutoAoPedido() {
	        Produto xis = new Produto("Xis", 12.99, TipoProduto.SANDUICHES);
	        Produto cocaCola = new Produto("Coca-Cola", 4.99, TipoProduto.BEBIDAS);

	        Pedido pedido = new Pedido();
	        pedido.adicionarProduto(xis);
	        pedido.adicionarProduto(cocaCola);

	        assertEquals(2, pedido.getProdutos().size());
	        assertEquals(17.98, pedido.calcularTotal());
	    }

	    


	    @Test
	     void testMostrarFilaSemPedidos() {
	        Kds kds = new Kds();
	        kds.mostrarFila();

	        assertEquals("Não há pedidos listados..." , outputStreamCaptor.toString().trim());
	    }

	    @Test
	     void testEntregarPedidoSemPedidos() {
	        Kds kds = new Kds();
	        kds.entregaPedido();

	        assertEquals("Não há pedidos a serem entregues..." , outputStreamCaptor.toString().trim());
	    }
	   
	}

