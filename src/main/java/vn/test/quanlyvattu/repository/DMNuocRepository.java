package vn.test.quanlyvattu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.test.quanlyvattu.entity.DMNuoc;

@Repository
public interface DMNuocRepository extends JpaRepository<DMNuoc, Integer> {
}
