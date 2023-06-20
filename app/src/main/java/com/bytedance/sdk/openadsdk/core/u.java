package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdManager;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.core.o;
import com.google.android.gms.common.internal.ImagesContract;
import com.unity3d.ads.metadata.MediationMetaData;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: TTAdManagerImpl.java */
/* loaded from: classes.dex */
public class u implements TTAdManager {

    /* renamed from: f  reason: collision with root package name */
    private static final Map<Integer, String> f12749f = new HashMap<Integer, String>(12) { // from class: com.bytedance.sdk.openadsdk.core.u.1
        {
            put(1, "abtest");
            put(2, "user_data");
            put(3, "gaid");
            put(4, "apk-sign");
            put(5, "app_running_time");
            put(6, "vendor");
            put(7, "model");
            put(8, "user_agent_device");
            put(9, "user_agent_webview");
            put(10, "sys_compiling_time");
            put(11, "sec_did");
            put(12, ImagesContract.URL);
            put(13, "X-Argus");
            put(14, "X-Ladon");
            put(15, "X-Khronos");
            put(16, "X-Gorgon");
            put(17, "pangle_m");
            put(18, "screen_height");
            put(19, "screen_width");
            put(20, "rom_version");
            put(21, "carrier_name");
            put(22, "os_version");
            put(23, "conn_type");
            put(24, "boot");
        }
    };

    /* renamed from: a  reason: collision with root package name */
    String f12750a;

    /* renamed from: b  reason: collision with root package name */
    boolean f12751b = false;

    /* renamed from: c  reason: collision with root package name */
    boolean f12752c = false;

    /* renamed from: d  reason: collision with root package name */
    String f12753d = "com.union_test.internationad";

    /* renamed from: e  reason: collision with root package name */
    String f12754e = "5001121";

    /* renamed from: g  reason: collision with root package name */
    private int f12755g = 0;

    private void e(String str) {
        com.bytedance.sdk.openadsdk.core.e.a aVar;
        if (TextUtils.isEmpty(str) || str.equals(this.f12750a)) {
            return;
        }
        this.f12750a = str;
        try {
            JSONObject a10 = m.f().a(new JSONObject(str));
            if (a10 == null) {
                return;
            }
            o.a a11 = o.a.a(a10, null, null);
            if (a11.f12720d == 20000 && (aVar = a11.f12724h) != null && aVar.b().size() > 0) {
                com.bytedance.sdk.openadsdk.core.e.n nVar = a11.f12724h.b().get(0);
                this.f12751b = com.bytedance.sdk.openadsdk.utils.u.d(nVar);
                this.f12752c = nVar.G() != null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    /* renamed from: a */
    public u setAppId(String str) {
        h.d().a(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    /* renamed from: a */
    public u setPaid(boolean z10) {
        h.d().c(z10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    /* renamed from: b */
    public u setName(String str) {
        h.d().b(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    /* renamed from: c */
    public u setKeywords(String str) {
        h.d().c(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public TTAdNative createAdNative(Context context) {
        return new v(context);
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    /* renamed from: d */
    public u setData(String str) {
        h.d().d(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public TTAdManager debugLog(int i10) {
        this.f12755g = i10;
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public String getBiddingToken() {
        return getBiddingToken(null);
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public String getBiddingToken(String str) {
        int i10;
        com.bytedance.sdk.openadsdk.utils.u.n("getBiddingToken");
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("is_init", TTAdSdk.isInitSuccess() ? 1 : 0);
            String e10 = m.h().e();
            String f10 = m.h().f();
            if (e10 != null && f10 != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(MediationMetaData.KEY_VERSION, e10);
                jSONObject3.put("param", f10);
                jSONObject2.put("abtest", jSONObject3);
            }
            jSONObject2.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject2.put("package_name", com.bytedance.sdk.openadsdk.utils.u.d());
            jSONObject2.put("user_data", o.a(TextUtils.isEmpty(str) ? null : new AdSlot.Builder().setCodeId(str).build()));
            jSONObject2.put("ts", System.currentTimeMillis() / 1000);
            if (jSONObject2.toString().getBytes().length <= 2680) {
                com.bytedance.sdk.openadsdk.core.i.f h10 = m.h();
                if (h10.p("gaid")) {
                    jSONObject2.put("gaid", s3.a.a().c());
                }
                Context a10 = m.a();
                jSONObject2.put("apk-sign", s.a());
                jSONObject2.put("app_running_time", (System.currentTimeMillis() - TTAdSdk.INIT_TIME) / 1000);
                jSONObject2.put("vendor", Build.MANUFACTURER);
                jSONObject2.put("model", Build.MODEL);
                jSONObject2.put("user_agent_device", com.bytedance.sdk.openadsdk.utils.u.a());
                jSONObject2.put("user_agent_webview", com.bytedance.sdk.openadsdk.utils.u.b());
                jSONObject2.put("sys_compiling_time", j.b(a10));
                jSONObject2.put("screen_height", com.bytedance.sdk.openadsdk.utils.v.d(a10));
                jSONObject2.put("screen_width", com.bytedance.sdk.openadsdk.utils.v.c(a10));
                jSONObject2.put("rom_version", com.bytedance.sdk.openadsdk.utils.m.a());
                jSONObject2.put("carrier_name", com.bytedance.sdk.openadsdk.utils.n.a());
                jSONObject2.put("os_version", Build.VERSION.RELEASE);
                jSONObject2.put("conn_type", com.bytedance.sdk.openadsdk.utils.u.p(a10));
                if (h10.p("boot")) {
                    jSONObject2.put("boot", (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + "");
                }
                s.a(jSONObject2);
                i10 = f12749f.size();
            } else {
                i10 = 2;
            }
            while (i10 >= 1 && jSONObject2.toString().getBytes().length > 2680) {
                jSONObject2.remove(f12749f.get(Integer.valueOf(i10)));
                i10--;
            }
            jSONObject = com.bytedance.sdk.component.utils.a.a(jSONObject2);
            while (i10 >= 1 && jSONObject.toString().getBytes().length > 4096) {
                jSONObject2.remove(f12749f.get(Integer.valueOf(i10)));
                jSONObject = com.bytedance.sdk.component.utils.a.a(jSONObject2);
                i10--;
            }
            if (com.bytedance.sdk.component.utils.l.c()) {
                com.bytedance.sdk.component.utils.l.c("mssdk", "bidding token: " + jSONObject.toString() + "\nbidding token length: " + jSONObject.toString().getBytes().length);
            }
            com.bytedance.sdk.openadsdk.b.e.a(str);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.component.utils.l.b("TTAdManagerImpl", "bidding token: " + jSONObject.toString());
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public int getCcpa() {
        return h.d().v();
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public int getCoppa() {
        return h.d().i();
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public int getDebugLog() {
        return this.f12755g;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public int getGdpr() {
        return h.d().j();
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public String getSDKVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public String getSupportRegion() {
        return "VA";
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public boolean isExpressAd(String str, String str2) {
        if (m.h().h(str)) {
            return true;
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        e(str2);
        return this.f12752c;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public boolean isFullScreenVideoAd(String str, String str2) {
        if (m.h().i(str)) {
            return true;
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        e(str2);
        return this.f12751b;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public TTAdManager isUseTextureView(boolean z10) {
        h.d().e(z10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public boolean onlyVerityPlayable(String str, int i10, String str2, String str3, String str4) {
        if (this.f12753d.equals(m.a().getPackageName()) && this.f12754e.equals(h.d().f()) && !TextUtils.isEmpty(str)) {
            try {
                Method a10 = com.bytedance.sdk.component.utils.w.a("com.bytedance.sdk.openadsdk.TTC3Proxy", "verityPlayable", String.class, Integer.TYPE, String.class, String.class, String.class);
                if (a10 != null) {
                    a10.invoke(null, str, Integer.valueOf(i10), str2, str3, str4);
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.l.b("TTAdManagerImpl", "reward component maybe not exist, pls check", th);
            }
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public TTAdManager openDebugMode() {
        com.bytedance.sdk.component.utils.l.b();
        com.bytedance.sdk.component.e.a.a();
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public void requestPermissionIfNecessary(Context context) {
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public TTAdManager setAllowShowNotifiFromSDK(boolean z10) {
        h.d().d(z10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public TTAdManager setCcpa(int i10) {
        h.d().f(i10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public TTAdManager setCoppa(int i10) {
        h.d().b(i10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public TTAdManager setGdpr(int i10) {
        h.d().c(i10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public TTAdManager setIconId(int i10) {
        h.d().a(i10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public TTAdManager setNeedClearTaskReset(String[] strArr) {
        h.d().a(strArr);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public TTAdManager setTitleBarTheme(int i10) {
        h.d().e(i10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public void showPrivacyProtection() {
        TTDelegateActivity.a();
    }
}
