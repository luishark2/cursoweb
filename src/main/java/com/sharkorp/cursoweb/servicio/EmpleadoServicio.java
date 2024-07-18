package com.sharkorp.cursoweb.servicio;

import com.sharkorp.cursoweb.modelo.Empleado;
import com.sharkorp.cursoweb.repositorio.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoServicio {

    @Autowired
    private EmpleadoRepositorio empleadoRepositorio;

    public List<Empleado> obtenerTodosLosEmpleados() {
        return empleadoRepositorio.findAll();
    }

    public Optional<Empleado> obtenerEmpleadoPorId(Integer id) {
        return empleadoRepositorio.findById(id);
    }

    public Empleado guardarEmpleado(Empleado empleado) {
        return empleadoRepositorio.save(empleado);
    }

    public void eliminarEmpleado(Integer id) {
        empleadoRepositorio.deleteById(id);
    }
}
