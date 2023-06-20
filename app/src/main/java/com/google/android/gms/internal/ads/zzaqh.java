package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaqh extends zzaqn {
    private final zzapj zzi;
    private long zzj;

    public zzaqh(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i10, int i11, zzapj zzapjVar) {
        super(zzapcVar, "03Rb8b+VDPWNz2ZsdwvaSzyRMvfwK65RukwsWnYSmw87NOTFb26HoizUZBquofyN", "4NlIZpWANWCeruMUGSc5tEkf3o6K0hyRt+/1nSu0QU8=", zzaliVar, i10, 53);
        this.zzi = zzapjVar;
        if (zzapjVar != null) {
            this.zzj = zzapjVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqn
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            this.zze.zzO(((Long) this.zzf.invoke(null, Long.valueOf(this.zzj))).longValue());
        }
    }
}
