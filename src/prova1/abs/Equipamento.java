package prova1.abs;

public abstract class Equipamento {
	
	private String identificador;
	private Integer quantidade;
	private TipoEquipamento tipo = null;
	
	public Equipamento(String identificador, Integer quantidade, TipoEquipamento tipo) {
		super();
		this.identificador = identificador;
		this.quantidade = quantidade;
		this.tipo = tipo;
	}
	
	//protected abstract void criarEquipamento();
	
	public void adicionaEquipamento() {
		this.quantidade =+ 1;
	}
	
	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public TipoEquipamento getTipo() {
		return tipo;
	}

	public void setTipo(TipoEquipamento tipo) {
		this.tipo = tipo;
	}
	
	

}
