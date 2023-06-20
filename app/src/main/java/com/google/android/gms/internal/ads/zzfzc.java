package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfzc extends ThreadLocal {
    protected static final Cipher zza() {
        try {
            return (Cipher) zzghs.zza.zza("AES/GCM-SIV/NoPadding");
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
