package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzclu {
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.zzcli, java.lang.Object] */
    public static final zzcli zza(final Context context, final zzcmx zzcmxVar, final String str, final boolean z10, final boolean z11, final zzaoc zzaocVar, final zzbiy zzbiyVar, final zzcfo zzcfoVar, zzbio zzbioVar, final com.google.android.gms.ads.internal.zzl zzlVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzbdm zzbdmVar, final zzfbl zzfblVar, final zzfbo zzfboVar) throws zzclt {
        zzbhz.zzc(context);
        try {
            zzfpj zzfpjVar = new zzfpj(context, zzcmxVar, str, z10, z11, zzaocVar, zzbiyVar, zzcfoVar, null, zzlVar, zzaVar, zzbdmVar, zzfblVar, zzfboVar) { // from class: com.google.android.gms.internal.ads.zzclq
                public final /* synthetic */ Context zza;
                public final /* synthetic */ zzcmx zzb;
                public final /* synthetic */ String zzc;
                public final /* synthetic */ boolean zzd;
                public final /* synthetic */ boolean zze;
                public final /* synthetic */ zzaoc zzf;
                public final /* synthetic */ zzbiy zzg;
                public final /* synthetic */ zzcfo zzh;
                public final /* synthetic */ com.google.android.gms.ads.internal.zzl zzi;
                public final /* synthetic */ com.google.android.gms.ads.internal.zza zzj;
                public final /* synthetic */ zzbdm zzk;
                public final /* synthetic */ zzfbl zzl;
                public final /* synthetic */ zzfbo zzm;

                {
                    this.zzi = zzlVar;
                    this.zzj = zzaVar;
                    this.zzk = zzbdmVar;
                    this.zzl = zzfblVar;
                    this.zzm = zzfboVar;
                }

                @Override // com.google.android.gms.internal.ads.zzfpj
                public final Object zza() {
                    Context context2 = this.zza;
                    zzcmx zzcmxVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z12 = this.zzd;
                    boolean z13 = this.zze;
                    zzaoc zzaocVar2 = this.zzf;
                    zzbiy zzbiyVar2 = this.zzg;
                    zzcfo zzcfoVar2 = this.zzh;
                    com.google.android.gms.ads.internal.zzl zzlVar2 = this.zzi;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.zzj;
                    zzbdm zzbdmVar2 = this.zzk;
                    zzfbl zzfblVar2 = this.zzl;
                    zzfbo zzfboVar2 = this.zzm;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i10 = zzcmb.zza;
                        zzclx zzclxVar = new zzclx(new zzcmb(new zzcmw(context2), zzcmxVar2, str2, z12, z13, zzaocVar2, zzbiyVar2, zzcfoVar2, null, zzlVar2, zzaVar2, zzbdmVar2, zzfblVar2, zzfboVar2));
                        zzclxVar.setWebViewClient(com.google.android.gms.ads.internal.zzt.zzq().zzd(zzclxVar, zzbdmVar2, z13));
                        zzclxVar.setWebChromeClient(new zzclh(zzclxVar));
                        return zzclxVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            ?? zza = zzfpjVar.zza();
            StrictMode.setThreadPolicy(threadPolicy);
            return zza;
        } catch (Throwable th) {
            throw new zzclt("Webview initialization failed.", th);
        }
    }
}
