package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbkr extends zzaqw implements zzbkt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbkr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.zzbkt
    public final String zzg() throws RemoteException {
        Parcel zzbk = zzbk(2, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbkt
    public final List zzh() throws RemoteException {
        Parcel zzbk = zzbk(3, zza());
        ArrayList zzb = zzaqy.zzb(zzbk);
        zzbk.recycle();
        return zzb;
    }
}
