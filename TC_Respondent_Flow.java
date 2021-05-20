package com.ps.testcases;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.ps.Test.Login;
import com.ps.base.TestBase;

public class TC_Respondent_Flow extends TestBase {

	@Test (priority = 1)
	public static void Create_Survey() throws Exception {

		Login.Buyerlogin();

		driver.findElement(By.cssSelector("html>body>div>div>header>div:nth-of-type(2)>div>a>span")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("surveyTitle")));

		Reporter.log("Create Survey Page opened");

		driver.findElement(By.name("surveyTitle")).sendKeys(surveytitle6 + " " + date1);

		wait.until(ExpectedConditions.invisibilityOfElementLocated((By.id("loader-wrapper"))));

		driver.findElement(By.id("Survey_Sample_Title")).click();

		driver.findElement(By.cssSelector(
				"html>body>div>div>section>div>div>div>form>div>div>div:nth-of-type(2)>div>ul>li:nth-of-type(2)>a"))
				.click();

		driver.findElement(By.id("completes")).sendKeys("100");

		driver.findElement(By.id("LengthofSurvey")).sendKeys("1");

		driver.findElement(By.id("incidence")).sendKeys("45");

		driver.findElement(By.id("field_time")).sendKeys("10");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()[normalize-space()='Finalize & Launch!']]")).click();

		wait.until(ExpectedConditions.invisibilityOfElementLocated((By.id("loader-wrapper"))));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollTo(0, 350)");

		driver.findElement(By.id("#genderModal")).click();

		driver.findElement(By.xpath(
				"//button[@ng-disabled='(censusGender || censusRace || censusRb || censusEducation || censusHispanic || censusEmployment || isQlcEnabled && manageEdit) || parentDisabled']"))
				.click();
		driver.findElement(By.id("#genderModal")).click();

		driver.findElement(By.xpath("//button[@id='#rbModal']")).click();

		driver.findElement(By.xpath(
				"(//button[@ng-disabled='(censusGender || censusRace || censusRb || censusEducation || censusHispanic || censusEmployment || isQlcEnabled && manageEdit) || parentDisabled'])[2]"))
				.click();

		driver.findElement(By.xpath("//button[@id='#rbModal']")).click();

		driver.findElement(By.id("#hispanicModal")).click();

		driver.findElement(By.xpath(
				"//form[@name='surveyform']/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/span[1]/ul[1]/li[1]/button[3]"))
				.click();

		driver.findElement(By.id("#hispanicModal")).click();

		driver.findElement(By.xpath("//button[@id='#empModal']")).click();

		driver.findElement(By.xpath(
				"//form[@name='surveyform']/div[2]/div[1]/div[8]/div[1]/div[1]/div[1]/span[1]/ul[1]/li[1]/button[3]"))
				.click();

		driver.findElement(By.xpath("//button[@id='#empModal']")).click();

		driver.findElement(By.xpath("//button[@id='#eduModal']")).click();

		driver.findElement(By.xpath(
				"//form[@name='surveyform']/div[2]/div[1]/div[9]/div[1]/div[1]/div[1]/span[1]/ul[1]/li[1]/button[3]"))
				.click();

		driver.findElement(By.xpath("//button[@id='#eduModal']")).click();
		
		for (int i = 10; i < 10; i++) {
			
			driver.findElement(By.xpath("(//span[text()='×'])["+i+"]")).click();
		}
		Thread.sleep(2000);
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("(//li//div//button//div//span[@class='caret'])[2]")));

		wait.until(ExpectedConditions
				.invisibilityOfElementLocated(By.xpath("//div//span[@class='progress container ng-scope']")));
		// Thread.sleep(3000);
		driver.findElement(By.xpath("(//li//div//button//div//span[@class='caret'])[2]")).click();

		driver.findElement(By.xpath("//button[contains(text(),'Supplier')]")).click();

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//th[text()[normalize-space()='FEASIBILITY']]")));

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		driver.findElement(By.xpath("//button[text()='Save']")).click();

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[text()[normalize-space()='Finalize & Launch!']]")));
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()[normalize-space()='Finalize & Launch!']]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("liveUrl")));

		driver.findElement(By.id("liveUrl")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("liveUrl")).sendKeys(config.getProperty("liveurl"));

		driver.findElement(By.id("testUrl")).sendKeys(config.getProperty("testurl"));

		driver.findElement(By.xpath("(//button[contains(@class,'btn btn-default')])[3]")).click();

		driver.findElement(By.xpath("//button[text()='Launch Your Survey']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@class='ng-binding']")));

		Reporter.log("Survey Created Successfully");
	}

	@Test(priority = 2)
	public static void Search() throws Exception {

		Login.Buyerlogin();

		driver.findElement(By.xpath("//img[@class='img-responsive']")).click();

		wait.until(ExpectedConditions.invisibilityOfElementLocated((By.id("loader-wrapper"))));

		driver.findElement(By.xpath("(//input[contains(@class,'ng-pristine ng-untouched')])[2]")).click();

		driver.findElement(By.xpath("(//input[contains(@class,'ng-pristine ng-untouched')])[2]")).clear();

		driver.findElement(By.xpath("(//input[contains(@class,'ng-pristine ng-untouched')])[2]"))
				.sendKeys(surveytitle6);

		Thread.sleep(2000);

		int table = 10;

		for (int i = 1; i < table; i++) {

			String Surveytitle = driver.findElement(By.xpath("(//tr//td[@class='survey-title ng-binding'])[" + i + "]"))
					.getText();

			System.out.println(Surveytitle);

			if (Surveytitle.contains(surveytitle6)) {

				driver.findElement(By.xpath("(//tr//td[@class='ng-binding'])[" + i + "]")).click();

				Reporter.log("Search Working Fine");

				wait.until(
						ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='text-left ng-binding']")));

				break;
			}

			else {

				Reporter.log("No element Found");
				System.out.println("No Survey Found");
				Assert.fail();

			}

		}
	}

	@Test(priority = 3)
	public static void RespondentFlow() throws Exception {

		Thread.sleep(1000);

		driver.findElement(By.xpath("(//a[@data-toggle='tab'])[5]")).click();

		wait.until(ExpectedConditions.invisibilityOfElementLocated((By.id("loader-wrapper"))));

		((JavascriptExecutor) driver).executeScript("scroll(0,1000)");

		Thread.sleep(2000);

		String surveyid = driver.findElement(By.xpath("(//table//tbody//tr//td[@class='ng-binding'])[1]")).getText();

		driver.get("https://staging.spectrumsurveys.com/#/start-survey?survey_id=" + surveyid
				+ "&supplier_id=36&bsec=a70mx8&ps_simu_forced_loi=555&ps_simu_forced_status=21&ps_supplier_respondent_id=456&ps_byr_simuenv=staging");

		// wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("h4")));

		Thread.sleep(5000);
		String Zipcode = driver.findElement(By.tagName("h5")).getText();
		driver.findElement(By.id("ans000_229")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ans000_229")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("ans000_229")).sendKeys("12345");
		Thread.sleep(1000);
		String Race = driver.findElement(By.xpath("(//h5[@class='covered-if ng-scope'])[2]")).getText();
		driver.findElement(By.xpath("//a[@id='answerid-244']/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("White")).click();
		Thread.sleep(1000);
		String Hispanic = driver.findElement(By.xpath("(//h5[@class='covered-if ng-scope'])[3]")).getText();
		driver.findElement(By.xpath("//a[@id='answerid-245']/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Yes")).click();
		Thread.sleep(1000);
		String Gender = driver.findElement(By.xpath("//type-input-dir[@id='3']//h5[1]")).getText();
		driver.findElement(By.xpath("//a[@id='answerid-211']/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Male")).click();
		Thread.sleep(1000);
		String Year = driver.findElement(By.xpath("//type-input-dir[@unique-index='4']//h5[1]")).getText();
		driver.findElement(By.xpath("//a[@id='answerid-235']/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("1986")).click();
		Thread.sleep(1000);
		String Employed = driver.findElement(By.xpath("//type-input-dir[@unique-index='5']//h5[1]")).getText();
		driver.findElement(By.id("answerid-215")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Full Time")).click();
		Thread.sleep(1000);
		String Education = driver.findElement(By.xpath("//type-input-dir[@unique-index='6']//h5[1]")).getText();
		driver.findElement(By.id("answerid-216")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Some high school")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@id='stSurvey']/section/div/div/div/div[9]/div/button/img")).click();

		Thread.sleep(2000);

		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//table//thead//tr//th)[3]")));
		
		Thread.sleep(2000);

		if (Zipcode.contains("Zipcode")) {

			Assert.assertTrue(true);
		}

		else {

			Assert.fail();
		}

		if (Race.contains("race")) {

			Assert.assertTrue(true);
		}

		else {

			Assert.fail();
		}
		
		if (Hispanic.contains("Hispanic")) {

			Assert.assertTrue(true);
		}

		else {

			Assert.fail();
		}
		
		if (Gender.contains("I'm")) {

			Assert.assertTrue(true);
		}

		else {

			Assert.fail();
		}
		
		if (Year.contains("born")) {

			Assert.assertTrue(true);
		}

		else {

			Assert.fail();
		}
		
		if (Employed.contains("employed")) {

			Assert.assertTrue(true);
		}

		else {

			Assert.fail();
		}
		
		if (Education.contains("education")) {

			Assert.assertTrue(true);
		}

		else {

			Assert.fail();
		}
		
		
		

	}

}
