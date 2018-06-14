package persistencia;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import beans.*;

public class PessoaDAO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public static void inserir(Pessoa pessoa) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction t = sessao.beginTransaction();
		sessao.save(pessoa);
		t.commit();
		sessao.close();
	}

	public static void alterar(Pessoa pessoa) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction t = sessao.beginTransaction();
		sessao.update(pessoa);
		t.commit();
		sessao.close();
	}
	
	public static void excluir(Pessoa pessoa) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction t = sessao.beginTransaction();
		sessao.delete(pessoa);
		t.commit();
		sessao.close();
	}
	
	public static Pessoa pessoaQueFazPedido(Pessoa pessoa) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction t = sessao.beginTransaction();
		sessao.delete(pessoa);
		t.commit();
		sessao.close();
		return pessoa;
	}
	
	public static List<Pessoa> listagem(String filtro) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Query consulta;
		if(filtro.trim().length() == 0){
			consulta = sessao.createQuery("from Pessoa order by pes_nome");
		} else {
			consulta = sessao.createQuery("from Produto "
					+ "where pes_nome like :parametro order by pes_nome");
			consulta.setString("parametro", "%" + filtro + "%");
		}
		List<Pessoa> lista = consulta.list();
		sessao.close();
		return lista;
	}
	
	public static void excluir(Fone fones) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction t = sessao.beginTransaction();
		sessao.delete(fones);
		t.commit();
		sessao.close();
	}

	public Pessoa retornaUsuario(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

}
