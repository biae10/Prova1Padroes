package prova1.abs;

public class Acessorio extends Equipamento {
	
	private String descricao;

	public Acessorio(String identificador, Integer quantidade, String descricao ) {
		super(identificador, quantidade, TipoEquipamento.ACESSORIO);
		this.descricao = descricao;
	}
	
	

}
