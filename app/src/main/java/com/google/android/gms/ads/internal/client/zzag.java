package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbpm;
import com.google.android.gms.internal.ads.zzbpn;
import com.google.android.gms.internal.ads.zzbpr;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzag extends zzav {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbua zzb;
    final /* synthetic */ OnH5AdsEventListener zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzag(zzau zzauVar, Context context, zzbua zzbuaVar, OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = context;
        this.zzb = zzbuaVar;
        this.zzc = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    protected final /* synthetic */ Object zza() {
        return new zzbpr();
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzccVar) throws RemoteException {
        return zzccVar.zzj(ObjectWrapper.wrap(this.zza), this.zzb, 221908000, new zzbpe(this.zzc));
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        try {
            return ((zzbpn) zzcfm.zzb(this.zza, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", new zzcfk() { // from class: com.google.android.gms.ads.internal.client.zzaf
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcfk
                public final Object zza(Object obj) {
                    return zzbpm.zzb(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza), this.zzb, 221908000, new zzbpe(this.zzc));
        } catch (RemoteException | zzcfl | NullPointerException unused) {
            return null;
        }
    }
}
