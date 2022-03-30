package br.com.tricentis.page;

import org.openqa.selenium.By;

import br.com.tricentis.core.BasePage;

public class SendQuotePage extends BasePage {

	private By txtEmail = By.xpath("//*[@id='email']");
	private By txtUserName = By.xpath("//*[@id='username']");
	private By txtpassword = By.xpath("//*[@id='password']");
	private By txtConfirmPassword = By.xpath("//*[@id='confirmpassword']");
	private By btnSend = By.xpath("//*[@id='sendemail']");
	private By msgSendingSuccess = By.xpath("//h2[.='Sending e-mail success!']");
	

	public void preencherCamposSendQuote() {
		escrever(txtEmail, "teste@teste.com.br");
		escrever(txtUserName, "icostalima");
		escrever(txtpassword, "4321Ig0r");
		escrever(txtConfirmPassword, "4321Ig0r");
		clicarBtn(btnSend);
		
	}
	
	public void validarMensagemSucesso() {
		ValidarElemeto("Sending e-mail success!", msgSendingSuccess);
		printTela();
	}

}
