package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeea extends zzeeb {
    private static final SparseArray zzb;
    private final Context zzc;
    private final zzdaz zzd;
    private final TelephonyManager zze;
    private final zzeds zzf;
    private int zzg;

    static {
        SparseArray sparseArray = new SparseArray();
        zzb = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbfz.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzbfz zzbfzVar = zzbfz.CONNECTING;
        sparseArray.put(ordinal, zzbfzVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzbfzVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzbfzVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbfz.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzbfz zzbfzVar2 = zzbfz.DISCONNECTED;
        sparseArray.put(ordinal2, zzbfzVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzbfzVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzbfzVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzbfzVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzbfzVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbfz.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzbfzVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzbfzVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeea(Context context, zzdaz zzdazVar, zzeds zzedsVar, zzedo zzedoVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        super(zzedoVar, zzgVar);
        this.zzc = context;
        this.zzd = zzdazVar;
        this.zzf = zzedsVar;
        this.zze = (TelephonyManager) context.getSystemService("phone");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzbfq zza(zzeea zzeeaVar, Bundle bundle) {
        zzbfj zza = zzbfq.zza();
        int i10 = bundle.getInt("cnt", -2);
        int i11 = bundle.getInt("gnt", 0);
        int i12 = 2;
        if (i10 == -1) {
            zzeeaVar.zzg = 2;
        } else {
            zzeeaVar.zzg = 1;
            if (i10 == 0) {
                zza.zzb(2);
            } else if (i10 != 1) {
                zza.zzb(1);
            } else {
                zza.zzb(3);
            }
            switch (i11) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i12 = 3;
                    break;
                case 13:
                    i12 = 5;
                    break;
                default:
                    i12 = 1;
                    break;
            }
            zza.zza(i12);
        }
        return (zzbfq) zza.zzal();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzbfz zzb(zzeea zzeeaVar, Bundle bundle) {
        return (zzbfz) zzb.get(zzfco.zza(zzfco.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzbfz.UNSPECIFIED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ byte[] zze(zzeea zzeeaVar, boolean z10, ArrayList arrayList, zzbfq zzbfqVar, zzbfz zzbfzVar) {
        zzbfu zzg = zzbfv.zzg();
        zzg.zza(arrayList);
        zzg.zzi(zzg(Settings.Global.getInt(zzeeaVar.zzc.getContentResolver(), "airplane_mode_on", 0) != 0));
        zzg.zzj(com.google.android.gms.ads.internal.zzt.zzq().zzh(zzeeaVar.zzc, zzeeaVar.zze));
        zzg.zzf(zzeeaVar.zzf.zze());
        zzg.zze(zzeeaVar.zzf.zzb());
        zzg.zzb(zzeeaVar.zzf.zza());
        zzg.zzc(zzbfzVar);
        zzg.zzd(zzbfqVar);
        zzg.zzk(zzeeaVar.zzg);
        zzg.zzl(zzg(z10));
        zzg.zzh(zzeeaVar.zzf.zzd());
        zzg.zzg(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis());
        zzg.zzm(zzg(Settings.Global.getInt(zzeeaVar.zzc.getContentResolver(), "wifi_on", 0) != 0));
        return ((zzbfv) zzg.zzal()).zzaw();
    }

    private static final int zzg(boolean z10) {
        return z10 ? 2 : 1;
    }

    public final void zzd(boolean z10) {
        zzfvc.zzr(this.zzd.zzb(), new zzedz(this, z10), zzcfv.zzf);
    }
}
