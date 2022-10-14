package Enoca.com.Controller;

import Enoca.com.entity.Employee;
import Enoca.com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/e")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/create")
    public String yapiyomhocam(@RequestBody Employee employee){
        employeeService.create(employee);
        return "basarili";
    }
    @PostMapping("/update")
    public ResponseEntity<String> guncelliyomhocam(@RequestBody Employee employee){
        employeeService.update(employee);
        return ResponseEntity.ok("guncelleme Basarili");
    }

    @PostMapping("/delete/{id}")
    public ResponseEntity<String> siliyorumhocam(@PathVariable Long id){
        employeeService.destroy(id);
        return ResponseEntity.ok("Sildim Hocam");
    }

    @GetMapping("/listall")
    public List<Employee> listeliyomhocam(){

        return employeeService.listAll();
    }

    @GetMapping("/getbyid/{id}")
    public ResponseEntity<String> bulacamhocam(@PathVariable Long id){
        employeeService.getEmployeeById(id);
        return ResponseEntity.ok("Buldum hocam");
    }



}
