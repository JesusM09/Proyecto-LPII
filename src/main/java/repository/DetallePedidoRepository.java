package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entidad.Detallepedido;

public interface DetallePedidoRepository extends JpaRepository<Detallepedido, Long> {
   
}
