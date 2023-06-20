package com.bytedance.sdk.openadsdk.core.h;

import android.content.Context;
import android.os.Looper;
import com.bytedance.mobsec.metasec.ov.PglMSConfig;
import com.bytedance.mobsec.metasec.ov.PglMSManager;
import com.bytedance.mobsec.metasec.ov.PglMSManagerUtils;
import com.bytedance.sdk.component.f.e;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.j;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.u;
import com.inmobi.media.fq;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MSSdkImpl.java */
/* loaded from: classes.dex */
public class b implements a {

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f12297b = false;

    /* renamed from: c  reason: collision with root package name */
    private static volatile boolean f12298c = true;

    /* renamed from: a  reason: collision with root package name */
    private PglMSManager f12299a;

    /* renamed from: d  reason: collision with root package name */
    private volatile String f12300d;

    /* renamed from: e  reason: collision with root package name */
    private volatile String f12301e;

    public b() {
        Context a10 = m.a();
        this.f12300d = h.d().f();
        this.f12301e = j.a(a10);
        f12297b = a(this.f12300d, this.f12301e);
    }

    private synchronized boolean c() {
        if (!f12297b && f12298c) {
            this.f12300d = h.d().f();
            this.f12301e = j.a(m.a());
            f12297b = a(this.f12300d, this.f12301e);
        }
        return f12297b;
    }

    private void d() {
        if (this.f12299a == null) {
            PglMSManager pglMSManager = PglMSManagerUtils.get("1371");
            this.f12299a = pglMSManager;
            if (pglMSManager != null) {
                pglMSManager.setCollectMode(e());
            }
        }
    }

    private int e() {
        int o10 = u.o();
        if (o10 != 4 && o10 != 5) {
            l.c("mssdk", "getCollectMode() PglMSConfig.COLLECT_MODE_TIKTOK_NONUSEA");
            return 603;
        }
        l.c("mssdk", "getCollectMode() PglMSConfig.COLLECT_MODE_TIKTOK_USEA");
        return 503;
    }

    private Class f() {
        Class<?> cls = null;
        try {
            cls = Class.forName("com.bytedance.mobsec.metasec.ov.PglMS");
            f12298c = true;
            l.c("mssdk", "class found");
            return cls;
        } catch (Throwable unused) {
            l.c("mssdk", "class not found ");
            f12298c = false;
            return cls;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.h.a
    public void b(String str) {
        if (c()) {
            d();
            if (this.f12299a != null) {
                long currentTimeMillis = System.currentTimeMillis();
                this.f12299a.report(str);
                com.bytedance.sdk.openadsdk.h.b.a().a("report", currentTimeMillis);
            }
        }
    }

    private boolean a(String str, String str2) {
        try {
            l.c("mssdk", "Sdk.APP_ID: 1371\n appId: " + str + " \n MS_SDK_LICENCE:6QsgjKNXt0ThHEOR/wpJGqVuDr4bHw6oKiicVF73p9+zvKfmlFZpi9d4zgrMWd9vbyPsZIdIHuN5cgNZGzmWdjdpJjlERMNPwKHauPaQbfRfY4VRpA5s7BaQ3NqhlpVXhpJcCGkhG0r8GX6Q1ys7HXrrwSLpidXsl992B79+GPi4GB9tgR1CtqsLFzcKbbd+/j76xqkGzAl1p2JxYeZswgj5c/Mg5K2bA7MquHtxWz4N1Tkj \n did: " + str2 + " ");
            Context a10 = m.a();
            PglMSConfig build = new PglMSConfig.Builder("1371", str, "6QsgjKNXt0ThHEOR/wpJGqVuDr4bHw6oKiicVF73p9+zvKfmlFZpi9d4zgrMWd9vbyPsZIdIHuN5cgNZGzmWdjdpJjlERMNPwKHauPaQbfRfY4VRpA5s7BaQ3NqhlpVXhpJcCGkhG0r8GX6Q1ys7HXrrwSLpidXsl992B79+GPi4GB9tgR1CtqsLFzcKbbd+/j76xqkGzAl1p2JxYeZswgj5c/Mg5K2bA7MquHtxWz4N1Tkj", e()).setDeviceID(str2).setClientType(1).setOVRegionType(0).build();
            long currentTimeMillis = System.currentTimeMillis();
            PglMSManagerUtils.init(a10, build);
            com.bytedance.sdk.openadsdk.h.b.a().a("init", currentTimeMillis);
            d();
            PglMSManager pglMSManager = this.f12299a;
            if (pglMSManager != null) {
                pglMSManager.setDeviceID(str2);
            }
            l.c("mssdk", "init: 成功");
            return true;
        } catch (Throwable th) {
            l.c("mssdk", "init: 失败");
            l.b("MSSdkImpl", "appid 为空，初始化失败！或不包含mssdk模块", th);
            f();
            return false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.h.a
    public String b() {
        try {
            Context a10 = m.a();
            return a(MessageDigest.getInstance("SHA1").digest(a10.getPackageManager().getPackageInfo(a10.getPackageName(), 64).signatures[0].toByteArray())).toUpperCase();
        } catch (Throwable unused) {
            return "0000000000000000000000000000000000000000";
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.h.a
    public void a(final String str) {
        if (c()) {
            d();
            if (this.f12299a != null) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    e.a(new g("updateDid") { // from class: com.bytedance.sdk.openadsdk.core.h.b.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (b.this.f12299a != null) {
                                long currentTimeMillis = System.currentTimeMillis();
                                b.this.f12299a.setDeviceID(str);
                                com.bytedance.sdk.openadsdk.h.b.a().a("setDeviceID", currentTimeMillis);
                            }
                        }
                    });
                } else {
                    this.f12299a.setDeviceID(str);
                }
                l.c("mssdk did: ", str);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.h.a
    public String a() {
        if (c()) {
            d();
            if (this.f12299a != null) {
                long currentTimeMillis = System.currentTimeMillis();
                String token = this.f12299a.getToken();
                com.bytedance.sdk.openadsdk.h.b.a().a("getToken", currentTimeMillis);
                l.c("mssdk", "secDeviceToken: " + token);
                return token;
            }
            return "";
        }
        return "";
    }

    @Override // com.bytedance.sdk.openadsdk.core.h.a
    public Map<String, String> a(String str, byte[] bArr) {
        if (!c()) {
            return new HashMap();
        }
        d();
        if (this.f12299a != null) {
            long currentTimeMillis = System.currentTimeMillis();
            Map<String, String> featureHash = this.f12299a.getFeatureHash(str, bArr);
            com.bytedance.sdk.openadsdk.h.b.a().a("getFeatureHash", currentTimeMillis);
            return featureHash;
        }
        return new HashMap();
    }

    private static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        char[] charArray = "0123456789abcdef".toCharArray();
        char[] cArr = new char[bArr.length * 2];
        for (byte b10 = 0; b10 < bArr.length; b10 = (byte) (b10 + 1)) {
            int i10 = bArr[b10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
            int i11 = b10 * 2;
            cArr[i11] = charArray[i10 >>> 4];
            cArr[i11 + 1] = charArray[i10 & 15];
        }
        return new String(cArr);
    }
}
