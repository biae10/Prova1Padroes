package prova1.abs;

public class Haltere extends Equipamento {
	
	private double peso;

	public Haltere(String identificador, Integer quantidade, double peso) {
		super(identificador, quantidade, TipoEquipamento.HALTERE);
		this.peso = peso;
	}

}