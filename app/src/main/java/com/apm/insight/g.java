package com.apm.insight;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.apm.insight.MonitorCrash;
import com.apm.insight.k.k;
import com.apm.insight.l.l;
import com.apm.insight.l.v;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g {

    /* renamed from: b  reason: collision with root package name */
    protected static MonitorCrash f6311b;

    /* renamed from: a  reason: collision with root package name */
    protected MonitorCrash f6312a;

    private g(MonitorCrash monitorCrash) {
        this.f6312a = monitorCrash;
        com.apm.insight.entity.b.a(this);
        com.apm.insight.j.b.d();
        k.e();
    }

    public static Object a() {
        return f6311b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, final MonitorCrash monitorCrash) {
        f6311b = monitorCrash;
        g gVar = new g(monitorCrash);
        final com.apm.insight.runtime.d a10 = h.a();
        Npth.init(context, new ICommonParams() { // from class: com.apm.insight.g.1
            @Override // com.apm.insight.ICommonParams
            public Map<String, Object> getCommonParams() {
                return l.b(g.this.e());
            }

            @Override // com.apm.insight.ICommonParams
            public String getDeviceId() {
                return TextUtils.isEmpty(monitorCrash.mConfig.mDeviceId) ? a10.d() : monitorCrash.mConfig.mDeviceId;
            }

            @Override // com.apm.insight.ICommonParams
            public List<String> getPatchInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public Map<String, Integer> getPluginInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public String getSessionId() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public long getUserId() {
                return 0L;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(MonitorCrash monitorCrash) {
        new g(monitorCrash);
    }

    private JSONObject b(CrashType crashType) {
        Map<? extends String, ? extends String> userData;
        AttachUserData attachUserData = this.f6312a.mCustomData;
        if (attachUserData == null || (userData = attachUserData.getUserData(crashType)) == null) {
            return null;
        }
        return new JSONObject(userData);
    }

    private JSONObject c(CrashType crashType) {
        return new JSONObject(this.f6312a.mTagMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f6312a.mConfig.mPackageName == null) {
                Context g10 = h.g();
                PackageInfo packageInfo = g10.getPackageManager().getPackageInfo(g10.getPackageName(), 128);
                if (packageInfo != null) {
                    MonitorCrash.Config config = this.f6312a.mConfig;
                    if (config.mVersionInt == -1) {
                        config.mVersionInt = packageInfo.versionCode;
                    }
                    if (config.mVersionStr == null) {
                        config.mVersionStr = packageInfo.versionName;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(this.f6312a.mConfig.mDeviceId) || "0".equals(this.f6312a.mConfig.mDeviceId)) {
            this.f6312a.mConfig.mDeviceId = h.c().a();
        }
        try {
            jSONObject.put("aid", String.valueOf(this.f6312a.mConfig.mAid));
            jSONObject.put("update_version_code", this.f6312a.mConfig.mVersionInt);
            jSONObject.put("version_code", this.f6312a.mConfig.mVersionInt);
            jSONObject.put("app_version", this.f6312a.mConfig.mVersionStr);
            jSONObject.put("channel", this.f6312a.mConfig.mChannel);
            jSONObject.put("package", l.a(this.f6312a.mConfig.mPackageName));
            jSONObject.put("device_id", this.f6312a.mConfig.mDeviceId);
            jSONObject.put("user_id", this.f6312a.mConfig.mUID);
            jSONObject.put("ssid", this.f6312a.mConfig.mSSID);
            jSONObject.put("os", "Android");
            jSONObject.put("so_list", l.a(this.f6312a.mConfig.mSoList));
            jSONObject.put("single_upload", d() ? 1 : 0);
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    public JSONArray a(StackTraceElement[] stackTraceElementArr, Throwable th) {
        String[] strArr = this.f6312a.mConfig.mPackageName;
        if (strArr == null) {
            return new JSONArray().put(new v.a(0, stackTraceElementArr.length).a());
        }
        if (th == null || stackTraceElementArr == null) {
            return null;
        }
        return v.a(stackTraceElementArr, strArr);
    }

    public JSONArray a(String[] strArr) {
        return this.f6312a.config().mPackageName == null ? new JSONArray().put(new v.a(0, strArr.length).a()) : v.a(strArr, this.f6312a.mConfig.mPackageName);
    }

    public JSONObject a(CrashType crashType) {
        return a(crashType, (JSONArray) null);
    }

    public JSONObject a(CrashType crashType, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("header", e());
            if (crashType != null) {
                jSONObject.put("custom", b(crashType));
                jSONObject.put("filters", c(crashType));
            }
            jSONObject.put("line_num", jSONArray);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public boolean a(Object obj) {
        return this.f6312a == obj;
    }

    public String b() {
        return this.f6312a.mConfig.mAid;
    }

    public JSONObject c() {
        return e();
    }

    public boolean d() {
        return false;
    }
}
