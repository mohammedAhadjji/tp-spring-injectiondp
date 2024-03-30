package ma.ehei.tp.service;

import ma.ehei.tp.dao.EtudiantDAO;
import ma.ehei.tp.entity.Etudiant;
import ma.ehei.tp.service.impl.MemoirEtudionDAO;
import ma.ehei.tp.service.impl.MysqlEtudiantDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EtudiantService {

    @Autowired
    @Qualifier("msql")
    private EtudiantRepo mysqlEtudiantDAO;
    @Autowired
    @Qualifier("inc")
    private Idgenerator idgenerator;

    public void ajouter(EtudiantDAO edo){

        Etudiant e = new Etudiant( idgenerator.genaratId(),edo.getNom(), edo.getPreom() );
        mysqlEtudiantDAO.persist(e);
    }
}
