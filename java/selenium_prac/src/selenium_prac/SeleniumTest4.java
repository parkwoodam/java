package selenium_prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest4 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.point-nine.com/layout/res/home.php?go=main");
		//main창
		String srtMain = driver.getWindowHandle();
		//main 창이 아니면 팝업창 닫기
		for (String handle : driver.getWindowHandles()) {
			if(!handle.equals(srtMain)) {
				driver.switchTo().window(handle).close();
			}
		}
		
		//예약하기
		WebElement financeButton = driver.findElement(By.xpath("/html/body/div[3]/header/div/div/div[3]/ul/li[4]/a"));
		financeButton.click();
		
		//예약날짜 설정
		//출발역
		Select depature = new Select(driver.findElement(By.name("rev_days")));

		depature.selectByVisibleText("2024-07-15");
		
		
	}
}
