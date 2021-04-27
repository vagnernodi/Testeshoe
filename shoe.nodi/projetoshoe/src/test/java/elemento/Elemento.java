package elemento;

import org.openqa.selenium.By;

public class Elemento {
	
	public By Cookies = By.cssSelector("body > section > div > div.cookie-notification-button");
	public By Bolsas = By.cssSelector("#header-content > div.navigation-bar > div > section > nav > ul > li:nth-child(3) > a");
	public By bolsaAmarela = By.cssSelector("#item-list > div.wrapper > div:nth-child(6) > div.item-card__description > a.item-card__description__product-name > span");
	public By Comprar = By.cssSelector("#buy-button-now");
	public By presente = By.cssSelector("body > div.main > div.cart.breakpoint.main > div.cart__content > div.cart__items > div.product-items > div > div.product-item__details > div > div > div.gift-wrapping > label > span > label > input");
	public By Excluir = By.cssSelector("body > div.main > div.cart.breakpoint.main > div.cart__content > div.cart__items > div.product-items > div > i");
	public By msg = By.cssSelector("body > div.main > div.cart.breakpoint.empty > div.cart__content > div > h1");
	public By telaInicial = By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[2]/a");
}




