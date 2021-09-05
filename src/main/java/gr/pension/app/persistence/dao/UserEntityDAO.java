package gr.pension.app.persistence.dao;

import gr.pension.app.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserEntityDAO extends JpaRepository<UserEntity, Integer> {
    UserEntity findUserEntityByEmail(String mail);
}
