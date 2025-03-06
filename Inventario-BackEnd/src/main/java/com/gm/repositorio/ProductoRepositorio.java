package com.gm.repositorio;

import com.gm.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepositorio  extends JpaRepository<Producto, Integer> {
}
