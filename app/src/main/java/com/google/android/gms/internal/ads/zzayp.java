package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzayp extends IOException {
    public final zzayl zza;

    public zzayp(IOException iOException, zzayl zzaylVar, int i10) {
        super(iOException);
        this.zza = zzaylVar;
    }

    public zzayp(String str, zzayl zzaylVar, int i10) {
        super(str);
        this.zza = zzaylVar;
    }

    public zzayp(String str, IOException iOException, zzayl zzaylVar, int i10) {
        super(str, iOException);
        this.zza = zzaylVar;
    }
}
