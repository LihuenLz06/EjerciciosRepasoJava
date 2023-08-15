package com.primerProyectoSpring.primerProyecto.Servicios;

import com.primerProyectoSpring.primerProyecto.Entidades.Noticias;
import com.primerProyectoSpring.primerProyecto.Repositorio.INoticiasRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class NoticiaServicioImpl implements INoticiaServicios {

    @Autowired//Inyectar repositorio
    private INoticiasRepository noticiaRepo;

    @Override
    public List<Noticias> findAll() {
        return noticiaRepo.findAll();
    }

    @Override
    public Optional<Noticias> getById(Integer id) {
        return noticiaRepo.findById(id);
    }

    @Override
    public void update(Noticias noticia) {
        noticiaRepo.save(noticia);
    }

    @Override
    public void delete(Integer id) {
        noticiaRepo.deleteById(id);
    }

    @Override
    public Noticias save(Noticias noticia) {
        return noticiaRepo.save(noticia);
    }

}

