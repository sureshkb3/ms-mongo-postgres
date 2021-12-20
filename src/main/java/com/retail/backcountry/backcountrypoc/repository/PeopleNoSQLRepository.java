package com.retail.backcountry.backcountrypoc.repository;

import com.retail.backcountry.backcountrypoc.domain.nosql.entity.People;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PeopleNoSQLRepository extends MongoRepository<People,String> {
}
