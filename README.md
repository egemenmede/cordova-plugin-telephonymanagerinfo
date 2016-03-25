
Cordova Plugin TelephonyManagerInfo
=================================

Bu plugin, native Android üzerinde `TelephonyManager` class'ının kullanılarak öğrenilebilecek 9 bilgiyi bu plugin ile almanızı sağlar.

Bu bilgiler şunlardır;

- phone
- simSerialNumber
- simOperatorName
- simOperator
- networkOperatorName
- networkOperator
- networkCountryIso
- deviceSoftwareVersion
- deviceId

Bu bilgiler ile ilgili detaylı açıklamalara aşağıdaki linkten ulaşabilirsiniz.

http://developer.android.com/reference/android/telephony/TelephonyManager.html

Pluginin Kurulumu
=================================

Ekleme
```
cordova plugin add cordova-plugin-telephonymanagerinfo
```

Çıkarma
```
cordova plugin remove cordova-plugin-telephonymanagerinfo
```

Pluginin Kullanımı
=================================
```
TelephonyManagerInfo.phone
TelephonyManagerInfo.simSerialNumber
TelephonyManagerInfo.simOperatorName
TelephonyManagerInfo.simOperator
TelephonyManagerInfo.networkOperatorName
TelephonyManagerInfo.networkOperator
TelephonyManagerInfo.networkCountryIso
TelephonyManagerInfo.deviceSoftwareVersion
TelephonyManagerInfo.deviceId
```
İzinler
=================================

Plugin, projeye eklendiğinde kullanıcıdan aşağıdaki izni talep edecektir.
```
android.permission.READ_PHONE_STATE
```
Desteklenen Platformlar
=================================
```
- Android
```

Web
=================================
http://www.delipenguen.com
