package  br.ce.mcosta.page ;
import  org.openqa.selenium.By ;

import  br.ce.mcosta.core.BasePage ;

public  class  SeuBarrigaLoginPage  extends  BasePage {

	public  void  setUsuario ( String  usuario ) {
		dsl . escrever ( " email " , usuario);
	}
	
	public  void  setSenha ( String  senha ) {
		dsl . escrever ( " senha " , senha);
	}
	
	public  void  clicarEntrar () {
		dsl . clicarBotao ( Por . xpath ( " / html / body / div [2] / form / botão " ));
	}
	
	public  String  getMensagem () {
		return dsl . obterTexto ( Por . xpath ( " / html / body / div [1] " ));
	}
}