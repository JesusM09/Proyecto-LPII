package entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Metodopago {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id_pago;
	    private String tipo_pago;

	    @ManyToOne
	    private Pedido pedido;

		public Long getId_pago() {
			return id_pago;
		}

		public void setId_pago(Long id_pago) {
			this.id_pago = id_pago;
		}

		public String getTipo_pago() {
			return tipo_pago;
		}

		public void setTipo_pago(String tipo_pago) {
			this.tipo_pago = tipo_pago;
		}

		public Pedido getPedido() {
			return pedido;
		}

		public void setPedido(Pedido pedido) {
			this.pedido = pedido;
		}
	    
	    
	

}
