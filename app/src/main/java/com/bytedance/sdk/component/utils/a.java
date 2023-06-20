package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import java.security.SecureRandom;
import org.json.JSONObject;

/* compiled from: AESUtils.java */
/* loaded from: classes.dex */
public class a {
    public static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            return jSONObject2;
        }
        try {
            try {
                String a10 = a(jSONObject.toString());
                if (!TextUtils.isEmpty(a10)) {
                    jSONObject2.put("message", a10);
                    jSONObject2.put("cypher", 3);
                } else {
                    jSONObject2.put("message", jSONObject.toString());
                    jSONObject2.put("cypher", 0);
                }
            } catch (Throwable unused) {
                jSONObject2.put("message", jSONObject.toString());
                jSONObject2.put("cypher", 0);
            }
        } catch (Throwable th) {
            l.a(th.getMessage());
        }
        return jSONObject2;
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 49) {
            return str;
        }
        String a10 = a(str.substring(1, 33), 32);
        String substring = str.substring(33, 49);
        return (substring == null || a10 == null) ? str : com.bytedance.sdk.component.c.a.b(str.substring(49), substring, a10);
    }

    public static String b() {
        String a10 = a(8);
        if (a10 == null || a10.length() != 16) {
            return null;
        }
        return a10;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String a10 = a();
        String a11 = a(a10, 32);
        String b10 = b();
        String str2 = null;
        if (a11 != null && b10 != null) {
            str2 = com.bytedance.sdk.component.c.a.a(str, b10, a11);
        }
        return 3 + a10 + b10 + str2;
    }

    public static String a() {
        String a10 = a(16);
        if (a10 == null || a10.length() != 32) {
            return null;
        }
        return a10;
    }

    public static String a(String str, int i10) {
        if (str == null || str.length() != i10) {
            return null;
        }
        int i11 = i10 / 2;
        return str.substring(i11, i10) + str.substring(0, i11);
    }

    public static String a(int i10) {
        try {
            byte[] bArr = new byte[i10];
            new SecureRandom().nextBytes(bArr);
            return e.a(bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
