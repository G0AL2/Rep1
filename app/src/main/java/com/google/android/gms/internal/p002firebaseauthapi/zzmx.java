package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.SecureRandom;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmx  reason: invalid package */
/* loaded from: classes2.dex */
final class zzmx extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
