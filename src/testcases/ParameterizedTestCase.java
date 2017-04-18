package testcases;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class ParameterizedTestCase {
	
public String username;
public String password;
public int pincode;

public ParameterizedTestCase (String username, String password, int pincode){
	this.username=username;
	this.password=password;
	this.pincode=pincode;
}

 @Parameters

public static Collection<Object[]> getdata(){
	
	Object[][] data = new Object[2][3];
	
	data[0][0]="username1";
	data[0][1]="pass1";
	data[0][2]=123456;
	data[1][0]="username2";
	data[1][1]="pass2";
	data[1][2]=789123;
	
	return Arrays.asList(data);
}

@Test

public void testRegister(){
	System.out.println("test registration"+"--"+username+"--"+password+"--"+pincode);
}



}
