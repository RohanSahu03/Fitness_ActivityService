package com.fitness.ActivityService.repo;

import com.fitness.ActivityService.model.Activity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepo extends MongoRepository<Activity,String> {
}
