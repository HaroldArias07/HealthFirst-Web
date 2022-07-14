package com.essentials.demo.controllers;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.essentials.demo.models.entity.Blogs;
import com.essentials.demo.models.entity.Carrusels;
import com.essentials.demo.models.entity.Contactos;
import com.essentials.demo.models.entity.Productos;
import com.essentials.demo.models.entity.Testimonios;
import com.essentials.demo.models.entity.Tiendas;
import com.essentials.demo.models.entity.Usuarios;
import com.essentials.demo.models.service.IBlogService;
import com.essentials.demo.models.service.ICarruselService;
import com.essentials.demo.models.service.IContactoService;
import com.essentials.demo.models.service.IProductoService;
import com.essentials.demo.models.service.ITestimonioService;
import com.essentials.demo.models.service.ITiendaService;
import com.essentials.demo.models.service.IUsuarioService;

@Controller
@RequestMapping("/private")
public class PrivateController {

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
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@Autowired
	private IContactoService contactoService;
	
	@GetMapping("/index")
	public String index(Authentication auth, HttpSession session, Model model, Model model2, Model model3, Model model4) {
		String username = auth.getName();
		
		if(session.getAttribute("usuarios") == null) {
			Usuarios usuarios = usuarioService.findByUsername(username);
			usuarios.setPassword(null);
			session.setAttribute("usuarios", usuarios);
		}
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
	public String stores(Authentication auth, HttpSession session, Model model) {
		String username = auth.getName();
		
		if(session.getAttribute("usuarios") == null) {
			Usuarios usuarios = usuarioService.findByUsername(username);
			usuarios.setPassword(null);
			session.setAttribute("usuarios", usuarios);
		}
		List<Tiendas>tiendas = tiendaService.listar();
		model.addAttribute("tiendas", tiendas);
		return "stores";
	}
	
	@GetMapping("/shop")
	public String shop(Authentication auth, HttpSession session, Model model) {
		String username = auth.getName();
		
		if(session.getAttribute("usuarios") == null) {
			Usuarios usuarios = usuarioService.findByUsername(username);
			usuarios.setPassword(null);
			session.setAttribute("usuarios", usuarios);
		}
		List<Productos>productos = productoService.listar();
		model.addAttribute("productos", productos);
		return "shop";
	}
	
	@GetMapping("/shop2")
	public String shop2(Authentication auth, HttpSession session, Model model) {
		String username = auth.getName();
		
		if(session.getAttribute("usuarios") == null) {
			Usuarios usuarios = usuarioService.findByUsername(username);
			usuarios.setPassword(null);
			session.setAttribute("usuarios", usuarios);
		}
		List<Productos>productos = productoService.listar();
		model.addAttribute("productos", productos);
		return "shop2";
	}
	
	@GetMapping("/aboutus")
	public String aboutus(Authentication auth, HttpSession session) {
		String username = auth.getName();
		
		if(session.getAttribute("usuarios") == null) {
			Usuarios usuarios = usuarioService.findByUsername(username);
			usuarios.setPassword(null);
			session.setAttribute("usuarios", usuarios);
		}
		return "aboutus";
	}
	
	@GetMapping("/blog")
	public String blog(Authentication auth, HttpSession session, Model model) {
		String username = auth.getName();
		
		if(session.getAttribute("usuarios") == null) {
			Usuarios usuarios = usuarioService.findByUsername(username);
			usuarios.setPassword(null);
			session.setAttribute("usuarios", usuarios);
		}
		List<Blogs>blogs = blogService.listar();
		model.addAttribute("blogs", blogs);
		return "blog";
	}
	
	@GetMapping("/contact")
	public String contact(Authentication auth, HttpSession session, Model model, Model model2) {
		String username = auth.getName();
		
		if(session.getAttribute("usuarios") == null) {
			Usuarios usuarios = usuarioService.findByUsername(username);
			usuarios.setPassword(null);
			session.setAttribute("usuarios", usuarios);
		}
		List<Contactos>contactos = contactoService.listar();
		model.addAttribute("contactos", contactos);
		model2.addAttribute("contact", new Contactos());
		return "contact";
	}
	
	@PostMapping("/save/contact")
	public String saveContactos(@Validated Contactos con, Model model2) {
		contactoService.save(con);
		return "redirect:/private/enviado";
	}
	
	@GetMapping("/enviado")
	public String enviado(Authentication auth, HttpSession session) {
		String username = auth.getName();
		
		if(session.getAttribute("usuarios") == null) {
			Usuarios usuarios = usuarioService.findByUsername(username);
			usuarios.setPassword(null);
			session.setAttribute("usuarios", usuarios);
		}
		return "enviado";
	}
	
	@GetMapping("/cuatrocerocuatro")
	public String cuatrocerocuatro(Authentication auth, HttpSession session) {
		String username = auth.getName();
		
		if(session.getAttribute("usuarios") == null) {
			Usuarios usuarios = usuarioService.findByUsername(username);
			usuarios.setPassword(null);
			session.setAttribute("usuarios", usuarios);
		}
		return "404";
	}
	
	@GetMapping("/singlepost")
	public String singlepost(Authentication auth, HttpSession session) {
		String username = auth.getName();
		
		if(session.getAttribute("usuarios") == null) {
			Usuarios usuarios = usuarioService.findByUsername(username);
			usuarios.setPassword(null);
			session.setAttribute("usuarios", usuarios);
		}
		return "single-post";
	}
	
	@GetMapping("/singleproduct/{id_producto}")
	public String buysingleproduct(@PathVariable int id_producto, Model model) {
		Optional<Productos>productos=productoService.listarId(id_producto);
		model.addAttribute("producto", productos.get());
		return "single-product";
	}
	
	@GetMapping("/profile")
	public String profile(Authentication auth, HttpSession session) {
		String username = auth.getName();
		
		if(session.getAttribute("usuarios") == null) {
			Usuarios usuarios = usuarioService.findByUsername(username);
			usuarios.setPassword(null);
			session.setAttribute("usuarios", usuarios);
		}
		return "profile";
	}
	
	@GetMapping("/editprofile/{id}")
	public String editProfile(@PathVariable Long id, Authentication auth, HttpSession session, Model model2) {
		String username = auth.getName();
		
		if(session.getAttribute("usuarios") == null) {
			Usuarios usuarios = usuarioService.findByUsername(username);
			usuarios.setPassword(null);
			session.setAttribute("usuarios", usuarios);
		}
		
		Optional<Usuarios>usuarios=usuarioService.listarId(id);
		model2.addAttribute("usuarios", usuarios);
		return "editprofile";
	}
	
	@PostMapping("/editprofile")
	public String saveProfile(@Validated Usuarios u, Model model2) {
		model2.addAttribute("usuarios", usuarioService.registrar(u));
		return "editado";
	}
	
	@GetMapping("/eliminar/profile/{id}")
	public String delete(Model model, @PathVariable Long id) {
		usuarioService.delete(id);
		return "redirect:/eliminar";
	}
	
	@GetMapping("/eliminar")
	public String eliminar(Authentication auth, HttpSession session) {
		String username = auth.getName();
		
		if(session.getAttribute("usuarios") == null) {
			Usuarios usuarios = usuarioService.findByUsername(username);
			usuarios.setPassword(null);
			session.setAttribute("usuarios", usuarios);
		}
		return "eliminar";
	}
	
}
