package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaps extends zzaqn {
    private final long zzi;

    public zzaps(zzapc zzapcVar, String str, String str2, zzali zzaliVar, long j10, int i10, int i11) {
        super(zzapcVar, "FmiCZESJMiUiPEVFp8/sySGg9zk5i1lJsy88E60+KsD4lJB1UVftaJnD830H1Cnc", "B8qnIZWGEs7xms3SbQDilR0QM+SibSnQfZbTzlo06bE=", zzaliVar, i10, 25);
        this.zzi = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzaqn
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzf.invoke(null, new Object[0])).longValue();
        synchronized (this.zze) {
            this.zze.zzs(longValue);
            long j10 = this.zzi;
            if (j10 != 0) {
                this.zze.zzS(longValue - j10);
                this.zze.zzT(this.zzi);
            }
        }
    }
}
