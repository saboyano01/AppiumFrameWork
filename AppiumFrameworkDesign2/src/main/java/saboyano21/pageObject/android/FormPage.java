package saboyano21.pageObject.android;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Saboyano.Util.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FormPage extends AndroidActions {
	
	AndroidDriver driver;
	
public FormPage(AndroidDriver driver) 
{
	super(driver);
	this.driver = driver;
	PageFactory.initElements(new AppiumFieldDecorator(driver),this);

}
	
@AndroidFindBy(id="nameField")
private WebElement nameField;

@AndroidFindBy(xpath="//android.widget.RadioButton[@text='Female']")
private WebElement FemaleOptions;

@AndroidFindBy(xpath="//android.widget.RadioButton[@text='Male']")
private WebElement MaleOptions;

@AndroidFindBy(id="com.androidsample.generalstore:id/spinnerCountry")
private WebElement CountrySelection;

@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
private WebElement shopButton;



public void setNameField(String name) 
{
	nameField.sendKeys(name);
	driver.hideKeyboard();
}

public void setGender(String gender) 
{
	
	if(gender.contains("female"))
		FemaleOptions.click();
		
	else
		FemaleOptions.click();
	
	
}


public void setCountrySelection(String countryName) 
{
	CountrySelection.click();
	scrollToText(countryName);
	driver.findElement(By.xpath("//android.widget.TextView[@text='"+countryName+"']")).click();
	
}

public void submitForm()
{
	shopButton.click();
}


}



	