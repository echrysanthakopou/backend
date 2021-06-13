package gr.pension.app.dao;

import gr.pension.app.model.entities.HistoryworkingEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.List;


@Repository
public interface HistoryworkingEntityDAO extends CrudRepository<HistoryworkingEntity, Integer> {
    @Override
    List<HistoryworkingEntity> findAll();


        List<HistoryworkingEntity> findAllById(Integer id);


    @Override
    <S extends HistoryworkingEntity> S save(S s);

}
