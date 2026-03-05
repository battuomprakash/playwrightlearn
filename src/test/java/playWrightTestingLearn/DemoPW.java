package playWrightTestingLearn;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class DemoPW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create Playwright instance
        Playwright playwright = Playwright.create();

        // Launch browser
        Browser browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions().setHeadless(false));

        // Create new page
        Page page = browser.newPage();

        // Navigate to website
        page.navigate("https://www.google.com");

        // Print page title
        System.out.println("Page Title is: " + page.title());
		 browser.close();

        // Close browser
     //   browser.close();
     //   playwright.close();
	}

}
