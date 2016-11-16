package com.which.Entity;

import javax.persistence.*;

@Entity
public class Smartphone {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "marca")
    private String marca;

    @Column(name = "camara")
    private Integer camara;

    @Column(name = "frontCamara")
    private Integer frontCamara;

    @Column(name = "bateria")
    private Integer bateria;

    @Column(name = "pulgadasPantalla")
    private Integer pulgadasPantalla;

    @Column(name = "resolucionPantalla")
    private Integer resolucionPantalla;

    @Column(name = "resolucionVideo")
    private String resolucionVideo;

    @Column(name = "ram")
    private Integer ram;

    @Column(name = "so")
    private String so;

    @Column(name = "rom")
    private Integer rom;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getCamara() {
        return camara;
    }

    public void setCamara(Integer camara) {
        this.camara = camara;
    }

    public Integer getFrontCamara() {
        return frontCamara;
    }

    public void setFrontCamara(Integer frontCamara) {
        this.frontCamara = frontCamara;
    }

    public Integer getBateria() {
        return bateria;
    }

    public void setBateria(Integer bateria) {
        this.bateria = bateria;
    }

    public Integer getPulgadasPantalla() {
        return pulgadasPantalla;
    }

    public void setPulgadasPantalla(Integer pulgadasPantalla) {
        this.pulgadasPantalla = pulgadasPantalla;
    }

    public Integer getResolucionPantalla() {
        return resolucionPantalla;
    }

    public void setResolucionPantalla(Integer resolucionPantalla) {
        this.resolucionPantalla = resolucionPantalla;
    }

    public String getResolucionVideo() {
        return resolucionVideo;
    }

    public void setResolucionVideo(String resolucionVideo) {
        this.resolucionVideo = resolucionVideo;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public Integer getRom() {
        return rom;
    }

    public void setRom(Integer rom) {
        this.rom = rom;
    }

    @Override
    public String toString() {
        return "smartphone{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", camara=" + camara +
                ", frontCamara=" + frontCamara +
                ", bateria=" + bateria +
                ", pulgadasPantalla=" + pulgadasPantalla +
                ", resolucionPantalla=" + resolucionPantalla +
                ", resolucionVideo='" + resolucionVideo + '\'' +
                ", ram=" + ram +
                ", so='" + so + '\'' +
                ", rom=" + rom +
                '}';
    }
}
