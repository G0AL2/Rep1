package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzela {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzduc zzb;

    public zzela(zzduc zzducVar) {
        this.zzb = zzducVar;
    }

    public final zzbvt zza(String str) {
        if (this.zza.containsKey(str)) {
            return (zzbvt) this.zza.get(str);
        }
        return null;
    }

    public final void zzb(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e10) {
            zzcfi.zzh("Couldn't create RTB adapter : ", e10);
        }
    }
}
