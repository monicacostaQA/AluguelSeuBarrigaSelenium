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
		páginaSBMovimentarConta . setDataMovimentacao ( " 17/08/2020 " );
		páginaSBMovimentarConta . setDataPagamento ( " 17/08/2021 " );
		páginaSBMovimentarConta . setDescricao ( " testeMovimentacao " );
		páginaSBMovimentarConta . setInteressado ( " testeMovimentacao " );
		páginaSBMovimentarConta . setValor ( " testeMovimentacao " );
		páginaSBMovimentarConta . setConta ( " Conta para movimentacoes " );
		páginaSBMovimentarConta . setSituacaoPgmto ( " Pago " );
		páginaSBMovimentarConta . clicarSalvarMovimentacao ();
		
		Assert . assertEquals ( " Data da Movimentação deve ser menor ou igual à data atual \ n "
							+ " Valor deve ser um número " , pageSBMovimentarConta . getMensagemRetorno ());
		
		páginaSBMovimentarConta . setValor ( " 7250 " );
		páginaSBMovimentarConta . clicarSalvarMovimentacaoPosPrimeiroSalvar ();
		
		Assert . assertEquals ( " Data da Movimentação deve ser menor ou igual à data atual "
								, páginaSBMovimentarConta . getMensagemRetorno ());
	}
}