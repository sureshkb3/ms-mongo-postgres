package com.retail.backcountry.backcountrypoc;

import com.retail.backcountry.backcountrypoc.infra.CustomPeopleNoSQLRepository;
import com.retail.backcountry.backcountrypoc.infra.CustomPeopleSQLRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = CustomPeopleNoSQLRepository.class)
@EnableJpaRepositories(basePackageClasses = CustomPeopleSQLRepository.class)
public class BackcountryPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackcountryPocApplication.class, args);
	}

}
