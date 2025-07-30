package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UnileverHomepage {
    private WebDriver driver;

    public UnileverHomepage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By acceptCookiesBtn = By.id("onetrust-accept-btn-handler");
    private By ourCompanyMenu = By.id("uco-header-menu-0-0");
    private By viewOurCompany = By.xpath("//span[normalize-space()='View Our company']");
    private By contactUs = By.xpath("//span[normalize-space()='Contact us']");
    private By suppliersMenu = By.id("uco-header-menu-0-4");
    private By viewSuppliers = By.xpath("//span[normalize-space()='View Suppliers']");
    private By sustainabilityMenu = By.id("uco-header-menu-0-1");
    private By brandsMenu = By.id("uco-header-menu-0-2");
    private By viewBrands = By.xpath("//span[normalize-space()='View Brands']");
    private By exploreBrands = By.xpath("//span[normalize-space()='Explore more brands']");
    private By searchBrandsInput = By.id("keywords");
    private By searchBtn = By.xpath("//span[normalize-space()='Search']");
    private By investorsMenu = By.id("uco-header-menu-0-6");
    private By careersMenu = By.id("uco-header-menu-0-5");
    private By visitCareers = By.xpath("//span[contains(text(),'Visit our careers site to start your job search')]");
    private By newsMenu = By.id("uco-header-menu-0-1");
    private By viewLatestNews = By.xpath("//span[normalize-space()='View Latest news stories']");
    private By signUpForEmail = By.xpath("//span[normalize-space()='Sign up for email alerts']");

    // Page Actions
    public void acceptCookiesIfPresent() {
        try {
            if (driver.findElement(acceptCookiesBtn).isDisplayed())
                driver.findElement(acceptCookiesBtn).click();
        } catch (Exception ignored) {}
    }

    public void clickOurCompany() { driver.findElement(ourCompanyMenu).click(); }
    public void clickViewOurCompany() { driver.findElement(viewOurCompany).click(); }
    public void clickContactUs() { driver.findElement(contactUs).click(); }
    public void clickSuppliers() { driver.findElement(suppliersMenu).click(); }
    public void clickViewSuppliers() { driver.findElement(viewSuppliers).click(); }
    public void clickSustainability() { driver.findElement(sustainabilityMenu).click(); }
    public void clickBrands() { driver.findElement(brandsMenu).click(); }
    public void clickViewBrands() { driver.findElement(viewBrands).click(); }
    public void clickExploreBrands() { driver.findElement(exploreBrands).click(); }
    public void enterBrandSearch(String brand) { driver.findElement(searchBrandsInput).sendKeys(brand); }
    public void clickSearchBtn() { driver.findElement(searchBtn).click(); }
    public void clickInvestors() { driver.findElement(investorsMenu).click(); }
    public void clickCareers() { driver.findElement(careersMenu).click(); }
    public void clickVisitCareers() { driver.findElement(visitCareers).click(); }
    public void clickNews() { driver.findElement(newsMenu).click(); }
    public void clickViewLatestNews() { driver.findElement(viewLatestNews).click(); }
    public void clickSignUpForEmail() { driver.findElement(signUpForEmail).click(); }
}