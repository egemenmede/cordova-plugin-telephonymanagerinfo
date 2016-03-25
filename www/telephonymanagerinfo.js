var argscheck = require('cordova/argscheck'),
    channel = require('cordova/channel'),
    utils = require('cordova/utils'),
    exec = require('cordova/exec'),
    cordova = require('cordova');

function TelephonyManagerInfo() {
    var me = this;

    me.getInfo(function(info) {
        me.phone = info.phone;
        me.simSerialNumber = info.simSerialNumber;
        me.simOperatorName = info.simOperatorName;
        me.simOperator = info.simOperator;
        me.networkOperatorName = info.networkOperatorName;
        me.networkOperator = info.networkOperator;
        me.networkCountryIso = info.networkCountryIso;
        me.deviceSoftwareVersion = info.deviceSoftwareVersion;
        me.deviceId = info.deviceId;
        me.phoneType = info.phoneType;
        me.isNetworkRoaming = info.isNetworkRoaming;
        me.simState = info.simState;
        me.networkType = info.networkType;
        me.callState = info.callState;
        me.dataState = info.dataState;
        me.groupIdLevel = info.groupIdLevel;
        me.simCountryIso = info.simCountryIso;
        me.subscriberId = info.subscriberId;
        me.voiceMailAlphaTag = info.voiceMailAlphaTag;
        me.voiceMailNumber = info.voiceMailNumber;
        me.hasIccCard = info.hasIccCard;
        me.dataActivity = info.dataActivity;        
    },function(e) {
        utils.alert("[ERROR] Error initializing TelephonyManagerInfo: " + e);
    });
}

TelephonyManagerInfo.prototype.getInfo = function(successCallback, errorCallback) {
    exec(successCallback, errorCallback, "TelephonyManagerInfo", "getInfo", []);
};

module.exports = new TelephonyManagerInfo();