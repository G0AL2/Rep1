package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbwx extends NativeAd.AdChoicesInfo {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbwx(zzbkt zzbktVar) {
        try {
            this.zzb = zzbktVar.zzg();
        } catch (RemoteException e10) {
            zzcfi.zzh("", e10);
            this.zzb = "";
        }
        try {
            for (Object obj : zzbktVar.zzh()) {
                zzblb zzg = obj instanceof IBinder ? zzbla.zzg((IBinder) obj) : null;
                if (zzg != null) {
                    this.zza.add(new zzbwz(zzg));
                }
            }
        } catch (RemoteException e11) {
            zzcfi.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzb;
    }
}
