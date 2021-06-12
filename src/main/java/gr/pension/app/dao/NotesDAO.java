package gr.pension.app.dao;

import gr.pension.app.model.entitiesNew.HistoryworkingEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.List;


@Repository
public interface NotesDAO extends CrudRepository<HistoryworkingEntity, Integer> {
    @Override
    List<HistoryworkingEntity> findAll();


        List<HistoryworkingEntity> findAllById(Integer user);



    @Override
    <S extends HistoryworkingEntity> S save(S s);

}
