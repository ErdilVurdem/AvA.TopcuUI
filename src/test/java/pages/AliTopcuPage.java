package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class AliTopcuPage {
    public AliTopcuPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@class='attachment-large size-large wp-image-2997 lazyautosizes lazyloaded']")
    public WebElement aliTocuLogo;

    @FindBy (xpath = "(//*[@class='wpr-promo-box-btn-text'])[1]")
    public WebElement ictihatlarDahaFazlaYazisi;

    @FindBy (xpath = "(//*[@class='wpr-promo-box-btn-text'])[2]")
    public WebElement blogDahaFazlaYazisi;



    public void ictihatVeBlogGoruntuleme(String text){
        ReusableMethods.elementeKadarKaydirma(text);
        ReusableMethods.bekle(1);
        assertTrue(ictihatlarDahaFazlaYazisi.isDisplayed());
        assertTrue(blogDahaFazlaYazisi.isDisplayed());
    }




}
