package bytebank;

public class TesteMetodo {
	
	public static void  main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		contaDoPaulo.saca(10);
		System.out.println(contaDoPaulo.saldo);
	}

}
