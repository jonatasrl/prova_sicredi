package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class InformacoesUsuarioTest {

    private WebDriver navegador;

    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        navegador.manage().window().maximize();
        navegador.get("https://www.grocerycrud.com/demo/bootstrap_theme");

    };

    @Test
    public void adicionarInformacaoDoUsuario1() {

        //Desafio 1

        WebElement comboboxElement = navegador.findElement(By.id("switch-version-select"));
        Select combobox = new Select(comboboxElement);
        combobox.selectByVisibleText("Bootstrap V4 Theme");

        navegador.findElement(By.linkText("Add Customer")).click();

        WebElement form = navegador.findElement(By.id("crudForm"));
        form.findElement(By.id("field-customerName")).sendKeys("Teste Sicredi");
        form.findElement(By.id("field-contactLastName")).sendKeys("Teste");
        form.findElement(By.id("field-contactFirstName")).sendKeys("Jonatas");
        form.findElement(By.id("field-phone")).sendKeys("51 9999-9999");
        form.findElement(By.id("field-addressLine1")).sendKeys("Av Assis Brasil, 3970");
        form.findElement(By.id("field-addressLine2")).sendKeys("Torre D");
        form.findElement(By.id("field-city")).sendKeys("Porto Alegre");
        form.findElement(By.id("field-state")).sendKeys("RS");
        form.findElement(By.id("field-postalCode")).sendKeys("91000-000");
        form.findElement(By.id("field-country")).sendKeys("Brasil");

        form.findElement(By.id("field_salesRepEmployeeNumber_chosen")).click();
        form.findElement(By.xpath("/html/body/div[@class='crud-form']/div[@class='container gc-container']/div[@class='row']/div[@class='col-md-12']/div[@class='form-container table-container']/form[@id='crudForm']/div[@class='form-group salesRepEmployeeNumber_form_group row']/div[@class='col-sm-9']/div[@id='field_salesRepEmployeeNumber_chosen']/div[@class='chosen-drop']/div[@class='chosen-search']/input")).sendKeys("Fixter");
        form.findElement(By.xpath("/html/body/div[@class='crud-form']/div[@class='container gc-container']/div[@class='row']/div[@class='col-md-12']/div[@class='form-container table-container']/form[@id='crudForm']/div[@class='form-group salesRepEmployeeNumber_form_group row']/div[@class='col-sm-9']/div[@id='field_salesRepEmployeeNumber_chosen']/div[@class='chosen-drop']/div[@class='chosen-search']/input")).sendKeys(Keys.ENTER);

        form.findElement(By.id("field-creditLimit")).sendKeys("200");
        form.findElement(By.id("form-button-save")).click();

        WebElement mensagemSucesso = navegador.findElement(By.xpath("/html/body/div[@class='crud-form']/div[@class='container gc-container']/div[@class='row']/div[@class='col-md-12']/div[@class='form-container table-container']/form[@id='crudForm']/div[@class='form-group gcrud-form-group'][1]/div[@id='report-success']/p"));
        String mensagem = mensagemSucesso.getText();
        assertTrue("Your data has been successfully stored into the database. ", true);
        System.out.println(mensagem);

    }

    @Test
    public void adicionarInformacaoDoUsuario2() {

        //Desafio 1

        WebElement comboboxElement = navegador.findElement(By.id("switch-version-select"));
        Select combobox = new Select(comboboxElement);
        combobox.selectByVisibleText("Bootstrap V4 Theme");

        navegador.findElement(By.linkText("Add Customer")).click();

        WebElement form = navegador.findElement(By.id("crudForm"));
        form.findElement(By.id("field-customerName")).sendKeys("Teste Sicredi");
        form.findElement(By.id("field-contactLastName")).sendKeys("Teste");
        form.findElement(By.id("field-contactFirstName")).sendKeys("Jonatas");
        form.findElement(By.id("field-phone")).sendKeys("51 9999-9999");
        form.findElement(By.id("field-addressLine1")).sendKeys("Av Assis Brasil, 3970");
        form.findElement(By.id("field-addressLine2")).sendKeys("Torre D");
        form.findElement(By.id("field-city")).sendKeys("Porto Alegre");
        form.findElement(By.id("field-state")).sendKeys("RS");
        form.findElement(By.id("field-postalCode")).sendKeys("91000-000");
        form.findElement(By.id("field-country")).sendKeys("Brasil");

        form.findElement(By.id("field_salesRepEmployeeNumber_chosen")).click();
        form.findElement(By.xpath("/html/body/div[@class='crud-form']/div[@class='container gc-container']/div[@class='row']/div[@class='col-md-12']/div[@class='form-container table-container']/form[@id='crudForm']/div[@class='form-group salesRepEmployeeNumber_form_group row']/div[@class='col-sm-9']/div[@id='field_salesRepEmployeeNumber_chosen']/div[@class='chosen-drop']/div[@class='chosen-search']/input")).sendKeys("Fixter");
        form.findElement(By.xpath("/html/body/div[@class='crud-form']/div[@class='container gc-container']/div[@class='row']/div[@class='col-md-12']/div[@class='form-container table-container']/form[@id='crudForm']/div[@class='form-group salesRepEmployeeNumber_form_group row']/div[@class='col-sm-9']/div[@id='field_salesRepEmployeeNumber_chosen']/div[@class='chosen-drop']/div[@class='chosen-search']/input")).sendKeys(Keys.ENTER);

        form.findElement(By.id("field-creditLimit")).sendKeys("200");
        form.findElement(By.id("form-button-save")).click();

        WebElement mensagemSucesso = navegador.findElement(By.xpath("/html/body/div[@class='crud-form']/div[@class='container gc-container']/div[@class='row']/div[@class='col-md-12']/div[@class='form-container table-container']/form[@id='crudForm']/div[@class='form-group gcrud-form-group'][1]/div[@id='report-success']/p"));
        String mensagem = mensagemSucesso.getText();
        assertTrue("Your data has been successfully stored into the database. ", true);
        System.out.println(mensagem);

        //Desafio 2

        form.findElement(By.linkText("Go back to list")).click();

        navegador.findElement(By.xpath("/html/body/div[@class='container-fluid gc-container']/div[@class='row']/div[@class='table-section']/div[@class='table-container']/form[@id='gcrud-search-form']/div[@class='header-tools']/div[@class='floatR']/a[@class='btn btn-primary search-button t5']/i[@class='el el-search']")).click();

        navegador.findElement(By.xpath("/html/body/div[@class='container-fluid gc-container']/div[@class='row']/div[@class='table-section']/div[@class='table-container']/form[@id='gcrud-search-form']/div[@class='header-tools']/div[@class='floatR']/a[@class='btn search-button t5 btn-default btn-secondary search-button-big']/input[@class='search-input search-input-big']")).sendKeys("Teste Sicredi");

        navegador.findElement(By.xpath("/html/body/div[@class='container-fluid gc-container']/div[@class='row']/div[@class='table-section']/div[@class='table-container']/form[@id='gcrud-search-form']/div[@class='header-tools']/div[@class='floatR']/a[@class='btn search-button t5 btn-default btn-secondary search-button-big']/input[@class='search-input search-input-big']")).sendKeys(Keys.ENTER);

        navegador.findElement(By.className("select-all-none")).click();

        navegador.findElement(By.linkText("Delete")).click();

        WebElement mensagemDelete = navegador.findElement(By.className("alert-delete-multiple-one"));
        String delete = mensagemDelete.getText();
        assertTrue("Are you sure that you want to delete this ", true);
        System.out.println(delete);

        navegador.findElement(By.xpath("/html/body[@class='modal-open']/div[@class='container-fluid gc-container']/div[@class='row']/div[@class='delete-multiple-confirmation modal fade in show']/div[@class='modal-dialog']/div[@class='modal-content']/div[@class='modal-footer']/button[@class='btn btn-danger delete-multiple-confirmation-button']")).click();

        String mensagemConfirmacaoDelete = navegador.findElement(By.xpath("//*[@class='alert alert-success growl-animated animated bounceInDown hovering']/span[3]/p")).getText();
        assertEquals("Your data has been successfully deleted from the database.", mensagemConfirmacaoDelete);
        System.out.println(mensagemConfirmacaoDelete);

    }

    @After
    public void tearDown() {

        navegador.quit();

    };

}