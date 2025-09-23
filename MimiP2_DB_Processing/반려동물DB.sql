/*

-- 일련번호관리객체
create sequence seq_pet_pet_idx

--pet 테이블
create table pet
(
	pet_idx		int,					-- 일련번호
	pet_name 	varchar2(200) not null,	-- 반려동물 이름
	pet_type	varchar2(200) not null,	-- 반려동물 종류(ex 고양이,강아지,앵무새)
	pet_birth	date,					-- 반려동물 나이 및 생일 정보
	mem_idx		int						-- FK
)

-- 기본키 설정
alter table pet
	add constraint pk_pet_pet_idx primary key(pet_idx);

-- 외래키 설정
alter table pet
    add constraint fk_pet_mem_idx foreign key(mem_idx)
                                    references member(mem_idx) ;



select * from pet

*/