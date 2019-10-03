package Uk.Co.Covercheck.Vwfsinsuranceportal;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    LoadProp loadProp = new LoadProp();
    //web elements(locators) for home page
    private By _inputRegistrationNumber = By.id("vehicleReg");
    private By _clickOnFindByButton = By.xpath("//span[contains(text(),'Find vehicle')]");
    private By _resultRegText = By.xpath("//div[@id='page-container']/div[4]/div[1]");
    private By _resultMessage = By.className("result");
    private By _emptyFieldErrorMessage = By.className("error-required");

    //Entering a registration number for to find vehicle
    public void inputRegistrationNumber(String registerNumber) {
        sendKeyMethod(_inputRegistrationNumber, registerNumber);
    }

    public void clickOnFindByButton() {
        clickOnElementMethod(_clickOnFindByButton);
    }

    //getting vehicle result text
    public String getResultRegText() {
        return getText(_resultRegText);
    }

    //getting actual message text  for invalid registration number
    public String getResultMessageForInvalidRegNumber() {
        return getText(_resultMessage);
    }

    //getting error message text for empty field
    public String getEmpltyFieldErrorMessageText() {
        return getText(_emptyFieldErrorMessage);
    }
}
