package vn.test.quanlyvattu.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
public class DMVatTuCreateDTO {
    private String MaKkS;

    @NotBlank(message = "TenVT không được bỏ trống")
    private String TenVT;

    @NotBlank(message = "DVTinh không được bỏ trống")
    private String DVTinh;

    @NotBlank(message = "MaNuoc không được bỏ trống")
    private String MaNuoc;

    @NotBlank(message = "MaNCC không được bỏ trống")
    private String MaNCC;
}
