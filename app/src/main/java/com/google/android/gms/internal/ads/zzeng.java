package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeng implements zzetf {
    private final boolean zza;

    public zzeng(boolean z10) {
        this.zza = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        ((Bundle) obj).putString("adid_p", true != this.zza ? "0" : "1");
    }
}
