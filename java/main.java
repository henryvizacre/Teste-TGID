public class Main {
	public static void main( String args[] ) {
		Usuário usuário 	= new Usuário();
		Produto produto;
        Venda venda;
		String nomeUsuário;
        String cpfUsuário;

		JOptionPane.showMessageDialog( null, venda.dadosDaCompra(), 
			"Resultado da Compra", 1
		);

		System.out.print( venda.removerProduto( "leite" ) + "\n\n" + venda.printProduto( 0 ) );

		System.exit(0);		
	}
}