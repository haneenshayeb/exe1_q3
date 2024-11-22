package exe1_q3.exe1_q3;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {
		Question3 tester = new Question3();
    @Test
    public void Test_1() {
    	String Expected_result="B";
    	int a=5,b=9;
    	String mod="regular";
    	String actucal_result=tester.compare(a, b, mod);
    	assertEquals(Expected_result,actucal_result);
    }
    @Test
    public void Test_2() {
    	String Expected_result="A";
    	int a=2,b=-7;
    	String mod="regular";
    	String actucal_result=tester.compare(a, b, mod);
    	assertEquals(Expected_result,actucal_result);
    }
    
    @Test
    public void Test_3() {
    	String Expected_result="B";
    	int a=14,b=-7;
    	String mod="negative";
    	String actucal_result=tester.compare(a, b, mod);
    	assertEquals(Expected_result,actucal_result);
    }
    @Test
    public void Test_4() {
    	String Expected_result="A";
    	int a=-53,b=-47;
    	String mod="negative";
    	String actucal_result=tester.compare(a, b, mod);
    	assertEquals(Expected_result,actucal_result);
    }
    @Test
    public void Test_5() {
    	String Expected_result="B";
    	double a=1.0/3.0,b=1.0/9.0;
    	String mod="reciprocals";
    	String actucal_result=tester.compare(a, b, mod);
    	assertEquals(Expected_result,actucal_result);
    }
    @Test
    public void Test_6() {
        String Expected_result = "B";
        double a = 1.0 / 2.0, b = 1.0 / 5.0;
        String mod = "reciprocals";
        String actual_result = tester.compare(a, b, mod);
        assertEquals(Expected_result, actual_result);
    }
    @Test
    public void Test_7() {
        String Expected_result ="ERROR";
        double a = 1.0 / 2.0, b = 0.0 / 0.0;
        String mod = "reciprocals";
        String actual_result = tester.compare(a, b, mod);
        assertEquals("ERROR", Expected_result, actual_result);
        
    }
 
    
    
    
    
    
    
    
    
    

    
   
}
