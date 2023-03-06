package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.modal.Bank;
import com.project.repository.BankRepository;

@Controller
public class BankController {
	@Autowired(required=true)
	private BankRepository resp;
	@RequestMapping("Home")
	public String user() {
		return "Home.jsp";
	}
	@RequestMapping("adduser")
	public String adduser(Bank bank) {
		resp.save(bank);
		return "Home.jsp";
	}
	@RequestMapping("getuser")
	public ModelAndView getuser(@RequestParam int accno) {
		ModelAndView mav=new ModelAndView("showuser.jsp");
		Bank bank=resp.findById(accno).orElse(new Bank());
	    mav.addObject(bank);
	    return mav;
	}
	@RequestMapping("deleteuser")
	public ModelAndView deleteuser(@RequestParam int accno) {
		ModelAndView mav=new ModelAndView("deleteuser.jsp");
		Bank bank=resp.findById(accno).orElse(new Bank());
	    resp.deleteById(accno);
	    mav.addObject(bank);
	    return mav;
	}
	@RequestMapping("updateuser")
	public ModelAndView deleteuser(Bank bank) {
		ModelAndView mav=new ModelAndView("updateuser.jsp");
		bank=resp.findById(bank.getAccno()).orElse(new Bank());
	    resp.deleteById(bank.getAccno());
	    mav.addObject(bank);
	    return mav;
	}
}
