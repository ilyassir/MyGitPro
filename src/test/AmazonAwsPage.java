package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class AmazonAwsPage {

private WebDriver driver;
	
	public AmazonAwsPage() {
		this.driver = Driver.getDriver(null);//Here I passed my Driver class value.I could pass browser too.My method will pick one oif it s null too.
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='billLabel']")
	public WebElement billLabel;
	
	public boolean isAt() {
		return driver.getTitle().equals("Amazon Web Services Simple Monthly Calculator");
		}
	
public double getBill() {
	
	return Double.parseDouble(billLabel.getText().split("\\$ ")[1].replace(")", ""));
//	String str=billLabel.getText();
//	String[] arr=str.split("\\$ ");
//	String arr1=arr[1].replace(")", "");
//	Double arr3=Double.parseDouble(arr1);
//	return arr3;
		}

@FindBy(xpath="//*[@src='//d2zogmwzrm9slh.cloudfront.net/ver20180219vH/common/icons/small/add.png']")
public WebElement addrow;


@FindBy(xpath="(//input[@type='text'])[4]")
public WebElement emptyBox;

@FindBy(xpath="//tr[@class='EC2InstanceRow itemsTableDataRow table']//table[@class='SF_EC2_INSTANCE_FIELD_INSTANCES field integerNumericField']//input[@class='gwt-TextBox numericTextBox input']") 
public WebElement instanceCount; 

public int getIntanceCount() { 
return Integer.parseInt(instanceCount.getAttribute("value")); }






}