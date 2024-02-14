package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class homepage extends Utility {
    private static final Logger log = LogManager.getLogger(homepage.class);

    public homepage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class=\"privacy_prompt_content\"]/div/div[3]/label")
    WebElement acceptAllCookies;
    @CacheLookup
    @FindBy(tagName ="h1" )
    WebElement verifyText;
    @CacheLookup
    @FindBy(linkText = "Casino")
    WebElement casinolink;

    @CacheLookup
    @FindBy(xpath = " //div[@class='StyledGamesRow-sc-whe244-1 kiopLE']")
    List<WebElement> listitems;

public void clickOnAcceptCookies(){
  clickOnElement(acceptAllCookies);
    log.info("Click on accept all cookies: " + acceptAllCookies.toString());
}


public String verifyWelcomeText(){
    log.info("Verify Welcome message on homepage: " + verifyText.toString());
    return getTextFromElement(verifyText);

}
public void clickCasino(){
    log.info("Clicking on casino  " + casinolink.toString());
    clickOnElement(casinolink);
}
public ArrayList listItems(){
    ArrayList<String> names=new ArrayList<>();
    for(WebElement namePrint:listitems){
        names.add(namePrint.getText());
        System.out.println(names);
    }return names;
}
public int numberItems() {
   listItems();
   return listitems.size();


}
}