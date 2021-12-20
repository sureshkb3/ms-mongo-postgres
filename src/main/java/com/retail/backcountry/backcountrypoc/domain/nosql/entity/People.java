package com.retail.backcountry.backcountrypoc.domain.nosql.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "people")
@Setter
@Getter@NoArgsConstructor
@AllArgsConstructor
@Builder
public class People {

    @Id
    private String id;

    private String firstName;

    private String lastName;
}
