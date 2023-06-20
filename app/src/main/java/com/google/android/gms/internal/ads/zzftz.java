package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzftz extends zzfus implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    zzfvl zza;
    Object zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzftz(zzfvl zzfvlVar, Object obj) {
        Objects.requireNonNull(zzfvlVar);
        this.zza = zzfvlVar;
        Objects.requireNonNull(obj);
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfvl zzfvlVar = this.zza;
        Object obj = this.zzb;
        if ((isCancelled() | (zzfvlVar == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (zzfvlVar.isCancelled()) {
            zzt(zzfvlVar);
            return;
        }
        try {
            try {
                Object zzf = zzf(obj, zzfvc.zzp(zzfvlVar));
                this.zzb = null;
                zzg(zzf);
            } catch (Throwable th) {
                try {
                    zze(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e10) {
            zze(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e11) {
            zze(e11);
        } catch (ExecutionException e12) {
            zze(e12.getCause());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzftt
    public final String zza() {
        String str;
        zzfvl zzfvlVar = this.zza;
        Object obj = this.zzb;
        String zza = super.zza();
        if (zzfvlVar != null) {
            str = "inputFuture=[" + zzfvlVar + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (zza != null) {
                return str.concat(zza);
            }
            return null;
        }
        return str + "function=[" + obj + "]";
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    protected final void zzb() {
        zzs(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    abstract Object zzf(Object obj, Object obj2) throws Exception;

    abstract void zzg(Object obj);
}
