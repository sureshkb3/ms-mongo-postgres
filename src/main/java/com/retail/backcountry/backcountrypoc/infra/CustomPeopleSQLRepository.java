package com.retail.backcountry.backcountrypoc.infra;

import com.retail.backcountry.backcountrypoc.repository.PeopleSQLRepository;
import org.springframework.stereotype.Repository;

//can be used if we need to have custom implementation
@Repository
public interface CustomPeopleSQLRepository extends PeopleSQLRepository {
}
