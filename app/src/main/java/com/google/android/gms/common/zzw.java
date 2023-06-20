package com.google.android.gms.common;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes2.dex */
public class zzw {
    private static final zzw zzd = new zzw(true, null, null);
    final boolean zza;
    final String zzb;
    final Throwable zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzw(boolean z10, String str, Throwable th) {
        this.zza = z10;
        this.zzb = str;
        this.zzc = th;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzw zzb() {
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzw zzc(String str) {
        return new zzw(false, str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzw zzd(String str, Throwable th) {
        return new zzw(false, str, th);
    }

    String zza() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze() {
        if (this.zza || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.zzc != null) {
            Log.d("GoogleCertificatesRslt", zza(), this.zzc);
        } else {
            Log.d("GoogleCertificatesRslt", zza());
        }
    }
}
