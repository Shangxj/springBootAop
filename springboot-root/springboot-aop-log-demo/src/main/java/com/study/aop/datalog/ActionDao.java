package com.study.aop.datalog;


import com.study.aop.domain.Action;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ActionDao extends MongoRepository<Action,String> {
}
