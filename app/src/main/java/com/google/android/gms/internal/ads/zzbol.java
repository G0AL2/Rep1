package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbol {
    public static final zzbom zza = new zzbom() { // from class: com.google.android.gms.internal.ads.zzbnx
        @Override // com.google.android.gms.internal.ads.zzbom
        public final void zza(Object obj, Map map) {
            zzcmj zzcmjVar = (zzcmj) obj;
            zzbom zzbomVar = zzbol.zza;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                zzcfi.zzj("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] split = str.split(",");
            HashMap hashMap = new HashMap();
            PackageManager packageManager = zzcmjVar.getContext().getPackageManager();
            for (String str2 : split) {
                String[] split2 = str2.split(";", 2);
                boolean z10 = true;
                if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), Constants.MIN_PROGRESS_STEP) == null) {
                    z10 = false;
                }
                Boolean valueOf = Boolean.valueOf(z10);
                hashMap.put(str2, valueOf);
                com.google.android.gms.ads.internal.util.zze.zza("/canOpenURLs;" + str2 + ";" + valueOf);
            }
            ((zzbrd) zzcmjVar).zzd("openableURLs", hashMap);
        }
    };
    public static final zzbom zzb = new zzbom() { // from class: com.google.android.gms.internal.ads.zzbny
        @Override // com.google.android.gms.internal.ads.zzbom
        public final void zza(Object obj, Map map) {
            zzcmj zzcmjVar = (zzcmj) obj;
            zzbom zzbomVar = zzbol.zza;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgT)).booleanValue()) {
                zzcfi.zzj("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                zzcfi.zzj("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap hashMap = new HashMap();
            Boolean valueOf = Boolean.valueOf(zzcmjVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            hashMap.put(str, valueOf);
            com.google.android.gms.ads.internal.util.zze.zza("/canOpenApp;" + str + ";" + valueOf);
            ((zzbrd) zzcmjVar).zzd("openableApp", hashMap);
        }
    };
    public static final zzbom zzc = new zzbom() { // from class: com.google.android.gms.internal.ads.zzbnq
        @Override // com.google.android.gms.internal.ads.zzbom
        public final void zza(Object obj, Map map) {
            zzbol.zzc((zzcmj) obj, map);
        }
    };
    public static final zzbom zzd = new zzbod();
    public static final zzbom zze = new zzboe();
    public static final zzbom zzf = new zzbom() { // from class: com.google.android.gms.internal.ads.zzbnw
        @Override // com.google.android.gms.internal.ads.zzbom
        public final void zza(Object obj, Map map) {
            zzcmj zzcmjVar = (zzcmj) obj;
            zzbom zzbomVar = zzbol.zza;
            String str = (String) map.get("u");
            if (str == null) {
                zzcfi.zzj("URL missing from httpTrack GMSG.");
            } else {
                new com.google.android.gms.ads.internal.util.zzby(zzcmjVar.getContext(), ((zzcmr) zzcmjVar).zzp().zza, str).zzb();
            }
        }
    };
    public static final zzbom zzg = new zzbof();
    public static final zzbom zzh = new zzbog();
    public static final zzbom zzi = new zzbom() { // from class: com.google.android.gms.internal.ads.zzbnv
        @Override // com.google.android.gms.internal.ads.zzbom
        public final void zza(Object obj, Map map) {
            zzcmq zzcmqVar = (zzcmq) obj;
            zzbom zzbomVar = zzbol.zza;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int parseInt = Integer.parseInt(str);
                int parseInt2 = Integer.parseInt(str2);
                int parseInt3 = Integer.parseInt(str3);
                zzaoc zzK = zzcmqVar.zzK();
                if (zzK != null) {
                    zzK.zzc().zzl(parseInt, parseInt2, parseInt3);
                }
            } catch (NumberFormatException unused) {
                zzcfi.zzj("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final zzbom zzj = new zzboh();
    public static final zzbom zzk = new zzboi();
    public static final zzbom zzl = new zzcji();
    public static final zzbom zzm = new zzcjj();
    public static final zzbom zzn = new zzbnp();
    public static final zzbpa zzo = new zzbpa();
    public static final zzbom zzp = new zzboj();
    public static final zzbom zzq = new zzbok();
    public static final zzbom zzr = new zzbnz();
    public static final zzbom zzs = new zzboa();
    public static final zzbom zzt = new zzbob();

    public static zzbom zza(final zzdjg zzdjgVar) {
        return new zzbom() { // from class: com.google.android.gms.internal.ads.zzbnu
            @Override // com.google.android.gms.internal.ads.zzbom
            public final void zza(Object obj, Map map) {
                zzcli zzcliVar = (zzcli) obj;
                zzbol.zzd(map, zzdjg.this);
                String str = (String) map.get("u");
                if (str == null) {
                    zzcfi.zzj("URL missing from click GMSG.");
                } else {
                    zzfvc.zzr(zzbol.zzb(zzcliVar, str), new zzboc(zzcliVar), zzcfv.zza);
                }
            }
        };
    }

    public static zzfvl zzb(zzcli zzcliVar, String str) {
        Uri parse = Uri.parse(str);
        try {
            zzaoc zzK = zzcliVar.zzK();
            if (zzK != null && zzK.zzf(parse)) {
                parse = zzK.zza(parse, zzcliVar.getContext(), zzcliVar.zzH(), zzcliVar.zzk());
            }
        } catch (zzaod unused) {
            zzcfi.zzj("Unable to append parameter to URL: ".concat(str));
        }
        final String zzb2 = zzcdp.zzb(parse, zzcliVar.getContext());
        long longValue = ((Long) zzbjo.zze.zze()).longValue();
        if (longValue > 0 && longValue <= 221908400) {
            zzfut zzv = zzfut.zzv(zzcliVar.zzT());
            zzbnr zzbnrVar = new zzfok() { // from class: com.google.android.gms.internal.ads.zzbnr
                @Override // com.google.android.gms.internal.ads.zzfok
                public final Object apply(Object obj) {
                    Throwable th = (Throwable) obj;
                    zzbom zzbomVar = zzbol.zza;
                    if (((Boolean) zzbjo.zzk.zze()).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "prepareClickUrl.attestation1");
                        return "failure_click_attok";
                    }
                    return "failure_click_attok";
                }
            };
            zzfvm zzfvmVar = zzcfv.zzf;
            return zzfvc.zzf(zzfvc.zzm(zzfvc.zzf(zzv, Throwable.class, zzbnrVar, zzfvmVar), new zzfok() { // from class: com.google.android.gms.internal.ads.zzbns
                @Override // com.google.android.gms.internal.ads.zzfok
                public final Object apply(Object obj) {
                    String str2 = zzb2;
                    String str3 = (String) obj;
                    zzbom zzbomVar = zzbol.zza;
                    if (str3 != null) {
                        if (((Boolean) zzbjo.zzf.zze()).booleanValue()) {
                            String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                            String host = Uri.parse(str2).getHost();
                            for (int i10 = 0; i10 < 3; i10++) {
                                if (!host.endsWith(strArr[i10])) {
                                }
                            }
                        }
                        String str4 = (String) zzbjo.zza.zze();
                        String str5 = (String) zzbjo.zzb.zze();
                        if (!TextUtils.isEmpty(str4)) {
                            str2 = str2.replace(str4, str3);
                        }
                        if (!TextUtils.isEmpty(str5)) {
                            Uri parse2 = Uri.parse(str2);
                            if (TextUtils.isEmpty(parse2.getQueryParameter(str5))) {
                                return parse2.buildUpon().appendQueryParameter(str5, str3).toString();
                            }
                        }
                    }
                    return str2;
                }
            }, zzfvmVar), Throwable.class, new zzfok() { // from class: com.google.android.gms.internal.ads.zzbnt
                @Override // com.google.android.gms.internal.ads.zzfok
                public final Object apply(Object obj) {
                    String str2 = zzb2;
                    Throwable th = (Throwable) obj;
                    zzbom zzbomVar = zzbol.zza;
                    if (((Boolean) zzbjo.zzk.zze()).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "prepareClickUrl.attestation2");
                    }
                    return str2;
                }
            }, zzfvmVar);
        }
        return zzfvc.zzi(zzb2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(3:10|11|12)|(12:50|51|15|(10:17|(1:19)|20|(1:22)|23|(1:25)|26|(1:28)|29|(2:31|(1:33)))|34|35|36|(1:38)|39|40|42|43)|14|15|(0)|34|35|36|(0)|39|40|42|43|8) */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00ca, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00cb, code lost:
        com.google.android.gms.ads.internal.zzt.zzo().zzt(r0, r8.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x00df, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x00e0, code lost:
        com.google.android.gms.internal.ads.zzcfi.zzh("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzcmj r16, java.util.Map r17) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbol.zzc(com.google.android.gms.internal.ads.zzcmj, java.util.Map):void");
    }

    public static void zzd(Map map, zzdjg zzdjgVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzii)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdjgVar != null) {
            zzdjgVar.zzq();
        }
    }
}
