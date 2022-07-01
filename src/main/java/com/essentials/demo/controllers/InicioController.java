package com.essentials.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.essentials.demo.models.entity.Carrusels;
import com.essentials.demo.models.entity.Productos;
import com.essentials.demo.models.entity.Testimonios;
import com.essentials.demo.models.entity.Tiendas;
import com.essentials.demo.models.service.ICarruselService;
import com.essentials.demo.models.service.IProductoService;
import com.essentials.demo.models.service.ITestimonioService;
import com.essentials.demo.models.service.ITiendaService;

@Controller
public class InicioController {

	@Autowired
	private ITiendaService tiendaService;
	
	@Autowired
	private ICarruselService carruselService;
	
	@Autowired
	private IProductoService productoService;
	
	@Autowired
	private ITestimonioService testimonioService;
	
	@GetMapping("/")
	public String inicio(Model model, Model model2, Model model3, Model model4) {
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
		
}
