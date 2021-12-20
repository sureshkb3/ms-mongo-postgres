package com.retail.backcountry.backcountrypoc.domain.sql.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "people")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class People {

    @Id
    @Column(name = "id")
   // @GeneratedValue(generator = "id-generator")
    //@GenericGenerator(name = "id-generator", strategy = "com.retail.backcountry.backcountrypoc.domain.IdGenerator")
    private String id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
}
