package tests;


import io.appium.java_client.MobileBy;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.NoHttpResponseException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.util.Assert;
import org.testng.annotations.Test;

public class tests extends BaseClass{
	
	
	@Test(priority=1)
    public void phoneNumberValidation() {
        WebDriverWait wait = new WebDriverWait(driver, 30);

        WebElement login = driver.findElement(MobileBy.id("com.twigafoods.soko.staging:id/btnLogin"));
        login.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[contains(@text,'Phone Number is required')]")));

        String errorMessage = driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Phone Number is required')]")).getText();

     //   Assert.assertEquals(errorMessage,"Phone Number is required");


    }
	
	@Test (priority=2)
    public void pinNumberValidation() {
        WebDriverWait wait = new WebDriverWait(driver, 30);

        WebElement username = wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("com.twigafoods.soko.staging:id/edtPhoneNumber")));
        username.sendKeys("0793256440");

        driver.hideKeyboard();

        WebElement login = driver.findElement(MobileBy.id("com.twigafoods.soko.staging:id/btnLogin"));
        login.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[contains(@text,'PIN is required')]")));

        String errorMessage = driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'PIN is required')]")).getText();

     
       // Assert.assertEquals(errorMessage,"PIN is required");


    }
	@Test (priority=3)
	public void createSupplier() {
		WebDriverWait wait = new WebDriverWait(driver, 70);

		WebElement username = wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("com.twigafoods.soko.staging:id/edtPhoneNumber")));
		username.sendKeys("0793256440");

		WebElement password = driver.findElement(MobileBy.id("com.twigafoods.soko.staging:id/edtPassword"));
		password.sendKeys("9612");

		WebElement login = driver.findElement(MobileBy.id("com.twigafoods.soko.staging:id/btnLogin"));
		login.click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[contains(@text,'Tech Operations')]")));

		String successLogin = driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Tech Operations')]")).getText();


		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement supplier = wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.TextView[contains(@text,'Suppliers')]")));
		supplier.click();

		WebElement add_supplier = driver.findElement(MobileBy.xpath("//android.widget.TextView[contains(@text,'Add Supplier')]"));
		add_supplier.click();

		WebElement enter_fname = driver.findElement(MobileBy.id("com.twigafoods.soko.staging.sourcing:id/edtFname"));
		enter_fname.sendKeys("appium");

		WebElement enter_lname = driver.findElement(MobileBy.id("com.twigafoods.soko.staging.sourcing:id/edtLname"));
		enter_lname.sendKeys("test");

		WebElement enter_phoneNumber = driver.findElement(MobileBy.id("com.twigafoods.soko.staging.sourcing:id/edtPhoneNumber"));
		enter_phoneNumber.sendKeys("0703232437569990337");

		WebElement product_spinner = driver.findElement(MobileBy.xpath("//android.widget.TextView[contains(@text,'Select Products')]"));
		product_spinner.click();

		WebElement enter_product = driver.findElement(MobileBy.id("com.twigafoods.soko.staging.sourcing:id/alertSearchEditText"));
		enter_product.sendKeys("Bananas");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement click_check_box = driver.findElement(MobileBy.xpath("//android.widget.TextView[contains(@text,'Bananas')]"));
		click_check_box.click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement click_ok = driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button"));
		click_ok.click();

		WebElement confirm_supplier = driver.findElement(MobileBy.id("com.twigafoods.soko.staging.sourcing:id/btnConfirmSupplier"));
		confirm_supplier.click();

		WebElement confirm_creation = driver.findElement(MobileBy.id("com.twigafoods.soko.staging.sourcing:id/btnConfirm"));
		confirm_creation.click();

		WebElement view_supplier = driver.findElement(MobileBy.id("com.twigafoods.soko.staging.sourcing:id/btnViewSuppliers"));
		view_supplier.click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement add_farm_button = driver.findElement(MobileBy.id("com.twigafoods.soko.staging.sourcing:id/btnAddFarm"));
		add_farm_button.click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement add_farm_type = driver.findElement(MobileBy.id("com.twigafoods.soko.staging.sourcing:id/edtTypeFarmerDropDown"));
		add_farm_type.click();

		WebElement select_farm_type = wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("com.twigafoods.soko.staging.sourcing:id/editTextFarmName")));
		select_farm_type.click();

		WebElement farm_name = driver.findElement(MobileBy.id("com.twigafoods.soko.staging.sourcing:id/editTextFarmName"));
		farm_name.sendKeys("A1");


		WebElement farm_size = driver.findElement(MobileBy.id("com.twigafoods.soko.staging.sourcing:id/editTextFarmSize"));
		farm_size.sendKeys("100");

		WebElement collection_centre_clear = driver.findElement(MobileBy.id("com.twigafoods.soko.staging.sourcing:id/edtCollectionCenterDropDown"));
		collection_centre_clear.clear();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement collection_centre = driver.findElement(MobileBy.id("com.twigafoods.soko.staging.sourcing:id/edtCollectionCenterDropDown"));
		collection_centre.sendKeys("Pack House");

		List<WebElement> items = driver.findElements(MobileBy.id("com.twigafoods.soko.staging.sourcing:id/edtCollectionCenterDropDown"));
		items.get(0).click();

		driver.hideKeyboard();

		WebElement harvest_area_clear = driver.findElement(MobileBy.id("com.twigafoods.soko.staging.sourcing:id/edtHarvestArea"));
		harvest_area_clear.clear();

		WebElement harvest_area_click = driver.findElement(MobileBy.id("com.twigafoods.soko.staging.sourcing:id/edtHarvestArea"));
		harvest_area_click.click();

		List<WebElement> itemss = driver.findElements(MobileBy.id("com.twigafoods.soko.staging.sourcing:id/edtHarvestArea"));
		itemss.get(0).click();

		driver.hideKeyboard();


		WebElement select_harvest_area = driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup"));
		select_harvest_area.click();

		driver.hideKeyboard();

		WebElement take_location = driver.findElement(MobileBy.id("com.twigafoods.soko.staging.sourcing:id/textViewTakeLocation"));
		take_location.click();

		WebElement select_location = driver.findElement(MobileBy.id("com.twigafoods.soko.staging.sourcing:id/imageViewLocation"));
		select_location.click();

		WebElement save_location = driver.findElement(MobileBy.id("com.twigafoods.soko.staging.sourcing:id/btnSave"));
		save_location.click();

		WebElement save_farm = driver.findElement(MobileBy.id("com.twigafoods.soko.staging.sourcing:id/btnSaveFarm"));
		save_farm.click();

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		WebElement confirm_save_Farm = driver.findElement(MobileBy.id("com.twigafoods.soko.staging.sourcing:id/btnConfirm"));
		confirm_save_Farm.click();

		WebElement view_save_Farm = driver.findElement(MobileBy.id("com.twigafoods.soko.staging.sourcing:id/btnViewSuppliers"));
		view_save_Farm.click();


	}
}