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
		páginaSBMovimentarConta . clicarSalvarMovimentacao ();
		
		Assert . assertEquals ( " Data da Movimentação é obrigatório \ n "
							+ " Data do pagamento é obrigatório \ n "
							+ " Descrição é obrigatório \ n "
							+ " Interessado é obrigatório \ n "
							+ " Valor é obrigatório \ n "
							+ " Valor deve ser um número " , pageSBMovimentarConta . getMensagemRetorno ());
	}
}