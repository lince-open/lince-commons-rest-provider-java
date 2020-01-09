# lince-commons-rest-provider-java

![](https://github.com/lince-open/lince-commons-rest-provider-java/workflows/Java%20CI/badge.svg)
[![Known Vulnerabilities](https://snyk.io/test/github/lince-open/lince-commons-rest-provider-java/badge.svg)](https://snyk.io/test/github/pedrozatta/lince-commons-rest-provider-java)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=lince-open_lince-commons-rest-provider-java&metric=coverage)](https://sonarcloud.io/dashboard?id=lince-open_lince-commons-rest-provider-java)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=lince-open_lince-commons-rest-provider-java&metric=alert_status)](https://sonarcloud.io/dashboard?id=lince-open_lince-commons-rest-provider-java)

#How to Use

add maven dependency

        <dependency>
            <groupId>work.lince</groupId>
            <artifactId>lince-commons-rest-provider</artifactId>
            <version>0.0.1-SNAPSHOT</version>
        </dependency>
        

add ResponseHeaderFilter to ServletComponentScan on SpringApplication.java 

    @SpringBootApplication(scanBasePackages = {"work.lince"})
    @ServletComponentScan(basePackageClasses = {ResponseHeaderFilter.class})
    public class Application {
    
        public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
        }
    
    }
