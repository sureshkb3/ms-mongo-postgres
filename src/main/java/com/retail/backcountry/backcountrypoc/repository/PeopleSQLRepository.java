package com.retail.backcountry.backcountrypoc.repository;

import com.retail.backcountry.backcountrypoc.domain.sql.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleSQLRepository extends JpaRepository<People,String> {
}
