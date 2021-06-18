package gr.pension.app.dao;

import gr.pension.app.model.entities.CompanyEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CompanyDAO extends CrudRepository<CompanyEntity, Integer> {

    @Override
    List<CompanyEntity> findAll();


    List<CompanyEntity> findAllById(Integer id);


    @Override
    <S extends CompanyEntity> S save(S s);

}
