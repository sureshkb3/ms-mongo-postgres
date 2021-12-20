package com.retail.backcountry.backcountrypoc.config;

import com.retail.backcountry.backcountrypoc.domain.mapper.NoSqlPeopleMapper;
import com.retail.backcountry.backcountrypoc.domain.mapper.SqlPeopleMapper;
import com.retail.backcountry.backcountrypoc.domain.service.PeopleService;
import com.retail.backcountry.backcountrypoc.domain.service.impl.PeopleServiceImpl;
import com.retail.backcountry.backcountrypoc.repository.PeopleNoSQLRepository;
import com.retail.backcountry.backcountrypoc.repository.PeopleSQLRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DomainBeansConfig {

    @Bean
    public PeopleService peopleService(PeopleSQLRepository sqlRepository, PeopleNoSQLRepository noSQLRepository, SqlPeopleMapper sqlMapper, NoSqlPeopleMapper noSqlmapper){
        return  new PeopleServiceImpl(sqlRepository,noSQLRepository,sqlMapper,noSqlmapper);
    }
}
