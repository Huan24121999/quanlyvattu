package vn.test.quanlyvattu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.test.quanlyvattu.entity.DMVatTu;

@Repository
public interface DMVatTuRepository extends JpaRepository<DMVatTu, String> {
}
