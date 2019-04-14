package com.halbu.ear.Repository;

import com.halbu.ear.Model.Actor;
import com.halbu.ear.Model.Movie;
import com.halbu.ear.Model.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
public interface MovieRepository extends CrudRepository<Movie,String> {


    @Modifying
    @Transactional
    @Query("UPDATE Movie c SET c.name = :name WHERE c.movie_id = :movie_id")
    void setMovieUpdate(String movie_id, String name);


}
