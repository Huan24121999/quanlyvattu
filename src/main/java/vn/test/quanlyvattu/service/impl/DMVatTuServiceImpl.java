package vn.test.quanlyvattu.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.test.quanlyvattu.dto.DMVatTuCreateDTO;
import vn.test.quanlyvattu.dto.DMVatTuUpdateDTO;
import vn.test.quanlyvattu.entity.DMVatTu;
import vn.test.quanlyvattu.exception.BusinessException;
import vn.test.quanlyvattu.mapper.DMVatTuMapper;
import vn.test.quanlyvattu.repository.DMVatTuRepository;
import vn.test.quanlyvattu.service.DMVatTuService;
import vn.test.quanlyvattu.utils.RandomStringGenerator;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DMVatTuServiceImpl implements DMVatTuService {
    private final DMVatTuRepository dmVatTuRepository;
    private final DMVatTuMapper dmVatTuMapper;

    @Override
    @Transactional
    public DMVatTu create(DMVatTuCreateDTO vatTuCreateDTO) {
        boolean isExistInDB;
        do {
            var maVatTu = RandomStringGenerator.generateRandomString();
            var existVT = dmVatTuRepository.findById(maVatTu);
            isExistInDB = existVT.isPresent();
        } while (isExistInDB);

        var dmVatTu = dmVatTuMapper.fromCreate(vatTuCreateDTO);
        return dmVatTuRepository.save(dmVatTu);
    }

    @Override
    @Transactional
    public DMVatTu update(DMVatTuUpdateDTO vatTuUpdateDTO) {
        var existedVatTu = dmVatTuRepository.findById(vatTuUpdateDTO.getMaVT());
        if (existedVatTu.isEmpty()) {
            throw new BusinessException("01", "Không tìm thấy mã vật tư");
        }
        var updatedVatTu = dmVatTuMapper.fromUpdate(vatTuUpdateDTO);
        return dmVatTuRepository.save(updatedVatTu);
    }

    @Override
    @Transactional
    public void delete(String maVatTu) {
        var existedVatTu = dmVatTuRepository.findById(maVatTu);
        if (existedVatTu.isEmpty()) {
            throw new BusinessException("01", "Không tìm thấy mã vật tư");
        }
        dmVatTuRepository.delete(existedVatTu.get());
    }

    @Override
    public List<DMVatTu> getAll() {
        return dmVatTuRepository.findAll();
    }
}
