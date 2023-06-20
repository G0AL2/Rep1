package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import androidx.collection.a;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.auth.PhoneAuthProvider;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuv  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzuv {
    private static final Map zza = new a();

    public static PhoneAuthProvider.a zza(String str, PhoneAuthProvider.a aVar, zzuh zzuhVar) {
        zze(str, zzuhVar);
        return new zzut(aVar, str);
    }

    public static void zzc() {
        zza.clear();
    }

    public static boolean zzd(String str, PhoneAuthProvider.a aVar, Activity activity, Executor executor) {
        Map map = zza;
        if (map.containsKey(str)) {
            zzuu zzuuVar = (zzuu) map.get(str);
            if (DefaultClock.getInstance().currentTimeMillis() - zzuuVar.zzb < 120000) {
                zzuh zzuhVar = zzuuVar.zza;
                if (zzuhVar != null) {
                    zzuhVar.zzh(aVar, activity, executor, str);
                    return true;
                }
                return true;
            }
            zze(str, null);
            return false;
        }
        zze(str, null);
        return false;
    }

    private static void zze(String str, zzuh zzuhVar) {
        zza.put(str, new zzuu(zzuhVar, DefaultClock.getInstance().currentTimeMillis()));
    }
}
