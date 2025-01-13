package com.example.SpringBoot.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.SpringBoot.entity.studentEntity;
@Repository
public interface studentRepo extends MongoRepository<studentEntity,Long>{

}
