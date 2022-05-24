package prova1.abs;

public class Test {

	public static void main(String[] args) {
		
		//Adiciona um equipamento
		Equipamento equipamento = EquipamentoFactory.getInstance().criaEquipamento(TipoEquipamento.HALTERE, "Halter01", 1);
		
		System.out.println(equipamento.getTipo());
		System.out.println(equipamento.getIdentificador());
		System.out.println(equipamento.getQuantidade());
		
		//Tenta adicionar o mesmo equipamento. Deve aumentar a quantidade para 2
		Equipamento equipamento1 = EquipamentoFactory.getInstance().criaEquipamento(TipoEquipamento.HALTERE, "Halter01", 0);
		
		System.out.println(equipamento1.getTipo());
		System.out.println(equipamento1.getIdentificador());
		System.out.println(equipamento1.getQuantidade());
		
		//Cria uma maquina
		Equipamento equipamento2 = EquipamentoFactory.getInstance().criaEquipamento(TipoEquipamento.MAQUINA, "Maquina01", 1);
		System.out.println(equipamento2.getTipo());
		System.out.println(equipamento2.getIdentificador());
		System.out.println(equipamento2.getQuantidade());
		
		//Tenta criar a mesma maquina
		Equipamento equipamento3 = EquipamentoFactory.getInstance().criaEquipamento(TipoEquipamento.MAQUINA, "Maquina01", 5);
		System.out.println(equipamento3.getQuantidade());
		
		
		
		
	}

}
