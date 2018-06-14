/*package negocio;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;


import beans.FormaPgto;
import beans.Produto;
import beans.pedido;
import persistencia.ProdutoDAO;
import persistencia.formaPgtodao;
import persistencia.pedidoDAO;

@ManagedBean
@SessionScoped

public class pedidoCtrl implements Serializable {
		
		private static final long serialVersionUID =1L;
		private pedido Pedido = new pedido();
		private String filtro = "";
		public pedido getPedido() {
			return Pedido;
		}
		public void setPedido(pedido Pedido) {
			this.Pedido = Pedido;
		}
		public String getFiltro() {
			return filtro;
		}
		public void setFiltro(String filtro) {
			this.filtro = filtro;
		}
		
		public List<pedido>getListagem(){
			return pedidoDAO.listagem(filtro);
		}
		
		public String actionGravar() {
			FacesContext context = 	FacesContext.getCurrentInstance();
			if(Pedido.getId() == 0) {
				pedidoDAO.inserir(Pedido);
				context.addMessage(null, new FacesMessage("Sucesso",  "Inserido com sucesso!") );
			}
			else {
				pedidoDAO.alterar(Pedido);
				context.addMessage(null, new FacesMessage("Sucesso",  "Alterado com sucesso!") );
			}
			return "/admin/lista_Pedido";
		}
		
		public String actionInserir() {
			Pedido = new pedido();
			return "/admin/lista_pedido";
		}
		
		public String actionExcluir() {
		pedidoDAO.excluir(Pedido);
			 return "/admin/lista_pedido";
			 
		}
		
		
}
*/
