package selenium_prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class bb {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.point-nine.com/layout/res/home.php?go=main");
        String escapeMain = driver.getWindowHandle();

        // RESERVATION 버튼 클릭
        Thread.sleep(1000);
        WebElement resButton = driver.findElement(By.xpath("/html/body/div[3]/header/div/div/div[3]/ul/li[4]/a"));
        resButton.click();

        WebElement a = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/form/div/dl/div[2]/dd/select"));
        a.click();
        Thread.sleep(1000);
        
        Select hongdae = new Select(driver.findElement(By.name("s_zizum")));


        hongdae.selectByVisibleText("홍대점");

        // 예약날짜 버튼 클릭
        Thread.sleep(1000);
        WebElement dateButton = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/form/div/dl/div[1]/dd/input"));
        dateButton.click();
        
        Thread.sleep(1000);
        WebElement Button = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td[6]"));
        Button.click();
        
        

        // 시간 버튼 클릭
        Thread.sleep(1000);
        WebElement timeButton = driver
                .findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[3]/div[3]/ul/li[10]/a"));
        timeButton.click();

        //예약 정보 입력
        WebElement myname = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/form/table/tbody/tr[5]/td/input"));
        myname.sendKeys("이름");
        WebElement mytel1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/form/table/tbody/tr[6]/td/input[1]"));
        mytel1.sendKeys("전화번호 중간 4자리");
        WebElement mytel2 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/form/table/tbody/tr[6]/td/input[2]"));
        mytel2.sendKeys("전화번호 끝 4자리");
        
        // 인원 선택
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

