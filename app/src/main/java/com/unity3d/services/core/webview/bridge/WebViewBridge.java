package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewApp;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class WebViewBridge {
    private static HashMap<String, HashMap<String, HashMap<Integer, Method>>> _classTable;

    private static Method findMethod(String str, String str2, Object[] objArr) throws JSONException, NoSuchMethodException {
        if (_classTable.containsKey(str)) {
            HashMap<String, HashMap<Integer, Method>> hashMap = _classTable.get(str);
            if (hashMap.containsKey(str2)) {
                return hashMap.get(str2).get(Integer.valueOf(Arrays.deepHashCode(getTypes(objArr))));
            }
            throw new NoSuchMethodException();
        }
        throw new NoSuchMethodException();
    }

    private static Class<?>[] getTypes(Object[] objArr) throws JSONException {
        Class<?>[] clsArr = objArr == null ? new Class[1] : new Class[objArr.length + 1];
        if (objArr != null) {
            for (int i10 = 0; i10 < objArr.length; i10++) {
                clsArr[i10] = objArr[i10].getClass();
            }
        }
        clsArr[clsArr.length - 1] = WebViewCallback.class;
        return clsArr;
    }

    private static Object[] getValues(Object[] objArr, WebViewCallback webViewCallback) throws JSONException {
        Object[] objArr2;
        if (objArr != null) {
            objArr2 = new Object[objArr.length + (webViewCallback != null ? 1 : 0)];
        } else if (webViewCallback == null) {
            return null;
        } else {
            objArr2 = new Object[1];
        }
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        if (webViewCallback != null) {
            objArr2[objArr2.length - 1] = webViewCallback;
        }
        return objArr2;
    }

    public static void handleCallback(String str, String str2, Object[] objArr) throws Exception {
        try {
            WebViewApp.getCurrentApp().getCallback(str).invoke(str2, getValues(objArr, null));
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | JSONException e10) {
            DeviceLog.error("Error while invoking method");
            throw e10;
        }
    }

    public static void handleInvocation(String str, String str2, Object[] objArr, WebViewCallback webViewCallback) throws Exception {
        try {
            try {
                findMethod(str, str2, objArr).invoke(null, getValues(objArr, webViewCallback));
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | JSONException e10) {
                webViewCallback.error(WebViewBridgeError.INVOCATION_FAILED, str, str2, objArr, e10.getMessage());
                throw e10;
            }
        } catch (NoSuchMethodException | JSONException e11) {
            webViewCallback.error(WebViewBridgeError.METHOD_NOT_FOUND, str, str2, objArr);
            throw e11;
        }
    }

    public static void setClassTable(Class[] clsArr) {
        Method[] methods;
        HashMap<Integer, Method> hashMap;
        if (clsArr == null) {
            return;
        }
        _classTable = new HashMap<>();
        for (Class cls : clsArr) {
            if (cls != null && (cls.getPackage().getName().startsWith("com.unity3d.services") || cls.getPackage().getName().startsWith("com.unity3d.ads.test"))) {
                HashMap<String, HashMap<Integer, Method>> hashMap2 = new HashMap<>();
                for (Method method : cls.getMethods()) {
                    if (method.getAnnotation(WebViewExposed.class) != null) {
                        String name = method.getName();
                        if (hashMap2.containsKey(name)) {
                            hashMap = hashMap2.get(name);
                        } else {
                            hashMap = new HashMap<>();
                        }
                        hashMap.put(Integer.valueOf(Arrays.deepHashCode(method.getParameterTypes())), method);
                        hashMap2.put(name, hashMap);
                    }
                }
                _classTable.put(cls.getName(), hashMap2);
            }
        }
    }
}
