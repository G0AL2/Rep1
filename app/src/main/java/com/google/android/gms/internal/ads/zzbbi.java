package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzbbi implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzbbm zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbi(zzbbm zzbbmVar, View view) {
        this.zzb = zzbbmVar;
        this.zza = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc(this.zza);
    }
}
