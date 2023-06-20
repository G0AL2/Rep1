package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlr  reason: invalid package */
/* loaded from: classes2.dex */
final class zzlr extends ThreadLocal {
    protected static final Cipher zza() {
        try {
            return (Cipher) zzmh.zza.zza("AES/ECB/NOPADDING");
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
