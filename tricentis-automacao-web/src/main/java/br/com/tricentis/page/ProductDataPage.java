package br.com.tricentis.page;

import org.openqa.selenium.By;

import br.com.tricentis.core.BasePage;

public class ProductDataPage extends BasePage {

	private By txtStartDate = By.xpath("//*[@id='startdate']");
	private By cbBoxInsuranceSum = By.xpath("//*[@id='insurancesum']");
	private By cbBoxMeritRating = By.xpath("//*[@id='meritrating']");
	private By cbBoxDamageInsurance = By.xpath("//*[@id='damageinsurance']");
	private By chkEuroProtection = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]");
	private By cbBoxCourtesyCar = By.xpath("//*[@id='courtesycar']");
	private By btnNext = By.xpath("//*[@id='nextselectpriceoption']");


	public void preencherCamposProductData() {
		escrever(txtStartDate, "12/31/2022");
		selecionarOpcaoCbBox(cbBoxInsuranceSum, "3.000.000,00");
		selecionarOpcaoCbBox(cbBoxMeritRating, "Malus 11");
		selecionarOpcaoCbBox(cbBoxDamageInsurance, "No Coverage");
		clicarCheck(chkEuroProtection);
		selecionarOpcaoCbBox(cbBoxCourtesyCar, "No");
		clicarBtn(btnNext);
	}
	
	

}
