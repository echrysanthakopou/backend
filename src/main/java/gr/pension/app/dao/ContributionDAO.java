package gr.pension.app.dao;

import gr.pension.app.model.entities.ContributionsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ContributionDAO extends CrudRepository<ContributionsEntity, Integer> {
    @Override
    List<ContributionsEntity> findAll();


        List<ContributionsEntity> findAllById(Integer id);


    @Override
    <S extends ContributionsEntity> S save(S s);

}
