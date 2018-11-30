# CHANGELOG

### 2.1.1
- 集成Moshi
- 使用方式不再主动依赖Gson
```gradle
//如需使用Gson
implementation 'com.google.code.gson:gson:2.8.2'
//如需使用Moshi
implementation "com.squareup.moshi:moshi:1.8.0"
```

### 2.1.0
- 各个接口类public
- SharedPreferences使用apply()