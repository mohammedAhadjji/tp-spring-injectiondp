package ma.ehei.tp.service;

import ma.ehei.tp.entity.Etudiant;
import org.springframework.stereotype.Service;


public interface EtudiantRepo {
    public void persist(Etudiant e);
}
