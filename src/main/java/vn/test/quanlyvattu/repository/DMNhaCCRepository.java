package vn.test.quanlyvattu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.test.quanlyvattu.entity.DMNhaCC;

@Repository
public interface DMNhaCCRepository extends JpaRepository<DMNhaCC, Integer> {
}
