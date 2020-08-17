package  br.ce.mcosta.test ;
import  org.junit.Assert ;
import  org.junit.Test ;

import  br.ce.mcosta.core.BaseTest ;
import  br.ce.mcosta.page.SeuBarrigaHomePage ;
import  br.ce.mcosta.page.SeuBarrigaListarPage ;

public  class  TesteSeuBarrigaRemoverConta  extends  BaseTest {
	
	privado  SeuBarrigaHomePage pageSBHome =  new  SeuBarrigaHomePage ();
	privado  SeuBarrigaListarPage pageSBListarConta =  new  SeuBarrigaListarPage ();

	@Teste
	public  void  deveChecarExclusaoMovimentacao () throws  InterruptedException {
		
		pageSBHome . clicarListarContas ();
		pageSBListarConta . clicarExcluir ( " Conta com movimentação " );
		
		Assert . assertEquals ( " Conta em uso na movimentações " , pageSBListarConta . getMensagemRetorno ());
	}
}