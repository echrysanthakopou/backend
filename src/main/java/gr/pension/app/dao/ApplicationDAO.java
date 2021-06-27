package gr.pension.app.dao;

import gr.pension.app.model.entities.ApplicationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicationDAO extends CrudRepository<ApplicationEntity, Integer> {

    @Override
    List<ApplicationEntity> findAll();

    List<ApplicationEntity> findAllById(Integer id);

    List<ApplicationEntity> findAllByEmail(String mail);

    @Override
    <S extends ApplicationEntity> S save(S s);

}
