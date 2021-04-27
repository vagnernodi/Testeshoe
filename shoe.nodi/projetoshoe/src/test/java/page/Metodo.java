package page;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodo {
	

	WebDriver driver;

	public void abrirNavegador(String appUrl) {

		System.setProperty("webdriver.chrome.driver", "C:\\DRIVER89\\chromedriver.exe ");
		driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();

	}

	public void escrever(By elemento, String texto) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void esperar(int tempo) throws  InterruptedException {

		Thread.sleep(tempo);
	}

	public void validar(String appUrl, By elemento) {
		String texto = driver.findElement(elemento).getText();
		assertEquals(appUrl, texto);
	}

	public void screnShot(String nome) throws IOException {
		TakesScreenshot scrShoT = ((TakesScreenshot) driver);

		java.io.File srcFile = scrShoT.getScreenshotAs(OutputType.FILE);
		java.io.File destFile = new java.io.File("./src/evidencias/" + nome + ".png");
		FileUtils.copyFile(srcFile, destFile);

	}

	public void fecharNavegador() throws  InterruptedException{
		driver.quit();
	}
}

	
	
	

	
