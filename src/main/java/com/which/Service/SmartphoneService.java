package com.which.Service;

import com.which.Entity.Smartphone;
import com.which.Repository.SmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class SmartphoneService {
    @Autowired
    private SmartphoneRepository smartphoneRepository;

    // CREAMOS LOS SMARTPHONES
    public void registrarSmarthpones() {
        // VGA 640 x 480
        // HD 1280 x 720
        // FullHD 1920 x 1080
        // UHD 3840 x 2160
        Smartphone s1 = new Smartphone();
        s1.setModelo("Galaxy S7");
        s1.setMarca("Samsung");
        s1.setCamara(12.0);
        s1.setFrontCamara(5.0);
        s1.setBateria(3000);
        s1.setPulgadasPantalla(5.1);
        s1.setResolucionPantalla("1280p x 720p");
        s1.setResolucionVideo("HD");
        s1.setRam(4);
        s1.setSo("Android");
        s1.setRom(32);
        smartphoneRepository.save();

        Smartphone s2 = new Smartphone();
        s2.setModelo("Galaxy S6 Edge+");
        s2.setMarca("Samsung");
        s2.setCamara(16.0);
        s2.setFrontCamara(5.0);
        s2.setBateria(3000);
        s2.setPulgadasPantalla(5.7);
        s2.setResolucionPantalla("2560p x 1440p");
        s2.setResolucionVideo("4k");
        s2.setRam(4);
        s2.setSo("Android");
        s2.setRom(32);
        smartphoneRepository.save(s2);

        Smartphone s3 = new Smartphone();
        s3.setModelo("Galaxy S5");
        s3.setMarca("Samsung");
        s3.setCamara(16.0);
        s3.setFrontCamara(2.1);
        s3.setBateria(2800);
        s3.setPulgadasPantalla(5.1);
        s3.setResolucionPantalla("1920p x 1080p");
        s3.setResolucionVideo("UHD");
        s3.setRam(4);
        s3.setSo("Android");
        s3.setRom(32);
        smartphoneRepository.save(s3);

        Smartphone s4 = new Smartphone();
        s4.setModelo("Galaxy S4");
        s4.setMarca("Samsung");
        s4.setCamara(13.0);
        s4.setFrontCamara(2.0);
        s4.setBateria(2600);
        s4.setPulgadasPantalla(5.0);
        s4.setResolucionPantalla("1920p x 1080p");
        s4.setResolucionVideo("Full HD");
        s4.setRam(2);
        s4.setSo("Android");
        s4.setRom(16);
        smartphoneRepository.save(s4);

        System.out.println(smartphoneRepository.findByModeloStartingWith("Ga"));
    }



}