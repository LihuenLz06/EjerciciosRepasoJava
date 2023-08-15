package com.primerProyectoSpring.primerProyecto.Controler;

import com.primerProyectoSpring.primerProyecto.Entidades.Autor;
import com.primerProyectoSpring.primerProyecto.Entidades.Noticias;
import com.primerProyectoSpring.primerProyecto.Servicios.IAutorServicios;
import com.primerProyectoSpring.primerProyecto.Servicios.INoticiaServicios;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //esta es la clase que maneja la logica de la programación

public class NoticiaControlador {

    @Autowired// coneccion que se utiliza para inyectar contenido
    private INoticiaServicios notiServ;//con este objeto voy a poder traer todos los metodos de los servicios
@Autowired
    private IAutorServicios autorServ; //le inyectamos la interfaz de servicios

    @GetMapping("/")//URL a donde me dirige
    public String indexSpring(ModelMap modelmap) {//ModelMap permite pasar valores al HTML para que realice operaciones
         List<Noticias> noticias = notiServ.findAll();
        Collections.sort(noticias, (n1, n2) -> n2.getId().compareTo(n1.getId()));
        modelmap.addAttribute("noticia", noticias);
        return "index.html";
    }
   
    @GetMapping("/noticias")//URL a donde me dirige
    public String index(ModelMap modelmap) {//ModelMap permite pasar valores al HTML para que realice operaciones
        List<Noticias> noticias = notiServ.findAll();
        modelmap.addAttribute("noticia", noticias);
        return "noticiasAdmin.html";
    }
    
     @GetMapping("/registro")//URL a donde me dirige
    public String register() {
        return "registro.html";
    }
    
        @GetMapping("/create")//Get trae la información para consultar
    public String create() {
        return "crear.html";
    }

    @PostMapping("/save")//Post envía la informacion. Con post se refiere a indicar la acción que se va a realizar despues de la consulta, va a realizar una accion que aun no existe
    public String save(Noticias noticia, Autor autor) {
        autorServ.save(autor);
        noticia.setAutor(autor);
        notiServ.save(noticia);
        return "redirect:/noticias";
    }
     

    @GetMapping("/edit/{id}")//Parámetro que se recibe del HTML
    public String edit(@PathVariable Integer id, ModelMap modelmap) {//Recibe variable desde el HTML
        //Optional<Noticia> respuesta = notiServ.getById(id);//Optional permite validar sin necesidad de crear método alterno
        Noticias noticia = notiServ.getById(id).get();
        Autor autor = noticia.getAutor();
        modelmap.addAttribute("noticia", noticia);
        modelmap.addAttribute("autor", autor);
        return "/edit.html";
    }
  

    @PostMapping("/update")
    public String update(Noticias noticia, Autor autor) {
        Autor autorActual = autorServ.getById(autor.getId()).get();
        autorActual.setNombre(autor.getNombre());
        autorActual.setApellido(autor.getApellido());
        autorServ.update(autorActual);
        Noticias noticiaActual = notiServ.getById(noticia.getId()).get();
        noticiaActual.setTitulo(noticia.getTitulo());
        noticiaActual.setCuerpo(noticia.getCuerpo());
        noticiaActual.setAutor(autorActual);
        notiServ.update(noticia);
        return "redirect:/noticias";
    }
    
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        notiServ.delete(id);
        return "redirect:/noticias";
    }
    
}

