package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzvr {
    private final Handler zza;
    private final zzvt zzb;
    private boolean zzc;

    public zzvr(Handler handler, zzvt zzvtVar) {
        this.zza = handler;
        this.zzb = zzvtVar;
    }

    public final void zzc() {
        this.zzc = true;
    }
}
