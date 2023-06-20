package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzlh {
    final String zza;
    long zzb;

    private zzlh(zzli zzliVar, String str) {
        this.zza = str;
        this.zzb = zzliVar.zzaw().elapsedRealtime();
    }
}
