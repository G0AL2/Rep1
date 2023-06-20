package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmu  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzmu extends ThreadLocal {
    final /* synthetic */ zzmv zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmu(zzmv zzmvVar) {
        this.zza = zzmvVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: zza */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            zzmh zzmhVar = zzmh.zzb;
            str = this.zza.zzb;
            Mac mac = (Mac) zzmhVar.zza(str);
            key = this.zza.zzc;
            mac.init(key);
            return mac;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
