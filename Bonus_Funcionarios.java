
public class Bonus_Funcionarios {
	public static void main(String[] args) {
		
		int MetaFaturamentoEmpresa = 800000;
		int ValorFaturamentoReal = 640560;
		int MediaSalarioFuncionario = 3450;
		
		if (ValorFaturamentoReal >= MetaFaturamentoEmpresa) {
		System.out.println("Recebem Bonus de: R$" + MediaSalarioFuncionario);
	}
		 if (ValorFaturamentoReal <= MetaFaturamentoEmpresa && ValorFaturamentoReal >= ((MetaFaturamentoEmpresa * 80)/100)) {
		System.out.println("Recebem bonu de R$"+ ((MediaSalarioFuncionario * 80)/100));
		
	}else if (ValorFaturamentoReal <= MetaFaturamentoEmpresa) {
			System.out.println("Não recebe Bonus !!");
		}
	


}}
