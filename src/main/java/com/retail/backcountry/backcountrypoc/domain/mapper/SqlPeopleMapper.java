package com.retail.backcountry.backcountrypoc.domain.mapper;

import com.retail.backcountry.backcountrypoc.domain.dto.PeopleDto;
import com.retail.backcountry.backcountrypoc.domain.sql.entity.People;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring",builder = @Builder(disableBuilder = true))
public interface SqlPeopleMapper {

    PeopleDto peopleToPeopleDto(People people);

    People peopleDtoToPeople(PeopleDto peopleDto);
}
