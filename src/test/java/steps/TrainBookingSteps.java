package steps;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;
import utils.BasePage;
import java.io.IOException;
import static utils.Driver.driver;
import static utils.Driver.setUpDriver;
import org.testng.Assert;

public class TrainBookingSteps extends BasePage {


    @BeforeTest
    public void setupDriverTest() throws IOException {
        setUpDriver();
    }
    @Test(priority = 1)
    public void clickAllCategories()throws InterruptedException {
        MethodsPage methodsPage = new MethodsPage(driver);
        methodsPage.clickAllCategory();
    }
    @Test(priority = 2)
    public void selectTrain() {
        MethodsPage methodsPage = new MethodsPage(driver);
        methodsPage.selectTrain();
    }
    @Test(priority = 3)
    public void selectSourceStation() {
        MethodsPage methodsPage = new MethodsPage(driver);
        methodsPage.selectSourceStation();
    }
    @Test(priority = 4)
    public void setSourceStation()
    {
        MethodsPage methodsPage=new MethodsPage(driver);
        methodsPage.setSourceStation();
    }
    @Test(priority = 5)
    public void selectDestinationStation()
    {
        MethodsPage methodsPage = new MethodsPage(driver);
        methodsPage.selectDestinationStation();
        methodsPage.setDestinationStation();
    }
    @Test(priority = 6)
    public void selectRoundTrip()
    {
        MethodsPage methodsPage = new MethodsPage(driver);
        methodsPage.selectRoundTrip();
    }
    @Test(priority = 7)
    public void selectDate()
    {
        MethodsPage methodsPage =new MethodsPage(driver);
        methodsPage.selectAndSetStartDate();
        methodsPage.selectAndSetReturnDate();
    }
    @Test(priority = 8)
    public void search(){
        MethodsPage methodsPage =new MethodsPage(driver);
        methodsPage.search();
    }
    @Test(priority = 9)
    public void bookTrain()
    {
        MethodsPage methodsPage =new MethodsPage(driver);
        methodsPage.bookTrain();
    }
    @Test(priority = 10)
    public void seeDetails()
    {
        MethodsPage methodsPage =new MethodsPage(driver);
        methodsPage.productDetails();
    }
}