package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeqf implements zzetf {
    public final Bundle zza;

    public zzeqf(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        ((Bundle) obj).putBundle("content_info", this.zza);
    }
}
