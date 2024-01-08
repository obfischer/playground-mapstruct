package org.example.mapper;

import org.example.Service;
import org.example.source.B;
import org.example.target.Y;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(uses = {Service.class}, componentModel = MappingConstants.ComponentModel.SPRING,
        injectionStrategy = InjectionStrategy.SETTER)
public abstract class B2YMapper {

    protected Service service;

    @Mapping(target = "section", expression = "java(service.lookup(source.getSomeKey()))")
    public abstract Y fromB2Y(B source);

    @Autowired
    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
