
# Prototypes Microservices : Service Registration and Service Discovery - Based on spring cloud and Neflix Eureka stack.

### References
	*[https://spring.io/guides/gs/service-registration-and-discovery/]
	*[https://github.com/spring-guides/gs-service-registration-and-discovery.git]

### Pre-requisites
| Dependency | Version |
| ------ | ------ |
| Java | 1.8 |
| Maven | 3.0.x > higher |
	
### Modules
	* Registry service module - <prototype-module-registry_service>
	* Registry client module - <prototype-module-registry_service>
	
### Maven goals

#### Create parent project
```sh
	$ mvn archetype:generate -DarchetypeGroupId=org.codehaus.mojo.archetypes -DarchetypeArtifactId=pom-root -DarchetypeVersion=RELEASE -DgroupId=prototype.module.registry -DartifactId=prototype-module-registry -Dversion=0.0.0.1-SNAPSHOT -DinteractiveMode=false
```

#### Create registry service sub-project
```sh		
$ mvn archetype:generate -DgroupId=prototype.module.registry -DartifactId=prototype-module-registry_server -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

#### Create registry service client sub-project
```sh	
$ mvn archetype:generate -DgroupId=prototype.module.registry -DartifactId=prototype-module-registry_client -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

#### Build project from parent
```sh	
$ cd prototype-module-registry && clear && mvn clean install -U 
```