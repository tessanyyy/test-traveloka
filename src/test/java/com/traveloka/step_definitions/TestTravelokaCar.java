package com.traveloka.step_definitions;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.traveloka.cucumber.pages.Traveloka;
import com.traveloka.cucumber.utils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestTravelokaCar {

    private static WebDriver driver;

    private static ExtentTest extentTest;

    private Traveloka traveloka = new Traveloka();

    public TestTravelokaCar() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //Test Case ke web traveloka
    @When("Mengakses web traveloka")
    public void mengakses_web_traveloka(){
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "Mengakses web traveloka");
    }

    @Then("Berhasil mengakses web traveloka")
    public void berhasil_mengakses_web_traveloka(){
        Assert.assertEquals(traveloka.getTxtTravelokaPages(), "");
        extentTest.log(LogStatus.PASS,"Berhasil mengakses web traveloka");
    }

    //Test Case Search Car Rental
    @When("Klik car rental")
    public void klik_car_rental(){
        Hooks.delay(1);
        traveloka.setChooseCarRental();
        extentTest.log(LogStatus.PASS, "Klik car rental");
    }

    @And("Pilih jenis car rental")
    public void pilih_jenis(){
        Hooks.delay(1);
        traveloka.setChooseWithDriver();
        extentTest.log(LogStatus.PASS,"Pilih jenis car rental");
    }

    @And("Input rental location")
    public void input_rental_location(){
        traveloka.setInputRegion("Manado");
        extentTest.log(LogStatus.PASS, "Input rental location");
    }

    @And("Input start date")
    public void input_start_date(){
        Hooks.delay(1);
        traveloka.setInputStartDate("01/12/2022");
        extentTest.log(LogStatus.PASS, "Input start date");
    }

    @And("Input start time")
    public void input_start_time(){
        Hooks.delay(1);
        traveloka.inputStartTime("09:00");
        extentTest.log(LogStatus.PASS, "Input start time");
    }

    @And("Input end date")
    public void input_end_date(){
        Hooks.delay(1);
        traveloka.setInputEndDate("03/12/2022");
        extentTest.log(LogStatus.PASS, "Input end date");
    }

    @And("Input end time")
    public void input_end_time(){
        Hooks.delay(1);
        traveloka.setKlikEndTime("09:00");
        extentTest.log(LogStatus.PASS, "Input end time");
    }

    @And("Klik button search")
    public void klik_button_search(){
        Hooks.delay(1);
        traveloka.setBtnSearch();
        extentTest.log(LogStatus.PASS, "Klik button search");
    }

    @Then("Tampil hasil pencarian")
    public void tampil_hasil(){
        Assert.assertEquals(traveloka.getTxtTampilHasil(), "Car Rental Without Driver");
        extentTest.log(LogStatus.PASS, "Tampil hasil pencarian");
    }

    //Test case continue search car rental
    @When("Continue search")
    public void continue_search(){
        Hooks.delay(1);
        traveloka.setBtnContinue();
        extentTest.log(LogStatus.PASS, "Continue search");
    }

    @And("Continue rental provider")
    public void continue_rental(){
        traveloka.setBtnContinueProvider();
        extentTest.log(LogStatus.PASS, "Continue rental provider");
    }

    @And("Select pickup location")
    public void select_pickup_location(){
        traveloka.setChoosePickupLocation();
        extentTest.log(LogStatus.PASS, "Select pickup location");
    }

    @And("Select pickup")
    public void select_pickup(){
        traveloka.setSelectPickup();
        extentTest.log(LogStatus.PASS, "Select pickup");
    }

    @And("Click pickup location")
    public void click_pickup_location(){
        traveloka.setClickPickup();
        extentTest.log(LogStatus.PASS, "Click pickup location");
    }

    @And("Select dropoff location")
    public void select_dropoff_location(){
        traveloka.setSelectDropOffLocation();
        extentTest.log(LogStatus.PASS, "Select dropoff location");
    }

    @And("Select dropoff")
    public void select_dropoff(){
        traveloka.setSelectDropOff();
        extentTest.log(LogStatus.PASS, "Select dropoff");
    }

    @And("Click dropoff location")
    public void click_dropoff(){
        traveloka.setClickDropOff();
        extentTest.log(LogStatus.PASS, "Click dropoff location");
    }

    @And("Click continue pay")
    public void click_continue_pay(){
        traveloka.clickContinuePay();
        extentTest.log(LogStatus.PASS, "Click continue pay");
    }

    @Then("Get your booking")
    public void get_your_booking(){
        Assert.assertEquals(traveloka.getTxtBooking(), "Your Booking");
        extentTest.log(LogStatus.PASS, "Get your booking");
    }
}
