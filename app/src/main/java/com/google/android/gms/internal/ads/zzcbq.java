package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcbq {
    public static final zzcbe zza(Context context, String str, zzbua zzbuaVar) {
        try {
            IBinder zze = ((zzcbi) zzcfm.zzb(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new zzcfk() { // from class: com.google.android.gms.internal.ads.zzcbp
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcfk
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    return queryLocalInterface instanceof zzcbi ? (zzcbi) queryLocalInterface : new zzcbi(obj);
                }
            })).zze(ObjectWrapper.wrap(context), str, zzbuaVar, 221908000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return queryLocalInterface instanceof zzcbe ? (zzcbe) queryLocalInterface : new zzcbc(zze);
        } catch (RemoteException | zzcfl e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
            return null;
        }
    }
}
