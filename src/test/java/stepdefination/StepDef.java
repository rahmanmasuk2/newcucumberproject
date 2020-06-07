package stepdefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDef {
WebDriver driver;
    @Before
    public void login () {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
    }

    @Given("I navigate to {string} page")
public void i_navigate_to_page(String string) {
        driver.get(string);

}

    @When("I enter userId and Password")
    public void i_enter_userId_and_Password() {
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("masukzakir@gmail.com");
        System.out.println("type email");
    }
    @When("I click on next button")
    public void click_on_next_button() throws InterruptedException {

    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/span/span")).click();
        System.out.println("click to next");
        Thread.sleep(4000);
    }
    @Then("I should see the error massage")
    public void i_should_see_the_error_message() {
        System.out.println("i see the error massage");
    }

    @After
    public void abdullah(){
        driver.quit();

    }
}
