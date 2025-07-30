package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import Pages.UnileverHomepage;

public class UnileverStep {
    WebDriver driver;
    UnileverHomepage homePage;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.unilever.com/");
        driver.manage().window().maximize();
        homePage = new UnileverHomepage(driver);
    }

    @After
    public void tearDown() {
        if (driver != null) driver.quit();
    }

    @Given("I am on the Unilever homepage")
    public void i_am_on_the_homepage() {
        // Already opened in @Before
    }

    @When("I accept cookies if present")
    public void i_accept_cookies() {
        homePage.acceptCookiesIfPresent();
    }

    @When("I click on Our Company")
    public void i_click_our_company() {
        homePage.clickOurCompany();
    }

    @When("I view Our Company")
    public void i_view_our_company() {
        homePage.clickViewOurCompany();
    }

    @When("I click on Contact Us")
    public void i_click_contact_us() {
        homePage.clickContactUs();
    }

    @When("I click on Suppliers")
    public void i_click_suppliers() {
        homePage.clickSuppliers();
    }

    @When("I view Suppliers")
    public void i_view_suppliers() {
        homePage.clickViewSuppliers();
    }

    @When("I click on Sustainability")
    public void i_click_sustainability() {
        homePage.clickSustainability();
    }

    @When("I click on Brands")
    public void i_click_brands() {
        homePage.clickBrands();
    }

    @When("I view Brands")
    public void i_view_brands() {
        homePage.clickViewBrands();
    }

    @When("I explore more brands")
    public void i_explore_more_brands() {
        homePage.clickExploreBrands();
    }

    @When("I search for brand {string}")
    public void i_search_for_brand(String brand) {
        homePage.enterBrandSearch(brand);
        homePage.clickSearchBtn();
    }

    @When("I click on Investors")
    public void i_click_investors() {
        homePage.clickInvestors();
    }

    @When("I click on Careers")
    public void i_click_careers() {
        homePage.clickCareers();
    }

    @When("I visit Careers site")
    public void i_visit_careers_site() {
        homePage.clickVisitCareers();
    }

    @When("I click on News")
    public void i_click_news() {
        homePage.clickNews();
    }

    @When("I view Latest News")
    public void i_view_latest_news() {
        homePage.clickViewLatestNews();
    }

    @When("I sign up for email alerts")
    public void i_sign_up_for_email_alerts() {
        homePage.clickSignUpForEmail();
    }

    @Then("I should see the page or modal")
    public void i_should_see_the_page() {
        // Add assertions as needed for your tests
    }
}