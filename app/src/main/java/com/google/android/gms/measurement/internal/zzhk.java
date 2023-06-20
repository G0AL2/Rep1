package com.google.android.gms.measurement.internal;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzhk implements zzes {
    final /* synthetic */ zzgi zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhk(zzhl zzhlVar, zzgi zzgiVar) {
        this.zza = zzgiVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzes
    public final boolean zza() {
        return this.zza.zzL() && Log.isLoggable(this.zza.zzaz().zzq(), 3);
    }
}
