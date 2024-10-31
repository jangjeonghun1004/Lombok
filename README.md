# 롬북(Lombok)

    롬북(Lombok)은 getter/setter 같은 메서드를 어노테이션으로 대체하는 기능을 제공하는 라이브러리입니다.

# 롬북(Lombok) 설치

    롬북(Lombok)은 "dependency"를 추가하거나 인텔리제이(Intellij) -> "Marketplace"를 통해 추가할 수 있습니다.
    
    인텔리제이의 경우 룸북 설치 후 
    Setting -> [Build, Execution, Deployment] -> [Compiler] -> [Annotation Processors]
    "Enalble annotation processing" 체크를 해야합니다.

# 롬북(Lombok) 주요 어노테이션

    @Getter, @Setter
    클래스 필드에 대한 getter/setter 메서드를 생성합니다.

    @NoArgsConstructor: 기본 생성자를 생성합니다.
    @AllArgsConstructor: 모든 필드를 기준으로 생성자를 생성합니다.
    @RequiredArgConstructor: final 또는 @NotNull 필드를 기준으로 생성자를 생성합니다.
   
    @ToString
    toString() 메서드를 생성합니다.

    @EqualsAndHashCode(callSuper = false)
    equals: 두 객체의 내용이 같은지 동등성을 비교합니다.
    hashcode: 두 객체가 같은 객체인지 동일성을 비교합니다.(객체의 구성이 같은지를 판단)

    @Data
    @Getter, @Setter, @RequiredArgConstructor, @ToString,@EqualsAndHashCode 을 포함하는 어노테이션입니다.

    @Builder
    빌더(Builder) 패턴을 따르는 메서드를 생성합니다.

    @Builder.Default
    Builder의 기본 값을 설정합니다.
        @Builder
        public class SomeClass {
            @Builder.Default
            private String name = "james";
        }
