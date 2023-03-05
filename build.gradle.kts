import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "3.0.4"
	id("io.spring.dependency-management") version "1.1.0"
	kotlin("plugin.spring") version "1.8.10"
	kotlin("plugin.jpa") version "1.8.10"
	kotlin("jvm") version "1.8.10"
	kotlin("plugin.allopen") version "1.8.10"
}

allOpen {
	annotations("javax.persistence.Entity")
	annotations("javax.persistence.MappedSuperclass")
}

group = "edu.kit.sport.floorball"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_18

repositories {
	mavenCentral()
}

val jacksonVersion: String by project
val springBootVersion: String by project
val hsqldbVersion: String by project
val postgresqlVersion: String by project


dependencies {
	implementation("org.hsqldb:hsqldb:$hsqldbVersion")
	implementation("org.postgresql:postgresql:$postgresqlVersion")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa:$springBootVersion")
	implementation("org.springframework.boot:spring-boot-starter-web:$springBootVersion")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin:$jacksonVersion")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.springframework.boot:spring-boot-starter-data-jdbc:$springBootVersion")

	developmentOnly("org.springframework.boot:spring-boot-devtools:$springBootVersion")
	testImplementation("org.springframework.boot:spring-boot-starter-test:$springBootVersion")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "18"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
