package com.winter.app.test.countries;

import com.winter.app.contries.CountryDAO;
import com.winter.app.contries.CountryDTO;

public class CountryTest {

	public static void main(String[] args) {
		CountryDAO cd = new CountryDAO();
		CountryDTO dto = new CountryDTO();
		
		try {
			dto.setCountryId("KR");
			dto.setCountryName("Korea");
			dto.setRegionId(30);
			cd.create(dto);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
