package com.google.android.gms.internal.ads;

import android.os.StrictMode;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbib {
    public static Object zza(zzfpj zzfpjVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return zzfpjVar.zza();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
