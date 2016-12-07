package com.which.Entity;

import javax.persistence.*;

@Entity
public class Smartphone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "marca")
    private String marca;

    @Column(name = "camara")
    private Double camara;

    @Column(name = "frontCamara")
    private Double frontCamara;

    @Column(name = "bateria")
    private Integer bateria;

    @Column(name = "pulgadasPantalla")
    private Double pulgadasPantalla;

    @Column(name = "resolucionPantalla")
    private String resolucionPantalla;

    @Column(name = "resolucionVideo")
    private String resolucionVideo;

    @Column(name = "ram")
    private Integer ram;

    @Column(name = "so")
    private String so;

    @Column(name = "rom")
    private Integer rom;

    public Smartphone() {}

    public Smartphone(String modelo, String marca, Double camara, Double frontCamara, Integer bateria, Double pulgadasPantalla, String resolucionPantalla, String resolucionVideo, Integer ram, String so, Integer rom) {
        this.modelo = modelo;
        this.marca = marca;
        this.camara = camara;
        this.frontCamara = frontCamara;
        this.bateria = bateria;
        this.pulgadasPantalla = pulgadasPantalla;
        this.resolucionPantalla = resolucionPantalla;
        this.resolucionVideo = resolucionVideo;
        this.ram = ram;
        this.so = so;
        this.rom = rom;
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

    public Double getCamara() {
        return camara;
    }

    public void setCamara(Double camara) {
        this.camara = camara;
    }

    public Double getFrontCamara() {
        return frontCamara;
    }

    public void setFrontCamara(Double frontCamara) {
        this.frontCamara = frontCamara;
    }

    public Integer getBateria() {
        return bateria;
    }

    public void setBateria(Integer bateria) {
        this.bateria = bateria;
    }

    public Double getPulgadasPantalla() {
        return pulgadasPantalla;
    }

    public void setPulgadasPantalla(Double pulgadasPantalla) {this.pulgadasPantalla = pulgadasPantalla;}

    public String getResolucionPantalla() {
        return resolucionPantalla;
    }

    public void setResolucionPantalla(String resolucionPantalla) {this.resolucionPantalla = resolucionPantalla;}

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
