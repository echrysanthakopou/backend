package gr.pension.app.dao;

import gr.pension.app.model.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserEntityDAO extends CrudRepository<UserEntity, Integer> {
    @Override
    List<UserEntity> findAll();
    
        List<UserEntity> findAllById(Integer id);

    @Override
    <S extends UserEntity> S save(S s);

}
