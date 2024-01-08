package org.example.mapper;

import org.example.source.A;
import org.example.target.Z;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import static org.mapstruct.MappingInheritanceStrategy.AUTO_INHERIT_FROM_CONFIG;

@Mapper(uses = {B2YMapper.class}, componentModel = MappingConstants.ComponentModel.SPRING,
        mappingInheritanceStrategy = AUTO_INHERIT_FROM_CONFIG,
        injectionStrategy = InjectionStrategy.SETTER)
public interface A2ZMapper {

    @Mapping(target = "y", source = "b")
    @Mapping(target = "lastname", source = "familyName")
    Z fromA2Z(A source);
}
