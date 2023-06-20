package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcxd extends zzcvv {
    private final zzbms zzc;
    private final Runnable zzd;
    private final Executor zze;

    public zzcxd(zzcxw zzcxwVar, zzbms zzbmsVar, Runnable runnable, Executor executor) {
        super(zzcxwVar);
        this.zzc = zzbmsVar;
        this.zzd = runnable;
        this.zze = executor;
    }

    public static /* synthetic */ void zzi(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxx
    public final void zzW() {
        final zzcxb zzcxbVar = new zzcxb(new AtomicReference(this.zzd));
        this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcxc
            @Override // java.lang.Runnable
            public final void run() {
                zzcxd.this.zzk(zzcxbVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final View zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final com.google.android.gms.ads.internal.client.zzdk zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final zzfbm zze() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final zzfbm zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zzh(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar) {
    }

    public final /* synthetic */ void zzk(Runnable runnable) {
        try {
            if (this.zzc.zzb(ObjectWrapper.wrap(runnable))) {
                return;
            }
            zzi(((zzcxb) runnable).zza);
        } catch (RemoteException unused) {
            zzi(((zzcxb) runnable).zza);
        }
    }
}
