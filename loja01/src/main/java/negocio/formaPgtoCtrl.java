package negocio;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;


import beans.FormaPgto;
import beans.Pessoa;
import beans.Produto;
import persistencia.PessoaDAO;
import persistencia.ProdutoDAO;
import persistencia.formaPgtodao;

@ManagedBean
@SessionScoped
public class formaPgtoCtrl implements Serializable {
		
		private static final long serialVersionUID =1L;
		private static FormaPgto formaPgto = new FormaPgto();
		private String filtro = "";
		public FormaPgto getFormaPgto() {
			return formaPgto;
		}
		public void setFormaPgto(FormaPgto formaPgto) {
			this.formaPgto = formaPgto;
		}
		public String getFiltro() {
			return filtro;
		}
		public void setFiltro(String filtro) {
			this.filtro = filtro;
		}
		
		public List<FormaPgto>getListagem(){
			return formaPgtodao.listagem(filtro);
		}
		
		public String actionGravar() {
			FacesContext context = 	FacesContext.getCurrentInstance();
			if(formaPgto.getId() == 0) {
				formaPgtodao.inserir(formaPgto);
				context.addMessage(null, new FacesMessage("Sucesso",  "Inserido com sucesso!") );
			}
			else {
				formaPgtodao.alterar(formaPgto);
				context.addMessage(null, new FacesMessage("Sucesso",  "Alterado com sucesso!") );
			}
			return "/admin/lista_formaPgto";
		}
		
		public static String formaPgtPedido() {
			formaPgto = new FormaPgto();
			return "/admin/lista_formaPgto";
		}
		
		
		public String actionInserir() {
			formaPgto = new FormaPgto();
			return "/admin/lista_formaPgto";
		}
		
		
		public String actionExcluir() {
			formaPgtodao.excluir(formaPgto);
			 return "/admin/lista_formaPgto";
			 
		}
		
		
		
		
}
