package com.codegym.case_study.controller;

import com.codegym.case_study.dto.EmployeeDto;
import com.codegym.case_study.model.entity.employee.Division;
import com.codegym.case_study.model.entity.employee.EducationDegree;
import com.codegym.case_study.model.entity.employee.Employee;
import com.codegym.case_study.model.entity.employee.Position;
import com.codegym.case_study.model.service.contract.ContractService;
import com.codegym.case_study.model.service.employee.DivisionService;
import com.codegym.case_study.model.service.employee.EducationDegreeService;
import com.codegym.case_study.model.service.employee.EmployeeService;
import com.codegym.case_study.model.service.employee.PositionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private PositionService positionService;
    @Autowired
    private EducationDegreeService educationDegreeService;
    @Autowired
    private DivisionService divisionService;
    @Autowired
    private ContractService contractService;

    @GetMapping("/list")
    public String showList(@PageableDefault(value = 2) Pageable pageable, Model model) {
        model.addAttribute("employeeList", employeeService.findAll(pageable));
        return "employee/list";
    }

    @GetMapping("/create")
    public String showCreateEmployee(Model model) {
        List<Position> positions = positionService.findAll();
        model.addAttribute("postitonList", positions);

        List<EducationDegree> educationDegrees = educationDegreeService.findAll();
        model.addAttribute("educationDegreeList", educationDegrees);

        List<Division> divisions = divisionService.findAll();
        model.addAttribute("divisionList", divisions);


        model.addAttribute("employeeDto", new EmployeeDto());
        return "employee/create";
    }
    @PostMapping("/create")
    public String createEmployee(@ModelAttribute("employeeDto") @Valid EmployeeDto employeeDto, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasErrors()) {
            List<Position> positions = positionService.findAll();
            model.addAttribute("postitonList", positions);

            List<EducationDegree> educationDegrees = educationDegreeService.findAll();
            model.addAttribute("educationDegreeList", educationDegrees);

            List<Division> divisions = divisionService.findAll();
            model.addAttribute("divisionList", divisions);

            return "employee/create";
        } else {
            Employee employee = new Employee();
            BeanUtils.copyProperties(employeeDto, employee);
            employeeService.save(employee);
            redirectAttributes.addFlashAttribute("successMsg", "Create Employee: " + employee.getNameEmployee() + "success");
            return "redirect:/employee/list";
        }
    }

    @GetMapping("/edit/{id}")
    public String showEditPage(@PathVariable Long id, Model model) {
        if (employeeService.findById(id) == null) {
            return "/error";
        }
         employeeService.findById(id);

        model.addAttribute("employee", employeeService.findById(id));


        model.addAttribute("postitonList", positionService.findAll());


        model.addAttribute("educationDegreeList", educationDegreeService.findAll());


        model.addAttribute("divisionList", divisionService.findAll());
        return "employee/edit";
    }

    @PostMapping("/edit")
    public String editEmployee(@ModelAttribute Employee employee, RedirectAttributes redirectAttributes) {
        employeeService.save(employee);
        redirectAttributes.addFlashAttribute("successMsg", "Update employee: " + employee.getNameEmployee() + " success");
        return "redirect:/employee/list";
    }

    @PostMapping("/search")
    public String searchEmployee(@PageableDefault(value = 2) Pageable pageable ,@RequestParam String search, Model model) {
        model.addAttribute("employeeList", employeeService.findEmployee(pageable,search));
        return "employee/list";
    }
}
