package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Entity.ShoeEntity;
import com.example.demo.Service.ShoeService;
import jakarta.servlet.http.HttpSession;

@Controller
public class ShoesController {
	@Autowired
	private ShoeService shoeService;

	@GetMapping("/")
	public String homepage() {
		return "home";
	}
	
	
	@GetMapping("/showlist")
	public String indexform(org.springframework.ui.Model model) {

		List<ShoeEntity> shoeEntity = shoeService.getallShoes();
		model.addAttribute("shoeEntityList", shoeEntity);
		return "index";
	}

	@GetMapping("/addshoes")
	public String addshoesForm() {
		return "addshoes";
	}

	@PostMapping("/register")
	public String shoeRegister(@ModelAttribute ShoeEntity shoeEntity, HttpSession session) {
		System.out.println(shoeEntity);
		shoeService.addShoe(shoeEntity);
		session.setAttribute("msg", "Shoes Added Successfully..!");
		return "redirect:/showlist";
	}

	@GetMapping("/EditShoeDetail/{srno}")
	public String ShoeDetailEdit(@PathVariable int srno, Model model) {
		ShoeEntity shoeEntity = shoeService.getShoeDetailByID(srno);
		model.addAttribute("shoeEntityDetail", shoeEntity);
		return "EditShoeDetail";
	}

	@PostMapping("/update")
	public String updateShoe(@ModelAttribute ShoeEntity shoeEntity, HttpSession session) {
		shoeService.addShoe(shoeEntity);
		session.setAttribute("msg", "Updated Successfully");
		return "redirect:/showlist";
	}
	
	@GetMapping("/DeleteShoeDetail/{srno}")
	public String DeleteShoeDetail(@PathVariable int srno) {
		shoeService.deleteShoeByID(srno);
		return "redirect:/showlist";
	}
}
