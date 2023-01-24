package comselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://www.primevideo.com/");
		String title = chromeDriver.getTitle();
		System.out.println("sdjfhsakdjfhsajjhaskfjhsalkjdfhlkasjdhfklsaj@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println(title);
//		String pageSource = chromeDriver.getPageSource();
//		System.out.println("sdjfhsakdjfhsajjhaskfjhsalkjdfhlkasjdhfklsaj@@@@@@@@@@@@@@@@@@@@@@@@");
//
//		System.out.println(pageSource);
		
	}

}
