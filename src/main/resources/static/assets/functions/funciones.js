function eliminarBlog(id) {
	swal({
		  title: "¿Esta seguro de eliminar?",
		  text: "¡Una vez eliminado no se prodra restablecer!",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			  $.ajax({
				 url:"/admin/eliminar/blogs/"+id,
				 success: function(res) {
					console.log(res);
				},			
			  });
		    swal("¡Poof! Cuenta eliminada", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/admin/blogs";
		    	}
		    });
		  } else {
			swal("¡Tu registro está seguro!")
		}
		});
}

function eliminarCarruseles(id) {
	swal({
		  title: "¿Esta seguro de eliminar?",
		  text: "¡Una vez eliminado no se prodra restablecer!",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			  $.ajax({
				 url:"/admin/eliminar/carruseles/"+id,
				 success: function(res) {
					console.log(res);
				},			
			  });
		    swal("¡Poof! Cuenta eliminada", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/admin/carruseles";
		    	}
		    });
		  } else {
			swal("¡Tu registro está seguro!")
		}
		});
}

function eliminarContactos(id) {
	swal({
		  title: "¿Esta seguro de eliminar?",
		  text: "¡Una vez eliminado no se prodra restablecer!",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			  $.ajax({
				 url:"/admin/eliminar/contactos/"+id,
				 success: function(res) {
					console.log(res);
				},			
			  });
		    swal("¡Poof! Cuenta eliminada", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/admin/contactos";
		    	}
		    });
		  } else {
			swal("¡Tu registro está seguro!")
		}
		});
}

function eliminarProducto(id) {
	swal({
		  title: "¿Esta seguro de eliminar?",
		  text: "¡Una vez eliminado no se prodra restablecer!",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			  $.ajax({
				 url:"/admin/eliminar/productos/"+id,
				 success: function(res) {
					console.log(res);
				},			
			  });
		    swal("¡Poof! Cuenta eliminada", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/admin/productos";
		    	}
		    });
		  } else {
			swal("¡Tu registro está seguro!")
		}
		});
}

function eliminarTestimonio(id) {
	swal({
		  title: "¿Esta seguro de eliminar?",
		  text: "¡Una vez eliminado no se prodra restablecer!",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			  $.ajax({
				 url:"/admin/eliminar/testimonios/"+id,
				 success: function(res) {
					console.log(res);
				},			
			  });
		    swal("¡Poof! Cuenta eliminada", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/admin/testimonios";
		    	}
		    });
		  } else {
			swal("¡Tu registro está seguro!")
		}
		});
}

function eliminarTienda(id) {
	swal({
		  title: "¿Esta seguro de eliminar?",
		  text: "¡Una vez eliminado no se prodra restablecer!",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			  $.ajax({
				 url:"/admin/eliminar/tiendas/"+id,
				 success: function(res) {
					console.log(res);
				},			
			  });
		    swal("¡Poof! Cuenta eliminada", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/admin/tiendas";
		    	}
		    });
		  } else {
			swal("¡Tu registro está seguro!")
		}
		});
}

function eliminarUsuario(id) {
	swal({
		  title: "¿Esta seguro de eliminar?",
		  text: "¡Una vez eliminado no se prodra restablecer!",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			  $.ajax({
				 url:"/admin/eliminar/usuarios/"+id,
				 success: function(res) {
					console.log(res);
				},			
			  });
		    swal("¡Poof! Cuenta eliminada", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/admin/usuarios";
		    	}
		    });
		  } else {
			swal("¡Tu registro está seguro!")
		}
		});
}

function eliminarProfile(id) {
	swal({
		  title: "¿Esta seguro de eliminar tu cuenta?",
		  text: "¡Una vez eliminado no se prodra restablecer!",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			  $.ajax({
				 url:"/private/eliminar/profile/"+id,
				 success: function(res) {
					console.log(res);
				},			
			  });
		    swal("¡Poof! Cuenta eliminada", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/private/eliminar";
		    	}
		    });
		  } else {
			swal("¡Tu cuenta está segura!")
		}
		});
}

function eliminarItem(id) {
	swal({
		  title: "¿Esta seguro de eliminar?",
		  text: "¡El producto será removido de tu carrito de compras!",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			  $.ajax({
				 url:"/private/eliminar/item/"+id,
				 success: function(res) {
					console.log(res);
				},			
			  });
		    swal("Poof! Producto eliminado!", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/private/cart";
		    	}
		    });
		  } else {
			swal("¡Tu producto está seguro!")
		}
		});
}

function eliminarFavorite(id) {
	swal({
		  title: "¿Esta seguro de eliminar?",
		  text: "¡El producto será removido de tu lista de favoritos!",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			  $.ajax({
				 url:"/private/eliminar/favorite/"+id,
				 success: function(res) {
					console.log(res);
				},			
			  });
		    swal("Poof! Producto eliminado!", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/private/favorites";
		    	}
		    });
		  } else {
			swal("¡Tu producto está seguro!")
		}
		});
}