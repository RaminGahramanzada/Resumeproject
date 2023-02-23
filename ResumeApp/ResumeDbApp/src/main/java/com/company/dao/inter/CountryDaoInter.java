/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.dao.inter;

import com.company.entity.Country;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface CountryDaoInter {
      List<Country> getAll();
     
    public Country getById(int id);
     
    boolean updateCountry(Country u);
     
    boolean removeCountry(int id);
    
}
