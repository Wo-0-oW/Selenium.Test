package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test01 {
    public static void main(String[] args) {

       //setPropert iki parametreden olusur. ilkinde hangi property set edecegimizi belirliyoruz
        // ikinci parametre icin ise bilgisayarimizdaki com driverin yolunu bulup yazacagiz
        // bu driver uzantisi verilen jar dosyasini calistirmak icin gereklidir.
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Adm\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        //WebDriver icin bir obje belirledik ve adi driver oldu. Burada dikkat edilmesi gerek kullanilacak olan tarayicimizin Firefox mu Opera mi chrome mu oldugu ki burada otomatik olsup Chrome verir

        WebDriver driver = new ChromeDriver();

        //Amazon sayfasina gider
        driver.get("https://amazon.com");
        //sayfayi tam ekran yapar
        driver.manage().window().maximize();
        //consola gittigi url adresini yazar
        System.out.println(driver.getCurrentUrl());
        //youtube sayfasina gider
        driver.navigate().to("https://youtube.com");
        //tarayici full ekran yapar
        driver.manage().window().fullscreen();
        //adresi alir
        System.out.println(driver.getCurrentUrl());
        //geri gelir
        driver.navigate().back();
        //sayfayi yeniler
        driver.navigate().refresh();
        //ileri gider
        driver.navigate().forward();
        //tum browserlari kapatir
        driver.quit();
        //tek tarayici aciksa onu kapatir. coklu kapatmaz
        driver.close();



    }
}
