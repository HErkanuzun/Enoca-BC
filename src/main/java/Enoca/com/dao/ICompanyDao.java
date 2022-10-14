package Enoca.com.dao;

import Enoca.com.entity.Company;

import java.util.List;

public interface ICompanyDao {
    void create(Company c);
    void update(Company c);

    Company getCompanyById(Long id);
    String destroy(Long id);
    List<Company>getAllCompany();

}
