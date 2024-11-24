package SocialTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Instagram_analysis {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		WebElement gmail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")));
		gmail.sendKeys("mahima27yadav@gmail.com");
		WebElement password=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")));
		password.sendKeys("Mahimayadav2708@");
		WebElement login=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")));
		login.click();
		WebElement search=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*/div/div/div[2]/div/div/div[1]/div[1]/div[1]/div/div/div/div/div[2]/div[2]/span/div")));
		search.click();
		WebElement search1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*/div/div/div[2]/div/div/div[1]/div[1]/div[1]/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/div/input")));
		search1.sendKeys("DotandKey.Skincare");
		
		WebElement search2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*/div/div/div[2]/div/div/div[1]/div[1]/div[1]/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/a[1]/div[1]/div/div/div[2]/div/div/div/span")));
		search2.click();
		
		
		WebElement followers=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*/div/div/div[2]/div/div/div[1]/div[1]/div[2]/div[2]/section/main/div/header/section/ul/li[2]/a/span/span")));
		 System.out.println("Followers:"+" "+followers.getText());
		 
		
		  WebElement following=driver.findElement(By.xpath("//*/div/div/div[2]/div/div/div[1]/div[1]/div[2]/div[2]/section/main/div/header/section/ul/li[3]/a/span/span"));
		  System.out.println("Following:" +" "+following.getText());
		  
		 WebElement Totalposts=driver.findElement(By.xpath("//*/div/div/div[2]/div/div/div[1]/div[1]/div[2]/div[2]/section/main/div/header/section/ul/li[1]/span/span"));
		 String posts1=Totalposts.getText(); 
		  posts1 = posts1.replace(",", ""); 
		
			 int posts=Integer.parseInt(posts1);
			 System.out.println("posts:"+" "+posts); 
		

		
		WebElement post=driver.findElement(By.xpath("/*//section/main/div/div[3]/div/div[1]/div[1]"));	
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView", post);
		post.click();
         
			
		WebElement likes=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/div/div/div[2]/div/article/div/div[2]/div/div/div[2]/section[2]/div/div/span/a/span/span")));	
		System.out.println("likes:"+likes.getText());
		
		WebElement date=driver.findElement(By.xpath("/html/body/div[7]/div[1]/div/div[3]/div/div/div/div/div[2]/div/article/div/div[2]/div/div/div[2]/div[2]/div/div"));
		System.out.println("Date of upload:"+date.getText());
		
		
		}
		
		
		
	}


