package com.which.Controller;

import com.which.Entity.Smartphone;
import com.which.Repository.SmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/smartphones")
public class SmartphoneController {
    @Autowired
    private SmartphoneRepository smartphoneRepository;

    // POST
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Smartphone createSmartphone(@RequestBody Smartphone smartphone) {
        return smartphoneRepository.save(smartphone);
    }

    // PUT
    @PutMapping
    public Smartphone updateSmartphone(@RequestBody Smartphone smartphone) {
        return smartphoneRepository.save(smartphone);
    }

    // GET TODOS LOS SMARTPHONES
    @GetMapping
    public List<Smartphone> findAll() {
        return smartphoneRepository.findAll();
    }

    // GET UN SMARTPHONES
    @GetMapping("/{id}")
    public Smartphone findById(@PathVariable Long id) {
        Smartphone smartphone = smartphoneRepository.findOne(id);
        return smartphone;
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deleteSmartphone(@PathVariable Long id) {smartphoneRepository.delete(id);}
}
