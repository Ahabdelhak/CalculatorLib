### Repo Contains step by step launching first library

## Installation
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

**Step 2.** Add the dependency in `/app/build.gradle` :

```
dependencies {
    ...
    implementation 'com.github.Ahabdelhak:CalculatorLib:1.0'
    }
```
