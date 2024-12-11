# Statement of Work (SOW)

## Project Title:  
**UniCircle**: 웹 기반 서울시립대학교 동아리 통합 관리 및 커뮤니티 플랫폼

<br>

---

## Project Scope  
서울시립대학교 컴퓨터과학부 2024년 소프트웨어 공학 프로젝트로, **Software Development Life-Cycle**을 기반으로 **객체지향 소프트웨어공학 방법론**을 적용하여 **웹 기반 서울시립대학교 동아리 통합 관리 플랫폼**을 개발

<br>

---

## Project Values/Motivations  
현재 서울시립대학교 학생들이 동아리 정보를 접하거나 참여하는 데에는 다음과 같은 불편함이 존재합니다:

- **동아리 정보 접근성 부족**: 동아리 관련 정보나 모집 현황은 에브리타임(Everytime) 앱을 통해서만 간접적으로 파악할 수 있어, 새로운 동아리를 찾기 어렵고, 정보가 분산됨.  
- **공지·커뮤니케이션의 단편화**: 동아리별 공지나 소식은 카카오톡 단톡방, 입부 신청은 구글 폼 등 여러 외부 툴을 통해 처리되어 업무 부담 및 소통 효율성이 떨어짐.  

**UniCircle**는 이러한 문제를 해결하기 위해 하나의 웹 플랫폼에서 다음을 제공하며 가치와 필요성을 강조합니다:

- **통합된 정보 접근**: 모든 동아리의 정보를 UniCircle에서 쉽게 검색 가능 (#농구, #밴드 등 해시태그 활용)  
- **원스톱 솔루션**: 공지, 게시판, 입부 신청 등 동아리 운영에 필요한 기능을 한 곳에서 처리할 수 있어 효율성 극대화  
- **사용자 편의성 향상**: 번거롭게 여러 앱/서비스를 왔다갔다 할 필요 없이 UniCircle 한 곳에서 모든 과정을 관리 및 참여 가능

<br>

---

## Project Duration  
**2024년 2학기**

<br>

---

## Project Description (Key Features)  
- **회원 관리**: 이메일 회원가입, 로그인, 비밀번호 재설정, JWT 인증 기반 세션 유지  
- **동아리 관리**: 동아리 개설, 소개 페이지 관리, 입부 신청서 작성/관리  
- **동아리 회원 관리**: 입부 신청 처리(수락/거절), 동아리원 목록 관리 및 정보 업데이트  
- **게시판 관리**: 게시글/댓글 CRUD, 공개 범위 설정, 해시태그를 통한 게시글 분류  
- **해시태그 기반 검색**: 관심 분야(#농구, #밴드 등) 해시태그를 통한 동아리 및 게시글 검색

<br>

---

## Expected Deliverables  
- **요구사항 분석 명세서**: 사용자 요구사항 정리 및 기능 정의  
- **아키텍쳐 및 설계 문서(UML, UI Design)**: 시스템 구조, 데이터 흐름, UI 화면 설계 산출물  
- **Coding Standard**: 코드 컨벤션 및 스타일 가이드 문서  
- **Source Code**: GitHub Repository를 통한 프론트엔드(Next.js) 및 백엔드(Spring) 소스 코드  
- **테스트 케이스 및 결과**: 단위/통합 테스트 케이스, JUnit 결과 로그, 100% 성공률 달성 보고

<br>

---

## Project Constraints  
- **기술적 제약**: 웹 기반 우선 개발, 제한된 서버 리소스, 초기 성능 최적화 필요  
- **보안/프라이버시**: 개인정보 보호법 준수, JWT 기반 인증 적용  
- **일정 제약**: 2025년 겨울학기 종료 전 1차 릴리즈 완료  
- **비용 제약**: 제한된 예산 내에서 클라우드 및 DB 사용  
- **사용자 수 제약**: 초기 약 1,000명 규모의 사용자 대응

<br>

---

## Project Team Members

| Name           | Role                | GitHub                                                |
|----------------|---------------------|-------------------------------------------------------|
| 박세환(프론트엔드 팀장) | Frontend Developer  | [박세환](https://github.com/sehwan505)                |
| 배유찬         | Frontend Developer  | [배유찬](https://github.com/baeyc0510)                |
| 오승민         | Frontend Developer  | [오승민](https://github.com/seongminoh-dev)           |
| 주재원(백엔드 팀장)  | Backend Developer   | [주재원](https://github.com/jaewon-ju)                |
| 김동하         | Backend Developer   | [김동하](https://github.com/H4N9ER)                   |
| 김민회         | Backend Developer   | [김민회](https://github.com/LNemo)                    |

