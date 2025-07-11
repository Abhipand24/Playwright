package framework.projectplaywright.Playwright;

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
            //Seeker Login
			page.locator("//*[@id=\"navbarsExample09\"]/a").click();
			page.waitForTimeout(3000);
			page.locator("//*[@id=\"root\"]/div[1]/section[2]/div[1]/div/div/div[1]/form/div[2]/div[1]/div[1]/div/input").fill("qa.alobha@gmail.com");
			page.waitForTimeout(3000);
			page.locator("//*[@id=\"root\"]/div[1]/section[2]/div[1]/div/div/div[1]/form/div[2]/div[2]/div/div/button").click();
			page.waitForTimeout(3000);
			page.locator("//*[@id=\"input_pass\"]").fill("123456");
			page.waitForTimeout(3000);
			page.locator("//*[@id=\"root\"]/div[1]/section[2]/div[1]/div/div/div[1]/form/div[2]/div[3]/div/div/button").click();
	}

}
