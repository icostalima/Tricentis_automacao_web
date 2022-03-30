package br.com.tricentis.core;

import static br.com.tricentis.core.DriverFactory.getDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {

	public void selecionarOpcaoCbBox(By by, String texto) {
		esperarVisibilidadeElemento(by);
		WebElement elemento = getDriver().findElement(by);
		Select combo = new Select(elemento);
		combo.selectByVisibleText(texto);
	}

	public void escrever(By by, String texto) {
		esperarVisibilidadeElemento(by);
		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(texto);
	}

	public void clicarBtn(By by) {
		esperarVisibilidadeElemento(by);
		getDriver().findElement(by).click();
	}

	public void clicarRdb(By by) {
		esperarVisibilidadeElemento(by);
		getDriver().findElement(by).click();
	}

	public void clicarCheck(By by) {
		esperarVisibilidadeElemento(by);
		getDriver().findElement(by).click();
	}

	
	public void ValidarElemeto(String atual, By by) {
		esperarVisibilidadeElemento(by);
		String mensagemSucesso = getDriver().findElement(by).getText();
		Assert.assertEquals(atual, mensagemSucesso);
	}

	private void esperarVisibilidadeElemento(By by) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	public void printTela() {
		File scr = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);

		File dest = new File("evidencias/teste_" + carimboDeDataHora() + ".png");
		try {
			FileUtils.copyFile(scr, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private String carimboDeDataHora() {
		return new SimpleDateFormat("dd-MM-yyyy HH-mm-ss").format(new Date());
	}

}
