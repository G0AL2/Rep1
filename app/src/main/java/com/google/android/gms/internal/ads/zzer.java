package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzer extends IOException {
    public final int zza;

    public zzer(int i10) {
        this.zza = i10;
    }

    public zzer(String str, int i10) {
        super(str);
        this.zza = i10;
    }

    public zzer(String str, Throwable th, int i10) {
        super(str, th);
        this.zza = i10;
    }

    public zzer(Throwable th, int i10) {
        super(th);
        this.zza = i10;
    }
}
