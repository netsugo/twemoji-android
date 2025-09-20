# twemoji-android

[![](https://jitpack.io/v/netsugo/twemoji-android.svg)](https://jitpack.io/#netsugo/twemoji-android)


A simple Android vector drawable library of converted [twemoji](https://github.com/jdecked/twemoji) SVGs.

## implementation

Step 1: Add the JitPack repository to your build file (if you need).

```gradle
dependencyResolutionManagement {
	repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
	repositories {
		mavenCentral()
		maven { url 'https://jitpack.io' }
	}
}
```

Step 2. Add the dependency


```gradle
dependencies {
    implementation 'com.github.netsugo:twemoji-android:<version>'
}
```

## usage

example:

```kotlin
@Composable
fun Hello() {
    Image(
        painter = painterResouce(com.github.netsugo.twemoji.R.drawable.emoji_1f600),
        contentDescription = "grinning face"
    )
}
```

example with type alias:

```kotlin
typealias Twemoji = com.github.netsugo.twemoji.R.drawable

@Composable
fun Hello() {
    Image(
        painter = painterResouce(Twemoji.emoji_1f600),
        contentDescription = "grinning face"
    )
}
```
