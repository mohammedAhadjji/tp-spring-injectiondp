package ma.ehei.tp.service.impl;

import ma.ehei.tp.entity.Etudiant;
import ma.ehei.tp.service.EtudiantRepo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Component
public class MemoirEtudionDAO implements EtudiantRepo {
    ArrayList<Etudiant> E = new ArrayList<Etudiant>();
    @Override
    public void persist(Etudiant e) {
        E.add(e);
    }
}
