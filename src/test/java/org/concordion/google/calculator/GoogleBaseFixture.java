package org.concordion.google.calculator;

import org.concordion.api.AfterSpecification;
import org.concordion.api.BeforeSpecification;
import org.concordion.api.extension.Extension;
import org.concordion.api.extension.Extensions;
import org.concordion.ext.ParallelRunExtension;
import org.concordion.ext.ScreenshotExtension;
import org.concordion.google.web.Browser;
import org.concordion.google.web.GoogleResultsPage;
import org.concordion.google.web.GoogleSearchPage;
import org.concordion.integration.junit4.ConcordionRunner;
import org.concordion.selenium.SeleniumScreenshotTaker;
import org.junit.runner.RunWith;

/** 
 * A base class for Google search tests that opens up the Google site
 * at the Google search page, and closes the browser once the test is complete.
 */
@RunWith(ConcordionRunner.class)
@Extensions(ParallelRunExtension.class)
public abstract class GoogleBaseFixture {

	protected static ThreadLocal<Browser> browser = new ThreadLocal<Browser>() {
	    protected Browser initialValue() {
	        return new Browser();
	    }
	};
	
    @Extension
    public ScreenshotExtension extension = new ScreenshotExtension();
    
    protected GoogleResultsPage resultsPage;

    @BeforeSpecification
    void initialiseBrowser() { 
        extension.setScreenshotTaker(new SeleniumScreenshotTaker(browser.get().getDriver()));
    }

	@AfterSpecification
	void close() {
	    browser.get().close();
	    browser.remove();
	}

    /**
     * Searches for the specified topic, and waits for the results page to load.
     */
    public void searchFor(String topic) {
        resultsPage = new GoogleSearchPage(browser.get().getDriver()).searchFor(topic);
    }
}
