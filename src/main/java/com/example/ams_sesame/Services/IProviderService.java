package com.example.ams_sesame.Services;

import com.example.ams_sesame.Entities.Provider;

import java.util.List;

public interface IProviderService {
    Provider addProvider(Provider p);
    Provider getProvider(int id);
    Provider updateProvider(Provider p);
    List<Provider> getAllProviders();
    void deleteProvider(int id);
}
