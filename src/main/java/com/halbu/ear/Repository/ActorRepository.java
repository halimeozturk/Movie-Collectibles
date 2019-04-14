package com.halbu.ear.Repository;


import com.halbu.ear.Model.Actor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.rowset.CachedRowSet;

@Repository
public interface ActorRepository extends CrudRepository<Actor,String> {

    @Modifying
    @Transactional
    @Query("UPDATE Actor a SET a.firstname = :firstname WHERE a.id = :id")
    void setActorUpdate(String id, String firstname);


}
