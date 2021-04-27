package teste;

import org.openqa.selenium.By;

import elemento.Elemento;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.Metodo;

public class Steps {
	Metodo metodo = new Metodo();
	Elemento elemento = new Elemento();

	@Given("Que eu esteja no {string}")
	public void que_eu_esteja_no(String string) throws InterruptedException {

		metodo.abrirNavegador(string);
		metodo.esperar(2000);
		metodo.clicar(elemento.Cookies);

	}

	@When("pesquisar bolsa")
	public void pesquisar_bolsa() throws InterruptedException {
		metodo.esperar(3000);
		metodo.clicar(elemento.Bolsas);
		metodo.esperar(2000);
		metodo.clicar(elemento.bolsaAmarela);
		metodo.clicar(elemento.Comprar);
		metodo.esperar(3000);
		metodo.clicar(elemento.presente);
		metodo.esperar(2000);
		metodo.clicar(elemento.Excluir);

	}

	@Then("Entao valido os produtos")
	public void entao_valido_os_produtos() throws InterruptedException {
		metodo.esperar(3000);
		metodo.validar("Seu carrinho está vazio", elemento.msg);
		metodo.fecharNavegador();
		
		
	}

}





