package com.example.ams_sesame.Repositories;

import com.example.ams_sesame.Entities.Provider;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProviderRepo extends CrudRepository<Provider, Integer> {
}
