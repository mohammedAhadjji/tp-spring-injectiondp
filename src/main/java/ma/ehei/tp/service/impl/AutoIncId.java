package ma.ehei.tp.service.impl;

import ma.ehei.tp.service.Idgenerator;

public class AutoIncId implements Idgenerator {
    private int idAuto=1;

    @Override
    public String genaratId() {
        return this.idAuto+++"";
    }
}
