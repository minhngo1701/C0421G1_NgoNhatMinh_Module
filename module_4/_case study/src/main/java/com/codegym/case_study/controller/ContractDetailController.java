package com.codegym.case_study.controller;

import com.codegym.case_study.dto.ContractDetailDto;
import com.codegym.case_study.model.entity.contract.AttachService;
import com.codegym.case_study.model.entity.contract.Contract;
import com.codegym.case_study.model.entity.contract.ContractDetail;

import com.codegym.case_study.model.service.contract.ContractDetailService;
import com.codegym.case_study.model.service.contract.ContractService;
import com.codegym.case_study.model.service.contract.IAttachService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
@Controller
@RequestMapping("/contract-detail")
public class ContractDetailController {
    @Autowired
    private ContractService contractService;

    @Autowired
    private IAttachService iAttachService;


    @Autowired
    private ContractDetailService contractDetailService;

    @GetMapping("")
    public String showContractPage() {
        return "contract/view";
    }

    @GetMapping("/create")
    public String showCreateContract(Model model) {
        model.addAttribute("contractList", contractService.findAll());
        model.addAttribute("attachServiceList", iAttachService.findAll());
        model.addAttribute("contractDetailDto", new ContractDetailDto());
        return "contract/create-ct-detail";
    }
    @PostMapping("/create")
    public String createEmployee(@ModelAttribute("contractDetailDto") @Valid ContractDetailDto contractDetailDto, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasErrors()) {
            List<Contract> contracts = contractService.findAll();
            model.addAttribute("contractList", contracts);

            List<AttachService> attachServices = iAttachService.findAll();
            model.addAttribute("attachServiceList", attachServices);

            return "contract/create";
        } else {
            ContractDetail contractDetail = new ContractDetail();
            BeanUtils.copyProperties(contractDetailDto, contractDetail);
            contractDetailService.save(contractDetail);
            redirectAttributes.addFlashAttribute("successMsg", "Create contract detail success");
            return "redirect:/contract/";
        }
    }
}
