package gr.pension.app.persistence.dao;

import gr.pension.app.persistence.entity.ApplicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicationDAO extends JpaRepository<ApplicationEntity, Integer> {
    List<ApplicationEntity> findAllByEmail(String mail);
}
