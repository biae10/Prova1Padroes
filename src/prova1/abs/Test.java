package prova1.abs;

public class Test {

	public static void main(String[] args) {
		
		Equipamento equipamento = EquipamentoFactory.getInstance()
													.criaEquipamento(TipoEquipamento.HALTERE, "Halter01", 0);
		
		System.out.println(equipamento.getTipo());
		System.out.println(equipamento.getIdentificador());
		System.out.println(equipamento.getQuantidade());
		
		Equipamento equipamento1 = EquipamentoFactory.getInstance()
													 .criaEquipamento(TipoEquipamento.HALTERE, "Halter01", 0);
		
		System.out.println(equipamento1.getTipo());
		System.out.println(equipamento1.getIdentificador());
		System.out.println(equipamento1.getQuantidade());
		
		

	}

}
