package prova1.abs;

public class Test {

	public static void main(String[] args) {
		
		Equipamento equipamento = EquipamentoFactory.criaEquipamento(TipoEquipamento.HALTERE);
		System.out.println(equipamento.getTipo());

	}

}
