package com.essentials.demo.controllers;

import java.util.List;

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
import com.essentials.demo.models.entity.Productos;
import com.essentials.demo.models.entity.Testimonios;
import com.essentials.demo.models.entity.Tiendas;
import com.essentials.demo.models.entity.Usuarios;
import com.essentials.demo.models.service.IBlogService;
import com.essentials.demo.models.service.ICarruselService;
import com.essentials.demo.models.service.IProductoService;
import com.essentials.demo.models.service.ITestimonioService;
import com.essentials.demo.models.service.ITiendaService;
import com.essentials.demo.models.service.IUsuarioService;

@Controller
@RequestMapping("/admin")
public class AdminController {

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
	
	@GetMapping("/admin")
	public String dashboard(Authentication auth, HttpSession session) {
		String username = auth.getName();
		
		if(session.getAttribute("usuarios") == null) {
			Usuarios usuarios = usuarioService.findByUsername(username);
			usuarios.setPassword(null);
			session.setAttribute("usuarios", usuarios);
		}
		return "admin/admin";
	}
	
	@GetMapping("/blogs")
	public String blogs(Authentication auth, HttpSession session, Model model, Model model2) {
		String username = auth.getName();
		
		if(session.getAttribute("usuarios") == null) {
			Usuarios usuarios = usuarioService.findByUsername(username);
			usuarios.setPassword(null);
			session.setAttribute("usuarios", usuarios);
		}
		List<Blogs>blogs = blogService.listar();
		model.addAttribute("blogs", blogs);
		model2.addAttribute("blog", new Blogs());
		return "admin/blogs";
	}
	
	@PostMapping("/save/blogs")
	public String saveBlogs(@Validated Blogs b, Model model2) {
		blogService.save(b);
		return "redirect:/admin/blogs";
	}
	
	/*
	@GetMapping("/editar/blogs/{id_blog}")
	public String editarBlogs(@PathVariable int id_blog, Model model2) {
		Optional<Blogs>blogs=blogService.listarId(id_blog);
		model2.addAttribute("blog", blogs);
		return "admin/editblogs";
	}
	*/
	
	@GetMapping("/eliminar/blogs/{id_blog}")
	public String deleteBlogs(Model model, @PathVariable int id_blog) {
		blogService.delete(id_blog);
		return "redirect:/admin/blogs";
	}
	
	@GetMapping("/carrusel")
	public String carrusel(Authentication auth, HttpSession session, Model model, Model model2) {
		String username = auth.getName();
		
		if(session.getAttribute("usuarios") == null) {
			Usuarios usuarios = usuarioService.findByUsername(username);
			usuarios.setPassword(null);
			session.setAttribute("usuarios", usuarios);
		}
		List<Carrusels>carrusels = carruselService.listar();
		model.addAttribute("carrusels", carrusels);
		model2.addAttribute("carrusel", new Carrusels());
		return "admin/carrusel";
	}
	
	@PostMapping("/save/carrusels")
	public String saveCarrusels(@Validated Carrusels c, Model model2) {
		carruselService.save(c);
		return "redirect:/admin/carrusel";
	}
	
	@GetMapping("/eliminar/carrusels/{id_carrusel}")
	public String deleteCarrusels(Model model, @PathVariable int id_carrusel) {
		carruselService.delete(id_carrusel);
		return "redirect:/admin/carrusel";
	}
	
	@GetMapping("/productos")
	public String productos(Authentication auth, HttpSession session, Model model, Model model2) {
		String username = auth.getName();
		
		if(session.getAttribute("usuarios") == null) {
			Usuarios usuarios = usuarioService.findByUsername(username);
			usuarios.setPassword(null);
			session.setAttribute("usuarios", usuarios);
		}
		List<Productos>productos = productoService.listar();
		model.addAttribute("productos", productos);
		model2.addAttribute("producto", new Productos());
		return "admin/productos";
	}
	
	@PostMapping("/save/productos")
	public String saveProductos(@Validated Productos p, Model model2) {
		productoService.save(p);
		return "redirect:/admin/productos";
	}
	
	@GetMapping("/eliminar/productos/{id_producto}")
	public String deleteProductos(Model model, @PathVariable int id_producto) {
		productoService.delete(id_producto);
		return "redirect:/admin/productos";
	}
	
	@GetMapping("/tiendas")
	public String tiendas(Authentication auth, HttpSession session, Model model, Model model2) {
		String username = auth.getName();
		
		if(session.getAttribute("usuarios") == null) {
			Usuarios usuarios = usuarioService.findByUsername(username);
			usuarios.setPassword(null);
			session.setAttribute("usuarios", usuarios);
		}
		List<Tiendas>tiendas = tiendaService.listar();
		model.addAttribute("tiendas", tiendas);
		model2.addAttribute("tienda", new Tiendas());
		return "admin/tiendas";
	}
	
	@PostMapping("/save/tiendas")
	public String saveTiendas(@Validated Tiendas t, Model model2) {
		tiendaService.save(t);
		return "redirect:/admin/tiendas";
	}
	
	@GetMapping("/eliminar/tiendas/{id_tienda}")
	public String deleteTiendas(Model model, @PathVariable int id_tienda) {
		tiendaService.delete(id_tienda);
		return "redirect:/admin/tiendas";
	}
	
	@GetMapping("/testimonios")
	public String testimonios(Authentication auth, HttpSession session, Model model, Model model2) {
		String username = auth.getName();
		
		if(session.getAttribute("usuarios") == null) {
			Usuarios usuarios = usuarioService.findByUsername(username);
			usuarios.setPassword(null);
			session.setAttribute("usuarios", usuarios);
		}
		List<Testimonios>testimonios = testimonioService.listar();
		model.addAttribute("testimonios", testimonios);
		model2.addAttribute("testimonio", new Testimonios());
		return "admin/testimonios";
	}
	
	@PostMapping("/save/testimonios")
	public String saveTestimonios(@Validated Testimonios ts, Model model2) {
		testimonioService.save(ts);
		return "redirect:/admin/testimonios";
	}
	
	@GetMapping("/eliminar/testimonios/{id_testimonio}")
	public String deleteTestimonios(Model model, @PathVariable int id_testimonio) {
		testimonioService.delete(id_testimonio);
		return "redirect:/admin/testimonios";
	}
	
	@GetMapping("/usuarios")
	public String usuarios(Authentication auth, HttpSession session, Model model, Model model2) {
		String username = auth.getName();
		
		if(session.getAttribute("usuarios") == null) {
			Usuarios usuarios = usuarioService.findByUsername(username);
			usuarios.setPassword(null);
			session.setAttribute("usuarios", usuarios);
		}
		List<Usuarios>usuarios = usuarioService.listar();
		model.addAttribute("usuarios", usuarios);
		model2.addAttribute("usuario", new Usuarios());
		return "admin/usuarios";
	}
	
	@PostMapping("/save/usuarios")
	public String saveUsuarios(@Validated Usuarios u, Model model2) {
		usuarioService.save(u);
		return "redirect:/admin/usuarios";
	}
	
	@GetMapping("/eliminar/usuarios/{id}")
	public String deleteUsuarios(Model model, @PathVariable Long id) {
		usuarioService.delete(id);
		return "redirect:/admin/usuarios";
	}
	
}
