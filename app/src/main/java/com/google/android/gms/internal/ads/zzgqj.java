package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgqj extends zzgqm {
    final Logger zza;

    public zzgqj(String str) {
        this.zza = Logger.getLogger(str);
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    public final void zza(String str) {
        this.zza.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
