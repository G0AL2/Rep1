package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvs  reason: invalid package */
/* loaded from: classes2.dex */
public enum zzvs {
    REFRESH_TOKEN("refresh_token"),
    AUTHORIZATION_CODE("authorization_code");
    
    private final String zzd;

    zzvs(String str) {
        this.zzd = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzd;
    }
}
