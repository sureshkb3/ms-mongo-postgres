package com.retail.backcountry.backcountrypoc.domain.service;

import com.retail.backcountry.backcountrypoc.domain.dto.PeopleDto;
import com.retail.backcountry.backcountrypoc.domain.dto.PeopleResponse;

import java.util.List;

public interface PeopleService {

    List<PeopleDto> getPeopleFromMongo();

    List<PeopleDto> getPeopleFromPostgres();

    PeopleDto savePeopleToMongo(PeopleDto peopleDto);

    PeopleDto savePeopleToPostgres(PeopleDto peopleDto);

    PeopleResponse deletePeopleFromPostgres(String id);

    PeopleResponse deletePeopleFromMongo(String  id);

}
