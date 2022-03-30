package br.com.tricentis.page;

import org.openqa.selenium.By;

import br.com.tricentis.core.BasePage;

public class InsurantDataPage extends BasePage {

	private By txtFirstName = By.xpath("//*[@id='firstname']");
	private By txtLastName = By.xpath("//*[@id='lastname']");
	private By txtDirthDate = By.xpath("//*[@id='birthdate']");
	private By rdbGenderMale = By.xpath("//*[@id='gendermale']/following::*[@class='ideal-radio']");
	private By cbBoxCountry = By.xpath("//*[@id='country']");
	private By txtZipCode = By.xpath("//*[@id='zipcode']");
	private By cbBoxOccupation = By.xpath("//*[@id='occupation']");
	private By chkGenderSpeeding = By.xpath("//*[@id='speeding']/following::*[@class='ideal-check']");
	private By chkSkyDiving = By.xpath("//*[@id='insurance-form']/div/section[2]/div[10]/p/label[4]/span");
	private By txtWebSite = By.xpath("//*[@id='website']");
	private By btnNext = By.xpath("//*[@id='nextenterproductdata']");

	public void preencherCamposInsurantData() {
		escrever(txtFirstName, "Igor");
		escrever(txtLastName, "Lima");
		escrever(txtDirthDate, "07/22/1986");
		clicarRdb(rdbGenderMale);
		selecionarOpcaoCbBox(cbBoxCountry, "Brazil");
		escrever(txtZipCode, "07241330");
		selecionarOpcaoCbBox(cbBoxOccupation, "Employee");
		clicarCheck(chkGenderSpeeding);
		clicarCheck(chkSkyDiving);		
		escrever(txtWebSite,"http://test.com.br");
		clicarBtn(btnNext);
	}

}
