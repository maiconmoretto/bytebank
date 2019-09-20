package bytebank;

public class TesteMetodo {

	public static void  main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		contaDoPaulo.saca(10);
		System.out.println(contaDoPaulo.saldo);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		boolean sucessoTransferencia = contaDaMarcela.transfere(500, contaDoPaulo);
		if (sucessoTransferencia) {
			System.out.println("transferenia realizada com sucesso");
		} else {
			System.out.println("ocorreu um erro");
		}
		System.out.println(contaDoPaulo.saldo);
	}

}
