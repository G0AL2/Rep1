package com.google.firebase.auth.internal;

import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.p002firebaseauthapi.zznd;
import com.google.firebase.auth.t;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f23280a = new Logger("GetTokenResultFactory", new String[0]);

    public static t a(String str) {
        Map hashMap;
        try {
            hashMap = c.b(str);
        } catch (zznd e10) {
            f23280a.e("Error parsing token claims", e10, new Object[0]);
            hashMap = new HashMap();
        }
        return new t(str, hashMap);
    }
}
