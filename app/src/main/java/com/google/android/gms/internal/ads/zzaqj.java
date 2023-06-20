package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaqj extends zzaqn {
    public zzaqj(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i10, int i11) {
        super(zzapcVar, "tGUqnRBT0Z8VLsYZLT0IoD5T4HRaaLpJNvmxlM5fu89BQ2YOdHgaf4qUlK58s24H", "LZbLZn8XvuN809srP2sgyvIe+LVffcIatfOggVsL/5c=", zzaliVar, i10, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzaqn
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzae(3);
        boolean booleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
        synchronized (this.zze) {
            if (booleanValue) {
                this.zze.zzae(2);
            } else {
                this.zze.zzae(1);
            }
        }
    }
}
