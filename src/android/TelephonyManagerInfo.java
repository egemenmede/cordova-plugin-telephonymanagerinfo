/* TelephonyManagerInfo Plugin - Egemen Mede - @delipenguen - 24.03.2016 */
package com.egemenmede.telephonymanagerinfo;

import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.provider.Settings;

import android.util.Log;
import android.content.Context;
import android.telephony.TelephonyManager;

public class TelephonyManagerInfo extends CordovaPlugin {

    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
    }

    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {


        if ("getInfo".equals(action)) {
            JSONObject r = new JSONObject();
            r.put("phone", this.getPhoneNumber());
            r.put("simSerialNumber", this.getSimSerialNumber());
            r.put("simOperatorName", this.getSimOperatorName());
            r.put("simOperator", this.getSimOperator());
            r.put("networkOperatorName", this.getNetworkOperatorName());
            r.put("networkOperator", this.getNetworkOperator());
            r.put("networkCountryIso", this.getNetworkCountryIso());
            r.put("deviceSoftwareVersion", this.getDeviceSoftwareVersion());
            r.put("deviceId", this.getDeviceId());
            callbackContext.success(r);
            return true;
        }else {
            return false;
        }
    }

    //--------------------------------------------------------------------------
    // LOCAL METHODS
    //--------------------------------------------------------------------------

    public String getPhoneNumber(){
        TelephonyManager tm = (TelephonyManager) this.cordova.getActivity().getSystemService(Context.TELEPHONY_SERVICE);
        String number = tm.getLine1Number();
        return number;
    }

    public String getSimSerialNumber(){
        TelephonyManager tm = (TelephonyManager) this.cordova.getActivity().getSystemService(Context.TELEPHONY_SERVICE);
        String number = tm.getSimSerialNumber();
        return number;
    }

    public String getSimOperatorName(){
        TelephonyManager tm = (TelephonyManager) this.cordova.getActivity().getSystemService(Context.TELEPHONY_SERVICE);
        String number = tm.getSimOperatorName();
        return number;
    }

    public String getSimOperator(){
        TelephonyManager tm = (TelephonyManager) this.cordova.getActivity().getSystemService(Context.TELEPHONY_SERVICE);
        String number = tm.getSimOperator();
        return number;
    }

    public String getNetworkOperatorName(){
        TelephonyManager tm = (TelephonyManager) this.cordova.getActivity().getSystemService(Context.TELEPHONY_SERVICE);
        String number = tm.getNetworkOperatorName();
        return number;
    }

    public String getNetworkOperator(){
        TelephonyManager tm = (TelephonyManager) this.cordova.getActivity().getSystemService(Context.TELEPHONY_SERVICE);
        String number = tm.getNetworkOperator();
        return number;
    }

    public String getNetworkCountryIso(){
        TelephonyManager tm = (TelephonyManager) this.cordova.getActivity().getSystemService(Context.TELEPHONY_SERVICE);
        String number = tm.getNetworkCountryIso();
        return number;
    }

    public String getDeviceSoftwareVersion(){
        TelephonyManager tm = (TelephonyManager) this.cordova.getActivity().getSystemService(Context.TELEPHONY_SERVICE);
        String number = tm.getDeviceSoftwareVersion();
        return number;
    }

    public String getDeviceId(){
        TelephonyManager tm = (TelephonyManager) this.cordova.getActivity().getSystemService(Context.TELEPHONY_SERVICE);
        String number = tm.getDeviceId();
        return number;
    }


}
