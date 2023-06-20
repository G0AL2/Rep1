package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbsg extends zzcgh {
    private final Object zza = new Object();
    private final zzbsl zzb;
    private boolean zzc;

    public zzbsg(zzbsl zzbslVar) {
        this.zzb = zzbslVar;
    }

    public final void zzb() {
        synchronized (this.zza) {
            if (this.zzc) {
                return;
            }
            this.zzc = true;
            zzi(new zzbsd(this), new zzcgd());
            zzi(new zzbse(this), new zzbsf(this));
        }
    }
}
