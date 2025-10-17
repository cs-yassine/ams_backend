package com.example.ams_sesame.Controllers;

import com.example.ams_sesame.Entities.Provider;
import com.example.ams_sesame.Services.IProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ams")
public class ProviderController {
    @Autowired
    IProviderService providerService;
    @PostMapping("/addProvider")
    public Provider addProvider(@RequestBody Provider provider) {
        return providerService.addProvider(provider);
    }
    @GetMapping("/getProvider/{id}")
    public Provider getProvider(@PathVariable("id") int id) {
        return providerService.getProvider(id);
    }
    @PostMapping("updateProvider")
    public Provider updateProvider(@RequestBody Provider provider) {
        return providerService.updateProvider(provider);
    }
    @PostMapping("/deleteProvider/{id}")
    public void deleteProvider(@PathVariable("id") int id) {
        providerService.deleteProvider(id);
    }
    @GetMapping("/getallProviders")
    public List<Provider> getAllProviders() {
        return providerService.getAllProviders();
    }

}
