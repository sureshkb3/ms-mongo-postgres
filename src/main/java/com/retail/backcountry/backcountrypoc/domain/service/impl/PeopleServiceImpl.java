package com.retail.backcountry.backcountrypoc.domain.service.impl;

import com.retail.backcountry.backcountrypoc.domain.dto.PeopleDto;
import com.retail.backcountry.backcountrypoc.domain.dto.PeopleResponse;
import com.retail.backcountry.backcountrypoc.domain.mapper.NoSqlPeopleMapper;
import com.retail.backcountry.backcountrypoc.domain.mapper.SqlPeopleMapper;
import com.retail.backcountry.backcountrypoc.domain.service.PeopleService;
import com.retail.backcountry.backcountrypoc.repository.PeopleNoSQLRepository;
import com.retail.backcountry.backcountrypoc.repository.PeopleSQLRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
public class PeopleServiceImpl implements PeopleService {

    private final PeopleSQLRepository sqlRepository;

    private final PeopleNoSQLRepository noSQLRepository;

    private final SqlPeopleMapper sqlPeopleMapper;

    private final NoSqlPeopleMapper noSqlPeopleMapper;


    @Override
    public List<PeopleDto> getPeopleFromMongo() {
        log.info("get from mongo ");
        return noSQLRepository.findAll().stream().map(noSqlPeopleMapper::peopleToPeopleDto).collect(Collectors.toList());
    }

    @Override
    public List<PeopleDto> getPeopleFromPostgres() {
        log.info("get from postgres ");
        return sqlRepository.findAll().stream().map(sqlPeopleMapper::peopleToPeopleDto).collect(Collectors.toList());
    }

    @Override
    public PeopleDto savePeopleToMongo(PeopleDto peopleDto) {
        log.info("save to mongo");
        return noSqlPeopleMapper.peopleToPeopleDto(noSQLRepository.save(noSqlPeopleMapper.peopleDtoToPeople(peopleDto)));
    }

    @Override
    public PeopleDto savePeopleToPostgres(PeopleDto peopleDto) {
        log.info("save to postgres");
        return sqlPeopleMapper.peopleToPeopleDto(sqlRepository.save(sqlPeopleMapper.peopleDtoToPeople(peopleDto)));
    }

    @Override
    public PeopleResponse deletePeopleFromPostgres(String id) {
        sqlRepository.deleteById(id);
        log.info("deleted from postgres");
        return PeopleResponse.builder().message("Deleted from postgres").build();
    }

    @Override
    public PeopleResponse deletePeopleFromMongo(String id) {
        noSQLRepository.deleteById(id);
        log.info("deleted from mongo");
        return PeopleResponse.builder().message("Deleted from mongo").build();
    }
}
