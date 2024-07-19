package selenium_prac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testtstsstt {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.notion.so/");
        String naverMain = driver.getWindowHandle();
        
        // 로그인 클릭
        Thread.sleep(1000);
        WebElement loginButton = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/header/div/div[2]/div/nav/div[2]/div/ul[2]/li[1]/a/div"));
        loginButton.click();
        

        // 로그인
        Thread.sleep(1000);
        WebElement IDBar = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/main/div[1]/section/div/div/div/div[2]/div[1]/div[3]/form/div[1]/input"));
        IDBar.sendKeys("qkrtjd50@naver.com"); // ID 입력
        IDBar.sendKeys(Keys.ENTER);      // 엔터로 로그인
        
        Thread.sleep(1000);
        WebElement PWBar = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/main/div[1]/section/div/div/div/div[2]/div[1]/div[3]/form/div[2]/input"));
        PWBar.sendKeys("qkqho9e0!"); // PW 입력
        PWBar.sendKeys(Keys.ENTER);      // 엔터로 로그인
        
///html/body/div[1]/div/div[1]/div/nav/div/div/div/div[3]/div/div[4]/div/div/div[1]/div[2]/div/div/div[2]/div/div/div/div[1]/a/div/div[2]/div
        // 할일목록 클릭
        Thread.sleep(1000);
        WebElement calButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/nav/div/div/div/div[3]/div/div[4]/div/div/div[1]/div[2]/div/div/div[2]/div/div/div/div[1]/a/div/div[2]/div"));
        calButton.click();
        
        
        
        
//        // 팝업창 닫기
//        Thread.sleep(1000);
//        WebElement closeButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/button[1]"));
//        closeButton.click();

    }

}
