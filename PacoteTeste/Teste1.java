package  br.ce.mcosta.test ;
import  org.junit.Assert ;
import  org.junit.Test ;

import  br.ce.mcosta.core.BaseTest ;
import  br.ce.mcosta.page.SeuBarrigaAddContaPage ;
import  br.ce.mcosta.page.SeuBarrigaHomePage ;

public  class  TesteSeuBarrigaCriarContaJaExistente  extends  BaseTest {
	
	privado  SeuBarrigaHomePage pageSBHome =  new  SeuBarrigaHomePage () ;;
	privado  SeuBarrigaAddContaPage pageSBAddConta =  novo  SeuBarrigaAddContaPage ();

	@Teste
	public  void  deveChecarMsgDeErroContaJaExistente () {
		
		pageSBHome . clicarAdicionarConta ();
		pageSBAddConta . setNome ( " Conta mesmo nome " );
		pageSBAddConta . clicarSalvar ();
		
		Assert . assertEquals ( " Conta já existente, por favor, registrar uma conta com outro nome " + 
				" " , pageSBAddConta . getMensagemRetorno ());
	}
}