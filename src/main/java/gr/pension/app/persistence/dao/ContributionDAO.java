package gr.pension.app.persistence.dao;

import gr.pension.app.persistence.entity.ContributionsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContributionDAO extends JpaRepository<ContributionsEntity, Integer> {

}
