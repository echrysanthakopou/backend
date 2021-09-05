package gr.pension.app.persistence.dao;

import gr.pension.app.persistence.entity.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyDAO extends JpaRepository<CompanyEntity, Integer> {

}
