package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"passp-field-login\"]")
    private WebElement loginField;

    @FindBy(xpath = "//*[@id=\"passp:sign-in\"]")
    private WebElement loginBtn;

    @FindBy(xpath = "//*[@id=\"passp-field-passwd\"]")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@class='passp-auth-content']")
    private WebElement passpPageField;

    @FindBy(xpath = "//*[@class='registration__avatar-btn']")
    private WebElement registrationAvatarBtn;



    public void inputLogin(String login) {
        loginField.sendKeys(login);
    }

    public void inputPasswd(String passwd) {
        passwordField.sendKeys(passwd);
    }

    public void clickLoginBtn() {
        loginBtn.click();
    }

    public void registrationAvatarBtn() {
        registrationAvatarBtn.click();
    }


    public WebElement getPasspPageField() {
        return passpPageField;
    }

    public void setPasspPageField(WebElement passpPageField) {
        this.passpPageField = passpPageField;
    }
}
