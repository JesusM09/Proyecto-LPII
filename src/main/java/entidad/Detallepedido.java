package entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
	public class Detallepedido {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id_detalle;
	    private int cantidad;
	    private Double subtotal;

	    @ManyToOne
	    private Pedido pedido;

	    @ManyToOne
	    private Producto producto;

		public Long getId_detalle() {
			return id_detalle;
		}

		public void setId_detalle(Long id_detalle) {
			this.id_detalle = id_detalle;
		}

		public int getCantidad() {
			return cantidad;
		}

		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}

		public Double getSubtotal() {
			return subtotal;
		}

		public void setSubtotal(Double subtotal) {
			this.subtotal = subtotal;
		}

		public Pedido getPedido() {
			return pedido;
		}

		public void setPedido(Pedido pedido) {
			this.pedido = pedido;
		}

		public Producto getProducto() {
			return producto;
		}

		public void setProducto(Producto producto) {
			this.producto = producto;
		}
	    

}
