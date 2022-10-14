package Enoca.com.Controller;

import Enoca.com.entity.Company;
import Enoca.com.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/c")
public class CompanyController {

    @Autowired
    private ICompanyService companyService;


    @GetMapping("/all")
    public List<Company> getAll(){
        return companyService.getAllCompany();
    }

    @PostMapping("/{id}")
    public String deleteCompanyById(@PathVariable Long id){
        return companyService.destroy(id);
    }
    @PostMapping("/update")
    public ResponseEntity<String>updateCompany(@RequestBody Company c){
         companyService.update(c);
         return ResponseEntity.ok("Guncellendi");
    }
    @GetMapping("/{id}")
    public Company getCompanyById(@PathVariable Long id){
        return companyService.getCompanyById(id);
    }

    @PostMapping("/create")
    public ResponseEntity<String> createCompany(@RequestBody Company c){
        companyService.create(c);
        return ResponseEntity.ok("BAŞARIYLA OLUSTURULDU");
    }

}
