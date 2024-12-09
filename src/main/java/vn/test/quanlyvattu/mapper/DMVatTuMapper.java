package vn.test.quanlyvattu.mapper;

import org.mapstruct.Mapper;
import vn.test.quanlyvattu.dto.DMVatTuCreateDTO;
import vn.test.quanlyvattu.dto.DMVatTuUpdateDTO;
import vn.test.quanlyvattu.entity.DMVatTu;

@Mapper(componentModel = "spring")
public interface DMVatTuMapper {
    DMVatTu fromCreate(DMVatTuCreateDTO dmVatTuCreateDTO);

    DMVatTu fromUpdate(DMVatTuUpdateDTO dmVatTuUpdateDTO);

}
