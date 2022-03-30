package br.com.tricentis.page;

import org.openqa.selenium.By;

import br.com.tricentis.core.BasePage;

public class PriceOptionPage extends BasePage {

	
	private By rdbSilver = By.xpath("//*[@id='selectsilver']/following::*[@class='ideal-radio']");
//	private By rdbGold = By.xpath("//*[@id='selectsilver']/following::*[@class='ideal-radio']");
//	private By rdbPlatinum = By.xpath("//*[@id='selectsilver']/following::*[@class='ideal-radio']");
//	private By rdbUltimate = By.xpath("//*[@id='selectsilver']/following::*[@class='ideal-radio']");
	private By btnNext = By.xpath("//*[@id='nextsendquote']");


	public void selecionarPriceOption() {
		clicarRdb(rdbSilver);
		clicarBtn(btnNext);
	}
	
	

}
