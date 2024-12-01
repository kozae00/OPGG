# 🏆 LOL-Build 프로젝트

## 🌟 프로젝트 개요
LOL-Build는 리그 오브 레전드(League of Legends) 플레이어들에게 **챔피언 빌드 가이드를 제공**하는 웹 애플리케이션입니다.  
사용자는 특정 챔피언의 **추천 빌드와 관련 정보**를 확인할 수 있으며, **React**와 **Spring Boot**를 활용하여 데이터를 제공하고 관리합니다.
 
---

## 🛠️ 기술 스택
| **구분**       | **기술**              |
|----------------|----------------------|
| **Frontend**   | React               |
| **Backend**    | Spring Boot         |
| **Database**   | H2 Database (개발용)|
| **API 통신**   | REST API            |
| **Build Tool** | Maven               |

---

## ✨ 주요 기능
### 🗂️ **챔피언 리스트 확인**
- 사용자는 모든 챔피언의 빌드 정보를 **리스트 형태**로 확인할 수 있습니다.

### 🛡️ **추천 빌드 표시**
- 각 챔피언의 **스킬 조합** 및 **아이템 빌드**를 직관적으로 제공합니다.

### 🛠️ **데이터 관리**
- 백엔드에서 **챔피언 정보를 추가 및 관리**할 수 있습니다.

---

## 🚀 설치 및 실행

### 🔧 백엔드 (Spring Boot):
1. Spring Boot 프로젝트 디렉토리로 이동
``` bash
cd backend
```

2. Maven을 사용하여 애플리케이션 실행
```bash
mvn spring-boot:run
```

### 프론트엔드 (React)
React 프로젝트 디렉토리로 이동
```bash
cd lol-build
```

의존성 설치 및 실행
```bash
npm install
npm start
```

## 프로젝트 구조
```
opgg/
├── backend/                # Spring Boot 백엔드
│   ├── src/main/java
│   ├── src/main/resources
│   ├── build/              # React 빌드 파일 복사 위치
│   └── pom.xml
├── lol-build/              # React 프론트엔드
│   ├── public/
│   ├── src/
│   └── package.json

```

## 📡 API 엔드포인트

| **Method**       | **Endpoint**        | **Description**     |
|----------------|----------------------|----------------|
| GET   | /api/champions       |모든 챔피언 정보 조회 |
| POST    | /api/champions       | 새로운 챔피언 추가 |
  



