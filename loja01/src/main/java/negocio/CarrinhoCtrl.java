package negocio;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import beans.FormaPgto;
import beans.Item;
import beans.Pessoa;
import beans.Produto;
import beans.pedido;
import persistencia.PessoaDAO;

@ManagedBean
@SessionScoped
public class CarrinhoCtrl{
	private List<Item> itens = new ArrayList<Item>();

	private double total = 0.0;

	public void remover(Item Item) {
		itens.remove(Item);
	}
	/*Adicionar produto*/

	public void adiciona(Produto produto) {
		Item item = new Item();
		item.setProduto(produto);
		item.setSubtotal(produto.getPreco());
		item.setQuantidade(1);
		item.setValorunit(produto.getPreco());
		FacesMessage mensagem = new FacesMessage("");	
		if (itens.size() == 0) {
			item.setProduto(produto);
			itens.add(item);
			mensagem = new FacesMessage(FacesMessage.SEVERITY_INFO,"Produto "+produto.getModelo()+" adicionado no carrinho!",null);
		} else {
			item.setProduto(produto);
			if (verificarItemExiste(item)) {
				mensagem = new FacesMessage(FacesMessage.SEVERITY_INFO,"Adicionado mais 1 unidade de "+ produto.getModelo(),null);
			} else {
			itens.add(item);
				mensagem = new FacesMessage(FacesMessage.SEVERITY_INFO,"Produto "+produto.getModelo()+" adicionado no carrinho!",null);
			}
		}
		item = new Item();
		FacesContext.getCurrentInstance().addMessage(null, mensagem);	
	}
		

	public boolean verificarItemExiste(Item item) {
		for (int i = 0; i < itens.size(); i++) {
			if (itens.get(i).getProduto().getId() == item.getProduto().getId()) {				
				itens.get(i).setQuantidade(itens.get(i).getQuantidade()+1);
				itens.get(i).setSubtotal(itens.get(i).getProduto().getPreco() * itens.get(i).getQuantidade());
				
				return true;
			}
		}
		return false;		
	}
	
	public void atualizarProduto(Item item) {
		item.setSubtotal(item.getProduto().getPreco() * item.getQuantidade());
	}

	/*Finalizar pedido
	
	public String finalizarPedido() {
		Pessoa pessoa = PessoaDAO.pessoaQueFazPedido(pessoa);
		pedido = new pedido();
		pedido.setDataemisao(new Date(System.currentTimeMillis()));
		pedido.setPedidototal(total);
		pedido.setIdPessoas(pessoa);
		pedido.setItensPedidos(Item);
		pedido.getIdpagamento(forma)	;
		FacesMessage mensagem = new FacesMessage(FacesMessage.SEVERITY_INFO,"Pedido Realizado com Sucesso!!",null);
		FacesContext.getCurrentInstance().addMessage(null, mensagem);	
		return "/cliente/principal.xhtml";
	}
	
	*/
	

	
	public double getTotal() {
		total = 0;
		for (int i = 0; i < itens.size(); i++) {
			total = total + itens.get(i).getSubtotal();
		}
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	
	public void mensagem() {
		 FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Produto Adicionado",  null);
	     FacesContext.getCurrentInstance().addMessage(null, message);
		
		
		
	}

}
