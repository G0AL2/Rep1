package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaqd extends zzaqn {
    private List zzi;

    public zzaqd(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i10, int i11) {
        super(zzapcVar, "EQnlrBUlHjk2AEt0zmKDh6D/4LKq1nD5m8E6B+NGkhfc83YRi+bdMQpWJDofZ7UC", "vT7QqRHPYW89dMOJkMQAS7XgxAAvbeOb6ybNiPRYWg8=", zzaliVar, i10, 31);
        this.zzi = null;
    }

    @Override // com.google.android.gms.internal.ads.zzaqn
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzV(-1L);
        this.zze.zzR(-1L);
        if (this.zzi == null) {
            this.zzi = (List) this.zzf.invoke(null, this.zzb.zzb());
        }
        List list = this.zzi;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.zze) {
            this.zze.zzV(((Long) this.zzi.get(0)).longValue());
            this.zze.zzR(((Long) this.zzi.get(1)).longValue());
        }
    }
}
