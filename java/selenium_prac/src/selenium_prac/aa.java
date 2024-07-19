package selenium_prac;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class aa {
	public static void main(String[] args) throws InterruptedException {
        LocalTime now = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        String formattedNow = now.format(formatter);
        System.out.println("프로그램을 구동합니다.");

        // 시간 형식 지정 (오전/오후 구분)
        int flag = 0;

        while (flag == 0) {
            now = LocalTime.now();
            formatter = DateTimeFormatter.ofPattern("hh:mm a");
            formattedNow = now.format(formatter);

            if (now.getHour() == 18 && now.getMinute() ==00 &&now.getSecond() ==00) {
                WebDriver driver = new ChromeDriver();
                driver.get("https://edu.ssafy.com/edu/main/index.do");
                
                WebElement myId = driver.findElement(By.xpath("//*[@id=\"userId\"]"));
                myId.sendKeys("아이디 입력");
                WebElement myPw = driver.findElement(By.xpath("//*[@id=\"userPwd\"]"));
                myPw.sendKeys("비밀번호 입력");
                WebElement Click = driver.findElement(By.xpath("//*[@id=\"wrap\"]/div/div/div[2]/form/div/div[2]/div[3]/a"));
                Click.click();
                
                Thread.sleep(1000);
                WebElement closeButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/button[1]"));
                closeButton.click();
                
                // 입실
//                Thread.sleep(1000);
//                WebElement inRoomButton = driver.findElement(By.xpath("//*[@id=\"checkIn\"]"));
//                inRoomButton.click();
                
                Thread.sleep(1000);
                WebElement plusButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/section[2]/div/div[1]/div/a/span"));
                plusButton.click();
                
                
               String abc = "";
                

                List<WebElement> searchDay = driver.findElements(By.xpath("//*[@id=\"_crclmDayTargetId\"]/li[1]"));
                for (WebElement webElement : searchDay) {
                    
                    abc = abc.concat(webElement.getText());
           
                    
                }

                
                Thread.sleep(1000);
                driver.get("https://edu.ssafy.com/edu/main/index.do");
                
                //퇴실
                Thread.sleep(1000);
                WebElement outRoomButton = driver.findElement(By.xpath("//*[@id=\"checkOut\"]"));
                outRoomButton.click();
                
//                ArrayList<String> my_text = new ArrayList<String>();
//                String line;
//                String[] abcde = abc.split("\n");
//                String text_date = abcde[0].substring(abcde[0].indexOf("2"), abcde[0].indexOf(")")+1);
//                String temp_text ="";
//                for (int i = 1; i < abcde.length; i++) {
//
//                    if (i%4 == 1) {
//                        temp_text = temp_text.concat(abcde[i]);
//                        temp_text = temp_text.concat(" = ");    
//                    }
//                    if (i%4 == 3) {
//                        temp_text = temp_text.concat(abcde[i]);
//                    }
//                    if(i%4 == 0) {
//                        my_text.add(temp_text);
//                        temp_text ="";
//                    }
//                    
//                }
//                ArrayList<String> my_time = new ArrayList<String>(my_text.size());
//                ArrayList<String> my_content = new ArrayList<String>(my_text.size());
//                System.out.println("오늘의 날짜는 " + text_date + " 입니다.");
//                for (int i = 0; i < my_text.size(); i++) {
//                    String[] temp_mytext = my_text.get(i).split("=");
//                    my_time.add(temp_mytext[0]);
//                    my_content.add(temp_mytext[1]);
//                    System.out.println(my_time.get(i) + " = " + my_content.get(i));
//                    
//                }
//                
//                
//                flag = 1;
            }
        }

    }

}