package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzapm extends zzaqn {
    private final Activity zzi;
    private final View zzj;

    public zzapm(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i10, int i11, View view, Activity activity) {
        super(zzapcVar, "bJ19ecmml/ZL+PAjNo6P4un4UIg2zol83OavxH1sy4lr9vgJAAspRAybhuIko55U", "vAwaartPSmuJV+jFjOXlfyM3UPFY8tl7jDP13kq4YYw=", zzaliVar, i10, 62);
        this.zzj = view;
        this.zzi = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzaqn
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzj == null) {
            return;
        }
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzce)).booleanValue();
        Object[] objArr = (Object[]) this.zzf.invoke(null, this.zzj, this.zzi, Boolean.valueOf(booleanValue));
        synchronized (this.zze) {
            this.zze.zzc(((Long) objArr[0]).longValue());
            this.zze.zze(((Long) objArr[1]).longValue());
            if (booleanValue) {
                this.zze.zzd((String) objArr[2]);
            }
        }
    }
}
