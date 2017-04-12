	

public class TestaPagamentos {
	
	public static void main(String[] args) {
		
	
	
	Pagamentos pagamentos = new Pagamentos();
	
	
	Pagamento pagamento1 = new Pagamento();
	
	Pagamento pagamento2 = new Pagamento();
	
	pagamento1.setValor(105);
	pagamento2.setValor(25);
	
	pagamentos.registra(pagamento1);
	pagamentos.registra(pagamento2);
	
	System.out.println(pagamentos.getValorPago());
	
	

	
//	Pagamentos pagamentos2 = new Pagamentos();
//	ArrayList<Pagamento> colecoesDePagamentos = new ArrayList<Pagamento>();
//	
//	
//	
//	Pagamento pagamento3 = new Pagamento();
//	Pagamento pagamento4 = new Pagamento();
//	
//	pagamento3.setValor(105);
//	pagamento4.setValor(25);
//	
//	colecoesDePagamentos.add(pagamento3);
//	colecoesDePagamentos.add(pagamento4);
//	
//	pagamentos2.addAll(colecoesDePagamentos);
//	System.out.println(pagamentos2.getValorPago());
	
	
	
	
	}
	

}
