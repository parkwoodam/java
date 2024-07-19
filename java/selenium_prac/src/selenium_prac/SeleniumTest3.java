package selenium_prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://finance.naver.com/");
		
		///html/body/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div/ul
		List<WebElement> newsTitleList = driver.findElements(By.xpath("/html/body/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div/ul"));
		
		for (WebElement webElement : newsTitleList) {
			System.out.println(webElement.getText());
		}

	}

}
