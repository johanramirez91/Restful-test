package com.example.controladores.repository;

import com.example.controladores.model.Widget;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WidgetRepository extends MongoRepository<Widget, Long> {
}
