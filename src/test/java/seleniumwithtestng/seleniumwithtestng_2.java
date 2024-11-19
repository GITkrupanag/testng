package seleniumwithtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class seleniumwithtestng_2 {
	String driverPath= "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	
	
	@BeforeTest
	
	void navigate() throws InterruptedException {
		driver.get("https://demo.automationtesting.in/Register.html");
	    Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
	}
	
	@Test(priority=0)
		void firstname() {
		WebElement fn=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		fn.sendKeys("Krupa");
	}
		
		@Test(priority=1)
		void lastname() {
		WebElement ln=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		ln.sendKeys("Nag");
		}
		
		@Test(priority=2)
		void address() {
		WebElement add=driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
		add.sendKeys("Hebbal,Bengaluru");
		}
		
		@Test(priority=3)
		void email() {
		WebElement em=driver.findElement(By.xpath("//input[@type='email']"));
		em.sendKeys("krupanag07@gmail.com");
		}
		
		
		@Test(priority=9)
		void choosefile() {
			WebElement ch=driver.findElement(By.xpath("//input[@id='imagesrc']"));
			ch.sendKeys("C:\\Users\\Admin\\Desktop\\program ss.png");
			
		}
		
		@Test(priority=4)
		void phonenumber() {
		WebElement pn=driver.findElement(By.xpath("//input[@type='tel']"));
		pn.sendKeys("9663716108");
		}
		
		@Test(priority=5)
		void grnder() {
		WebElement fl=driver.findElement(By.xpath("//label[normalize-space()='FeMale']"));
		fl.click();
		}
		
		@Test(priority=6)
		void lang() throws InterruptedException {
		WebElement cri=driver.findElement(By.xpath("//input[@id='checkbox1']"));
		cri.click();
		WebElement mov=driver.findElement(By.xpath("//input[@id='checkbox2']"));
		mov.click();
		WebElement lang=driver.findElement(By.xpath("//label[normalize-space()='Languages']"));
		Actions a=new Actions(driver);
		a.moveToElement(lang).build().perform();
		WebElement opt=driver.findElement(By.xpath("//div[@id='msdd']"));
		opt.click();
		Thread.sleep(2000);
		//a.moveToElement(opt).build().perform();
		WebElement eng=driver.findElement(By.xpath("//a[normalize-space()='English']"));
		eng.click();
		Thread.sleep(2000);
		WebElement lan=driver.findElement(By.xpath("//label[normalize-space()='Languages']"));
		lan.click();
		WebElement sk=driver.findElement(By.xpath("//select[@id='Skills']"));
		sk.click();
		WebElement and=driver.findElement(By.xpath("//option[@value=\"Android\"]"));
		and.click();
		WebElement skil=driver.findElement(By.xpath("//label[normalize-space()='Skills']"));
		skil.click();
		WebElement selco=driver.findElement(By.xpath("//b[@role='presentation']"));
		selco.click();
		Thread.sleep(1000);
		WebElement india=driver.findElement(By.xpath("//input[@role='textbox']"));
		india.sendKeys("India");
		Thread.sleep(1000);
		}
		
		@Test(priority=7)
		void dateofbirth() {
		WebElement coun=driver.findElement(By.xpath("//label[@for='usr']"));
		coun.click();
		WebElement year=driver.findElement(By.xpath("//option[@value=\"2003\"]"));
		year.click();
		WebElement mon=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		mon.click();
		WebElement mont=driver.findElement(By.xpath("//option[@value=\"May\"]"));
		mont.click();
		WebElement xz=driver.findElement(By.xpath("//label[normalize-space()='Date Of Birth']"));
		xz.click();
		WebElement day=driver.findElement(By.xpath("//select[@id='daybox']"));
		day.click();
		WebElement days=driver.findElement(By.xpath("//option[@value=\"7\"]"));
		days.click();
		WebElement yz=driver.findElement(By.xpath("//label[normalize-space()='Date Of Birth']"));
		yz.click();
		}
		
		@Test(priority=8)
		void password() {
		WebElement pw=driver.findElement(By.xpath("//input[@id='firstpassword']"));
		pw.sendKeys("apple2024");
		WebElement rpw=driver.findElement(By.xpath("//input[@id='secondpassword']"));
		rpw.sendKeys("apple2024");
		WebElement submit=driver.findElement(By.xpath("//button[@id='submitbtn']"));
		submit.click();
		}
}

