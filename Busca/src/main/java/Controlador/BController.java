/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidad.Contacto;
import Modelo.ContactoDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author santi
 */
@Controller
public class BController 
{

    @Autowired
    private ContactoDAO cdao;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) 
    {
        List<Contacto> contactos = cdao.getContactos();
        model.addAttribute("contactos", contactos);
        System.out.println("C1: " + contactos.get(0).getNombre());
        return "index";
    }

    @RequestMapping(value = "/buscacli", method = RequestMethod.GET)
    public @ResponseBody
    String scli(@RequestParam("id") String id, Model model) 
    {
        String r = "";
        List<Contacto> contactos = cdao.ContactosLike(id);
        r += "<div class='table-responsive table-centered'>"
                + "<div class='listastb'>"
                + "<table class='table table-hover'>"
                + "<tr class='info'>"
                + "<th>ID</th>"
                + "<th>Nombre</th>"
                + "<th>Telefono</th>"
                + "<th>Direccion</th>"
                + "</tr>";
        for (Contacto c : contactos) 
        {
            r += "<tr class='active'>"
                    + "<td>" + c.getIdentificacion() + "</td>"
                    + "<td>" + c.getNombre() + "</td>"
                    + "<td>" + c.getTelefono() + "</td>"
                    + "<td>" + c.getDireccion() + "</td>"
                    + "</tr>";
        }
        r += "</table></div></div>";
        return r;
    }
}
