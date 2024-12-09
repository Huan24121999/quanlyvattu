package vn.test.quanlyvattu.service;

import vn.test.quanlyvattu.dto.DMVatTuCreateDTO;
import vn.test.quanlyvattu.dto.DMVatTuUpdateDTO;
import vn.test.quanlyvattu.entity.DMVatTu;

import java.util.List;

public interface DMVatTuService {
    DMVatTu create(DMVatTuCreateDTO vatTuCreateDTO);

    DMVatTu update(DMVatTuUpdateDTO vatTuUpdateDTO);

    void delete(String maVatTu);

    List<DMVatTu> getAll();
}
