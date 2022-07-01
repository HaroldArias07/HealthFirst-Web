package com.essentials.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.essentials.demo.models.entity.Blogs;
import com.essentials.demo.models.entity.Carrusels;
import com.essentials.demo.models.entity.Productos;
import com.essentials.demo.models.entity.Testimonios;
import com.essentials.demo.models.entity.Tiendas;
import com.essentials.demo.models.service.IBlogService;
import com.essentials.demo.models.service.ICarruselService;
import com.essentials.demo.models.service.IProductoService;
import com.essentials.demo.models.service.ITestimonioService;
import com.essentials.demo.models.service.ITiendaService;

@Controller
@RequestMapping("/public")
public class PublicController {
	
	@Autowired
	private ITiendaService tiendaService;
	
	@Autowired
	private ICarruselService carruselService;
	
	@Autowired
	private IBlogService blogService;
	
	@Autowired
	private IProductoService productoService;
	
	@Autowired
	private ITestimonioService testimonioService;
	
	@GetMapping("/index")
	public String index(Model model, Model model2, Model model3, Model model4) {
		List<Carrusels>carrusels = carruselService.listar();
		model.addAttribute("carrusels", carrusels);
		
		List<Tiendas>tiendas = tiendaService.listar();
		model2.addAttribute("tiendas", tiendas);
		
		List<Productos>productos = productoService.listar();
		model3.addAttribute("productos", productos);
		
		List<Testimonios>testimonios = testimonioService.listar();
		model4.addAttribute("testimonios", testimonios);
		return "index";
	}
	
	@GetMapping("/stores")
	public String stores(Model model) {
		List<Tiendas>tiendas = tiendaService.listar();
		model.addAttribute("tiendas", tiendas);
		return "stores";
	}
	
	@GetMapping("/shop")
	public String shop(Model model) {
		List<Productos>productos = productoService.listar();
		model.addAttribute("productos", productos);
		return "shop";
	}
	
	@GetMapping("/shop2")
	public String shop2(Model model) {
		List<Productos>productos = productoService.listar();
		model.addAttribute("productos", productos);
		return "shop2";
	}
	
	@GetMapping("/blog")
	public String blog(Model model) {
		List<Blogs>blogs = blogService.listar();
		model.addAttribute("blogs", blogs);
		return "blog";
	}
	
	@GetMapping("/aboutus")
	public String aboutus() {
		return "aboutus";
	}
	
	@GetMapping("/singlepost")
	public String singlepost() {
		return "single-post";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	
	@GetMapping("/cuatrocerocuatro")
	public String cuatrocerocuatro() {
		return "404";
	}
}
