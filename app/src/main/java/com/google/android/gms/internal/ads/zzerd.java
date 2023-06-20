package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzerd implements zzetf {
    public final zzfbk zza;

    public zzerd(zzfbk zzfbkVar) {
        this.zza = zzfbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfbk zzfbkVar = this.zza;
        if (zzfbkVar != null) {
            bundle.putBoolean("render_in_browser", zzfbkVar.zzd());
            bundle.putBoolean("disable_ml", this.zza.zzc());
        }
    }
}
