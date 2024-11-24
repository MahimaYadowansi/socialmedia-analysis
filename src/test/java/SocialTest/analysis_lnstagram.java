package SocialTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class analysis_lnstagram {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		System.out.println("Details of Dot and Key Skincare:");
		
		driver.get("https://www.instagram.com/dotandkey.skincare/");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		WebElement followers=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[2]/button/span/span")));
		 System.out.println("Followers:"+" "+followers.getText());
		 
		
		  WebElement following=driver.findElement(By.xpath("//li[3]/button/span/span"));
		  System.out.println("Following:" +" "+following.getText());
		  
		 WebElement posts=driver.findElement(By.xpath("//li[1]/button/span/span"));
		  
		 System.out.println("posts:"+" "+posts.getText());
		  List<WebElement> AllPosts=driver.findElements(By.xpath("//li[1]/button/span/span"));
		  for(WebElement AllPost:AllPosts)
		  {
			  AllPost.click();
			  
		  }
		  
		  
		  
		  
		  
		  driver.close();
		  
		  System.out.println("------------------------------------");
		  System.out.println("Details of Filtercopy:");
		  
		  WebDriver driver1=new ChromeDriver();
		  driver1.get("https://www.instagram.com/filtercopy/?hl=en");
		  driver1.manage().window().maximize();
		  WebDriverWait wait1=new WebDriverWait(driver1,Duration.ofSeconds(20));
		  WebElement followers1=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[2]/button/span/span")));
			 System.out.println("Followers:"+" "+followers1.getText());
			 
			
	      WebElement following1=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[3]/button/span/span")));
			  System.out.println("Following:" +" "+following1.getText());
			  
		WebElement posts1=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[1]/button/span/span")));
			  System.out.println("posts:"+" "+posts1.getText());
			  driver1.close();
		  
			  

			  System.out.println("------------------------------------");
			  System.out.println("Details of classywomenn:");
			  
			  WebDriver driver2=new ChromeDriver();
			  driver2.get("https://www.instagram.com/classywomenn/?hl=en");
			  driver2.manage().window().maximize();
			  WebDriverWait wait2=new WebDriverWait(driver2,Duration.ofSeconds(20));
			  WebElement followers2=wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[2]/button/span/span")));
				 System.out.println("Followers:"+" "+followers2.getText());
				 
				
		      WebElement following2=wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[3]/button/span/span")));
				  System.out.println("Following:" +" "+following2.getText());
				  
			WebElement posts2=wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[1]/button/span/span")));
				  System.out.println("posts:"+" "+posts2.getText());
				  driver2.close();
			  
		  }

}
