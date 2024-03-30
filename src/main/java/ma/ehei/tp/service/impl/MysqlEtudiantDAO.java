package ma.ehei.tp.service.impl;

import ma.ehei.tp.entity.Etudiant;
import ma.ehei.tp.service.EtudiantRepo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component("msql")
public class MysqlEtudiantDAO implements EtudiantRepo {

    @Override
    public void persist(Etudiant e) {
        System.out.println("ajouter avec succes");
    }
}
