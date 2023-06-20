package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzcgx extends TextureView implements zzchu {
    protected final zzchl zza;
    protected final zzchv zzb;

    public zzcgx(Context context) {
        super(context);
        this.zza = new zzchl();
        this.zzb = new zzchv(context, this);
    }

    public void zzA(int i10) {
    }

    public void zzB(String str, String[] strArr) {
        zzs(str);
    }

    public abstract int zza();

    public abstract int zzb();

    public abstract int zzc();

    public abstract int zzd();

    public abstract int zze();

    public abstract long zzf();

    public abstract long zzg();

    public abstract long zzh();

    public abstract String zzj();

    public abstract void zzn();

    public abstract void zzo();

    public abstract void zzp();

    public abstract void zzq(int i10);

    public abstract void zzr(zzcgw zzcgwVar);

    public abstract void zzs(String str);

    public abstract void zzt();

    public abstract void zzu(float f10, float f11);

    public void zzw(int i10) {
    }

    public void zzx(int i10) {
    }

    public void zzy(int i10) {
    }

    public void zzz(int i10) {
    }
}
