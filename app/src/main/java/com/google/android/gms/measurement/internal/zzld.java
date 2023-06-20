package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzld implements zzlo {
    final /* synthetic */ zzli zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzld(zzli zzliVar) {
        this.zza = zzliVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzlo
    public final void zza(String str, String str2, Bundle bundle) {
        zzgi zzgiVar;
        zzgi zzgiVar2;
        if (!TextUtils.isEmpty(str)) {
            this.zza.zzaA().zzp(new zzlc(this, str, "_err", bundle));
            return;
        }
        zzli zzliVar = this.zza;
        zzgiVar = zzliVar.zzn;
        if (zzgiVar != null) {
            zzgiVar2 = zzliVar.zzn;
            zzgiVar2.zzaz().zzd().zzb("AppId not known when logging event", "_err");
        }
    }
}
