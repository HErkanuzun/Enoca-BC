package Enoca.com.dao;

import Enoca.com.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CompanyDao implements ICompanyDao{
    @Autowired
    private ICompanyRepository companyRepository;

    public CompanyDao(ICompanyRepository companyRepository){
        this.companyRepository = companyRepository;
    }
    public CompanyDao(){

    }

    @Override
    public void create(Company c) {

        companyRepository.save(c);
    }

    @Override
    public void update(Company c) {
        companyRepository.save(c);
    }

    @Override
    public Company getCompanyById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }

    @Override
    public String destroy(Long id) {

        companyRepository.deleteById(id);
        return "silindi";
    }

    @Override
    public List<Company> getAllCompany() {

       return companyRepository.findAll();

    }
}
