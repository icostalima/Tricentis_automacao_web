package br.com.tricentis.steps;

import br.com.tricentis.page.InsurantDataPage;
import br.com.tricentis.page.PriceOptionPage;
import br.com.tricentis.page.ProductDataPage;
import br.com.tricentis.page.SendQuotePage;
import br.com.tricentis.page.VehicleDataPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	VehicleDataPage vehicleDataPage = new VehicleDataPage();
	InsurantDataPage insurantDataPage= new InsurantDataPage();
	ProductDataPage productDataPage= new ProductDataPage();
	PriceOptionPage priceOptionPage= new PriceOptionPage();
	SendQuotePage sendQuotePage= new SendQuotePage();


	@Given("que estou na pagina de cadastro do seguro tricentis")
	public void queEstouNaPaginaDeCadastroDoSeguroTricentis() {
		vehicleDataPage.abreUrl();
	}

	@When("preencho o formulario da pagina enter vehicle data")
	public void preenchoOFormularioDaPaginaEnterVehicleData() {
		vehicleDataPage.preencherCamposVehicleData();
	}

	@When("preencho o formulario da pagina enter insurant data")
	public void preenchoOFormularioDaPaginaEnterInsurantData() {
		insurantDataPage.preencherCamposInsurantData();
	}

	@When("preencho o formulario da pagina enter product data")
	public void preenchoOFormularioDaPaginaEnterProductData() {
		productDataPage.preencherCamposProductData();
	}

	@When("seleciono o preco na pagina select price option")
	public void selecionoOPrecoNaPaginaSelectPriceOption() {
		priceOptionPage.selecionarPriceOption();
	}

	@When("preencho o formulario da pagina send quote e envio")
	public void preenchoOFormularioDaPaginaSendQuoteEEnvio() {
		sendQuotePage.preencherCamposSendQuote();
	}

	@Then("valido a mensagem sending email success")
	public void validoAMensagemSendingEmailSuccess() {
		sendQuotePage.validarMensagemSucesso();
	}
}
