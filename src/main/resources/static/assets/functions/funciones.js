function eliminarBlog(id) {
	swal({
		  title: "¿Esta seguro de Eliminar?",
		  text: "Una vez eliminado no se prodra restablecer!",
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
		    swal("Poof! Registro eliminado!", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/admin/blogs";
		    	}
		    });
		  } else {
			swal("Tu registro está seguro!")
		}
		});
}

function eliminarCarrusel(id) {
	swal({
		  title: "¿Esta seguro de Eliminar?",
		  text: "Una vez eliminado no se prodra restablecer!",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			  $.ajax({
				 url:"/admin/eliminar/carrusels/"+id,
				 success: function(res) {
					console.log(res);
				},			
			  });
		    swal("Poof! Registro eliminado!", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/admin/carrusel";
		    	}
		    });
		  } else {
			swal("Tu registro está seguro!")
		}
		});
}

function eliminarProducto(id) {
	swal({
		  title: "¿Esta seguro de Eliminar?",
		  text: "Una vez eliminado no se prodra restablecer!",
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
		    swal("Poof! Registro eliminado!", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/admin/productos";
		    	}
		    });
		  } else {
			swal("Tu registro está seguro!")
		}
		});
}

function eliminarTestimonio(id) {
	swal({
		  title: "¿Esta seguro de Eliminar?",
		  text: "Una vez eliminado no se prodra restablecer!",
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
		    swal("Poof! Registro eliminado!", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/admin/testimonios";
		    	}
		    });
		  } else {
			swal("Tu registro está seguro!")
		}
		});
}

function eliminarTienda(id) {
	swal({
		  title: "¿Esta seguro de Eliminar?",
		  text: "Una vez eliminado no se prodra restablecer!",
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
		    swal("Poof! Registro eliminado!", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/admin/tiendas";
		    	}
		    });
		  } else {
			swal("Tu registro está seguro!")
		}
		});
}

function eliminarUsuario(id) {
	swal({
		  title: "¿Esta seguro de Eliminar?",
		  text: "Una vez eliminado no se prodra restablecer!",
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
		    swal("Poof! Registro eliminado!", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/admin/usuarios";
		    	}
		    });
		  } else {
			swal("Tu registro está seguro!")
		}
		});
}

function eliminarProfile(id) {
	swal({
		  title: "¿Esta seguro de Eliminar?",
		  text: "Una vez eliminado no se prodra restablecer!",
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
		    swal("Poof! Registro eliminado!", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/private/eliminar";
		    	}
		    });
		  } else {
			swal("Tu registro está seguro!")
		}
		});
}