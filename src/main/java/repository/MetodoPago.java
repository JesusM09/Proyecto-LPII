package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entidad.Detallepedido;

public interface MetodoPago extends JpaRepository<Detallepedido, Long> {
}
