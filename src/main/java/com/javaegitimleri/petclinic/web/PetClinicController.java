package com.javaegitimleri.petclinic.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.javaegitimleri.petclinic.service.PetClinicService;

@Controller
public class PetClinicController {
	@Autowired
	private PetClinicService petClinicService;
	
	@RequestMapping ("/owners")
	public ModelAndView getOwners() {
		
		ModelAndView mAv= new ModelAndView();
		mAv.addObject("owners", petClinicService.findOwners());
		mAv.setViewName("owners");
		return mAv;
	}
	@RequestMapping("/pcs")
	@ResponseBody
	public String welcome() {
		return "Welcome to PetClinic World!";
	}
	
	
	

}
