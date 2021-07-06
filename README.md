# spring-boot-webflux
spring-boot-webflu

기본예제를 만들어봅시다.

단순 기본 예제입니다~~~

해당 bean 생성으로 파이브라인을 만들어줍니다.


\'
@Bean
public RouterFunction<ServerResponse> getInitalizedRoute(WebFluxHandler handler) {
return RouterFunctions
.route(RequestPredicates.GET("/api/user")
.and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), handler::getUser)
.andRoute(RequestPredicates.POST("/api/user")
.and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), handler::addUser)
.andRoute(RequestPredicates.PUT("/api/user")
.and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), handler::updateUser)
.andRoute(RequestPredicates.DELETE("/api/user")
.and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), handler::deleteUser);
}
  
'\
