# 문방구 (문화재 탐방 친구)
### ✏️"초등학생과 교사를 위한 교육용 문화재 탐방 어플"

<p align="center">
  <img src="./images/MBG Main.png">
  <img src="./images/TMBG Main.png">
</p>
<p align="center"><i>[앱 메인 화면] 학생용(왼쪽) / 교사용(오른쪽)</i></p>

| 항목 | 내용 |
| --- | --- |
| <b>앱 이름</b> | 문방구 (문화재 탐방 친구) |
| <b>프로젝트 목적</b> | 초등학생과 교사의 현장학습 경험을 개선하는 교육용 앱 |
| <b>주요 기능</b> | GPS 기반 미션, 안전수칙 퀴즈, 학생들의 활동 추적, 만족도조사 자동화 |
| <b>개발 기간</b> | 25.01.06 ~ 25.02.22 (7주) |
| <b>팀 구성</b> | 6인 (FE 3, BE 3) |
| <b>담당 역할</b> | 백엔드 API 개발 + 인프라 구축 |


| 분야 | 기술 |
| --- | --- |
| `Front-end` | <img src="https://img.shields.io/badge/kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white"> <img src="https://img.shields.io/badge/android%20studio-3DDC84?style=for-the-badge&logo=android%20studio&logoColor=white"> <img src="https://img.shields.io/badge/retrofit2-3E4348?style=for-the-badge&logo=square&logoColor=white"> <img src="https://img.shields.io/badge/okhttp3-3E4348?style=for-the-badge&logo=square&logoColor=white"> <img src="https://img.shields.io/badge/glide-3E4348?style=for-the-badge&logo=square&logoColor=white"> <img src="https://img.shields.io/badge/hilt-3E4348?style=for-the-badge&logo=square&logoColor=white"> |
| `Back-end` | <img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"> <img src="https://img.shields.io/badge/spring%20boot-6DB33F?style=for-the-badge&logo=spring%20boot&logoColor=white"> <img src="https://img.shields.io/badge/spring%20security-6DB33F?style=for-the-badge&logo=spring%20security&logoColor=white"> <img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white"> <img src="https://img.shields.io/badge/firebase-FFCA28?style=for-the-badge&logo=firebase&logoColor=black"> <img src="https://img.shields.io/badge/jwt-000000?style=for-the-badge&logo=json%20web%20tokens&logoColor=white"> |
| `Infra` | <img src="https://img.shields.io/badge/amazon%20ec2-FF9900?style=for-the-badge&logo=amazon%20ec2&logoColor=white"> <img src="https://img.shields.io/badge/amazon%20s3-569A31?style=for-the-badge&logo=amazon%20s3&logoColor=white"> <img src="https://img.shields.io/badge/jenkins-D24939?style=for-the-badge&logo=jenkins&logoColor=white"> <img src="https://img.shields.io/badge/docker-2496ED?style=for-the-badge&logo=docker&logoColor=white"> <img src="https://img.shields.io/badge/nginx-009639?style=for-the-badge&logo=nginx&logoColor=white"> |

<br>

## 1. 프로젝트 소개

문방구는 초등학생과 교사를 위한 <b>교육용 문화재 탐방 어플리케이션</b>입니다.  
학생은 GPS 기반 퀴즈와 미션을 수행하며 문화재를 즐겁게 학습하고, 교사는 실시간으로 학생들의 위치와 활동 상태를 파악하며 체계적인 현장학습 관리가 가능합니다.

### 프로젝트의 필요성

저희는 <b>실제 현직 초등교사</b>와의 인터뷰를 통해 현장체험학습에서 겪는 다양한 문제점을 파악했습니다.  
교사들은 다음과 같은 어려움을 공통적으로 언급했습니다.

| ❌문제 | 내용 | ✅해결 방식 |
| --- | --- | --- |
| <b>공지 및 연락의 어려움</b> | 학생들에게 실시간으로 전달사항을 알리기 어렵다. | 공지 및 알림 기능 |
| <b>안전 교육 및 통제 문제</b> | 출발 전에 매번 안전 교육을 실시해도, 이를 듣지 않는 학생들이 많다. | 안전수칙 O/X 퀴즈 |
| <b>팀별 활동 관리 미비</b> | 팀별로 나눠 움직이는 경우, 활동 관리가 어렵다. | 조별 미션 진행 현황 파악 기능 |
| <b>학생들의 학습 흥미 저하</b> | 단순 관람 중심이라 교육적 몰입도가 낮다. | 문화재 및 일화 카드 수집 기능 |
| <b>교사의 문화재 지식 부족</b> | 교사 입장에서도 설명할 지식이나 자료가 부족한 경우가 많다. | 문화재 백과사전 기능 |  

문방구는 단순히 학습 도구를 넘어, <b>학생의 참여도와 교사의 관리 효율을 동시에 높이는 실용적인 교육 솔루션</b>을 목표로 합니다.

<br>

## 2. 기능 소개
### 학생용 앱(MBG)
#### 스플래시 화면 및 로그인 회원 가입 화면

<table>
  <tr>
    <td align="center"><b>회원가입</b></td>
    <td align="center"><b>로그인</b></td>
  </tr>
  <tr>
    <td><img src="./images/회원가입.gif" width="300"></td>
    <td><img src="./images/로그인.gif" width="300"></td>
  </tr>
</table>

#### 안전 수칙

<p align="center">
  <img src="./images/ox퀴즈.gif" width="300">
  <br>
  <b>회원가입 시 안전 수칙 퀴즈 진행</b>
</p>

#### 메인 화면

<table>
  <tr>
    <td align="center"><b>팀 참가</b></td>
    <td align="center"><b>알림 공지</b></td>
  </tr>
  <tr>
    <td><img src="./images/초대코드 입력.gif" width="300"></td>
    <td><img src="./images/일정알림.gif" width="300"></td>
  </tr>
  <tr>
    <td align="center"><b>공지 알림</b></td>
    <td align="center"><b>만족도 조사</b></td>
  </tr>
  <tr>
    <td><img src="./images/공지알림.gif" width="300"></td>
    <td><img src="./images/만족도조사 (1).gif" width="300"></td>
  </tr>
</table>

#### 지도 및 게임 화면

<table>
  <tr>
    <td align="center"><b>지도</b></td>
    <td align="center"><b>미션 - 주관식 퀴즈</b></td>
  </tr>
  <tr>
    <td><img src="./images/미션지도.png" width="300"></td>
    <td><img src="./images/미션.png" width="300"></td>
  </tr>
  <tr>
    <td align="center"><b>미션 - 객관식 퀴즈</b></td>
    <td align="center"><b>미션 - 인증샷</b></td>
  </tr>
  <tr>
    <td><img src="./images/미션(객관식).png" width="300"></td>
    <td><img src="./images/미션(인증샷).png" width="300"></td>
  </tr>
</table>

#### 도감 화면

<table>
  <tr>
    <td align="center"><b>수집 아이템 확인</b></td>
  </tr>
  <tr>
    <td><img src="./images/도감 페이지.gif" width="300"></td>
  </tr>
  <tr>
    <td align="center">본인이 수집한 아이템을 문화재, 일화 별로 확인 가능함</td>
  </tr>
</table>

#### 꾸미 백과

<table>
  <tr>
    <td align="center"><b>풀이 기록 확인</b></td>
  </tr>
  <tr>
    <td><img src="./images/꾸미백과.gif" width="300"></td>
  </tr>
  <tr>
    <td align="center">본인이 풀었던 문제에 해당하는 문화재에 대한 자세한 설명 조회 가능</td>
  </tr>
</table>

### TMBG

#### 팀 관리

<table>
  <tr>
    <td align="center"><b>팀 생성</b></td>
    <td align="center"><b>팀 조회</b></td>
  </tr>
  <tr>
    <td><img src="./images/팀생성.gif" width="300"></td>
    <td><img src="./images/모자이크.gif" width="300"></td>
  </tr>
  <tr>
    <td align="center">현장 체험 학습을 진행할 팀 생성</td>
    <td align="center">팀 상세 보기로, 조 별로 조회가 가능하고 인원과 미션(인증샷) 진행률, 인증샷 조회 가능<br>현장체험 종료 시 만족도 조사 알림 전송</td>
  </tr>
</table>

#### 전체 공지

<table>
  <tr>
    <td align="center"><b>공지 생성</b></td>
  </tr>
  <tr>
    <td><img src="./images/공지.png" width="300"></td>
  </tr>
  <tr>
    <td align="center">공지 생성 및 이전에 생성했던 공지 조회 가능</td>
  </tr>
</table>

#### 일정 관리

<table>
  <tr>
    <td align="center"><b>일정 생성</b></td>
    <td align="center"><b>일정 조회</b></td>
  </tr>
  <tr>
    <td><img src="./images/일정생성.png" width="300"></td>
    <td><img src="./images/일정조회.png" width="300"></td>
  </tr>
  <tr>
    <td align="center">일정 생성 일정은 시작 10분전에 학생들에게 알림 전송</td>
    <td align="center">일정 조회 및 삭제</td>
  </tr>
</table>

#### 보고서 관리

<table>
  <tr>
    <td align="center"><b>보고서 PDF 작성</b></td>
  </tr>
  <tr>
    <td><img src="./images/보고서.gif" width="300"></td>
  </tr>
  <tr>
    <td align="center">만족도 조사를 완료한 학생이 표시 되고, 모든 학생이 완료하면 보고서 작성<br>PDF로 내보내기 클릭 시 체험학습 종료</td>
  </tr>
</table>

### 기술 스택

<div align="center">

#### 🏗️ Infrastructure

<img src="https://img.shields.io/badge/jenkins-D24939?style=for-the-badge&logo=jenkins&logoColor=white">
<img src="https://img.shields.io/badge/amazon%20s3-569A31?style=for-the-badge&logo=amazon%20s3&logoColor=white">
<img src="https://img.shields.io/badge/amazon%20ec2-FF9900?style=for-the-badge&logo=amazon%20ec2&logoColor=white">
<img src="https://img.shields.io/badge/docker-2496ED?style=for-the-badge&logo=docker&logoColor=white">
<img src="https://img.shields.io/badge/nginx-009639?style=for-the-badge&logo=nginx&logoColor=white">

#### 📱 Client

<img src="https://img.shields.io/badge/kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white">
<img src="https://img.shields.io/badge/android%20studio-3DDC84?style=for-the-badge&logo=android%20studio&logoColor=white">
<img src="https://img.shields.io/badge/retrofit2-3E4348?style=for-the-badge&logo=square&logoColor=white">
<img src="https://img.shields.io/badge/okhttp3-3E4348?style=for-the-badge&logo=square&logoColor=white">
<img src="https://img.shields.io/badge/glide-3E4348?style=for-the-badge&logo=square&logoColor=white">
<img src="https://img.shields.io/badge/hilt-3E4348?style=for-the-badge&logo=square&logoColor=white">

#### 💻 Server

<img src="https://img.shields.io/badge/spring%20boot-6DB33F?style=for-the-badge&logo=spring%20boot&logoColor=white">
<img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white">
<img src="https://img.shields.io/badge/firebase-FFCA28?style=for-the-badge&logo=firebase&logoColor=black">
<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white">
<img src="https://img.shields.io/badge/jwt-000000?style=for-the-badge&logo=json%20web%20tokens&logoColor=white">
<img src="https://img.shields.io/badge/spring%20security-6DB33F?style=for-the-badge&logo=spring%20security&logoColor=white">

</div>

## 3. 기대효과

### 3-1. 학생

#### 가. 교육적 효과 증대

- **학습의 흥미 유발**  
  게이미피케이션을 활용해 학생들이 재미있게 학습하며 문화재에 대한 관심을 자연스럽게 유도.
- **현장 체험 학습의 효율성 강화**  
  위치 기반 퀴즈 및 도감을 통해 방문한 문화재와 관련된 정보를 깊이 학습할 수 있는 기회 제공.
- **교과 내용과의 연계성 강화**  
  문제와 도감 콘텐츠를 교과 과정에 맞춰 설계하여 학업 성취도를 높임.
- **지속 가능한 학습 환경 조성**  
  학습 후에도 도감 및 리워드 시스템을 통해 지속적인 학습 동기 부여.

#### 나. 참여도와 협력 능력 향상

- **팀 기반 활동**  
  팀 랭킹 시스템, 릴레이 퀴즈 등을 통해 학생들 간 협력 및 소통을 장려.
- **협력과 참여의 증진 (소외 학생 고려)**  
  팀 기반 활동과 협력을 유도하여 소외되는 학생 없이 모두가 참여할 수 있는 환경 조성.  
  개인 맞춤형 난이도 조정과 힌트 기능을 통해 학습 능력에 차이가 있는 학생들도 자신감을 갖고 활동에 참여 가능.

#### 다. 문화재 관심 및 보존 인식 제고

- **문화재 탐방 촉진**  
  다양한 루트와 미션을 통해 학생들이 문화재에 대한 흥미를 느끼고 직접 방문하도록 유도.
- **문화재의 역사적 가치 재발견**  
  스토리라인 연결 및 도감 학습을 통해 학생들이 문화재의 역사적, 문화적 의미를 이해.

### 3-2. 교사(인솔자)

#### 가. 관리 효율성 증대

- **학생 안전 관리 강화**  
  실시간 학생별 진행도 파악을 통해 학생 동선을 철저히 관리하여 안전 관리를 강화할 수 있음.

#### 나. 현장학습 준비 부담 완화

- **편리한 현장 학습 관리**  
  코스 설정, 문제 난이도 조정, 반 내 팀 관리 등으로 활동을 사전에 효율적으로 계획하고 운영 가능.
- **보고서 자동화 지원**  
  현장학습 후 보고서를 자동 생성하여 사후 업무 부담 감소.

#### 다. 수업 효과 증대와 만족도 상승

- **학습의 의미 부여**  
  탐방 후 도감 완성과 리워드 제공으로 학생들에게 학습 동기를 지속적으로 부여
- **현장학습 만족도 향상**  
  재미있고 체계적인 학습 활동을 통해 학생과 학부모의 만족도를 높이며, 교사로서의 성과도 향상
- **팀 기반 활동 관리**  
  팀별 랭킹 및 점수 체계를 통해 협력 학습의 장을 제공하며, 팀워크 증진을 지원
- **학습과 재미의 균형**  
  게임적 요소와 교육적 목표가 조화를 이루어 학생들이 즐겁게 학습하도록 유도
