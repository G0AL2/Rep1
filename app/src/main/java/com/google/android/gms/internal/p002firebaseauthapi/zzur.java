package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.PhoneAuthCredential;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzur  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzur {
    public static zzxm zza(PhoneAuthCredential phoneAuthCredential) {
        if (!TextUtils.isEmpty(phoneAuthCredential.zzh())) {
            return zzxm.zzc(phoneAuthCredential.zzf(), phoneAuthCredential.zzh(), phoneAuthCredential.zzi());
        }
        return zzxm.zzb(phoneAuthCredential.zzg(), phoneAuthCredential.l1(), phoneAuthCredential.zzi());
    }
}
