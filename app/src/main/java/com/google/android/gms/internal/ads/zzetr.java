package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzetr implements zzetg {
    private final zzfvm zza;
    private final Context zzb;

    public zzetr(zzfvm zzfvmVar, Context context) {
        this.zza = zzfvmVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 39;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzetr.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzetp zzc() throws Exception {
        int i10;
        boolean z10;
        int i11;
        TelephonyManager telephonyManager = (TelephonyManager) this.zzb.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        com.google.android.gms.ads.internal.zzt.zzp();
        int i12 = -1;
        if (com.google.android.gms.ads.internal.util.zzs.zzx(this.zzb, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.zzb.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i10 = type;
                i12 = ordinal;
            } else {
                i10 = -1;
            }
            z10 = connectivityManager.isActiveNetworkMetered();
            i11 = i12;
        } else {
            i10 = -2;
            z10 = false;
            i11 = -1;
        }
        return new zzetp(networkOperator, i10, com.google.android.gms.ads.internal.zzt.zzq().zzl(this.zzb), phoneType, z10, i11);
    }
}
