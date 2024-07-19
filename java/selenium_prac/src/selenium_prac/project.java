package selenium_prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class project {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.point-nine.com/layout/res/home.php?go=rev.make.input&rev_days=2024-07-12&theme_time_num=1464");
		WebElement myname = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/form/table/tbody/tr[5]/td/input"));
		myname.sendKeys("박우담");
		WebElement mytel1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/form/table/tbody/tr[6]/td/input[1]"));
		mytel1.sendKeys("3406");
		WebElement mytel2 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/form/table/tbody/tr[6]/td/input[2]"));
		mytel2.sendKeys("2735");
		
		WebElement count = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/form/table/tbody/tr[7]/td/select"));
		count.sendKeys("2명");
		count.sendKeys(Keys.ENTER);

		WebElement Click = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/form/table/tbody/tr[11]/td/input[1]"));
		Click.click();
		
		WebElement reservation = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/form/div/button[1]"));
		reservation.click();
		
		WebElement reservation2 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[2]/button"));
		reservation2.click();

	}

}