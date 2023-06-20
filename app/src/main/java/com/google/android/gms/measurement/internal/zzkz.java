package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzkz implements zzfa {
    final /* synthetic */ String zza;
    final /* synthetic */ zzli zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkz(zzli zzliVar, String str) {
        this.zzb = zzliVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.measurement.internal.zzfa
    public final void zza(String str, int i10, Throwable th, byte[] bArr, Map map) {
        this.zzb.zzJ(i10, th, bArr, this.zza);
    }
}
