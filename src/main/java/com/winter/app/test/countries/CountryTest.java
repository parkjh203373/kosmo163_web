package com.winter.app.test.countries;

import com.winter.app.contries.CountryDAO;

public class CountryTest {

	public static void main(String[] args) {
		CountryDAO cd = new CountryDAO();
		try {
			cd.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			cd.detail("AR");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
