package framework.projectplaywright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TestCase1 {
	public static void main(String[] args) {
		
		//Server start
	Playwright playwright =	Playwright.create();
     Browser browser= 	playwright.chromium().launch(new LaunchOptions().setHeadless(false));
     BrowserContext context_1 = browser.newContext();
     Page page = context_1.newPage();
     page.setDefaultTimeout(60000);
		page.navigate("https://www.myntra.com/");
		page.locator("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[5]/div/a").click();
		
		//playwright.close();
	}

}
