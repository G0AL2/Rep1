package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzapv extends zzaqn {
    private final Map zzi;
    private final View zzj;

    public zzapv(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i10, int i11, Map map, View view) {
        super(zzapcVar, "e6wNdaLD6UNhzFmw+sulW0Dd6tS/ZIj4VP2rchYxgmyyl8SG0R852+ZvHvO065lU", "4WajQiAzbn6P/4aXItZyiVPs318La/hzY2eQhgLxpjo=", zzaliVar, i10, 85);
        this.zzi = map;
        this.zzj = view;
    }

    private final long zzc(int i10) {
        Map map = this.zzi;
        Integer valueOf = Integer.valueOf(i10);
        if (map.containsKey(valueOf)) {
            return ((Long) this.zzi.get(valueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzaqn
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = (long[]) this.zzf.invoke(null, new long[]{zzc(1), zzc(2)}, this.zzb.zzb(), this.zzj);
        long j10 = jArr[0];
        this.zzi.put(1, Long.valueOf(jArr[1]));
        long j11 = jArr[2];
        this.zzi.put(2, Long.valueOf(jArr[3]));
        synchronized (this.zze) {
            this.zze.zzu(j10);
            this.zze.zzt(j11);
        }
    }
}
