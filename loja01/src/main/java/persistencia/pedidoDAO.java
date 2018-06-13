/*package persistencia;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import beans.Fone;
import beans.pedido;

public class pedidoDAO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public static void inserir(pedido Pedido) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction t = sessao.beginTransaction();
		sessao.save(Pedido);
		t.commit();
		sessao.close();
	}

	public static void alterar(pedido Pedido) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction t = sessao.beginTransaction();
		sessao.update(Pedido);
		t.commit();
		sessao.close();
	}
	
	public static void excluir(pedido Pedido) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction t = sessao.beginTransaction();
		sessao.delete(Pedido);
		t.commit();
		sessao.close();
	}
	
	public static List<pedido> listagem(String filtro) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Query consulta;
		if(filtro.trim().length() == 0){
			consulta = sessao.createQuery("from pedido order by ped_id");
		} else {
			consulta = sessao.createQuery("from pedido "
					+ "where ped_id like :parametro order by ped_id");
			consulta.setString("parametro", "%" + filtro + "%");
		} 
		List<pedido> lista = consulta.list();
		sessao.close();
		return lista;
	}

	public static pedido listarUltimoPedidoAdicionado() {
		// TODO Auto-generated method stub
		return null;
	}

}
*/
