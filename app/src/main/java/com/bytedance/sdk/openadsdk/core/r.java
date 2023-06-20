package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SecSdkHelper.java */
/* loaded from: classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private static com.bytedance.sdk.openadsdk.core.h.a f12736a;

    /* renamed from: b  reason: collision with root package name */
    private String f12737b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SecSdkHelper.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final r f12738a = new r();
    }

    private boolean c(String str) {
        String[] split;
        if (TextUtils.isEmpty(str) || (split = str.split(":")) == null || split.length < 20) {
            return false;
        }
        for (String str2 : split) {
            if (!"00".equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public void a(String str) {
        com.bytedance.sdk.openadsdk.core.h.a aVar;
        if (TextUtils.isEmpty(str) || (aVar = f12736a) == null) {
            return;
        }
        aVar.a(str);
    }

    public void b(String str) {
        com.bytedance.sdk.openadsdk.core.h.a aVar = f12736a;
        if (aVar != null) {
            aVar.b(str);
        }
    }

    private r() {
        this.f12737b = null;
        f12736a = new com.bytedance.sdk.openadsdk.core.h.b();
    }

    public String b() {
        try {
            com.bytedance.sdk.component.utils.l.c("mssdk", "进入getSha1");
            if (!TextUtils.isEmpty(this.f12737b)) {
                com.bytedance.sdk.component.utils.l.c("mssdk", "sha1 内存 getSha1 " + this.f12737b);
                return this.f12737b;
            }
            String a10 = h.a("sdk_app_sha1", 2592000000L);
            this.f12737b = a10;
            if (!TextUtils.isEmpty(a10)) {
                com.bytedance.sdk.component.utils.l.c("mssdk", "sha1 return sha1: " + this.f12737b);
                return this.f12737b;
            }
            com.bytedance.sdk.openadsdk.core.h.a aVar = f12736a;
            if (aVar != null) {
                this.f12737b = aVar.b();
                com.bytedance.sdk.component.utils.l.c("mssdk", "sha1: mssdk:  " + this.f12737b);
            }
            if (c(this.f12737b)) {
                String upperCase = this.f12737b.toUpperCase();
                this.f12737b = upperCase;
                h.a("sdk_app_sha1", upperCase);
                return this.f12737b;
            }
            String a11 = com.bytedance.sdk.component.utils.c.a(m.a());
            this.f12737b = a11;
            if (c(a11)) {
                String upperCase2 = this.f12737b.toUpperCase();
                this.f12737b = upperCase2;
                h.a("sdk_app_sha1", upperCase2);
                return this.f12737b;
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static r a() {
        return a.f12738a;
    }

    public Map<String, String> a(String str, byte[] bArr) {
        com.bytedance.sdk.openadsdk.core.h.a aVar = f12736a;
        if (aVar != null) {
            return aVar.a("https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250", bArr);
        }
        return new HashMap();
    }

    public String c() {
        com.bytedance.sdk.openadsdk.core.h.a aVar = f12736a;
        if (aVar != null) {
            String a10 = aVar.a();
            com.bytedance.sdk.component.utils.l.c("mssdk", "sec_did: " + a10);
            return a10 != null ? a10 : "";
        }
        return "";
    }
}
