<h1>📺 Network Product System</h1>

---

## 1. 개요
네트워크 기반의 디지털 제작 체계로 미디어 자산 관리 시스템( Media Asset Management System )을 통해 미디어의 수집부터 변환, 저장, 관리까지의 전체 워크플로우를 구현하는 시스템입니다.<br> 
이 시스템은 미디어의 메타데이터 처리부터 보관 및 활용까지의 모든 과정을 효율적으로 진행합니다.

## 2. 서비스 구성

1. **미디어 자산 관리 시스템( media-asset-management )** : 
- 미디어의 수집부터 변환, 저장, 관리까지의 전체 워크플로우를 구현하는 시스템입니다.
2. **미디어 센터( media-center )** : 
- 이 서비스는 영상 컨버팅을 위한 서비스로 FFmpeg'를 사용하여 다양한 형식과 포맷의 미디어를 변환하여 필요한 형태로 가공합니다.
3. **adobe-nps-panel** : 
- 어도비 CEP(Common Extensibility Platform ) 프레임워크를 사용하여 개발된 웹 플러그인입니다.<br>
이를 통해 클라이언트는 어도비 소프트웨어 내에서 관리된 미디어 자산을 임포트하여 영상을 편집할 수 있습니다.

## 3. 프로젝트 기술 스택
![image](https://github.com/solarpark7346/media-asset-management/assets/61046271/c9d26b77-8085-46f0-bcfd-8037ad3f5a38)

## 4. 어플리케이션 상세 기술
다음은 프로젝트의 어플리케이션 상세 기술입니다:

1. RestApi: RESTful 아키텍처를 기반으로 한 API를 개발하여 클라이언트와의 통신을 처리합니다.
2. 세션 처리: 사용자 세션 관리를 위해 세션 처리 기능을 구현하였습니다.
3. 인사 관리: 인사 정보를 관리하기 위한 기능을 구현하였습니다.
4. 미디어 자산 관리: 미디어 자산의 업로드, 메타데이터 처리 등을 위한 기능을 구현하였습니다.
5. MSA (Microservices Architecture): MSA 아키텍처 패턴을 적용하여 각 기능을 독립적으로 개발하고 배포할 수 있도록 설계하였습니다.
6. 트랜스코딩: 다양한 형식과 포맷의 미디어 파일을 변환하는 기능을 구현하였습니다.
7. 실시간 트랜스코딩 확인: 웹 소켓을 활용하여 실시간으로 트랜스코딩 작업의 진행 상황을 확인할 수 있는 기능을 구현하였습니다.
8. 글로벌 예외 처리: 예외 상황을 전역적으로 처리하기 위한 글로벌 예외 처리 기능을 구현하였습니다.
9. 페이징: 대량의 데이터를 효율적으로 처리하기 위해 페이징 기능을 구현하였습니다.

## 5. DB 구조
<img width="1502" alt="image" src="https://github.com/solarpark7346/media-asset-management/assets/61046271/8d6d91e0-9c1a-4ab9-9236-ffd21b7ceb63">



