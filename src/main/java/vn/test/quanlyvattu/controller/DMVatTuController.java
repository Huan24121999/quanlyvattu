package vn.test.quanlyvattu.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import vn.test.quanlyvattu.dto.DMVatTuCreateDTO;
import vn.test.quanlyvattu.dto.DMVatTuUpdateDTO;
import vn.test.quanlyvattu.entity.DMVatTu;
import vn.test.quanlyvattu.service.DMVatTuService;

import javax.validation.Valid;
import java.util.List;

@Controller
@Slf4j
public class DMVatTuController {
    private final DMVatTuService dmVatTuService;

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("dmVatTu", new DMVatTuCreateDTO());
        return "createForm";
    }

    @PostMapping("/create")
    public String createVatTu(@Valid @ModelAttribute("dmVatTu") DMVatTuCreateDTO dmVatTu, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "createForm";
        }
        dmVatTuService.create(dmVatTu);
        model.addAttribute("message", "Thêm vật tư thành công!");
        return "result";
    }

    public DMVatTuController(DMVatTuService dmVatTuService) {
        this.dmVatTuService = dmVatTuService;
    }

    @PostMapping
    public ResponseEntity<DMVatTu> create(@RequestBody @Valid DMVatTuCreateDTO req) {
        return ResponseEntity.ok(dmVatTuService.create(req));
    }

    @PutMapping
    public ResponseEntity<DMVatTu> update(@RequestBody @Valid DMVatTuUpdateDTO req) {
        return ResponseEntity.ok(dmVatTuService.update(req));
    }

    @DeleteMapping("/maVatTu")
    public ResponseEntity<Object> delete(@PathVariable String maVatTu) {
        dmVatTuService.delete(maVatTu);
        return ResponseEntity.ok(null);
    }

    @GetMapping
    public ResponseEntity<List<DMVatTu>> baoCao() {
        return ResponseEntity.ok(dmVatTuService.getAll());
    }
}
