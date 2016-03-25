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
    },function(e) {
        utils.alert("[ERROR] Error initializing TelephonyManagerInfo: " + e);
    });
}

TelephonyManagerInfo.prototype.getInfo = function(successCallback, errorCallback) {
    exec(successCallback, errorCallback, "TelephonyManagerInfo", "getInfo", []);
};

module.exports = new TelephonyManagerInfo();