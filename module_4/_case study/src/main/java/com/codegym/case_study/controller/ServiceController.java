package com.codegym.case_study.controller;

import com.codegym.case_study.dto.ServiceDto;
import com.codegym.case_study.model.entity.service_entity.RentType;
import com.codegym.case_study.model.entity.service_entity.Service;
import com.codegym.case_study.model.entity.service_entity.ServiceType;
import com.codegym.case_study.model.service.IService;
import com.codegym.case_study.model.service.RentTypeService;
import com.codegym.case_study.model.service.ServiceTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/service")
public class ServiceController {
    @Autowired
    private IService iService;

    @Autowired
    private RentTypeService rentTypeService;

    @Autowired
    private ServiceTypeService serviceTypeService;

    @GetMapping("")
    public String showServicePage() {
        return "service/view";
    }

    @GetMapping("/create")
    public String showCreateService(Model model) {
        List<RentType> rentTypes = rentTypeService.findAll();
        model.addAttribute("rentTypeList", rentTypes);

        List<ServiceType> serviceTypes = serviceTypeService.findAll();
        model.addAttribute("serviceTypeList", serviceTypes);

        model.addAttribute("serviceDto", new ServiceDto());
        return "service/create";
    }

    @PostMapping("/create")
    public String createService(@ModelAttribute("serviceDto") @Valid ServiceDto serviceDto, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasErrors()){
            List<RentType> rentTypes = rentTypeService.findAll();
            model.addAttribute("rentTypeList", rentTypes);

            List<ServiceType> serviceTypes = serviceTypeService.findAll();
            model.addAttribute("serviceTypeList", serviceTypes);
            return "service/create";
        } else {
            Service service = new Service();
            BeanUtils.copyProperties(serviceDto, service);
            iService.save(service);
            redirectAttributes.addFlashAttribute("successMsg", "Create service: " + service.getNameService() + " success");
            return "redirect:/service/";
        }
    }


}
