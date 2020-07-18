package org.adactin;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.Date;


import org.objectrepository.SearchPage;
import org.objectrepository.confirmationPage;
import org.objectrepository.loginPage;
import org.objectrepository.paymentPage;
import org.objectrepository.selectionPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdactinHotel extends BaseClass {
	@BeforeClass
		public static void browserlaunch() {
			chromelaunch(); 
			enterUrl("http://adactinhotelapp.com/");
		}
	@Test	
		public void tsc1() throws IOException {
		
		writingDataToExcel(0, 0, "Username");
		writingDataToExcel(0, 1, "password");
		loginPage l = new loginPage();
		a=l.getTxtuser();
		readingDataFromExcel(1, 0);
		keysToSend(value);
		assertTrue(value.equals("raguvarmaa"));
		a=l.getPass();
		readingDataFromExcel(1, 1);
		keysToSend(value);
		a=l.getLoginbutton();
		clickBtn();
		System.out.println("login page");

		}
		@Test
		public void tsc2() {
			// TODO Auto-generated method stub
			SearchPage s = new SearchPage();
			a=s.getLoction();
			selectByValue("Los Angeles");
			a=s.getHotel();
			selectByValue("Hotel Sunshine");
			a=s.getRoomtype();
			selectByValue("Deluxe");
			a=s.getRoomno();
			selectByValue("2");
			a=s.getDatepickin();
			keysToSend("21/06/2020");
			a=s.getDatepickout();
			keysToSend("25/06/2020");
			a=s.getAdult();
			selectByValue("3");
			a=s.getChild();
			selectByValue("0");
			a=s.getSubmit();
			String c=driver.getCurrentUrl();
			System.out.println(c);
			assertEquals(c.contains("adactin"), c.contains("SearchHotel"));
			clickBtn();
			System.out.println("search page");
		}
		@Test
		public void tsc3() {
			// TODO Auto-generated method stub
			selectionPage sel = new selectionPage();
			a=sel.getRadiobutton();
			clickBtn();
			assertTrue(a.isSelected());
			a=sel.getCon();
			clickBtn();
			System.out.println("selection Page");

		}
		@Test
		public void tsc4() {
			// TODO Auto-generated method stub
			paymentPage p = new paymentPage();
			a=p.getFirstname();
			keysToSend("Ragu");
			a=p.getLastname();
			keysToSend("varma");
			a=p.getAddress();
			keysToSend("west street");
			a=p.getCcnum();
			keysToSend("1234567891012141");
			a=p.getCctype();
			selectByValue("VISA");
			a=p.getMonth();
			selectByValue("3");
			a=p.getYear();
			selectByValue("2012");
			a=p.getCvv();
			keysToSend("333");
			a=p.getBook();
			clickBtn();
			System.out.println("payment Page");
		}
		@Test
		public void tsc5() throws IOException, InterruptedException {
			// TODO Auto-generated method stub
			Thread.sleep(5000);
			confirmationPage f = new confirmationPage();
			a=f.getOrderno();
		
			String c= a.getAttribute("value");
			assertFalse(c.isEmpty());
			writingDataToExcel(0, 2, "order no");
			writingDataToExcel(1, 2, c);
			System.out.println(c);
			System.out.println("confirmationPage");
		
		}
		@BeforeMethod
		public void startTime() {
			// TODO Auto-generated method stub
			Date d = new Date();
		
			System.out.println(d);
					
		}
		@AfterMethod
		public void endTime() {
			// TODO Auto-generated method stub
			Date d = new Date();
		
			System.out.println(d);
					
		}
	}


