package vn.test.quanlyvattu.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "DM_Vattu")
public class DMVatTu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaVT", nullable = false)
    private String MaVT;

    @Column(name = "MaKkS")
    private String MaKkS;

    @Column(name = "TenVT", nullable = false)
    private String TenVT;

    @Column(name = "DVTinh", nullable = false)
    private String DVTinh;

    @Column(name = "MaNuoc", nullable = false)
    private String MaNuoc;

    @Column(name = "MaNCC", nullable = false)
    private String MaNCC;
}
