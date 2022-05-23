package prova1.abs;

public class Maquina extends Equipamento {
	
	private String descricao;
	private String marca;

	public Maquina(String identificador, Integer quantidade, String marca, String descricao) {
		super(identificador, quantidade, TipoEquipamento.MAQUINA);
		this.descricao = descricao;
		this.marca = marca;
	}

	@Override
	protected void criarEquipamento() {
		System.out.println("Criando uma maquina...");
		
		
	}
	
	

}
