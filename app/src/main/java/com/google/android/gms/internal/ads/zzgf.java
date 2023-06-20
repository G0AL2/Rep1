package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgf {
    private final Context zza;
    private final zzgd zzb;

    public zzgf(Context context, Handler handler, zzge zzgeVar) {
        this.zza = context.getApplicationContext();
        this.zzb = new zzgd(this, handler, zzgeVar);
    }
}
