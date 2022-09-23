package retryLogic;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer{

	
	int count= 0;
	int rCount=2;
	
	
	public boolean retry(ITestResult result) {
		
	
		if(count < rCount) {
						
			count++;
			return true;
		
		}
		
		
		
		
		return false;
	}

	
	
	
	
	
	
	
	
	


}
