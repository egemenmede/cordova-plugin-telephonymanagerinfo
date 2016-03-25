
Cordova Plugin TelephonyManagerInfo
=================================

Bu plugin, native Android üzerinde `TelephonyManager` class'ının kullanılarak öğrenilebilecek 22 bilgiyi bu plugin ile almanızı sağlar.

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
- phoneType
- isNetworkRoaming
- simState
- networkType
- callState
- dataState
- groupIdLevel
- simCountryIso
- subscriberId
- voiceMailAlphaTag
- voiceMailNumber
- hasIccCard
- dataActivity

Bu bilgiler ile ilgili detaylı açıklamalara aşağıdaki linkten ulaşabilirsiniz.

http://developer.android.com/reference/android/telephony/TelephonyManager.html

Pluginin Kurulumu
=================================

Ekleme
```
cordova plugin add cordova-plugin-telephonymanagerinfo
```
veya GitHub adresini kullanarak
```
cordova plugin add https://github.com/egemenmede/cordova-plugin-telephonymanagerinfo
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
TelephonyManagerInfo.phoneType
TelephonyManagerInfo.isNetworkRoaming
TelephonyManagerInfo.simState
TelephonyManagerInfo.networkType
TelephonyManagerInfo.callState
TelephonyManagerInfo.dataState
TelephonyManagerInfo.groupIdLevel
TelephonyManagerInfo.simCountryIso
TelephonyManagerInfo.subscriberId
TelephonyManagerInfo.voiceMailAlphaTag
TelephonyManagerInfo.voiceMailNumber
TelephonyManagerInfo.hasIccCard
TelephonyManagerInfo.dataActivity
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

Npm Adresi
=================================
https://www.npmjs.com/package/cordova-plugin-telephonymanagerinfo
