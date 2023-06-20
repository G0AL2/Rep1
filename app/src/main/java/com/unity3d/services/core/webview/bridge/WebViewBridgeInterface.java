package com.unity3d.services.core.webview.bridge;

import android.webkit.JavascriptInterface;
import com.unity3d.services.core.log.DeviceLog;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class WebViewBridgeInterface {
    private Object[] getParameters(JSONArray jSONArray) throws JSONException {
        Object[] objArr = new Object[jSONArray.length()];
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            objArr[i10] = jSONArray.get(i10);
        }
        return objArr;
    }

    @JavascriptInterface
    public void handleCallback(String str, String str2, String str3) throws Exception {
        Object[] objArr;
        DeviceLog.debug("handleCallback " + str + " " + str2 + " " + str3);
        JSONArray jSONArray = new JSONArray(str3);
        if (jSONArray.length() > 0) {
            objArr = new Object[jSONArray.length()];
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                objArr[i10] = jSONArray.get(i10);
            }
        } else {
            objArr = null;
        }
        WebViewBridge.handleCallback(str, str2, objArr);
    }

    @JavascriptInterface
    public void handleInvocation(String str) throws JSONException {
        DeviceLog.debug("handleInvocation " + str);
        JSONArray jSONArray = new JSONArray(str);
        Invocation invocation = new Invocation();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONArray jSONArray2 = (JSONArray) jSONArray.get(i10);
            invocation.addInvocation((String) jSONArray2.get(0), (String) jSONArray2.get(1), getParameters((JSONArray) jSONArray2.get(2)), new WebViewCallback((String) jSONArray2.get(3), invocation.getId()));
        }
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            invocation.nextInvocation();
        }
        invocation.sendInvocationCallback();
    }
}
