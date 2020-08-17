package  br.ce.mcosta.test ;
import  org.junit.Assert ;
import  org.junit.Test ;

import  br.ce.mcosta.core.BaseTest ;
import  br.ce.mcosta.page.SeuBarrigaHomePage ;
import  br.ce.mcosta.page.SeuBarrigaMovimentarPage ;

public  class  TesteSeuBarrigaInserirMovimentacaoSemPreencher  extends  BaseTest {
	
	privado  SeuBarrigaHomePage pageSBHome =  new  SeuBarrigaHomePage ();
	privado  SeuBarrigaMovimentarPage pageSBMovimentarConta =  new  SeuBarrigaMovimentarPage ();

	@Teste
	public  void  deveChecarMsgDeErroAoCriarMovimentacao () {
		
		pageSBHome . clicarCriarMovimentacao () ;;
		p�ginaSBMovimentarConta . clicarSalvarMovimentacao ();
		
		Assert . assertEquals ( " Data da Movimenta��o � obrigat�rio \ n "
							+ " Data do pagamento � obrigat�rio \ n "
							+ " Descri��o � obrigat�rio \ n "
							+ " Interessado � obrigat�rio \ n "
							+ " Valor � obrigat�rio \ n "
							+ " Valor deve ser um n�mero " , pageSBMovimentarConta . getMensagemRetorno ());
	}
}