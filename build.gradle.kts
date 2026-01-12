plugins {
    id("java")
    // 버전 관리 플러그인을 빼고 부트 버전만 명시합니다.
    id("org.springframework.boot") version "3.2.1"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // 스프링 부트 라이브러리 (버전을 직접 써줍니다)
    implementation("org.springframework.boot:spring-boot-starter-web:3.2.1")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf:3.2.1")

    // JRuby (루비 연동 도구)
    implementation("org.jruby:jruby-complete:9.4.5.0")

    testImplementation("org.springframework.boot:spring-boot-starter-test:3.2.1")
}

tasks.test {
    useJUnitPlatform()
}