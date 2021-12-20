package com.retail.backcountry.backcountrypoc.domain.mapper;

import com.retail.backcountry.backcountrypoc.domain.dto.PeopleDto;
import com.retail.backcountry.backcountrypoc.domain.nosql.entity.People;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",builder = @Builder(disableBuilder = true))
public interface NoSqlPeopleMapper {

    PeopleDto peopleToPeopleDto(People people);

    People peopleDtoToPeople(PeopleDto peopleDto);

}
