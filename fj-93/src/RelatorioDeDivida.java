import java.text.NumberFormat;
import java.util.Locale;

public class RelatorioDeDivida {

	private final Divida divida;

	public RelatorioDeDivida(Divida divida) {

		this.divida = divida;
	}

	public void geraRelatorio(NumberFormat formatador) {
		System.out.println("Cnpj credor: " + divida.getCnpjCredor());
		System.out.println("Credor: " + divida.getCredor());

		System.out.println("Valor pago: " + formatador.format(divida.getTotal()));
		System.out.println("Valor pago: " + formatador.format(divida.getValorPago()));

	}

	public static void main(String[] args) {

		NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

		Divida divida = new Divida();
		divida.setCredor("Uma Empresa");
		divida.setTotal(100);
		divida.setValor("00.000.002/0001-01");

		Pagamento pagamento = new Pagamento();
		pagamento.setCnpjPagador("00.000.02/0002-02");
		pagamento.setPagador("Outra Empresa");
		pagamento.setValor(20);
		divida.registra(pagamento);

		RelatorioDeDivida relatorio = new RelatorioDeDivida(divida);
		relatorio.geraRelatorio(formatador);

	}

}
