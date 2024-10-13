package entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Categoria {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id_categoria;
	    private String nombre_categoria;
	    
		public Long getId_categoria() {
			return id_categoria;
		}
		public void setId_categoria(Long id_categoria) {
			this.id_categoria = id_categoria;
		}
		public String getNombre_categoria() {
			return nombre_categoria;
		}
		public void setNombre_categoria(String nombre_categoria) {
			this.nombre_categoria = nombre_categoria;
		}

	    
	    
	    
	

}
