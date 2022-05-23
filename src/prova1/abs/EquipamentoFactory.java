package prova1.abs;

import java.util.ArrayList;

public class EquipamentoFactory {
	
	static ArrayList<Equipamento> listaEquipamentos = new ArrayList<Equipamento>();
	
	//private Equipamento verificaSeExisteAntesDeCriar() {
	//	
	//}
	
	public static Equipamento criaEquipamento(TipoEquipamento tipo) {
		
		Equipamento equipamento = null;
	
		switch (tipo) {
		case HALTERE:
			equipamento = new Haltere("Haltere01", 1, 0);
			break;
		case MAQUINA:
			equipamento = new Maquina("Maquina01", 2, null, null);
			break;
		case ACESSORIO:
			equipamento = new Acessorio("Acessorio01", 3, null);
			break;
		default:
			break;
		}
		
		return equipamento;
		
	}


}
