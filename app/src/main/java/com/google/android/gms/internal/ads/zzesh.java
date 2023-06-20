package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzesh implements zzetf {
    private final String zza;

    public zzesh(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        ((Bundle) obj).putString("rtb", this.zza);
    }
}
