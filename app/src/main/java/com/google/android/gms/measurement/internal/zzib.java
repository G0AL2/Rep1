package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzib implements zzlo {
    final /* synthetic */ zzin zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzib(zzin zzinVar) {
        this.zza = zzinVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzlo
    public final void zza(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.zza.zzG("auto", "_err", bundle, str);
        } else {
            this.zza.zzE("auto", "_err", bundle);
        }
    }
}
