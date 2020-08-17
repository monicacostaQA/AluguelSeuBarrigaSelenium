package  br.ce.mcosta.test ;
import  org.junit.Assert ;
import  org.junit.Test ;

import  br.ce.mcosta.core.BaseTest ;
import  br.ce.mcosta.page.SeuBarrigaHomePage ;
import  br.ce.mcosta.page.SeuBarrigaMovimentarPage ;

public  class  TesteSeuBarrigaInserirMovimentacaoFutura  extends  BaseTest {
	
	privado  SeuBarrigaHomePage pageSBHome =  new  SeuBarrigaHomePage ();
	privado  SeuBarrigaMovimentarPage pageSBMovimentarConta =  new  SeuBarrigaMovimentarPage ();

	@Teste
	public  void  deveChecarMovimentacaoFutura () {
		
		pageSBHome . clicarCriarMovimentacao ();
		p�ginaSBMovimentarConta . setDataMovimentacao ( " 17/08/2020 " );
		p�ginaSBMovimentarConta . setDataPagamento ( " 17/08/2021 " );
		p�ginaSBMovimentarConta . setDescricao ( " testeMovimentacao " );
		p�ginaSBMovimentarConta . setInteressado ( " testeMovimentacao " );
		p�ginaSBMovimentarConta . setValor ( " testeMovimentacao " );
		p�ginaSBMovimentarConta . setConta ( " Conta para movimentacoes " );
		p�ginaSBMovimentarConta . setSituacaoPgmto ( " Pago " );
		p�ginaSBMovimentarConta . clicarSalvarMovimentacao ();
		
		Assert . assertEquals ( " Data da Movimenta��o deve ser menor ou igual � data atual \ n "
							+ " Valor deve ser um n�mero " , pageSBMovimentarConta . getMensagemRetorno ());
		
		p�ginaSBMovimentarConta . setValor ( " 7250 " );
		p�ginaSBMovimentarConta . clicarSalvarMovimentacaoPosPrimeiroSalvar ();
		
		Assert . assertEquals ( " Data da Movimenta��o deve ser menor ou igual � data atual "
								, p�ginaSBMovimentarConta . getMensagemRetorno ());
	}
}