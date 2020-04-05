
bootstrap.propertis - 
feign.hystrix.enabled=true #Enables Hystrix to be used with Feign
management.endpoints.web.exposure.include=hystrix.stream #Enables hystrix stream(Applicable to Spring Boot 2.X only)

@EnableEurekaClient - Registers the application as Eureka Client
@EnableFeignClients - Enables the application to use Feign
@EnableCircuitBreaker - Enables Circuit Breaker
@EnableHystrixDashboard - Enables Hystrix Dashboard

@FeignClient(value = "room-services", fallback = RoomServiceFallbackImpl.class) - value refers to service to call, fallback refers to the Fallback method in case of issue

Hystrix console url - http://localhost:8102/hystrix
Hystrix Monitor Stream - http://localhost:8102/actuator/hystrix.stream