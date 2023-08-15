package com.primerProyectoSpring.primerProyecto.Servicios;

import com.primerProyectoSpring.primerProyecto.Entidades.Autor;
import com.primerProyectoSpring.primerProyecto.Repositorio.IAutorRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AutorServicioImpl implements IAutorServicios {

    @Autowired//Inyectar repositorio, sirve para hacer una relacion con el repositorio de una manera más practica
    private IAutorRepository autorRepo;

    @Override
    public List<Autor> findAll() {
        return autorRepo.findAll();
    }

    @Override
    public Optional<Autor> getById(Integer id) {
        return autorRepo.findById(id);
    }

    @Override
    public void update(Autor autor) {
        autorRepo.save(autor);
    }

    @Override
    public void delete(Integer id) {
        autorRepo.deleteById(id);
    }

    @Override
    public Autor save(Autor autor) {
        return autorRepo.save(autor);
    }
}
