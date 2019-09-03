package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("primeiraConta tem " + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 500;
		System.out.println("segundaConta tem " + segundaConta.saldo);
	}

}
