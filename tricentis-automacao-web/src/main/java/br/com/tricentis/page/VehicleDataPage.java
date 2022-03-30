package br.com.tricentis.page;

import org.openqa.selenium.By;

import br.com.tricentis.core.BasePage;
import br.com.tricentis.core.DriverFactory;

public class VehicleDataPage extends BasePage {

	private String URL = "http://sampleapp.tricentis.com/101/app.php";		
	private By cbBoxMake = By.xpath("//*[@id='make']");
	private By cbBoxModel = By.xpath("//*[@id='model']");
	private By txtCylinderCapacity = By.xpath("//*[@id='cylindercapacity']");
	private By txtEnginePerformance = By.xpath("//*[@id='engineperformance']");
	private By txtdateOfManufacture = By.xpath("//*[@id='dateofmanufacture']");
	private By cbBoxnumberOfSeats = By.xpath("//*[@id='numberofseats']");
	private By rdbRightHandDriveYes = By.xpath("//*[@value='Yes']/following::*[@class='ideal-radio']");
	private By cbBoxNumberOfSeatsMotorcycle = By.xpath("//*[@id='numberofseatsmotorcycle']");
	private By cbBoxfuelType = By.xpath("//*[@id='fuel']");
	private By txtPayLoad = By.xpath("//*[@id='payload']");
	private By txtTotalWeight = By.xpath("//*[@id='totalweight']");
	private By txtListPrice = By.xpath("//*[@id='listprice']");
	private By txtAnnualMileage = By.xpath("//*[@id='annualmileage']");
	private By btnNext = By.xpath("//*[@id='nextenterinsurantdata']");

	public void abreUrl() {		
		DriverFactory.getDriver().get(URL);
	}

	public void preencherCamposVehicleData() {
		selecionarOpcaoCbBox(cbBoxMake, "BMW");		
		selecionarOpcaoCbBox(cbBoxModel, "Scooter");
		escrever(txtCylinderCapacity, "123");
		escrever(txtEnginePerformance, "123");
		escrever(txtdateOfManufacture, "03/28/2022");
		selecionarOpcaoCbBox(cbBoxnumberOfSeats, "3");
		clicarRdb(rdbRightHandDriveYes);
		selecionarOpcaoCbBox(cbBoxNumberOfSeatsMotorcycle, "2");
		selecionarOpcaoCbBox(cbBoxfuelType, "Petrol");
		escrever(txtPayLoad, "500");
		escrever(txtTotalWeight, "1234");
		escrever(txtListPrice, "3211");
		escrever(txtAnnualMileage, "1000");
		clicarBtn(btnNext);
	}
	
	

}
