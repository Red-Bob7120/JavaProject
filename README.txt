JavaProject/                          // 프로젝트 최상위 폴더
 ├── app/                             // 안드로이드 앱 관련 모든 코드와 리소스가 들어가는 폴더
 │   ├── manifests/
 │   │    └── AndroidManifest.xml     // 액티비티 등록, 권한, 앱 설정을 정의하는 핵심 설정 파일
 │   │
 │   ├── java/
 │   │    └── com.example.javaproject/        // Java 코드(액티비티, 클래스 등) 실제 위치
 │   │          ├── MainActivity.java         // 앱 처음 실행되는 화면
 │   │          ├── LoginActivity.java        // 로그인 UI 및 로그인 동작 처리
 │   │          ├── ProfileActivity.java      // 로그인 후 사용자 프로필 화면
 │   │          │
 │   │          ├── model/                    // 데이터 구조, DTO 등을 보관하는 폴더
 │   │          │     └── User.java           // 사용자 정보 모델 (이름, 이메일 등)
 │   │          │
 │   │          └── util/                     // 공통 도구, Firebase 관련 헬퍼 클래스 폴더
 │   │                └── FirebaseAuthManager.java   // Firebase 로그인 담당 클래스
 │   │
 │   ├── res/                          // XML 레이아웃, 이미지, 문자열 등 리소스 모음
 │   │    ├── layout/
 │   │    │     ├── activity_main.xml        // MainActivity 화면 UI
 │   │    │     ├── activity_login.xml       // 로그인 화면 UI
 │   │    │     └── activity_profile.xml     // 프로필 화면 UI
 │   │    │
 │   │    ├── drawable/                       // 이미지/배경/shape 등의 그래픽 리소스
 │   │    │     ├── bg_profile_header.xml     // 프로필 상단 배경 shape
 │   │    │     ├── bg_button.xml             // 버튼 모양 커스텀 shape
 │   │    │     ├── ic_user_default.png       // 기본 프로필 이미지
 │   │    │     └── ic_google.png             // 구글 로그인 아이콘
 │   │    │
 │   │    ├── values/                         // 문자열, 테마, 색상 등 코드가 아닌 설정값들
 │   │    │     ├── colors.xml                // 앱 전체에서 사용하는 색 설정
 │   │    │     ├── strings.xml               // 문자열 리소스 (텍스트를 여기서 관리)
 │   │    │     └── themes.xml                // 앱 스타일/테마 정의
 │   │    │
 │   │    └── mipmap/                         // 앱 아이콘(런처 아이콘) 폴더
 │   │          ├── ic_launcher.png
 │   │          └── ic_launcher_round.png
 │   │
 │   └── build.gradle                         // 모듈(app) 단위 라이브러리, SDK 설정
 │
 ├── build.gradle (Project)                   // 프로젝트 전체 빌드 설정
 └── settings.gradle                           // 어떤 모듈을 포함하는지 정의
