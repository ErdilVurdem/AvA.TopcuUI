package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;
import pages.AliTopcuPage;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.*;

public class AvAliTopcuStepDefinitions {

    AliTopcuPage aliTopcuPage=new AliTopcuPage();
    JavascriptExecutor jse=(JavascriptExecutor) driver;

    @Given("Kullanici {string} ana sayfasına gider ve gidildigini dogrular")
    public void kullanici_ana_sayfasına_gider(String gidilecekURL) {
        getDriver().get(gidilecekURL);
        assertTrue(aliTopcuPage.aliTocuLogo.isDisplayed());
    }
    @Given("Header kisminda bulunan {string} gorundugunu dogrular")
    public void header_kisminda_bulunan_gorundugunu_dogrular(String headerYazi) {
        ReusableMethods.textGorunuyorMu(headerYazi);
    }

    @Given("{string} ve {string} bolumu gorunene kadar sayfayı aşağıya kaydırır, ilgili bolumlerin gorundugunu ve erisilebildigini dogrular")
    public void ve_bolumu_gorunene_kadar_sayfayı_aşağıya_kaydırır_ilgili_bolumlerin_gorundugunu_ve_erisilebildigini_dogrular(String text1, String text2) {
        aliTopcuPage.ictihatVeBlogGoruntuleme(text1);
        aliTopcuPage.ictihatlarDahaFazlaYazisi.click();
        assertEquals("https://avukatalitopcu.com/ictihat-ve-kararlar/",getDriver().getCurrentUrl());
        getDriver().navigate().back();
        aliTopcuPage.ictihatVeBlogGoruntuleme(text2);
        aliTopcuPage.blogDahaFazlaYazisi.click();
        assertEquals("https://avukatalitopcu.com/blog/",getDriver().getCurrentUrl());
    }

    @Given("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        quitDriver();
    }
}
