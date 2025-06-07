# 문방구 (문화재 탐방 친구)
### ✏️"초등학생과 교사를 위한 교육용 문화재 탐방 어플"

<p align="center">
  <img src="./images/MBG-Main.png" width="45%">
  <img src="./images/TMBG-Main.png" width="45%">
</p>
<p align="center"><i>[앱 메인 화면] 학생용(왼쪽) / 교사용(오른쪽)</i></p>

## 1. 프로젝트 개요

<table>
  <tr>
    <th><b>앱 이름</b></th>
    <td>문방구</td>
  </tr>
  <tr>
    <th><b>프로젝트 목적</b></th>
    <td>초등학생과 교사의 현장학습 경험을 개선하는 교육용 앱</td>
  </tr>
  <tr>
    <th><b>주요 기능</b></th>
    <td>GPS 기반 미션, 안전수칙 퀴즈, 학생들의 활동 추적, 만족도조사 자동화</td>
  </tr>
  <tr>
    <th><b>개발 기간</b></th>
    <td>25.01.06 ~ 25.02.22 (7주)</td>
  </tr>
  <tr>
    <th><b>팀 구성</b></th>
    <td>6인 (FE 3, BE 3)</td>
  </tr>
  <tr>
    <th><b>담당 역할</b></th>
    <td>백엔드 API 개발 + 인프라 구축</td>
  </tr>
</table>

<table>
  <tr>
    <th>분야</th>
    <th>기술</th>
  </tr>
  <tr>
    <td><code>Front-end</code></td>
    <td>
      <img src="https://img.shields.io/badge/kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white">
      <img src="https://img.shields.io/badge/android%20studio-3DDC84?style=for-the-badge&logo=android%20studio&logoColor=white">
      <img src="https://img.shields.io/badge/retrofit2-3E4348?style=for-the-badge&logo=square&logoColor=white">
      <img src="https://img.shields.io/badge/okhttp3-3E4348?style=for-the-badge&logo=square&logoColor=white">
      <img src="https://img.shields.io/badge/glide-3E4348?style=for-the-badge&logo=square&logoColor=white">
      <img src="https://img.shields.io/badge/hilt-3E4348?style=for-the-badge&logo=square&logoColor=white">
    </td>
  </tr>
  <tr>
    <td><code>Back-end</code></td>
    <td>
      <img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white">
      <img src="https://img.shields.io/badge/spring%20boot-6DB33F?style=for-the-badge&logo=spring%20boot&logoColor=white">
      <img src="https://img.shields.io/badge/spring%20security-6DB33F?style=for-the-badge&logo=spring%20security&logoColor=white">
      <img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white">
      <img src="https://img.shields.io/badge/firebase-FFCA28?style=for-the-badge&logo=firebase&logoColor=black">
      <img src="https://img.shields.io/badge/jwt-000000?style=for-the-badge&logo=json%20web%20tokens&logoColor=white">
    </td>
  </tr>
  <tr>
    <td><code>Infra</code></td>
    <td>
      <img src="https://img.shields.io/badge/amazon%20ec2-FF9900?style=for-the-badge&logo=amazon%20ec2&logoColor=white">
      <img src="https://img.shields.io/badge/amazon%20s3-569A31?style=for-the-badge&logo=amazon%20s3&logoColor=white">
      <img src="https://img.shields.io/badge/jenkins-D24939?style=for-the-badge&logo=jenkins&logoColor=white">
      <img src="https://img.shields.io/badge/docker-2496ED?style=for-the-badge&logo=docker&logoColor=white">
      <img src="https://img.shields.io/badge/nginx-009639?style=for-the-badge&logo=nginx&logoColor=white">
    </td>
  </tr>
</table>

<br>

## 2. 프로젝트 소개

문방구는 초등학생과 교사를 위한 <b>교육용 문화재 탐방 어플리케이션</b>입니다. 학생은 GPS 기반 퀴즈와 미션을 수행하며 문화재를 즐겁게 학습하고, 교사는 실시간으로 학생들의 위치와 활동 상태를 파악하며 체계적인 현장학습 관리가 가능합니다.

### 프로젝트의 필요성

저희는 <b>실제 현직 초등교사</b>와의 인터뷰를 통해 현장체험학습에서 겪는 다양한 문제점을 파악했습니다. 교사들은 다음과 같은 어려움을 공통적으로 언급했습니다.

<table>
  <thead>
    <tr>
      <th>❌ 문제</th>
      <th>내용</th>
      <th>✅ 해결 방식</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><b>공지 및 연락의 어려움</b></td>
      <td>학생들에게 실시간으로 전달사항을 알리기 어렵다.</td>
      <td>공지 및 알림 기능</td>
    </tr>
    <tr>
      <td><b>안전 교육 및 통제 문제</b></td>
      <td>출발 전에 매번 안전 교육을 실시해도, 이를 듣지 않는 학생들이 많다.</td>
      <td>안전수칙 O/X 퀴즈</td>
    </tr>
    <tr>
      <td><b>팀별 활동 관리 미비</b></td>
      <td>팀별로 나눠 움직이는 경우, 활동 관리가 어렵다.</td>
      <td>조별 미션 진행 현황 파악 기능</td>
    </tr>
    <tr>
      <td><b>학생들의 학습 흥미 저하</b></td>
      <td>단순 관람 중심이라 교육적 몰입도가 낮다.</td>
      <td>문화재 및 일화 카드 수집 기능</td>
    </tr>
    <tr>
      <td><b>교사의 문화재 지식 부족</b></td>
      <td>교사 입장에서도 설명할 지식이나 자료가 부족한 경우가 많다.</td>
      <td>문화재 백과사전 기능</td>
    </tr>
  </tbody>
</table>

문방구는 단순히 학습 도구를 넘어, <b>학생의 참여도와 교사의 관리 효율을 동시에 높이는 실용적인 교육 솔루션</b>을 목표로 합니다.

<br>

## 3. 기능 소개
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
