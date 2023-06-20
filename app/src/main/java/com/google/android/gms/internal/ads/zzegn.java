package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzegn extends zzbvg {
    final /* synthetic */ zzego zza;
    private final zzefg zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzegn(zzego zzegoVar, zzefg zzefgVar, zzegm zzegmVar) {
        this.zza = zzegoVar;
        this.zzb = zzefgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zze(String str) throws RemoteException {
        ((zzegz) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzegz) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzego.zze(this.zza, (View) ObjectWrapper.unwrap(iObjectWrapper));
        ((zzegz) this.zzb.zzc).zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zzh(zzbuj zzbujVar) throws RemoteException {
        zzego.zzd(this.zza, zzbujVar);
        ((zzegz) this.zzb.zzc).zzo();
    }
}
