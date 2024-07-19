package selenium_prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest5 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://etk.srail.kr/main.do");
//		//main창
//		String srtMain = driver.getWindowHandle();
//		//main 창이 아니면 팝업창 닫기
//		for (String handle : driver.getWindowHandles()) {
//			if(!handle.equals(srtMain)) {
//				driver.switchTo().window(handle).close();
//			}
//		}
		
		//출발역
		Select depature = new Select(driver.findElement(By.name("dptRsStnCd")));
		
//		System.out.println(depature);
		
		depature.selectByVisibleText("대전");
		
		//도착역
		Select arrival = new Select(driver.findElement(By.name("arvRsStnCd")));
		
//		System.out.println(arrival);
		
		arrival.selectByValue("0015");		
		
		
		
		
		
		
		
	}
}
