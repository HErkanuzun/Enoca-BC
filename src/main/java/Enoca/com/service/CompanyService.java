package Enoca.com.service;

import Enoca.com.dao.CompanyDao;
import Enoca.com.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService implements ICompanyService{

    @Autowired
    private CompanyDao companyDao;

    @Override
    public void create(Company c) {
        companyDao.create(c);
    }

    @Override
    public void update(Company c) {
        companyDao.update(c);
    }

    @Override
    public Company getCompanyById(Long id) {
        return companyDao.getCompanyById(id);
    }

    @Override
    public String destroy(Long id) {
        companyDao.destroy(id);
        return "Silindi";
    }

    @Override
    public List<Company> getAllCompany() {
        return companyDao.getAllCompany();
    }
}
