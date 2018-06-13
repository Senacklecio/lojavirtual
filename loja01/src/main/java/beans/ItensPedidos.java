package beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "itens_pedido")

public class ItensPedidos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "ipe_id")
	private static int id;

	@Column(name ="ped_id",length = 20, nullable = true)
	private static int pedidoid;

	
	@Column(name ="pro_id",length = 20, nullable = true)
	private static int produtoid;

	
	@Column(name ="ipe_qtde",length = 20, nullable = true)
	private static float pedidoQuant;
	
	
	@Column(name ="ipe_valorUnit",length = 20, nullable = true)
	private static float IpValorUnit;

	
	@Column(name ="ipe_subtotal",length = 20, nullable = true)
	private static float ipSubTotal;
	
	
	
	

	public static int getId() {
		return id;
	}


	public static void setId(int id) {
		ItensPedidos.id = id;
	}


	public static int getPedidoid() {
		return pedidoid;
	}


	public static void setPedidoid(int pedidoid) {
		ItensPedidos.pedidoid = pedidoid;
	}


	public static int getProdutoid() {
		return produtoid;
	}


	public static void setProdutoid(int produtoid) {
		ItensPedidos.produtoid = produtoid;
	}


	public static float getPedidoQuant() {
		return pedidoQuant;
	}


	public static void setPedidoQuant(float pedidoQuant) {
		ItensPedidos.pedidoQuant = pedidoQuant;
	}


	public static float getIpValorUnit() {
		return IpValorUnit;
	}


	public static void setIpValorUnit(float ipValorUnit) {
		IpValorUnit = ipValorUnit;
	}


	public static float getIpSubTotal() {
		return ipSubTotal;
	}


	public static void setIpSubTotal(float ipSubTotal) {
		ItensPedidos.ipSubTotal = ipSubTotal;
	}
	
}
