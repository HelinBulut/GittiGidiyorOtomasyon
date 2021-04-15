package Pages;

import Contants.LoginPageContants;
import base.BasePage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;


public class LoginPage extends BasePage implements LoginPageContants {

    private Logger LOGGER = LogManager.getLogger(LoginPage.class);
    String email="helinbulut92";
    String sifre="1001.helin";

    public void goToLoginPage (){
        waitSeconds(1);
        String actualTitle;
        actualTitle = driver.getTitle();
        Assert.assertTrue("anasayfada değilsiniz", actualTitle.equals("Üye Giriş Sayfası – Gittigidiyor.com"));

    }

    public void Login(){
        waitForElementAndClick(login);
        waitForElementAndClick(loginbutton);
        waitForElementAndSendKeys(emailText,email);
        waitForElementAndSendKeys(sifreText,sifre);
        waitForElementAndClick(girisYap);
        Assert.assertTrue("Hesabım elementi gözükmedi. Login işlemi başarısız.",isElementVisible(submitKontrol,10));
        LOGGER.info("Başarılı şekılde gırış yapıldı.");
    }

}
