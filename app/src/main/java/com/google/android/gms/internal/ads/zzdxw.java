package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdxw implements zzdxg {
    private final long zza;
    private final String zzb;
    private final zzdxl zzc;
    private final zzfbc zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxw(long j10, Context context, zzdxl zzdxlVar, zzcnf zzcnfVar, String str) {
        this.zza = j10;
        this.zzb = str;
        this.zzc = zzdxlVar;
        zzfbe zzu = zzcnfVar.zzu();
        zzu.zzb(context);
        zzu.zza(str);
        this.zzd = zzu.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzdxg
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdxg
    public final void zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        try {
            this.zzd.zzf(zzlVar, new zzdxu(this));
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdxg
    public final void zzc() {
        try {
            this.zzd.zzk(new zzdxv(this));
            this.zzd.zzm(ObjectWrapper.wrap(null));
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
        }
    }
}
