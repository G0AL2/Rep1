package com.google.firebase.auth.internal;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private boolean f23282a;

    /* renamed from: b  reason: collision with root package name */
    private String f23283b;

    private e() {
    }

    public static e a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map b10 = c.b(str);
        try {
            e eVar = new e();
            Object obj = b10.get("basicIntegrity");
            boolean z10 = false;
            if (obj != null && ((Boolean) obj).booleanValue()) {
                z10 = true;
            }
            eVar.f23282a = z10;
            String str2 = (String) b10.get("advice");
            if (str2 == null) {
                str2 = "";
            }
            eVar.f23283b = str2;
            return eVar;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public final String b() {
        return this.f23283b;
    }

    public final boolean c() {
        return this.f23282a;
    }
}
