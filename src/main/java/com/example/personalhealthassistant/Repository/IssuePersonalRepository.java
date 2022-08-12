package com.example.personalhealthassistant.Repository;

import com.example.personalhealthassistant.model.IssuePersonalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IssuePersonalRepository extends JpaRepository<IssuePersonalEntity,Long> {
    @Query("SELECT ip FROM IssuePersonalEntity ip WHERE ip.name LIKE %?1%"
//            + " OR p.brand LIKE %?1%"
//            + " OR p.madein LIKE %?1%"
//            + " OR CONCAT(p.price, '') LIKE %?1%"
    )
    public List<IssuePersonalEntity> search(String keyword);


}
