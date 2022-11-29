package com.traveloka.cucumber.pages;

import com.traveloka.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Traveloka {
    private WebDriver driver;

    public Traveloka(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div/div[3]/div[1]/a")
    WebElement txtTravelokaPages;

    @FindBy(xpath = "//div[contains(text(),'Car Rental')]")
    WebElement chooseCarRental;

    @FindBy(xpath = "//div[@class='css-1dbjc4n r-1naam9t r-1fuqb1j r-d045u9 r-1472mwg r-icoktb r-u8s1d r-lrsllp']")
    WebElement chooseWithoutDriver;

    @FindBy(xpath ="//div[@aria-checked='true']//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1777fci r-ymttw5 r-1yzf0co']")
    WebElement chooseWithDriver;

    @FindBy(xpath = "//input[@placeholder='Enter city or region']")
    WebElement inputRegion;

    @FindBy(xpath = "//div[normalize-space()='North Sulawesi, Indonesia']")
    WebElement selectRegion;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div/div/div[4]/div[1]/div/div[1]/input")
    WebElement klikStartDate;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div/div/div[4]/div[1]/div/div[2]/div/div")
    WebElement inputStartDate;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div/div/div[4]/div[3]/div/div[1]/input")
    WebElement klikStartTime;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div/div/div[4]/div[5]/div/div[1]/input")
    WebElement klikEndDate;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div/div/div[4]/div[1]/div/div[2]/div/div")
    WebElement inputEndDate;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div/div/div[4]/div[7]/div/div[1]/input")
    WebElement klikEndTime;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[5]/div[2]/div[1]/div/div/div[3]/div/div/div[4]/div[9]/div/div[2]")
    WebElement btnSearch;

   @FindBy(xpath = "//*[@id=\"__next\"]/div/div[4]/div/div[1]/div/div[1]/div/div[3]/div/div/h2")
   WebElement txtTampilHasil;

    @FindBy(xpath = "//div[@class='css-18t94o4 css-1dbjc4n r-kdyh1x r-oo3563 r-1loqt21 r-10paoce r-1e081e0 r-5njf8e r-1otgn73 r-lrvibr']//div[@class='css-1dbjc4n r-1awozwy r-13awgt0 r-18u37iz r-1777fci']")
    WebElement btnContinue;

    @FindBy(xpath = "//div[@class='css-18t94o4 css-1dbjc4n r-kdyh1x r-oo3563 r-1loqt21 r-10paoce r-1guathk r-5njf8e r-1otgn73 r-lrvibr']")
    WebElement btnContinueProvider;

    @FindBy(xpath = "//*[@id=\"RENTAL_PICKUP_LOCATION\"]/div/div/div[3]/div[1]/div[2]/div/div/div[1]")
    WebElement choosePickupLocation;

    @FindBy(xpath = "//*[@id=\"RENTAL_PICKUP_LOCATION\"]/div/div/div[3]/div[2]/div/div/div[1]/div[1]")
    WebElement selectPickup;

    @FindBy(xpath = "//*[@id=\"RENTAL_PICKUP_LOCATION\"]/div/div/div[3]/div[2]/div/div/div[1]/div[2]/div/div/div/div[1]/div[1]/div/div[1]/div/div[2]")
    WebElement clickPickup;

    @FindBy(xpath = "//*[@id=\"RENTAL_DROPOFF_LOCATION\"]/div/div/div[3]/div[1]/div[2]/div/div/div[1]/div/div[1]")
    WebElement selectDropOffLocation;

    @FindBy(xpath = "//div[@class='css-1dbjc4n r-1naam9t r-kdyh1x r-rs99b7 r-1loqt21 r-1otgn73 r-1i6wzkk r-lrvibr']//div[@class='css-1dbjc4n r-13awgt0 r-18u37iz r-edyy15']")
    WebElement selectDropOff;

    @FindBy(xpath = "//div[@class='css-901oao css-bfa6kz r-1sixt3s r-1b43r93 r-majxgm r-rjixqe r-fdjqy7'][normalize-space()='Kanigara Jaya Raya Manado']")
    WebElement clickDropOff;

    @FindBy(xpath = "//div[@class='css-18t94o4 css-1dbjc4n r-kdyh1x r-oo3563 r-1loqt21 r-10paoce r-5wp0in r-5njf8e r-1otgn73 r-lrvibr']//div[@class='css-901oao css-bfa6kz r-jwli3a r-1sixt3s r-cygvgh r-b88u0q r-1iukymi r-q4m81j'][normalize-space()='Continue']")
    WebElement continuePay;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/h1")
    WebElement txtBooking;

    public void setChooseCarRental(){
        this.chooseCarRental.click();
    }

    public void setChooseWithoutDriver(){
        this.chooseWithoutDriver.click();
    }

    public void setChooseWithDriver(){
        this.chooseWithDriver.click();
    }

    public void setInputRegion(String region){
        this.inputRegion.click();
        this.inputRegion.sendKeys(region, Keys.RETURN);
        this.selectRegion.click();
    }

    public void setInputStartDate(String startdate){
        this.klikStartDate.click();
        this.klikStartDate.sendKeys(startdate, Keys.RETURN);
    }

    public void inputStartTime(String starttime){
        this.klikStartTime.click();
        this.klikStartTime.sendKeys(starttime, Keys.RETURN);
    }

    public void setInputEndDate(String enddate){
        this.klikEndDate.click();
        this.klikEndDate.sendKeys(enddate, Keys.RETURN);
    }

    public void setKlikEndTime(String endtime){
        this.klikEndTime.click();
        this.klikEndTime.sendKeys(endtime, Keys.RETURN);
    }

    public void setBtnSearch(){
        this.btnSearch.click();
    }

    public String getTxtTampilHasil(){
        return txtTampilHasil.getText();
    }

    public String getTxtTravelokaPages(){
        return txtTravelokaPages.getText();
    }


    public void setBtnContinue(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnContinue);
    }

    public void setBtnContinueProvider(){
        this.btnContinueProvider.click();
    }

    public void setChoosePickupLocation(){
        this.choosePickupLocation.click();
    }

    public void setSelectPickup(){
        this.selectPickup.click();
    }

    public void setClickPickup(){
        this.clickPickup.click();
    }

    public void setContinuePay(){
        this.continuePay.click();
    }

    public void setSelectDropOffLocation(){
        this.selectDropOffLocation.click();
    }

    public void setSelectDropOff(){
        this.selectDropOff.click();
    }

    public void setClickDropOff(){
        this.clickDropOff.click();
    }

    public void clickContinuePay(){
        this.continuePay.click();
    }

    public String getTxtBooking(){ return txtBooking.getText();}


}
