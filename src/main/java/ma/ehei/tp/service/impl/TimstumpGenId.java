package ma.ehei.tp.service.impl;

import ma.ehei.tp.service.Idgenerator;

import java.util.Date;

public class TimstumpGenId implements Idgenerator {
    private Date date = new Date();
    @Override
    public String genaratId() {
        return this.date.toString();
    }
}
