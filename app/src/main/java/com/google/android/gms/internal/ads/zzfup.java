package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfup extends zzfuc {
    private zzfuo zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfup(zzfre zzfreVar, boolean z10, Executor executor, Callable callable) {
        super(zzfreVar, z10, false);
        this.zza = new zzfun(this, callable, executor);
        zzw();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzfuo zzG(zzfup zzfupVar, zzfuo zzfuoVar) {
        zzfupVar.zza = null;
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfuc
    final void zzg(int i10, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    protected final void zzr() {
        zzfuo zzfuoVar = this.zza;
        if (zzfuoVar != null) {
            zzfuoVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuc
    final void zzv() {
        zzfuo zzfuoVar = this.zza;
        if (zzfuoVar != null) {
            zzfuoVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuc
    final void zzz(int i10) {
        super.zzz(i10);
        if (i10 == 1) {
            this.zza = null;
        }
    }
}
