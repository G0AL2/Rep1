package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeqn implements zzetf {
    private final boolean zza;

    public zzeqn(boolean z10) {
        this.zza = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        ((Bundle) obj).putBoolean("is_gbid", this.zza);
    }
}
