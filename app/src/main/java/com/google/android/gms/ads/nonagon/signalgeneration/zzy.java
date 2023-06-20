package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbyk;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzfii;
import com.google.android.gms.internal.ads.zzfuy;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzy implements zzfuy {
    final /* synthetic */ zzbyk zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzaa zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzy(zzaa zzaaVar, zzbyk zzbykVar, boolean z10) {
        this.zzc = zzaaVar;
        this.zza = zzbykVar;
        this.zzb = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
        try {
            zzbyk zzbykVar = this.zza;
            String message = th.getMessage();
            zzbykVar.zze("Internal error: " + message);
        } catch (RemoteException e10) {
            zzcfi.zzh("", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        boolean z10;
        String str;
        Uri zzW;
        zzfii zzfiiVar;
        zzfii zzfiiVar2;
        List<Uri> list = (List) obj;
        try {
            zzaa.zzF(this.zzc, list);
            this.zza.zzf(list);
            z10 = this.zzc.zzu;
            if (z10 || this.zzb) {
                for (Uri uri : list) {
                    if (this.zzc.zzN(uri)) {
                        str = this.zzc.zzC;
                        zzW = zzaa.zzW(uri, str, "1");
                        zzfiiVar = this.zzc.zzs;
                        zzfiiVar.zzc(zzW.toString(), null);
                    } else {
                        if (((Boolean) zzay.zzc().zzb(zzbhz.zzgu)).booleanValue()) {
                            zzfiiVar2 = this.zzc.zzs;
                            zzfiiVar2.zzc(uri.toString(), null);
                        }
                    }
                }
            }
        } catch (RemoteException e10) {
            zzcfi.zzh("", e10);
        }
    }
}
