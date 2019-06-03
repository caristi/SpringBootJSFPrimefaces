package com.auth0.samples.bootfaces.controller;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.auth0.samples.bootfaces.dao.IProductoDao;
import com.auth0.samples.bootfaces.dto.Producto;

@Scope(value = "session")
@Component(value = "productoController")
@ELBeanName(value = "productoController")
@Join(path = "/producto", to = "/producto-form.jsf")
public class ProductoController {

	@Autowired
	IProductoDao productoDao;
	
	private Producto producto = new Producto();

    public String save() {
    	productoDao.save(producto);
    	producto = new Producto();
        return "/producto-form";
    }

    public Producto getProducto() {
        return producto;
    }
}
