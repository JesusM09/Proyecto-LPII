package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entidad.Producto;
import repository.ProductoRepository;

@Service
public class ProductoService {
	 @Autowired
	    private ProductoRepository productoRepository;

	    // Listar todos los productos
	    public List<Producto> listarProductos() {
	        return productoRepository.findAll();
	    }

	    // Guardar un producto
	    public Producto guardarProducto(Producto producto) {
	        return productoRepository.save(producto);
	    }

	    // Obtener un producto por ID
	    public Producto obtenerProductoPorId(Long id) {
	        return productoRepository.findById(id).orElse(null);
	    }

	    // Actualizar un producto
	    public Producto actualizarProducto(Producto producto) {
	        return productoRepository.save(producto);
	    }

	    // Eliminar un producto por ID
	    public void eliminarProducto(Long id) {
	        productoRepository.deleteById(id);
	    }

}
