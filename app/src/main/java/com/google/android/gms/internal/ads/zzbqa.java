package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzbqa extends zzbpx {
    final /* synthetic */ zzcga zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbqa(zzbqb zzbqbVar, zzcga zzcgaVar) {
        this.zza = zzcgaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpy
    public final void zzb(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        this.zza.zzd(parcelFileDescriptor);
    }
}
