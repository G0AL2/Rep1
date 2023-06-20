package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbmd extends zzaqw implements zzbmf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbmd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbmf
    public final void zze(zzblv zzblvVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzblvVar);
        zza.writeString(str);
        zzbl(1, zza);
    }
}
