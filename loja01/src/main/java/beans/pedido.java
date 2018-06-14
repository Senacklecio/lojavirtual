package beans;

import java.sql.Date;


import javax.persistence.*;

@Entity
@Table(name = "pedido")

public class pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "ped_id")
	private static int id;
	@Column(name ="pes_id",length = 20, nullable = true)
	private Pessoa idPessoas;
	@Column(name = "fpg_id ", nullable = true)
	private int idPagamento;
	@Column(name = "ped_dataEmissao", nullable = true)
	private Date dataEmisao;
	@Column(name = "ped_status", nullable = true)
	private String status;
	@Column(name = "ped_dataAutorizacao", nullable = true)
	private Date dataAutorizacao;
	@Column(name = "ped_total", nullable = false)
	private double pedidoTotal;
	@Column(name = "ped_desconto", nullable = false)
	private float desconto;
	
	
	public static int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Pessoa getIdPessoas() {
		return idPessoas;
	}
	public void setIdPessoas(Pessoa pessoa) {
		this.idPessoas = pessoa;
	}
	public int getIdpagamento() {
		return idPagamento;
	}
	public void setIdpagamento(int idPagamento) {
		this.idPagamento = idPagamento;
	}
	public Date getdataemisao() {
		return dataEmisao;
	}
	public void setDataemisao(Date dataEmisao) {
		this.dataEmisao = dataEmisao;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDataautorizacao() {
		return dataAutorizacao;
	}
	public void setIDataautorizacao(Date dataAutorizacao) {
		this.dataAutorizacao = dataAutorizacao;
	}
	public double getPedidototal() {
		return pedidoTotal;
	}
	public void setPedidototal(double pedidoTotal) {
		this.pedidoTotal = pedidoTotal;
	}
	public float getDesconto() {
		return desconto;
	}
	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
	
}
