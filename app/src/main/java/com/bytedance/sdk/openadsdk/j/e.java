package com.bytedance.sdk.openadsdk.j;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PlayableJsBridge.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private Context f13360a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<g> f13361b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, a> f13362c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private SensorEventListener f13363d = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.j.e.1
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            g d10;
            if (sensorEvent.sensor.getType() != 1 || (d10 = e.this.d()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f10);
                jSONObject.put("y", f11);
                jSONObject.put("z", f12);
                d10.a("accelerometer_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private SensorEventListener f13364e = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.j.e.12
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            g d10;
            if (sensorEvent.sensor.getType() != 4 || (d10 = e.this.d()) == null) {
                return;
            }
            float degrees = (float) Math.toDegrees(sensorEvent.values[0]);
            float degrees2 = (float) Math.toDegrees(sensorEvent.values[1]);
            float degrees3 = (float) Math.toDegrees(sensorEvent.values[2]);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", degrees);
                jSONObject.put("y", degrees2);
                jSONObject.put("z", degrees3);
                d10.a("gyro_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PlayableJsBridge.java */
    /* loaded from: classes.dex */
    public interface a {
        JSONObject a(JSONObject jSONObject) throws Throwable;
    }

    public e(g gVar) {
        this.f13360a = gVar.a();
        this.f13361b = new WeakReference<>(gVar);
        c();
    }

    private void c() {
        this.f13362c.put("adInfo", new a() { // from class: com.bytedance.sdk.openadsdk.j.e.19
            @Override // com.bytedance.sdk.openadsdk.j.e.a
            public JSONObject a(JSONObject jSONObject) {
                g d10 = e.this.d();
                if (d10 != null) {
                    return d10.n();
                }
                return null;
            }
        });
        this.f13362c.put("appInfo", new a() { // from class: com.bytedance.sdk.openadsdk.j.e.20
            @Override // com.bytedance.sdk.openadsdk.j.e.a
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "5.2.2");
                JSONArray jSONArray = new JSONArray();
                for (String str : e.this.a()) {
                    jSONArray.put(str);
                }
                jSONObject2.put("supportList", jSONArray);
                g d10 = e.this.d();
                if (d10 != null) {
                    jSONObject2.put("deviceId", d10.g());
                    jSONObject2.put("netType", d10.k());
                    jSONObject2.put("innerAppName", d10.d());
                    jSONObject2.put("appName", d10.e());
                    jSONObject2.put("appVersion", d10.f());
                    Map<String, String> b10 = d10.b();
                    for (String str2 : b10.keySet()) {
                        jSONObject2.put(str2, b10.get(str2));
                    }
                }
                return jSONObject2;
            }
        });
        this.f13362c.put("playableSDKInfo", new a() { // from class: com.bytedance.sdk.openadsdk.j.e.21
            @Override // com.bytedance.sdk.openadsdk.j.e.a
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "5.2.2");
                jSONObject2.put("os", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
                return jSONObject2;
            }
        });
        this.f13362c.put("subscribe_app_ad", new a() { // from class: com.bytedance.sdk.openadsdk.j.e.22
            @Override // com.bytedance.sdk.openadsdk.j.e.a
            public JSONObject a(JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.j.a e10 = e.this.e();
                if (e10 == null) {
                    return null;
                }
                e10.a(jSONObject);
                return null;
            }
        });
        this.f13362c.put("download_app_ad", new a() { // from class: com.bytedance.sdk.openadsdk.j.e.23
            @Override // com.bytedance.sdk.openadsdk.j.e.a
            public JSONObject a(JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.j.a e10 = e.this.e();
                if (e10 == null) {
                    return null;
                }
                e10.b(jSONObject);
                return null;
            }
        });
        this.f13362c.put("isViewable", new a() { // from class: com.bytedance.sdk.openadsdk.j.e.24
            @Override // com.bytedance.sdk.openadsdk.j.e.a
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                g d10 = e.this.d();
                if (d10 == null) {
                    return new JSONObject();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("viewStatus", d10.i());
                return jSONObject2;
            }
        });
        this.f13362c.put("getVolume", new a() { // from class: com.bytedance.sdk.openadsdk.j.e.25
            @Override // com.bytedance.sdk.openadsdk.j.e.a
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                g d10 = e.this.d();
                if (d10 == null) {
                    return new JSONObject();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("endcard_mute", d10.h());
                return jSONObject2;
            }
        });
        this.f13362c.put("getScreenSize", new a() { // from class: com.bytedance.sdk.openadsdk.j.e.2
            @Override // com.bytedance.sdk.openadsdk.j.e.a
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                g d10 = e.this.d();
                if (d10 == null) {
                    return new JSONObject();
                }
                return d10.m();
            }
        });
        this.f13362c.put("start_accelerometer_observer", new a() { // from class: com.bytedance.sdk.openadsdk.j.e.3
            @Override // com.bytedance.sdk.openadsdk.j.e.a
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i10 = 2;
                if (jSONObject != null) {
                    try {
                        i10 = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        f.a("PlayableJsBridge", "invoke start_accelerometer_observer error", th);
                        jSONObject2.put(Analytics.Param.CODE, -2);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                i.a(e.this.f13360a, e.this.f13363d, i10);
                jSONObject2.put(Analytics.Param.CODE, 0);
                return jSONObject2;
            }
        });
        this.f13362c.put("close_accelerometer_observer", new a() { // from class: com.bytedance.sdk.openadsdk.j.e.4
            @Override // com.bytedance.sdk.openadsdk.j.e.a
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    i.a(e.this.f13360a, e.this.f13363d);
                    jSONObject2.put(Analytics.Param.CODE, 0);
                    return jSONObject2;
                } catch (Throwable th) {
                    f.a("PlayableJsBridge", "invoke close_accelerometer_observer error", th);
                    jSONObject2.put(Analytics.Param.CODE, -2);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.f13362c.put("start_gyro_observer", new a() { // from class: com.bytedance.sdk.openadsdk.j.e.5
            @Override // com.bytedance.sdk.openadsdk.j.e.a
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i10 = 2;
                if (jSONObject != null) {
                    try {
                        i10 = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        f.a("PlayableJsBridge", "invoke start_gyro_observer error", th);
                        jSONObject2.put(Analytics.Param.CODE, -2);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                i.b(e.this.f13360a, e.this.f13364e, i10);
                jSONObject2.put(Analytics.Param.CODE, 0);
                return jSONObject2;
            }
        });
        this.f13362c.put("close_gyro_observer", new a() { // from class: com.bytedance.sdk.openadsdk.j.e.6
            @Override // com.bytedance.sdk.openadsdk.j.e.a
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    i.a(e.this.f13360a, e.this.f13364e);
                    jSONObject2.put(Analytics.Param.CODE, 0);
                    return jSONObject2;
                } catch (Throwable th) {
                    f.a("PlayableJsBridge", "invoke close_gyro_observer error", th);
                    jSONObject2.put(Analytics.Param.CODE, -2);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.f13362c.put("device_shake", new a() { // from class: com.bytedance.sdk.openadsdk.j.e.7
            @Override // com.bytedance.sdk.openadsdk.j.e.a
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    i.a(e.this.f13360a);
                    jSONObject2.put(Analytics.Param.CODE, 0);
                    return jSONObject2;
                } catch (Throwable th) {
                    f.a("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put(Analytics.Param.CODE, -2);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.f13362c.put("playable_style", new a() { // from class: com.bytedance.sdk.openadsdk.j.e.8
            @Override // com.bytedance.sdk.openadsdk.j.e.a
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                g d10 = e.this.d();
                if (d10 != null) {
                    return d10.c();
                }
                return null;
            }
        });
        this.f13362c.put("sendReward", new a() { // from class: com.bytedance.sdk.openadsdk.j.e.9
            @Override // com.bytedance.sdk.openadsdk.j.e.a
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                g d10 = e.this.d();
                if (d10 != null) {
                    d10.p();
                    return null;
                }
                return null;
            }
        });
        this.f13362c.put("webview_time_track", new a() { // from class: com.bytedance.sdk.openadsdk.j.e.10
            @Override // com.bytedance.sdk.openadsdk.j.e.a
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                return null;
            }
        });
        this.f13362c.put("playable_event", new a() { // from class: com.bytedance.sdk.openadsdk.j.e.11
            @Override // com.bytedance.sdk.openadsdk.j.e.a
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                g d10 = e.this.d();
                if (d10 == null || jSONObject == null) {
                    return null;
                }
                d10.b(jSONObject.optString("event", null), jSONObject.optJSONObject("params"));
                return null;
            }
        });
        this.f13362c.put("reportAd", new a() { // from class: com.bytedance.sdk.openadsdk.j.e.13
            @Override // com.bytedance.sdk.openadsdk.j.e.a
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                g d10 = e.this.d();
                if (d10 == null) {
                    return null;
                }
                d10.c(jSONObject);
                return null;
            }
        });
        this.f13362c.put("close", new a() { // from class: com.bytedance.sdk.openadsdk.j.e.14
            @Override // com.bytedance.sdk.openadsdk.j.e.a
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                g d10 = e.this.d();
                if (d10 == null) {
                    return null;
                }
                d10.d(jSONObject);
                return null;
            }
        });
        this.f13362c.put("openAdLandPageLinks", new a() { // from class: com.bytedance.sdk.openadsdk.j.e.15
            @Override // com.bytedance.sdk.openadsdk.j.e.a
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                g d10 = e.this.d();
                if (d10 == null) {
                    return null;
                }
                d10.e(jSONObject);
                return null;
            }
        });
        this.f13362c.put("get_viewport", new a() { // from class: com.bytedance.sdk.openadsdk.j.e.16
            @Override // com.bytedance.sdk.openadsdk.j.e.a
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                g d10 = e.this.d();
                if (d10 == null) {
                    return null;
                }
                return d10.o();
            }
        });
        this.f13362c.put("jssdk_load_finish", new a() { // from class: com.bytedance.sdk.openadsdk.j.e.17
            @Override // com.bytedance.sdk.openadsdk.j.e.a
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                g d10 = e.this.d();
                if (d10 == null) {
                    return null;
                }
                d10.s();
                return null;
            }
        });
        this.f13362c.put("material_render_result", new a() { // from class: com.bytedance.sdk.openadsdk.j.e.18
            @Override // com.bytedance.sdk.openadsdk.j.e.a
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                g d10 = e.this.d();
                if (d10 == null) {
                    return null;
                }
                d10.b(jSONObject);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public g d() {
        WeakReference<g> weakReference = this.f13361b;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bytedance.sdk.openadsdk.j.a e() {
        g d10 = d();
        if (d10 == null) {
            return null;
        }
        return d10.l();
    }

    public Set<String> a() {
        return this.f13362c.keySet();
    }

    public void b() {
        i.a(this.f13360a, this.f13363d);
        i.a(this.f13360a, this.f13364e);
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        try {
            a aVar = this.f13362c.get(str);
            if (aVar == null) {
                return null;
            }
            return aVar.a(jSONObject);
        } catch (Throwable th) {
            f.a("PlayableJsBridge", "invoke error", th);
            return null;
        }
    }
}
