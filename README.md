# Android BMP Encoder
The missing encoder to encode android.graphics.Bitmap to Windows Bitmap (*.bmp)

## Add the library to your project (gradle)
1. Add the Maven Central repository (if not exist) to your build file:
```groovy
repositories {
    mavenCentral()
}
```

2. Add the dependency:
```groovy
dependencies {
    implementation 'com.tianscar:android-bmp-encoder:1.0.0'
}
```

## Usage
```java
BmpEncoder.compress(Bitmap bitmap, Outputstream stream);
```
[JavaDocs](https://docs.tianscar.com/android-bmp-encoder)  
[A simple example](library/src/androidTest/java/com/tianscar/bmpencoder/EncodeBmpInstrumentedTest.java)

## License
[MIT](/LICENSE) (c) Tianscar
