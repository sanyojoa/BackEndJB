package com.portfolio.jb.Dto;

import javax.validation.constraints.NotBlank;

public class dtoPersona {
    @NotBlank
    private String img;
    @NotBlank
    private String sobremi;

    public dtoPersona() {
    }

    public dtoPersona(String img, String sobremi) {
        this.img = img;
        this.sobremi = sobremi;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getSobremi() {
        return sobremi;
    }

    public void setSobremi(String sobremi) {
        this.sobremi = sobremi;
    }
}
