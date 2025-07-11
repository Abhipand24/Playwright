package framework.projectplaywright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class Karlatoon_Landing_Navigate {


	public static void main(String[] args) throws InterruptedException {
		//Server start
		Playwright playwright =	Playwright.create();
	     Browser browser= 	playwright.chromium().launch(new LaunchOptions().setHeadless(false));
	     BrowserContext context_1 = browser.newContext();
	     Page page = context_1.newPage();
	     page.setDefaultTimeout(60000);
			page.navigate("https://uat.alobhaitsolution.com/");
			page.waitForTimeout(5000);
			 // Scroll to bottom of the page
            page.evaluate("window.scrollTo(0, document.body.scrollHeight)");
            System.out.println("Scrolled to bottom.");
            page.waitForTimeout(5000); // Optional wait

            // Scroll to top of the page
            page.evaluate("window.scrollTo(0, 0)");
            System.out.println("Scrolled back to top.");
            page.waitForTimeout(5000); // Optional wait
			//page.locator("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[5]/div/a").click();
	}

}
