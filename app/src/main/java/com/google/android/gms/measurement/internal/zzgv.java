package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpp;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
final class zzgv implements Callable {
    final /* synthetic */ zzav zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzha zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgv(zzha zzhaVar, zzav zzavVar, String str) {
        this.zzc = zzhaVar;
        this.zza = zzavVar;
        this.zzb = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzli zzliVar;
        zzli zzliVar2;
        byte[] bArr;
        zzli zzliVar3;
        zzln zzlnVar;
        zzg zzgVar;
        com.google.android.gms.internal.measurement.zzfz zzfzVar;
        String str;
        Bundle bundle;
        com.google.android.gms.internal.measurement.zzgb zzgbVar;
        String str2;
        zzar zzc;
        long j10;
        zzliVar = this.zzc.zza;
        zzliVar.zzA();
        zzliVar2 = this.zzc.zza;
        zzis zzr = zzliVar2.zzr();
        zzav zzavVar = this.zza;
        String str3 = this.zzb;
        zzr.zzg();
        zzgi.zzO();
        Preconditions.checkNotNull(zzavVar);
        Preconditions.checkNotEmpty(str3);
        if (!zzr.zzs.zzf().zzs(str3, zzel.zzT)) {
            zzr.zzs.zzaz().zzc().zzb("Generating ScionPayload disabled. packageName", str3);
            return new byte[0];
        } else if (!"_iap".equals(zzavVar.zza) && !"_iapx".equals(zzavVar.zza)) {
            zzr.zzs.zzaz().zzc().zzc("Generating a payload for this event is not available. package_name, event_name", str3, zzavVar.zza);
            return null;
        } else {
            com.google.android.gms.internal.measurement.zzfz zza = com.google.android.gms.internal.measurement.zzga.zza();
            zzr.zzf.zzi().zzw();
            try {
                zzg zzj = zzr.zzf.zzi().zzj(str3);
                if (zzj == null) {
                    zzr.zzs.zzaz().zzc().zzb("Log and bundle not available. package_name", str3);
                    bArr = new byte[0];
                    zzliVar3 = zzr.zzf;
                } else if (!zzj.zzaj()) {
                    zzr.zzs.zzaz().zzc().zzb("Log and bundle disabled. package_name", str3);
                    bArr = new byte[0];
                    zzliVar3 = zzr.zzf;
                } else {
                    com.google.android.gms.internal.measurement.zzgb zzu = com.google.android.gms.internal.measurement.zzgc.zzu();
                    zzu.zzae(1);
                    zzu.zzaa(MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
                    if (!TextUtils.isEmpty(zzj.zzt())) {
                        zzu.zzE(zzj.zzt());
                    }
                    if (!TextUtils.isEmpty(zzj.zzv())) {
                        zzu.zzG((String) Preconditions.checkNotNull(zzj.zzv()));
                    }
                    if (!TextUtils.isEmpty(zzj.zzw())) {
                        zzu.zzH((String) Preconditions.checkNotNull(zzj.zzw()));
                    }
                    if (zzj.zzb() != -2147483648L) {
                        zzu.zzI((int) zzj.zzb());
                    }
                    zzu.zzW(zzj.zzm());
                    zzu.zzQ(zzj.zzk());
                    String zzy = zzj.zzy();
                    String zzr2 = zzj.zzr();
                    if (!TextUtils.isEmpty(zzy)) {
                        zzu.zzV(zzy);
                    } else if (!TextUtils.isEmpty(zzr2)) {
                        zzu.zzC(zzr2);
                    }
                    zzah zzh = zzr.zzf.zzh(str3);
                    zzu.zzN(zzj.zzj());
                    if (zzr.zzs.zzJ() && zzr.zzs.zzf().zzt(zzu.zzaq()) && zzh.zzi(zzag.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        zzu.zzP(null);
                    }
                    zzu.zzM(zzh.zzh());
                    if (zzh.zzi(zzag.AD_STORAGE)) {
                        Pair zzd = zzr.zzf.zzs().zzd(zzj.zzt(), zzh);
                        if (zzj.zzai() && !TextUtils.isEmpty((CharSequence) zzd.first)) {
                            try {
                                zzu.zzaf(zzis.zza((String) zzd.first, Long.toString(zzavVar.zzd)));
                                Object obj = zzd.second;
                                if (obj != null) {
                                    zzu.zzY(((Boolean) obj).booleanValue());
                                }
                            } catch (SecurityException e10) {
                                zzr.zzs.zzaz().zzc().zzb("Resettable device id encryption failed", e10.getMessage());
                                bArr = new byte[0];
                                zzliVar3 = zzr.zzf;
                            }
                        }
                    }
                    zzr.zzs.zzg().zzu();
                    zzu.zzO(Build.MODEL);
                    zzr.zzs.zzg().zzu();
                    zzu.zzZ(Build.VERSION.RELEASE);
                    zzu.zzak((int) zzr.zzs.zzg().zzb());
                    zzu.zzao(zzr.zzs.zzg().zzc());
                    try {
                        if (zzh.zzi(zzag.ANALYTICS_STORAGE) && zzj.zzu() != null) {
                            zzu.zzF(zzis.zza((String) Preconditions.checkNotNull(zzj.zzu()), Long.toString(zzavVar.zzd)));
                        }
                        if (!TextUtils.isEmpty(zzj.zzx())) {
                            zzu.zzU((String) Preconditions.checkNotNull(zzj.zzx()));
                        }
                        String zzt = zzj.zzt();
                        List zzu2 = zzr.zzf.zzi().zzu(zzt);
                        Iterator it = zzu2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                zzlnVar = null;
                                break;
                            }
                            zzlnVar = (zzln) it.next();
                            if ("_lte".equals(zzlnVar.zzc)) {
                                break;
                            }
                        }
                        if (zzlnVar == null || zzlnVar.zze == null) {
                            zzln zzlnVar2 = new zzln(zzt, "auto", "_lte", zzr.zzs.zzaw().currentTimeMillis(), 0L);
                            zzu2.add(zzlnVar2);
                            zzr.zzf.zzi().zzL(zzlnVar2);
                        }
                        zzlk zzu3 = zzr.zzf.zzu();
                        zzu3.zzs.zzaz().zzj().zza("Checking account type status for ad personalization signals");
                        if (zzu3.zzs.zzg().zze()) {
                            String zzt2 = zzj.zzt();
                            Preconditions.checkNotNull(zzt2);
                            if (zzj.zzai() && zzu3.zzf.zzo().zzn(zzt2)) {
                                zzu3.zzs.zzaz().zzc().zza("Turning off ad personalization due to account type");
                                Iterator it2 = zzu2.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if ("_npa".equals(((zzln) it2.next()).zzc)) {
                                        it2.remove();
                                        break;
                                    }
                                }
                                zzu2.add(new zzln(zzt2, "auto", "_npa", zzu3.zzs.zzaw().currentTimeMillis(), 1L));
                            }
                        }
                        com.google.android.gms.internal.measurement.zzgl[] zzglVarArr = new com.google.android.gms.internal.measurement.zzgl[zzu2.size()];
                        for (int i10 = 0; i10 < zzu2.size(); i10++) {
                            com.google.android.gms.internal.measurement.zzgk zzd2 = com.google.android.gms.internal.measurement.zzgl.zzd();
                            zzd2.zzf(((zzln) zzu2.get(i10)).zzc);
                            zzd2.zzg(((zzln) zzu2.get(i10)).zzd);
                            zzr.zzf.zzu().zzu(zzd2, ((zzln) zzu2.get(i10)).zze);
                            zzglVarArr[i10] = (com.google.android.gms.internal.measurement.zzgl) zzd2.zzaE();
                        }
                        zzu.zzj(Arrays.asList(zzglVarArr));
                        zzez zzb = zzez.zzb(zzavVar);
                        zzr.zzs.zzv().zzL(zzb.zzd, zzr.zzf.zzi().zzi(str3));
                        zzr.zzs.zzv().zzM(zzb, zzr.zzs.zzf().zzd(str3));
                        Bundle bundle2 = zzb.zzd;
                        bundle2.putLong("_c", 1L);
                        zzr.zzs.zzaz().zzc().zza("Marking in-app purchase as real-time");
                        bundle2.putLong("_r", 1L);
                        bundle2.putString("_o", zzavVar.zzc);
                        if (zzr.zzs.zzv().zzae(zzu.zzaq())) {
                            zzr.zzs.zzv().zzO(bundle2, "_dbg", 1L);
                            zzr.zzs.zzv().zzO(bundle2, "_r", 1L);
                        }
                        zzar zzn = zzr.zzf.zzi().zzn(str3, zzavVar.zza);
                        if (zzn == null) {
                            zzgbVar = zzu;
                            zzgVar = zzj;
                            zzfzVar = zza;
                            str = str3;
                            bundle = bundle2;
                            str2 = null;
                            zzc = new zzar(str3, zzavVar.zza, 0L, 0L, 0L, zzavVar.zzd, 0L, null, null, null, null);
                            j10 = 0;
                        } else {
                            zzgVar = zzj;
                            zzfzVar = zza;
                            str = str3;
                            bundle = bundle2;
                            zzgbVar = zzu;
                            str2 = null;
                            long j11 = zzn.zzf;
                            zzc = zzn.zzc(zzavVar.zzd);
                            j10 = j11;
                        }
                        zzr.zzf.zzi().zzE(zzc);
                        zzaq zzaqVar = new zzaq(zzr.zzs, zzavVar.zzc, str, zzavVar.zza, zzavVar.zzd, j10, bundle);
                        com.google.android.gms.internal.measurement.zzfr zze = com.google.android.gms.internal.measurement.zzfs.zze();
                        zze.zzm(zzaqVar.zzd);
                        zze.zzi(zzaqVar.zzb);
                        zze.zzl(zzaqVar.zze);
                        zzas zzasVar = new zzas(zzaqVar.zzf);
                        while (zzasVar.hasNext()) {
                            String next = zzasVar.next();
                            com.google.android.gms.internal.measurement.zzfv zze2 = com.google.android.gms.internal.measurement.zzfw.zze();
                            zze2.zzj(next);
                            Object zzf = zzaqVar.zzf.zzf(next);
                            if (zzf != null) {
                                zzr.zzf.zzu().zzt(zze2, zzf);
                                zze.zze(zze2);
                            }
                        }
                        com.google.android.gms.internal.measurement.zzgb zzgbVar2 = zzgbVar;
                        zzgbVar2.zzk(zze);
                        com.google.android.gms.internal.measurement.zzgd zza2 = com.google.android.gms.internal.measurement.zzgf.zza();
                        com.google.android.gms.internal.measurement.zzft zza3 = com.google.android.gms.internal.measurement.zzfu.zza();
                        zza3.zza(zzc.zzc);
                        zza3.zzb(zzavVar.zza);
                        zza2.zza(zza3);
                        zzgbVar2.zzab(zza2);
                        zzgbVar2.zzf(zzr.zzf.zzf().zza(zzgVar.zzt(), Collections.emptyList(), zzgbVar2.zzat(), Long.valueOf(zze.zzc()), Long.valueOf(zze.zzc())));
                        if (zze.zzq()) {
                            zzgbVar2.zzaj(zze.zzc());
                            zzgbVar2.zzR(zze.zzc());
                        }
                        long zzn2 = zzgVar.zzn();
                        int i11 = (zzn2 > 0L ? 1 : (zzn2 == 0L ? 0 : -1));
                        if (i11 != 0) {
                            zzgbVar2.zzac(zzn2);
                        }
                        long zzp = zzgVar.zzp();
                        if (zzp != 0) {
                            zzgbVar2.zzad(zzp);
                        } else if (i11 != 0) {
                            zzgbVar2.zzad(zzn2);
                        }
                        String zzB = zzgVar.zzB();
                        zzpp.zzc();
                        if (zzr.zzs.zzf().zzs(str2, zzel.zzaH) && zzB != null) {
                            zzgbVar2.zzai(zzB);
                        }
                        zzgVar.zzE();
                        zzgbVar2.zzJ((int) zzgVar.zzo());
                        zzr.zzs.zzf().zzh();
                        zzgbVar2.zzam(61000L);
                        zzgbVar2.zzal(zzr.zzs.zzaw().currentTimeMillis());
                        zzgbVar2.zzah(true);
                        com.google.android.gms.internal.measurement.zzfz zzfzVar2 = zzfzVar;
                        zzfzVar2.zza(zzgbVar2);
                        zzg zzgVar2 = zzgVar;
                        zzgVar2.zzac(zzgbVar2.zzd());
                        zzgVar2.zzaa(zzgbVar2.zzc());
                        zzr.zzf.zzi().zzD(zzgVar2);
                        zzr.zzf.zzi().zzC();
                        try {
                            return zzr.zzf.zzu().zzy(((com.google.android.gms.internal.measurement.zzga) zzfzVar2.zzaE()).zzby());
                        } catch (IOException e11) {
                            zzr.zzs.zzaz().zzd().zzc("Data loss. Failed to bundle and serialize. appId", zzey.zzn(str), e11);
                            return str2;
                        }
                    } catch (SecurityException e12) {
                        zzr.zzs.zzaz().zzc().zzb("app instance id encryption failed", e12.getMessage());
                        bArr = new byte[0];
                        zzliVar3 = zzr.zzf;
                    }
                }
                zzliVar3.zzi().zzx();
                return bArr;
            } finally {
                zzr.zzf.zzi().zzx();
            }
        }
    }
}
