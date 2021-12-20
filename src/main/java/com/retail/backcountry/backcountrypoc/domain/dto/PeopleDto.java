package com.retail.backcountry.backcountrypoc.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PeopleDto {

    private String id;

    private String firstName;

    private String lastName;
}
