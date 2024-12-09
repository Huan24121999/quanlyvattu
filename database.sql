create schema quan_ly_vat_tu;
use
quan_ly_vat_tu;
create table DM_NUOC
(
    MaNuoc  int auto_increment primary key,
    TenNuoc varchar(25) not null
);

create table DM_NHACC
(
    MaNCC  int auto_increment primary key,
    TenNCC varchar(25) not null
);

create table DM_Vattu
(
    MaVT   varchar(5) primary key,
    MaKKS  varchar(25),
    TenVT  varchar(50) not null,
    DVTinh varchar(25) not null,
    MaNuoc int references DM_NUOC (MaNuoc),
    MaNCC  int references DM_NHACC (MaNCC)
);