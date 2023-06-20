package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzfuo extends zzfvk {
    private final Executor zza;
    final /* synthetic */ zzfup zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfuo(zzfup zzfupVar, Executor executor) {
        this.zzb = zzfupVar;
        Objects.requireNonNull(executor);
        this.zza = executor;
    }

    abstract void zzc(Object obj);

    @Override // com.google.android.gms.internal.ads.zzfvk
    final void zzd(Throwable th) {
        zzfup.zzG(this.zzb, (zzfuo) null);
        if (th instanceof ExecutionException) {
            this.zzb.zze(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.zzb.cancel(false);
        } else {
            this.zzb.zze(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    final void zze(Object obj) {
        zzfup.zzG(this.zzb, (zzfuo) null);
        zzc(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e10) {
            this.zzb.zze(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    final boolean zzg() {
        return this.zzb.isDone();
    }
}
