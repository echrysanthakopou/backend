package gr.pension.app.persistence.dao;

import gr.pension.app.persistence.entity.HistoryworkingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryworkingEntityDAO extends JpaRepository<HistoryworkingEntity, Integer> {

}
