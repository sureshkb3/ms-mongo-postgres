package com.retail.backcountry.backcountrypoc.application;

import com.retail.backcountry.backcountrypoc.domain.dto.PeopleDto;
import com.retail.backcountry.backcountrypoc.domain.dto.PeopleResponse;
import com.retail.backcountry.backcountrypoc.domain.service.PeopleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/people")
@RequiredArgsConstructor
public class PeopleController {

    private final PeopleService peopleService;

    @GetMapping("/from-mongo")
    public ResponseEntity<List<PeopleDto>> fromMongo(){
        List<PeopleDto> peopleFromMongo = peopleService.getPeopleFromMongo();
        return ResponseEntity.ok(peopleFromMongo);
    }

    @GetMapping("/from-postgres")
    public ResponseEntity<List<PeopleDto>> fromPostgres(){
        List<PeopleDto> peopleFromMongo = peopleService.getPeopleFromPostgres();
        return ResponseEntity.ok(peopleFromMongo);
    }

    @PostMapping("/save-to-mongo")
    public ResponseEntity<PeopleDto> saveToMongo(@RequestBody PeopleDto peopleDto){
        PeopleDto peopleFromMongo = peopleService.savePeopleToMongo(peopleDto);
        return ResponseEntity.ok(peopleFromMongo);
    }

    @PostMapping("/save-to-postgres")
    public ResponseEntity<PeopleDto> saveToPostgres(@RequestBody PeopleDto peopleDto){
        PeopleDto peopleFromMongo = peopleService.savePeopleToPostgres(peopleDto);
        return ResponseEntity.ok(peopleFromMongo);
    }

    @DeleteMapping("/delete-from-mongo/{id}")
    public ResponseEntity<PeopleResponse> deleteFromMongo(@PathVariable("id") String id ){
        PeopleResponse response = peopleService.deletePeopleFromMongo(id);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/delete-from-postgres/{id}")
    public ResponseEntity<PeopleResponse> deleteFromPostgres(@PathVariable("id") String id){
        PeopleResponse response = peopleService.deletePeopleFromPostgres(id);
        return ResponseEntity.ok(response);
    }
}