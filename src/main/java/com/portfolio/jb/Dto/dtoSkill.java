package com.portfolio.jb.Dto;

import javax.validation.constraints.NotBlank;

public class dtoSkill {
    @NotBlank
    private String nombreS;
    @NotBlank
    private String porcentajeS;
    @NotBlank
    private String imgS;

    public dtoSkill() {
    }

    public dtoSkill(String nombreS, String porcentajeS, String imgS) {
        this.nombreS = nombreS;
        this.porcentajeS = porcentajeS;
    }

    public String getNombreS() {
        return nombreS;
    }

    public void setNombreS(String nombreS) {
        this.nombreS = nombreS;
    }

    public String getPorcentajeS() {
        return porcentajeS;
    }

    public void setPorcentajeS(String porcentajeS) {
        this.porcentajeS = porcentajeS;
    }

    public String getImgS() {
        return imgS;
    }

    public void setImgS(String imgS) {
        this.imgS = imgS;
    }
}
