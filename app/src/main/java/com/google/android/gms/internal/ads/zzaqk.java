package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaqk extends zzaqn {
    private final View zzi;

    public zzaqk(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i10, int i11, View view) {
        super(zzapcVar, "f7Ni+qJ74MqRBDIn5zt+Qvnt6llN8c82PMULXlCAep3wzIprbOB6YjqpQItX7QwB", "MVJdjUEx+rB88W0UPnVsndOuLU6aovPyFF5b36lJGoA=", zzaliVar, i10, 57);
        this.zzi = view;
    }

    @Override // com.google.android.gms.internal.ads.zzaqn
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcB);
            Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzip);
            zzapg zzapgVar = new zzapg((String) this.zzf.invoke(null, this.zzi, this.zzb.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzalw zza = zzalx.zza();
            zza.zzb(zzapgVar.zza.longValue());
            zza.zzd(zzapgVar.zzb.longValue());
            zza.zze(zzapgVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zza.zzc(zzapgVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zza.zza(zzapgVar.zzd.longValue());
            }
            this.zze.zzX((zzalx) zza.zzal());
        }
    }
}
