/*package negocio;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import beans.FormaPagto;
import beans.ItemPedido;
import beans.Pedido;
import beans.Pessoa;
import beans.Produto;
import persistencia.PessoaDAO;

@ManagedBean
@SessionScoped
public class CarrinhoCtrl {
	private Ite item = new ItemPedido();
	private Pedido pedido = new Pedido();
	private List<ItemPedido> listaPedido = new ArrayList<ItemPedido>();
	private double totalLista;
	private boolean listaVazia;
	private String descricaoPedido;
	
	public void comprar(Produto prod) {
		FacesMessage mensagem = new FacesMessage("");	
		if (itens.size() == 0) {
			itens.setProduto(prod);
			itens.add(item);
			mensagem = new FacesMessage(FacesMessage.SEVERITY_INFO,"Produto "+prod.getNome()+" adicionado no carrinho!",null);
		} else {
			item.setProduto(prod);
			if (verificarItemExiste(item)) {
				mensagem = new FacesMessage(FacesMessage.SEVERITY_INFO,"Adicionado mais 1 unidade de "+ prod.getNome(),null);
			} else {
				listaPedido.add(item);
				mensagem = new FacesMessage(FacesMessage.SEVERITY_INFO,"Produto "+prod.getNome()+" adicionado no carrinho!",null);
			}
		}
		item = new ItemPedido();
		FacesContext.getCurrentInstance().addMessage(null, mensagem);	
	}
	
	public String finalizarPedido() {
		FormaPagto forma = FormaPagtoCtrl.formaPagtPedido();
		Pessoa pessoa = PessoaDAO.pessoaQueFazPedido(pessoa);
		pedido = new Pedido();
		pedido.setData(new Date(System.currentTimeMillis()));
		pedido.setValor(totalLista);
		pedido.setDescricao(this.descricaoPedido);
		pedido.setPessoa(pessoa);
		pedido.setItensPedidos(listaPedido);
		pedido.setFormaPagamento(forma);
		FacesMessage mensagem = new FacesMessage(FacesMessage.SEVERITY_INFO,"Pedido Realizado com Sucesso!!",null);
		FacesContext.getCurrentInstance().addMessage(null, mensagem);	
		return "/cliente/principal.xhtml";
	}
	
	public void teste() {
		Pessoa pessoa = PessoaDAO.pessoaQueFazPedido();
		FacesMessage mensagem = new FacesMessage(FacesMessage.SEVERITY_INFO,"Pessoa Logada:"+PessoaCtrl.usuarioLogado(),null);
		FacesContext.getCurrentInstance().addMessage(null, mensagem);	
	}
	
	
	public void excluirItemLista(ItemPedido item) {
		listaPedido.remove(item);
	}
	
	public boolean verificarItemExiste(ItemPedido item) {
		for (int i = 0; i < listaPedido.size(); i++) {
			if (listaPedido.get(i).getProduto().getId() == item.getProduto().getId()) {				
				listaPedido.get(i).setQtd(listaPedido.get(i).getQtd()+1);
				return true;
			}
		}
		return false;		
	}

	public List<ItemPedido> getListaPedido() {
		return listaPedido;
	}

	public void setListaPedido(List<ItemPedido> listaPedido) {
		this.listaPedido = listaPedido;
	}

	public double getTotalLista() {
		double soma=0;
		for (int i = 0; i < listaPedido.size(); i++) {
			soma = listaPedido.get(i).getSubtotal() + soma;
		}
		return soma;
	}

	public void setTotalLista(double totalLista) {
		this.totalLista = totalLista;
	}


	public boolean isListaVazia() {
		if(listaPedido.size()!=0) {
			return true;
		}else {
			return false;
		}
	}

	public void setListaVazia(boolean listaVazia) {
		this.listaVazia = listaVazia;
	}

	public String getDescricaoPedido() {
		return descricaoPedido;
	}

	public void setDescricaoPedido(String descricaoPedido) {
		this.descricaoPedido = descricaoPedido;
	}
	
}
*/