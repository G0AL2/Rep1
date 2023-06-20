package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import java.io.UnsupportedEncodingException;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwg  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzwg {
    public static long zza(String str) {
        zzwh zzb = zzb(str);
        return zzb.zzb().longValue() - zzb.zzc().longValue();
    }

    public static zzwh zzb(String str) {
        Preconditions.checkNotEmpty(str);
        List zzd = zzad.zzb('.').zzd(str);
        if (zzd.size() >= 2) {
            try {
                return zzwh.zza(new String(Base64Utils.decodeUrlSafeNoPadding((String) zzd.get(1)), "UTF-8"));
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("Unable to decode token", e10);
            }
        }
        throw new RuntimeException("Invalid idToken ".concat(String.valueOf(str)));
    }
}
