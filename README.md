# FinalProject

![자취 Script (3)](https://github.com/user-attachments/assets/c525680d-acbc-4f3e-8987-863fe4631902)

# 자취하우스

## 팀 소개

![3](https://github.com/user-attachments/assets/850e7379-d790-4417-a5ce-320cf845ddde)


## 팀원 소개

![14](https://github.com/user-attachments/assets/ce63e8b8-6bbe-4853-a367-c2727fbd15cd)

## 기획의도

![6](https://github.com/user-attachments/assets/51257e2b-2d35-4408-9954-967c6df39597)


## 차별성

![13](https://github.com/user-attachments/assets/44a69ddf-f0e9-4464-b7e5-ff3cc2fe9643)


## 개발일정

[53.pdf](https://github.com/user-attachments/files/19997240/53.pdf)


## 프로젝트 개발환경

- DB는 오라클 11g XE 버전을 이용하였습니다.
- 프론트엔드 & 백엔드 개발은 Spring Boot sts4, Visual Studio를 사용했습니다.

## 프로젝트 실행 방법

1. 오라클 11g를 설치한 후에 application.yml 에 있는

```
spring.datasource.username
```
```
spring.datasource.password
```

를 참고해서 계정을 만듭니다. <br><br>
이때
```
spring.datasource.url
```
을 확인해서 spring.datasource.url 을 변경한 후에 거기에 계정을 만드는 걸로 합니다.<br><br>
2. 그 계정에 RESOURCE, CONNECT 권한을 부여합니다. <br>
3. [CREATE SQL](./GNTOUR_CREATE.sql) 를 참고해서 테이블을 구성합니다.
4. [INSERT SQL](./INSERT_TRAVEL_INFO.sql) 를 참고해서 데이터를 구성합니다.
5. 환경변수를 다음과 같이 설정합니다.
```
GANGNEUNG_UPLOAD_FOLDER_PATH: [업로드할 폴더 경로] +"/"
EMAIL_APP_ID: [GMAIL 계정]
EMAIL_APP_PW: [GMAIL APP PASSWORD]
```

6. 그런 다음 Intellij 에서 실행을 합니다.

## 기술 스택

![HTML](https://img.shields.io/badge/html5-E34F26?style=for-the-badge&logo=html5&logoColor=white)
![CSS](https://img.shields.io/badge/css-1572B6?style=for-the-badge&logo=css3&logoColor=white)
![JavaScript](https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)
<br>
![Tomcat](https://img.shields.io/badge/apache%20tomcat-F8DC75?style=for-the-badge&logo=apache%20tomcat&logoColor=black)
![GitHub](https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white)
<br>
![Spring Boot](https://img.shields.io/badge/spring%20boot-6DB33F?style=for-the-badge&logo=spring%20boot&logoColor=white)
![Oracle](https://img.shields.io/badge/oracle-F80000?style=for-the-badge&logo=oracle&logoColor=white)
![Java](https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white)

## 프로젝트 후기

이번 프로젝트에서는 요구사항 분석 및 역할 분담 단계에서의 커뮤니케이션, 그리고 프론트엔드와 백엔드 기능 간의 유기적인 연동 작업을 통해 협업의 중요성과 실무적인 개발 프로세스를 몸소 체득할 수 있었습니다. 또한, 구현 과정에서 예외 처리나 사용자 경험(UX)을 고려한 화면 설계 등 그동안 간과했던 세부적인 요소의 중요성을 깨닫고 이를 보완해가며 프로젝트 완성도를 높일 수 있었습니다.
물론 아직도 코드의 구조적인 설계나 작업 일정 관리와 같은 부분에서는 부족함을 느꼈고, 특히 예상치 못한 오류나 병합 이슈에 대응하는 능력은 더 보완해야겠다는 생각이 들었습니다.
또한, 이번 프로젝트를 통해 개발자로서 한 단계 더 성장할 수 있었으며, 유사한 프로젝트를 다시 수행하게 된다면 이번보다 훨씬 더 나은 결과를 낼 수 있다는 자신감도 얻게 되었습니다. 

## 주요기능

### 회원간 중고거래 기능

|기능명|상세|
|--|--|
|중고거래 물품 목록페이지(회원)|중고물품을 볼 수 있는 목록페이지로서 중고물품에 대한 이미지와 함께 그에 대한 가격 , 조회수, 물품에 거래 상태에 대한 정보를 확인할 수 있으며 최신 등록순으로 보여집니다.  회원인 경우 중고물품판매글을 작성을 할 수 있습니다.|
 |중고거래 물품 목록페이지(비회원)|중고물품을 볼 수 있는 목록페이지로서 중고물품에 대한 이미지와 함께 그에 대한 가격 , 조회수, 물품에 거래 상태에 대한 정보를 확인할 수 있으며 최신 등록순으로 보여집니다. |
 |중고거래 물품 상세페이지(회원)|중고물품에 대한 자세한 정보를 볼 수 있는 상세페이지로서 중고물품에 대한 가격, 상품 이미지, 상세내용, 작성일, 거래상태 등에 대한 정보를 얻을수 있으며 글을 쓴 작성자는 거래상태, 수정, 삭제 등을 할 수 있으며 다른 사람과의 1대1 채팅도 가능하다. |
 |중고거래 물품 상세페이지(비회원)|중고물품에 대한 자세한 정보를 볼 수 있는 상세페이지로서 중고물품에 대한 가격, 상품 이미지, 상세내용, 작성일, 거래상태 등에 대한 정보를 얻을 수 있습니다.|
 |중고거래 물품 등록|로그인을 한 자취생만이 중고거래 물품을 등록하는 페이지이다. 물품을 등록시에는 물품에 대한 사진과 그에 해당하는 물품 정보를 작성해주어야 한다.|
 |중고거래 물품 수정|자신이 작성한 글을 수정할 수 있습니다. 물품명, 가격,  상세내용,  첨부파일을 수정 가능하다.|
 |중고거래 물품 삭제|자신이 작성한 글을 삭제할 수 있습니다. 삭제시에 작성한 글은 작성자와 다른 사람에게 보이지 않습니다.|
 |중고거래 물품 조회(검색)|중고물품은 물품명, 작성자로 검색할 수 있고, 검색결과에 해당하는 물품이 없을시에 검색 결과가 없다고 표시되며 검색시엔 중고물품들이 조회순으로 보여지며 작성자로 검색 시 작성자의 중고물품이 조회순으로 보여진다.|
 |중고거래 물품 판매여부|중고물품을 올렸을시 작성자만이 거래상태(판매중, 거래완료)를 버튼을 클릭함으로써 변경시킬 수 있다|
 |중고거래 1대1 실시간 채팅 기능(구매자 - 판매자)|로그인을 한 상태에서만 이용 가능하고, 중고물품을 거래하는 구매자와 판매자가 채팅 기능을 이용하여 실시간으로 서로 소통을 할 수 있다.|


## 화면 구현

### 중고거래게시판

### 중고거래게시판 목록(회원)
![중고거래게시판 목록(회원)](https://github.com/user-attachments/assets/a8e6cebe-0ea1-43bb-a449-a075d3305bbc)
- 중고물품을 볼 수 있는 목록페이지로서 중고물품에 대한 이미지와 함께 그에 대한 가격 , 조회수, 물품에 거래 상태에 대한 정보를 확인할 수 있으며 최신 등록순으로 보여지며 회원인 경우 중고물품판매글을 작성을 할 수 있다.
  
### 중고거래게시판 목록(비회원)
![중고거래게시판 목록페이지(비회원)](https://github.com/user-attachments/assets/1b0bdc83-e107-4991-bcb8-01cd1b27c157)
- 중고물품을 볼 수 있는 목록페이지로서 중고물품에 대한 이미지와 함께 그에 대한 가격 , 조회수, 물품에 거래 상태에 대한 정보를 확인할 수 있으며 최신 등록순으로 보여진다. 

### 중고거래게시판 상세(회원)
![중고거래게시판 상세(회원)](https://github.com/user-attachments/assets/1b49ae6f-970b-4f93-993d-a1100dafb987)
- 중고물품에 대한 자세한 정보를 볼 수 있는 상세페이지로서 중고물품에 대한 가격, 상품 이미지, 상세내용, 작성일, 거래상태 등에 대한 정보를 얻을수 있으며 글을 쓴 작성자는 거래상태, 수정, 삭제 등을 할 수 있으며 다른 사람과의 1대1 채팅도 가능하다. 

### 중고거래게시판 상세(비회원)
![중고거래게시판 상세(비회원)](https://github.com/user-attachments/assets/d34f888e-ad0b-437c-bd39-a60f9dc39e18)
- 중고물품에 대한 자세한 정보를 볼 수 있는 상세페이지로서 중고물품에 대한 가격, 상품 이미지, 상세내용, 작성일, 거래상태 등에 대한 정보를 얻을 수 있다.

### 중고거래게시판 등록
![중고거래게시판 등록](https://github.com/user-attachments/assets/a37dfcc0-47a5-435b-9097-882d5445b37a)
- 로그인을 한 자취생만이 중고거래 물품을 등록하는 페이지이다. 물품을 등록시에는 물품에 대한 사진과 그에 해당하는 물품 정보를 작성해주어야 한다.

### 중고거래게시판 수정
![중고거래게시판 수정](https://github.com/user-attachments/assets/a0541e9e-9e22-4ec0-a1be-3e564a9eb44e)
- 자신이 작성한 글을 수정할 수 있다. 물품명, 가격,  상세내용,  첨부파일을 수정 가능하다.

### 중고거래게시판 삭제
![중고거래게시판 삭제1](https://github.com/user-attachments/assets/b4df9ef1-7633-4d93-b8ec-36273bc08f0f)
![중고거래게시판 삭제2](https://github.com/user-attachments/assets/3d0d9f71-41fd-4dfe-861c-049b1af1e268)
![중고거래게시판 삭제3](https://github.com/user-attachments/assets/8bb1e490-ee32-4207-997c-962f76878fdc)
- 자신이 작성한 글을 삭제할 수 있다. 삭제시에 작성한 글은 작성자와 다른 사람에게 보이지 않는다.

### 중고거래게시판 검색(조회)
![중고거래게시판 검색(조회)](https://github.com/user-attachments/assets/fed1d944-1e1d-468d-90e3-4ec416f4a1fc)
![중고거래게시판 검색(조회)2](https://github.com/user-attachments/assets/687525bb-be4b-43b1-b348-f388ad0f79e1)
- 중고물품은 물품명, 작성자로 검색할 수 있고, 검색결과에 해당하는 물품이 없을시에 검색 결과가 없다고 표시되며 검색시엔 중고물품들이 조회순으로 보여지며 작성자로 검색 시 작성자의 중고물품이 조회순으로 보여진다.

### 중고거래게시판 판매여부
![중고거래게시판 검색(조회)](https://github.com/user-attachments/assets/def42a16-9e76-4c86-b3f9-0152324e571f)
![중고거래게시판 판매여부2](https://github.com/user-attachments/assets/15b3892c-0fd9-4ddb-a40e-adf2fa0743af)
![중고거래게시판 판매여부3](https://github.com/user-attachments/assets/80b46bf8-920c-4575-9a45-999987f67933)
- 중고물품을 올렸을시 글을 쓴 작성자만이 거래상태(판매중, 거래완료)를 버튼을 클릭함으로써 변경시킬 수 있다.

### 중고거래 1:1 채팅
![중고거래게시판 채팅페이지](https://github.com/user-attachments/assets/3ce4950e-4da6-490f-aae0-597cededdf73)
- 로그인을 한 상태인 자취생인 회원들만 이용 가능하고, 중고물품을 거래하는 구매자와 판매자가 채팅 기능을 이용하여 실시간으로 서로 소통을 할 수 있다.


## 프로젝트 산출 문서

- [기획보고서](https://drive.google.com/file/d/16_4R5AM1VDHC9rvQ0wilB0FZz4RwVaSl/view?usp=sharing)
- [요구사항기술서](https://docs.google.com/document/d/1FUEcoi6dF-K0HsaCJfMYB03EmBvbZR0znCKo40GD8V8/edit?usp=sharing)
- [요구사항정의서](https://drive.google.com/file/d/1vOZDQ4FNqnWm8kT_Q9z3pK8zo1VJS4Ld/view?usp=sharing)
- [요구사항리스트](https://drive.google.com/file/d/1SUoHAJdU4y4Sbufe8TjgWsJikeI1V16z/view?usp=sharing)
- [유스케이스](https://drive.google.com/file/d/184R74Td28Uw_YiSExECOuwf3V0n33flK/view?usp=sharing)
- [플로우차트](https://drive.google.com/file/d/1UhmdB1Xq8MXYGoNSmCSnj7LLDC7lmvEx/view?usp=sharing)
- [와이어프레임](https://drive.google.com/file/d/1UoBqSy-Q0kq8RrN5h_TleaWVrIjZboAX/view?usp=sharing)
- [DB설계](https://drive.google.com/file/d/1oTJyCaArGMo1ZILLOEU6UfIagveIRwmE/view?usp=sharing)
- [테이블정의서](https://drive.google.com/file/d/1oTJyCaArGMo1ZILLOEU6UfIagveIRwmE/view?usp=sharing)
- [클래스다이어그램](https://drive.google.com/file/d/1TM9ciPQ9pR1s3qRJn5023LDABb8SMrsW/view?usp=sharing)
- [시퀀스다이어그램](https://drive.google.com/file/d/1G6MZ_YERyN8FTbFmLypHusMGx74oFHLf/view?usp=sharing)
- [최종보고서](https://drive.google.com/file/d/1oOsWMHeT8A_SoYgZ_P-Rc4wgL3Cx02Qp/view?usp=sharing)
- [프로젝트 소스 DB](https://drive.google.com/file/d/1nxIlrn83LEpuOki1A6bZZBAY6IWZKpUR/view?usp=sharing)
- [시연영상](https://drive.google.com/file/d/1PIB3kV6DRV-8nHfGpEjWH0T9sBEq19Jo/view?usp=sharing)
