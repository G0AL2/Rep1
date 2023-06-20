package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbki {
    private final Context zza;

    public zzbki(Context context) {
        this.zza = context;
    }

    public final void zza(zzbzf zzbzfVar) {
        try {
            ((zzbkj) zzcfm.zzb(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new zzcfk() { // from class: com.google.android.gms.internal.ads.zzbkh
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcfk
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    return queryLocalInterface instanceof zzbkj ? (zzbkj) queryLocalInterface : new zzbkj(obj);
                }
            })).zze(zzbzfVar);
        } catch (RemoteException e10) {
            zzcfi.zzj("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e10.getMessage())));
        } catch (zzcfl e11) {
            zzcfi.zzj("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e11.getMessage())));
        }
    }
}
