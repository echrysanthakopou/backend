package gr.pension.app.persistence.dao;
import gr.pension.app.persistence.entity.BankaccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountDAO extends JpaRepository<BankaccountEntity, Integer> {

}
