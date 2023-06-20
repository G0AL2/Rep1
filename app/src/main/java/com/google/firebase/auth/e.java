package com.google.firebase.auth;

import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public class e {

    /* renamed from: d  reason: collision with root package name */
    private static final Map f23260d;

    /* renamed from: a  reason: collision with root package name */
    private final String f23261a;

    /* renamed from: b  reason: collision with root package name */
    private final String f23262b;

    /* renamed from: c  reason: collision with root package name */
    private final String f23263c;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("recoverEmail", 2);
        hashMap.put("resetPassword", 0);
        hashMap.put("signIn", 4);
        hashMap.put("verifyEmail", 1);
        hashMap.put("verifyBeforeChangeEmail", 5);
        hashMap.put("revertSecondFactorAddition", 6);
        f23260d = Collections.unmodifiableMap(hashMap);
    }

    private e(String str) {
        String e10 = e(str, "apiKey");
        String e11 = e(str, "oobCode");
        String e12 = e(str, "mode");
        if (e10 != null && e11 != null && e12 != null) {
            Preconditions.checkNotEmpty(e10);
            this.f23261a = Preconditions.checkNotEmpty(e11);
            this.f23262b = Preconditions.checkNotEmpty(e12);
            e(str, "continueUrl");
            e(str, "languageCode");
            this.f23263c = e(str, "tenantId");
            return;
        }
        throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", "apiKey", "oobCode", "mode"));
    }

    public static e c(String str) {
        Preconditions.checkNotEmpty(str);
        try {
            return new e(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static String e(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(Preconditions.checkNotEmpty(parse.getQueryParameter("link"))).getQueryParameter(str2);
            }
            return null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }

    public String a() {
        return this.f23261a;
    }

    public int b() {
        Map map = f23260d;
        if (map.containsKey(this.f23262b)) {
            return ((Integer) map.get(this.f23262b)).intValue();
        }
        return 3;
    }

    public final String d() {
        return this.f23263c;
    }
}
