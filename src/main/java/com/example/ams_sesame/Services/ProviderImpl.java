package com.example.ams_sesame.Services;

import com.example.ams_sesame.Entities.Provider;
import com.example.ams_sesame.Repositories.IProviderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderImpl implements IProviderService {
    @Autowired
    IProviderRepo providerRepo;
    @Override
    public Provider addProvider(Provider p) {
        return providerRepo.save(p);
    }

    @Override
    public Provider getProvider(int id) {
        return providerRepo.findById(id).get();
    }

    @Override
    public Provider updateProvider(Provider p) {
        return providerRepo.save(p);
    }

    @Override
    public List<Provider> getAllProviders() {
        return (List<Provider>) providerRepo.findAll();
    }

    @Override
    public void deleteProvider(int id) {
        providerRepo.deleteById(id);
    }


}
