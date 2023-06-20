package io.invertase.firebase.common;

import android.util.Log;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SharedUtils.java */
/* loaded from: classes3.dex */
public class a {
    public static void a(Object obj, WritableArray writableArray) {
        if (obj != null && obj != JSONObject.NULL) {
            String name = obj.getClass().getName();
            if (name.equals("java.lang.Integer")) {
                writableArray.pushInt(((Integer) obj).intValue());
                return;
            } else if (name.equals("java.lang.Float")) {
                writableArray.pushDouble(((Float) obj).floatValue());
                return;
            } else if (name.equals("org.json.JSONArray$1")) {
                try {
                    writableArray.pushArray(c((JSONArray) obj));
                    return;
                } catch (JSONException unused) {
                    writableArray.pushNull();
                    return;
                }
            } else if (name.equals("java.lang.Boolean")) {
                writableArray.pushBoolean(((Boolean) obj).booleanValue());
                return;
            } else if (name.equals("java.lang.Long")) {
                writableArray.pushDouble(((Long) obj).longValue());
                return;
            } else if (name.equals("java.lang.Double")) {
                writableArray.pushDouble(((Double) obj).doubleValue());
                return;
            } else if (name.equals("java.lang.String")) {
                writableArray.pushString((String) obj);
                return;
            } else if (!name.equals("org.json.JSONObject$1")) {
                if (List.class.isAssignableFrom(obj.getClass())) {
                    writableArray.pushArray(e((List) obj));
                    return;
                } else if (Map.class.isAssignableFrom(obj.getClass())) {
                    writableArray.pushMap(g((Map) obj));
                    return;
                } else {
                    Log.d("Utils", "utils:arrayPushValue:unknownType:" + name);
                    writableArray.pushNull();
                    return;
                }
            } else {
                try {
                    writableArray.pushMap(d((JSONObject) obj));
                    return;
                } catch (JSONException unused2) {
                    writableArray.pushNull();
                    return;
                }
            }
        }
        writableArray.pushNull();
    }

    public static WritableMap b(Exception exc) {
        WritableMap createMap = Arguments.createMap();
        String message = exc.getMessage();
        createMap.putString(Analytics.Param.CODE, DtbDeviceDataRetriever.ORIENTATION_UNKNOWN);
        createMap.putString("nativeErrorCode", DtbDeviceDataRetriever.ORIENTATION_UNKNOWN);
        createMap.putString("message", message);
        createMap.putString("nativeErrorMessage", message);
        return createMap;
    }

    public static WritableArray c(JSONArray jSONArray) throws JSONException {
        WritableArray createArray = Arguments.createArray();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if (!(obj instanceof Float) && !(obj instanceof Double)) {
                if (obj instanceof Number) {
                    createArray.pushInt(jSONArray.getInt(i10));
                } else if (obj instanceof String) {
                    createArray.pushString(jSONArray.getString(i10));
                } else if (obj instanceof JSONObject) {
                    createArray.pushMap(d(jSONArray.getJSONObject(i10)));
                } else if (obj instanceof JSONArray) {
                    createArray.pushArray(c(jSONArray.getJSONArray(i10)));
                } else if (obj == JSONObject.NULL) {
                    createArray.pushNull();
                }
            } else {
                createArray.pushDouble(jSONArray.getDouble(i10));
            }
        }
        return createArray;
    }

    public static WritableMap d(JSONObject jSONObject) throws JSONException {
        Iterator<String> keys = jSONObject.keys();
        WritableMap createMap = Arguments.createMap();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (!(obj instanceof Float) && !(obj instanceof Double)) {
                if (obj instanceof Number) {
                    createMap.putInt(next, jSONObject.getInt(next));
                } else if (obj instanceof String) {
                    createMap.putString(next, jSONObject.getString(next));
                } else if (obj instanceof JSONObject) {
                    createMap.putMap(next, d(jSONObject.getJSONObject(next)));
                } else if (obj instanceof JSONArray) {
                    createMap.putArray(next, c(jSONObject.getJSONArray(next)));
                } else if (obj == JSONObject.NULL) {
                    createMap.putNull(next);
                }
            } else {
                createMap.putDouble(next, jSONObject.getDouble(next));
            }
        }
        return createMap;
    }

    private static WritableArray e(List<Object> list) {
        WritableArray createArray = Arguments.createArray();
        for (Object obj : list) {
            a(obj, createArray);
        }
        return createArray;
    }

    public static void f(String str, Object obj, WritableMap writableMap) {
        if (obj != null && obj != JSONObject.NULL) {
            String name = obj.getClass().getName();
            if (name.equals("java.lang.Integer")) {
                writableMap.putInt(str, ((Integer) obj).intValue());
                return;
            } else if (name.equals("java.lang.Float")) {
                writableMap.putDouble(str, ((Float) obj).floatValue());
                return;
            } else if (name.equals("org.json.JSONArray$1")) {
                try {
                    writableMap.putArray(str, c((JSONArray) obj));
                    return;
                } catch (JSONException unused) {
                    writableMap.putNull(str);
                    return;
                }
            } else if (name.equals("java.lang.Boolean")) {
                writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
                return;
            } else if (name.equals("java.lang.Long")) {
                writableMap.putDouble(str, ((Long) obj).longValue());
                return;
            } else if (name.equals("java.lang.Double")) {
                writableMap.putDouble(str, ((Double) obj).doubleValue());
                return;
            } else if (name.equals("java.lang.String")) {
                writableMap.putString(str, (String) obj);
                return;
            } else if (!name.equals("org.json.JSONObject$1")) {
                if (List.class.isAssignableFrom(obj.getClass())) {
                    writableMap.putArray(str, e((List) obj));
                    return;
                } else if (Map.class.isAssignableFrom(obj.getClass())) {
                    writableMap.putMap(str, g((Map) obj));
                    return;
                } else {
                    Log.d("Utils", "utils:mapPutValue:unknownType:" + name);
                    writableMap.putNull(str);
                    return;
                }
            } else {
                try {
                    writableMap.putMap(str, d((JSONObject) obj));
                    return;
                } catch (JSONException unused2) {
                    writableMap.putNull(str);
                    return;
                }
            }
        }
        writableMap.putNull(str);
    }

    public static WritableMap g(Map<String, Object> map) {
        WritableMap createMap = Arguments.createMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            f(entry.getKey(), entry.getValue(), createMap);
        }
        return createMap;
    }

    public static String h(long j10) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ROOT);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j10 * 1000));
    }
}
