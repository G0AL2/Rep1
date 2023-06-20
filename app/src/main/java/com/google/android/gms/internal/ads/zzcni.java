package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcni {
    private final zzcfo zza;
    private final Context zzb;
    private final WeakReference zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcni(zzcng zzcngVar, zzcnh zzcnhVar) {
        zzcfo zzcfoVar;
        Context context;
        WeakReference weakReference;
        zzcfoVar = zzcngVar.zza;
        this.zza = zzcfoVar;
        context = zzcngVar.zzb;
        this.zzb = context;
        weakReference = zzcngVar.zzc;
        this.zzc = weakReference;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context zza() {
        return this.zzb;
    }

    public final zzaoc zzb() {
        return new zzaoc(new com.google.android.gms.ads.internal.zzi(this.zzb, this.zza));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzbki zzc() {
        return new zzbki(this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzcfo zzd() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zze() {
        return com.google.android.gms.ads.internal.zzt.zzp().zzc(this.zzb, this.zza.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final WeakReference zzf() {
        return this.zzc;
    }
}
