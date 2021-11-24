package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test02 {

    public static void main(String[] args) {
        //Yeni bir class olusturalim(VerifyTitle)
        //Amazon ana sayfasina gidelim. https://amazon.com

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Adm\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");

        String expectedTitle = "amazon1";
        String actualTitle =driver.getTitle();

        if(expectedTitle.equals(actualTitle)) {
            System.out.println("titel beklenen deger ile ayni , Test PASS");
        }else {
            System.out.println("title beklneen degerden farklidir , Test FAIL");
            System.out.println("actual title " + driver.getTitle());
        }

        driver.close();



    }
    }
