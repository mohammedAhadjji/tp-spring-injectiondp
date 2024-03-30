package ma.ehei.tp.service.impl;

import ma.ehei.tp.service.Idgenerator;
import org.springframework.stereotype.Service;

@Service("inc")

public class AutoIncId implements Idgenerator {
    private int idAuto=1;

    @Override
    public String genaratId() {
        return this.idAuto+++"";
    }
}
