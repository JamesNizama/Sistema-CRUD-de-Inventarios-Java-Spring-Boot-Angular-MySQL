package com.gm.servicio;

import com.gm.modelo.Producto;

import java.util.List;

public interface IProductoServicio {

    List<Producto> listarProducto();

    Producto buscarProductoPorId(Integer idProducto);

    Producto guardarProducto(Producto producto);

    void eliminarProducto(Integer idProducto);
}
