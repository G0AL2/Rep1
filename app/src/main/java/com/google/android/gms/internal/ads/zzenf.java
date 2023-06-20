package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.content.b;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzenf implements zzetg {
    private final Context zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzenf(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcr)).booleanValue()) {
            return zzfvc.zzi(new zzeng(b.a(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
        }
        return zzfvc.zzi(null);
    }
}
