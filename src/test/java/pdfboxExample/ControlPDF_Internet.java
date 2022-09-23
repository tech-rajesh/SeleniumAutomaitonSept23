package pdfboxExample;

import java.io.FileInputStream;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ControlPDF_Internet {
	
	
	@Test
	public void ReadPDFFile() throws Exception {
		
		
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		
//		
//		driver.get("https://file-examples.com/index.php/sample-documents-download/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		
//		
//		driver.findElement(By.xpath("//td[text()='PDF']//following-sibling::td/a")).click();
//		
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//td[text()='150 kB']//following-sibling::td/a")).click();
//		
//		
//		
//		String urlString = driver.getCurrentUrl();
//		
//		System.out.println(urlString);
//
//		
//		URL url = new URL(urlString);
		
		
		URL url = new URL("https://file-examples.com/storage/fe783a5cbb6323602a28c66/2017/10/file-sample_150kB.pdf");
		//url.openStream()
		
		
		//PDF file - local or internet
		
		
		//File file = new File("C:\\Users\\Act\\OneDrive\\Desktop\\Playwright_Course_Overview.pdf");
		
		//FileInputStream fis = new FileInputStream("C:\\Users\\Act\\OneDrive\\Desktop\\Playwright_Course_Overview.pdf");
		//FileInputStream fis = new FileInputStream("D:\\Training\\Course\\APITesting_POSTMAN_Training_CourseOutline_3Days.pdf");
		
		
		PDDocument pdfDocumnet = PDDocument.load(url.openStream());
		
		
		int pdfPageCount = pdfDocumnet.getPages().getCount();
		System.out.println("No of pages in PDF file: " + pdfPageCount);
		
		
		PDFTextStripper pdfText = new PDFTextStripper();
		
		
		String docText = pdfText.getText(pdfDocumnet);
		
		System.out.println(docText);
		
		//validation test
		
		Assert.assertTrue(docText.contains("in fringilla dui commodo"));
		
		
		pdfDocumnet.close();
		//fis.close();
		
	}
	
	

}
