package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzapy extends zzaqn {
    private final zzaog zzi;
    private final long zzj;
    private final long zzk;

    public zzapy(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i10, int i11, zzaog zzaogVar, long j10, long j11) {
        super(zzapcVar, "XdACBmHPjNtNHtvuxJIzO5INAuD0sY2N7kIXkPlZf2/7KHZWQ+7Wr4DDubVydJNF", "y+g//F0lHk9VQdkf/Jc605unsex1+WIt3b6Nn2DqnLo=", zzaliVar, i10, 11);
        this.zzi = zzaogVar;
        this.zzj = j10;
        this.zzk = j11;
    }

    @Override // com.google.android.gms.internal.ads.zzaqn
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzaog zzaogVar = this.zzi;
        if (zzaogVar != null) {
            zzaoe zzaoeVar = new zzaoe((String) this.zzf.invoke(null, zzaogVar.zzb(), Long.valueOf(this.zzj), Long.valueOf(this.zzk)));
            synchronized (this.zze) {
                this.zze.zzy(zzaoeVar.zza.longValue());
                if (zzaoeVar.zzb.longValue() >= 0) {
                    this.zze.zzP(zzaoeVar.zzb.longValue());
                }
                if (zzaoeVar.zzc.longValue() >= 0) {
                    this.zze.zzf(zzaoeVar.zzc.longValue());
                }
            }
        }
    }
}
