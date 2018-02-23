/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Entidad.Contacto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author santi
 */

@Service
public class ContactoDAO 
{
    @PersistenceContext
    private EntityManager em;
    
    @Transactional
    public List<Contacto> getContactos()
    {
        Query q = em.createNamedQuery("Contacto.findAll");
        return q.getResultList();
    }
    
    @Transactional
    public List<Contacto> ContactosLike(String cad) throws SecurityException
    {
        em.clear();
        em.flush();
        Query q = em.createNamedQuery("Contacto.like");
        q.setParameter("cad", "%"+cad+"%");        
        em.clear();
        em.close();
        return q.getResultList();
    }
}
