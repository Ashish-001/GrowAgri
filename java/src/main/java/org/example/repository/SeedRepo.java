package com.example.demo.repository;
import com.example.demo.domain.SeedInfo;
import org.springframework.data.repository.CrudRepository;

public interface SeedRepo extends CrudRepository<SeedInfo , String> {
}
