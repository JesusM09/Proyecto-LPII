package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entidad.Producto;

public interface usuariRepository extends JpaRepository<Producto, Long> {

}