package saboyano21.AppiumFrameworkDesign2;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Saboyano.Util.AndroidActions;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import saboyano21.pageObject.android.FormPage;
import saboyano21.pageObject.android.ProductCatalogue;


public  class TestCaseEcommerce3 extends BaseTest {

	

	@Test(dataProvider="getData")
	public void FillForm(String name, String gender, String country)  
		{
		
		FormPage formPage = new FormPage(driver);
		formPage.setNameField("saboyano"); 
		formPage.setGender("female");
		formPage.setCountrySelection("Argentina");
		formPage.submitForm();
		ProductCatalogue ProductCatalogue = new ProductCatalogue(driver);
		ProductCatalogue.addItemToCartByIndex(0);
		ProductCatalogue.addItemToCartByIndex(0);
		ProductCatalogue.goToCartPage();
		
		
		}
	    
	    @DataProvider
	   public Object [] [] getData()
	   {
	    	return new Object[] [] {{"saboyano","female","Argentina"} };
	   }
	
				
			
		
		
			
			
		
     		
			
//	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));
//	wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(driver.findElement(By.id("toolbar_title")))));
//	wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")),"text","Cart"));
//	List<WebElement> productPrices  = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));
//	int count = productPrices.size();
//	double totalSum = 0;
//	
//	for (int i =0; i< count; i++)
//	{
//		String amountString = productPrices.get(i).getText();
//		Double price = Double.parseDouble(amountString.substring(1));
//		totalSum = totalSum + price;	
//		
//	}
//	
//	WebElement ele = driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
//	AndroidActions androidActions = new AndroidActions(driver);
//	androidActions.longPressAction(ele);
//	driver.findElement(AppiumBy.className("android.widget.Button")).click();
//    driver.findElement(AppiumBy.className("android.widget.CheckBox")).click();
//    driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
//	}
//
//	
//		
//	}


		
	

	
		
	

	
	}
	
