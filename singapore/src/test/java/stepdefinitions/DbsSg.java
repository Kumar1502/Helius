package stepdefinitions;


import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DbsSg {

	public static WebDriver driver;
	// public static String
	// path=System.getProperty("user.dir")+"\\excel\\testdata.xlsx";

	@Given("^Launch the url\"([^\"]*)\"$")
	public void launch_the_urlsomething(String strArg1) throws Throwable {

		String path = "C:\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get(strArg1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Assert.assertEquals("DBS Bank | Singapore", driver.getTitle());
		Utilities.captureScreenshot(driver);
	}

	@When("^Click on Learn More button$")
	public void click_on_learn_more_button() throws IOException {
		driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("About")).isDisplayed());
		Utilities.captureScreenshot(driver);
	}

	@Then("^Scroll down and navigate to \"([^\"]*)\" on the left panel$")
	public void scroll_down_and_navigate_to_something_on_the_left_panel(String strArg1) throws IOException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Utilities.captureScreenshot(driver);
	}

	@And("^Read and Write the data table in excel sheet$")
	public void read_and_write_the_data_table_in_excel_sheet() throws Exception {
		Utilities uti = new Utilities();
		for (int i = 1; i <= 6; i++) {

			for (int j = 1; j <= 5; j++) {

				WebElement element = driver.findElement(By.xpath("//tr[" + i + "]//td[" + j + "]"));
				String data = element.getText();
				System.out.println(data);
				uti.setCellData(i - 1, j - 1, data);

			}
		}

		Utilities.captureScreenshot(driver);

	}

	@And("^Navigate to Aboutin the header tabs$")
	public void navigate_to_aboutin_the_header_tabs() throws IOException {
		driver.findElement(By.linkText("About")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Who We Are")).isDisplayed());
		Utilities.captureScreenshot(driver);
	}

	@And("^Navigate to Who  we are tab$")
	public void navigate_to_who_we_are_tab() throws IOException {
		driver.findElement(By.linkText("Who We Are")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Our Awards & Accolades')]")).isDisplayed());
		Utilities.captureScreenshot(driver);
	}

	@And("^Navigate to OurAwrds and Accolades$")
	public void navigate_to_ourawrds_and_accolades() throws InterruptedException, IOException {

		driver.findElement(By.cssSelector(
				"div.productCategory.gsmc:nth-child(5) div.main-container:nth-child(2) div.container.mTop-0:nth-child(4) div.row div.col-md-6.col-sm-6:nth-child(4) div.media.media-box-type1 div.media-body h3:nth-child(1) > a:nth-child(1)"))
				.click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'A World First')]")).isDisplayed());
		Utilities.captureScreenshot(driver);
	}

	@And("^Validate the total no of awards displayed is \"([^\"]*)\"$")
	public void validate_the_total_no_of_awards_displayed_is_something(String strArg1) throws IOException {
		List<WebElement> awards = driver.findElements(By.xpath("//div[@class='col-md-8']"));
		int actualAwards = awards.size();
		int expectedAwards = Integer.parseInt(strArg1);
		Assert.assertEquals(expectedAwards, actualAwards);
		Utilities.captureScreenshot(driver);

	}

	@And("^Print in the cucumber report in the form of table$")
	public void print_in_the_cucumber_report_in_the_form_of_table() throws IOException {

		List<WebElement> awardNames = driver.findElements(By.xpath("//div[@class='col-md-8']//Strong"));
		List<WebElement> captionOfTheAward = driver.findElements(By.xpath("//div[@class='col-md-8']//p"));
		//Utilities.captureScreenshot(driver);
		System.out.println("------Award names------------------");
		for (WebElement award : awardNames) {
			System.out.println(award.getText());
		}
		System.out.println("-----Captions of the award---------------");

		for (WebElement caption : captionOfTheAward) {
			System.out.println(caption.getText());
		}
	}

}
