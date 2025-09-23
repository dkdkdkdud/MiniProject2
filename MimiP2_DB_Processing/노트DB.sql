/*

-- 일련번호관리객체
create sequence seq_note_n_idx

--note 테이블
create table note
(
	n_idx		int,							-- 일련번호
	n_regdate	date,							-- 등록일자
	n_vomit		NUMBER(1) DEFAULT 0 NOT NULL, 	-- 구토 증상
	n_lethargy  number(1) default 0 not null,	-- 무기력
	n_defecation number(1) default 0 not null, 	-- 배변 이상
	n_appetite	number(1) default 0 not null,	-- 식욕 변화
	n_breath	number(1) default 0 not null,	-- 호흡
	n_sleep		number(1) default 0 not null,	-- 수면 패턴 변화
	n_walk		number(1) default 0 not null,	-- 산책
	n_memo	 	clob not null,					-- 증상에 대한 메모(최대4GB저장가능한 대용량 데이터)
	pet_idx		int								-- FK
)


--또는 note 테이블
create table note1
(
	n_idx		int,							-- 일련번호
	n_regdate	date,							-- 등록일자
	n_case		varchar2(200) not null,			-- '구토','무기력','배변','식욕','호흡','수면패턴'
	n_walk		number(1) default 0 not null,	-- 산책
	n_memo	 	clob not null,					-- 증상에 대한 메모(최대4GB저장가능한 대용량 데이터)
	pet_idx		int								-- FK
)

-- 기본키 설정
alter table note
	add constraint pk_note_n_idx primary key(n_idx);

-- 외래키 설정
alter table note
    add constraint fk_note_pet_idx foreign key(pet_idx)
                                    references pet(pet_idx) ;

select * from note

*/