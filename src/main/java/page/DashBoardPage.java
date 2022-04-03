package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashBoardPage {

	WebDriver driver;

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"label-first\"]/b")
	WebElement DASHBOARD_HEADER_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[3]")
	WebElement TAGGLE_ALL_ELEMENT;

	@FindBy(how = How.XPATH, using = "/html/body/a[1]")
	WebElement REMOVE_FIRST_CUSTOMER_ELEMENT;

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/a[2]/span")
	WebElement TECH23_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/a[3]/span")
	WebElement TECH71_ELEMENT;

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/a[4]/span")
	WebElement JAVASCRIPT_ELEMENT;

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/a[5]/span")
	WebElement TECH15_ELEMENT;
	

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/a[6]/span")
	WebElement TECH63_ELEMENT;

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/a[7]/span")
	WebElement ZATTO_ELEMENT;

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/a[8]/span")
	WebElement TEST_AUTOMATION_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/a[9]/span")
	WebElement TEST_AUTOMATION_28_ELEMENT;

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/a[10]/span")
	WebElement FLOWER_49_ELEMENT;

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/a[11]/span")
	WebElement FLOWER_8_ELEMENT;
	

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/a[12]/span")
	WebElement FLOWER_36_ELEMENT;

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/a[13]/span")
	WebElement FLOWER_31_ELEMENT;

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/a[14]/span")
	WebElement FLOWER_28_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/a[15]/span")
	WebElement TECH64_ELEMENT;


	@FindBy(how = How.XPATH, using = "/html/body/div[3]/a[16]/span")
	WebElement KWINTAS_971_ELEMENT;
	

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/a[17]/span")
	WebElement KWINTAS_64_ELEMENT;

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/a[18]/span")
	WebElement KWINTAS_153_ELEMENT;

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/a[19]/span")
	WebElement TECHFIOS_JUNE_2021_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/a[20]/span")
	WebElement KWINTAS_995_ELEMENT;

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/a[21]/span")
	WebElement KWINTAS_594_ELEMENT;

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/a[22]/span")
	WebElement KWINTAS_548_ELEMENT;
	

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/a[23]/span")
	WebElement KWINTAS_671_ELEMENT;

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/a[24]/span")
	WebElement KWINTAS_795_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/a[25]/span")
	WebElement KWINTAS_408_ELEMENT;

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/a[26]/span")
	WebElement AUTO_TEST_267_ELEMENT;

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/a[27]/span")
	WebElement KWINTAS_299_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/a[28]/span")
	WebElement KWINTAS_523_ELEMENT;
	
	
	
	
	


	public void verifyDashboardHeader() {

		Assert.assertEquals(DASHBOARD_HEADER_ELEMENT.getText(), "NSS-TODO List v 1.1", "Wrong Page");

	}

	public void clickToggleAllButton() {
		TAGGLE_ALL_ELEMENT.click();
	}

	public void clickRemoveCustomer() {
		REMOVE_FIRST_CUSTOMER_ELEMENT.click();
	}

	
	public void clickCustomer1() {
		TECH23_ELEMENT.click();
	}

	public void clickCustomer2() {
		TECH71_ELEMENT.click();
	}

	public void clickCustomer4() {
		JAVASCRIPT_ELEMENT.click();
	}

	public void clickCustomer5() {
		TECH15_ELEMENT.click();
	}


	public void clickCustomer6() {
		TECH63_ELEMENT.click();
	}

	public void clickCustomer7() {
		ZATTO_ELEMENT.click();
	}

	public void clickCustomer8() {
		TEST_AUTOMATION_ELEMENT.click();
	}

	public void clickCustomer9() {
		TEST_AUTOMATION_28_ELEMENT.click();
	}

	public void clickCustomer10() {
		FLOWER_49_ELEMENT.click();
	}

	
	public void clickCustomer11() {
		FLOWER_8_ELEMENT.click();
	}

	public void clickCustomer12() {
		FLOWER_36_ELEMENT.click();
	}

	public void clickCustomer13() {
		FLOWER_31_ELEMENT.click();
	}

	public void clickCustomer14() {
		FLOWER_28_ELEMENT.click();
	}

	public void clickCustomer15() {
		TECH64_ELEMENT.click();
	}

	public void clickCustomer16() {
		KWINTAS_971_ELEMENT.click();
	}

	public void clickCustomer17() {
		KWINTAS_64_ELEMENT.click();
	}

	public void clickCustomer18() {
		KWINTAS_153_ELEMENT.click();
	}
	public void clickCustomer19() {
		TECHFIOS_JUNE_2021_ELEMENT.click();
	}


	public void clickCustomer20() {
		KWINTAS_995_ELEMENT.click();
	}

	public void clickCustomer21() {
		KWINTAS_594_ELEMENT.click();
	}

	public void clickCustomer22() {
		KWINTAS_548_ELEMENT.click();
	}
	public void clickCustomer23() {
		KWINTAS_671_ELEMENT.click();
	}

	public void clickCustomer24() {
		KWINTAS_795_ELEMENT.click();
	}

	public void clickCustomer25() {
		KWINTAS_408_ELEMENT.click();
	}

	public void clickCustomer26() {
		AUTO_TEST_267_ELEMENT.click();
	}
	public void clickCustomer27() {
		KWINTAS_299_ELEMENT.click();
	}

	public void clickCustomer28() {
		KWINTAS_523_ELEMENT.click();
	}
}

