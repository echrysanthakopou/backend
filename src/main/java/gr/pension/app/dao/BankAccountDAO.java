package gr.pension.app.dao;
import gr.pension.app.model.entities.BankaccountEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BankAccountDAO extends CrudRepository<BankaccountEntity, Integer> {
    @Override
    List<BankaccountEntity> findAll();


        List<BankaccountEntity> findAllById(Integer id);


    @Override
    <S extends BankaccountEntity> S save(S s);

}
