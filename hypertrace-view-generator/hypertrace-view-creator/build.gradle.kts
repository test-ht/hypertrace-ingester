plugins {
  java
  application
  jacoco
  id("org.hypertrace.docker-java-application-plugin")
  id("org.hypertrace.docker-publish-plugin")
  id("org.hypertrace.jacoco-report-plugin")
}

application {
  mainClassName = "org.hypertrace.core.serviceframework.PlatformServiceLauncher"
}

tasks.test {
  useJUnitPlatform()
}

dependencies {
  implementation(project(":hypertrace-view-generator:hypertrace-view-generator-api"))
  implementation("org.hypertrace.core.viewcreator:view-creator-framework:0.1.16")
  constraints {
    implementation("com.google.guava:guava:30.0-jre") {
      because("https://snyk.io/vuln/SNYK-JAVA-COMGOOGLEGUAVA-1015415")
    }
    // to have calcite libs on the same version
    implementation("org.apache.calcite:calcite-babel:1.26.0") {
      because("https://snyk.io/vuln/SNYK-JAVA-ORGAPACHECALCITE-1038296")
    }
  }

  testImplementation("org.junit.jupiter:junit-jupiter:5.7.0")
  testImplementation("org.mockito:mockito-core:3.6.0")
}

description = "view creator for Pinot"
