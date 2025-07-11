package framework.projectplaywright;

import java.util.regex.Pattern;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;

public class Playwright_codegen {

	public static void main(String[] args) throws InterruptedException {
		 try (Playwright playwright = Playwright.create()) {
		      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
		        .setHeadless(false));
		      BrowserContext context = browser.newContext();
		      Page page = context.newPage();
		      page.navigate("https://www.flipkart.com/");
		      page.getByLabel("Mobiles").click();
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Become a Seller")).first().click();
		      page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Create Account$"))).getByRole(AriaRole.LINK).click();
		      
		    }
	}

}
