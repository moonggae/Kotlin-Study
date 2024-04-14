# Data classes

데이터 클래스는 주로 데이터를 다루는데 이용된다.

생성자를 통해 정의된 속성들은 컴파일러를 통해 아래 함수들이 자동으로 만들어진다.
사용자가 함수를 정의할 경우에는 자동으로 생성되지 않는다.
- equals()
- hashCode()
- toString()
- componentN()
- copy()

## 생성 규칙
- 생성자에 파라미터가 한개 이상 있어야한다.
- 생성자에 있는 모든 파라미터는 val, var를 이용해야한다.
- 데이터 클래스는 abstract, open, sealed, inner 클래스가 될 수 없다.

## equals()
- 생성자 파라미터를 통해 정의한 속성들이 같은 인스턴스는 hashCode() 값이 같고, equals()도 true를 반환한다.

```kotlin
data class User(
    val name: String,
    val id: Int
) {
    var count: Int = 30
}
```


```kotlin
val user = User("Alex", 1)
val secondUser = User("Alex", 1)

secondUser.count = 40

println(user.hashCode()) // 63347075
println(secondUser.hashCode()) // 63347075

println(user == secondUser) // true
```

## componentN()
- componentN을 통해 생성자에서 정의한 속성을 가져올 수 있다.
```kotlin
val user = User("Alex", 1)

println(user.component1()) // Alex
println(user.component2()) // 1
```

## destructuring
- 소괄호를 이용해 생성자에서 정의된 속성들을 가져올 수 있다.
```kotlin
val user = User("Alex", 1)

val (userName, userId) = user
println(userName) // Alex
println(userId) // 1
```