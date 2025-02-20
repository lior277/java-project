package org.example.searchResults;

import org.example.internals.utils.WebDriverExtension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage implements ISearchResultsPage {
    private WebDriver driver;

    // Locators
    private By commITJobExp = By
            .xpath("//div[contains(@class,'job-item preferred')][contains(.,'Comm-IT')]");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public String getJobData() {
        return WebDriverExtension
                .searchElement(driver, commITJobExp, null)
                .getText();
    }
}
