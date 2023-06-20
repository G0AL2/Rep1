package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzbxn;
import com.google.android.gms.internal.ads.zzbxo;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzae extends zzav {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbua zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzae(zzau zzauVar, Context context, zzbua zzbuaVar) {
        this.zza = context;
        this.zzb = zzbuaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    protected final /* bridge */ /* synthetic */ Object zza() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzccVar) throws RemoteException {
        return zzccVar.zzk(ObjectWrapper.wrap(this.zza), this.zzb, 221908000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        try {
            return ((zzbxo) zzcfm.zzb(this.zza, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", new zzcfk() { // from class: com.google.android.gms.ads.internal.client.zzad
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcfk
                public final Object zza(Object obj) {
                    return zzbxn.zzb(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza), this.zzb, 221908000);
        } catch (RemoteException | zzcfl | NullPointerException unused) {
            return null;
        }
    }
}
