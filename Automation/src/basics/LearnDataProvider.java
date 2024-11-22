package basics;

import org.testng.annotations.DataProvider;

public class LearnDataProvider {
	@DataProvider
	public Object [][] getData(){
		Object[][] data= {{"admin","manager"},{"virat","kohli"},{"sachin","tendulkar"},{"samir","sandilya"}};
		return data;
	}
}
