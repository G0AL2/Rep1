package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.collection.a;
import androidx.collection.e;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzpg;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzfz extends zzkw implements zzae {
    @VisibleForTesting
    final Map zza;
    @VisibleForTesting
    final Map zzb;
    @VisibleForTesting
    final Map zzc;
    @VisibleForTesting
    final e zzd;
    final com.google.android.gms.internal.measurement.zzr zze;
    private final Map zzg;
    private final Map zzh;
    private final Map zzi;
    private final Map zzj;
    private final Map zzk;
    private final Map zzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfz(zzli zzliVar) {
        super(zzliVar);
        this.zzg = new a();
        this.zza = new a();
        this.zzb = new a();
        this.zzc = new a();
        this.zzh = new a();
        this.zzj = new a();
        this.zzk = new a();
        this.zzl = new a();
        this.zzi = new a();
        this.zzd = new zzfw(this, 20);
        this.zze = new zzfx(this);
    }

    private final com.google.android.gms.internal.measurement.zzfe zzA(String str, byte[] bArr) {
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.zzfe.zzg();
        }
        try {
            com.google.android.gms.internal.measurement.zzfe zzfeVar = (com.google.android.gms.internal.measurement.zzfe) ((com.google.android.gms.internal.measurement.zzfd) zzlk.zzl(com.google.android.gms.internal.measurement.zzfe.zze(), bArr)).zzaE();
            this.zzs.zzaz().zzj().zzc("Parsed config. version, gmp_app_id", zzfeVar.zzs() ? Long.valueOf(zzfeVar.zzc()) : null, zzfeVar.zzr() ? zzfeVar.zzh() : null);
            return zzfeVar;
        } catch (com.google.android.gms.internal.measurement.zzkm e10) {
            this.zzs.zzaz().zzk().zzc("Unable to merge remote config. appId", zzey.zzn(str), e10);
            return com.google.android.gms.internal.measurement.zzfe.zzg();
        } catch (RuntimeException e11) {
            this.zzs.zzaz().zzk().zzc("Unable to merge remote config. appId", zzey.zzn(str), e11);
            return com.google.android.gms.internal.measurement.zzfe.zzg();
        }
    }

    private final void zzB(String str, com.google.android.gms.internal.measurement.zzfd zzfdVar) {
        HashSet hashSet = new HashSet();
        a aVar = new a();
        a aVar2 = new a();
        a aVar3 = new a();
        if (zzfdVar != null) {
            zzpg.zzc();
            if (this.zzs.zzf().zzs(null, zzel.zzaB)) {
                for (com.google.android.gms.internal.measurement.zzfa zzfaVar : zzfdVar.zzg()) {
                    hashSet.add(zzfaVar.zzb());
                }
            }
            for (int i10 = 0; i10 < zzfdVar.zza(); i10++) {
                com.google.android.gms.internal.measurement.zzfb zzfbVar = (com.google.android.gms.internal.measurement.zzfb) zzfdVar.zzb(i10).zzbB();
                if (TextUtils.isEmpty(zzfbVar.zzc())) {
                    this.zzs.zzaz().zzk().zza("EventConfig contained null event name");
                } else {
                    String zzc = zzfbVar.zzc();
                    String zzb = zzhf.zzb(zzfbVar.zzc());
                    if (!TextUtils.isEmpty(zzb)) {
                        zzfbVar.zzb(zzb);
                        zzfdVar.zzd(i10, zzfbVar);
                    }
                    if (zzfbVar.zzf() && zzfbVar.zzd()) {
                        aVar.put(zzc, Boolean.TRUE);
                    }
                    if (zzfbVar.zzg() && zzfbVar.zze()) {
                        aVar2.put(zzfbVar.zzc(), Boolean.TRUE);
                    }
                    if (zzfbVar.zzh()) {
                        if (zzfbVar.zza() >= 2 && zzfbVar.zza() <= 65535) {
                            aVar3.put(zzfbVar.zzc(), Integer.valueOf(zzfbVar.zza()));
                        } else {
                            this.zzs.zzaz().zzk().zzc("Invalid sampling rate. Event name, sample rate", zzfbVar.zzc(), Integer.valueOf(zzfbVar.zza()));
                        }
                    }
                }
            }
        }
        this.zza.put(str, hashSet);
        this.zzb.put(str, aVar);
        this.zzc.put(str, aVar2);
        this.zzi.put(str, aVar3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
        if (r2 == null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzC(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfz.zzC(java.lang.String):void");
    }

    private final void zzD(final String str, com.google.android.gms.internal.measurement.zzfe zzfeVar) {
        if (zzfeVar.zza() != 0) {
            this.zzs.zzaz().zzj().zzb("EES programs found", Integer.valueOf(zzfeVar.zza()));
            com.google.android.gms.internal.measurement.zzgs zzgsVar = (com.google.android.gms.internal.measurement.zzgs) zzfeVar.zzm().get(0);
            try {
                com.google.android.gms.internal.measurement.zzc zzcVar = new com.google.android.gms.internal.measurement.zzc();
                zzcVar.zzd("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.zzft
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new com.google.android.gms.internal.measurement.zzn("internal.remoteConfig", new zzfy(zzfz.this, str));
                    }
                });
                zzcVar.zzd("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfv
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        final zzfz zzfzVar = zzfz.this;
                        final String str2 = str;
                        return new com.google.android.gms.internal.measurement.zzu("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfu
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                zzfz zzfzVar2 = zzfz.this;
                                String str3 = str2;
                                zzg zzj = zzfzVar2.zzf.zzi().zzj(str3);
                                HashMap hashMap = new HashMap();
                                hashMap.put("platform", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
                                hashMap.put("package_name", str3);
                                zzfzVar2.zzs.zzf().zzh();
                                hashMap.put("gmp_version", 61000L);
                                if (zzj != null) {
                                    String zzw = zzj.zzw();
                                    if (zzw != null) {
                                        hashMap.put("app_version", zzw);
                                    }
                                    hashMap.put("app_version_int", Long.valueOf(zzj.zzb()));
                                    hashMap.put("dynamite_version", Long.valueOf(zzj.zzk()));
                                }
                                return hashMap;
                            }
                        });
                    }
                });
                zzcVar.zzd("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfs
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new com.google.android.gms.internal.measurement.zzt(zzfz.this.zze);
                    }
                });
                zzcVar.zzc(zzgsVar);
                this.zzd.put(str, zzcVar);
                this.zzs.zzaz().zzj().zzc("EES program loaded for appId, activities", str, Integer.valueOf(zzgsVar.zza().zza()));
                for (com.google.android.gms.internal.measurement.zzgq zzgqVar : zzgsVar.zza().zzd()) {
                    this.zzs.zzaz().zzj().zzb("EES program activity", zzgqVar.zzb());
                }
                return;
            } catch (com.google.android.gms.internal.measurement.zzd unused) {
                this.zzs.zzaz().zzd().zzb("Failed to load EES program. appId", str);
                return;
            }
        }
        this.zzd.remove(str);
    }

    private static final Map zzE(com.google.android.gms.internal.measurement.zzfe zzfeVar) {
        a aVar = new a();
        if (zzfeVar != null) {
            for (com.google.android.gms.internal.measurement.zzfi zzfiVar : zzfeVar.zzn()) {
                aVar.put(zzfiVar.zzb(), zzfiVar.zzc());
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzc zzd(zzfz zzfzVar, String str) {
        zzfzVar.zzW();
        Preconditions.checkNotEmpty(str);
        if (zzfzVar.zzo(str)) {
            if (zzfzVar.zzh.containsKey(str) && zzfzVar.zzh.get(str) != null) {
                zzfzVar.zzD(str, (com.google.android.gms.internal.measurement.zzfe) zzfzVar.zzh.get(str));
            } else {
                zzfzVar.zzC(str);
            }
            return (com.google.android.gms.internal.measurement.zzc) zzfzVar.zzd.snapshot().get(str);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzae
    public final String zza(String str, String str2) {
        zzg();
        zzC(str);
        Map map = (Map) this.zzg.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzkw
    protected final boolean zzb() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzc(String str, String str2) {
        Integer num;
        zzg();
        zzC(str);
        Map map = (Map) this.zzi.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final com.google.android.gms.internal.measurement.zzfe zze(String str) {
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        zzC(str);
        return (com.google.android.gms.internal.measurement.zzfe) this.zzh.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zzf(String str) {
        zzg();
        return (String) this.zzl.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zzh(String str) {
        zzg();
        return (String) this.zzk.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzi(String str) {
        zzg();
        zzC(str);
        return (String) this.zzj.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set zzk(String str) {
        zzg();
        zzC(str);
        return (Set) this.zza.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzl(String str) {
        zzg();
        this.zzk.put(str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzm(String str) {
        zzg();
        this.zzh.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzn(String str) {
        zzg();
        com.google.android.gms.internal.measurement.zzfe zze = zze(str);
        if (zze == null) {
            return false;
        }
        return zze.zzq();
    }

    public final boolean zzo(String str) {
        com.google.android.gms.internal.measurement.zzfe zzfeVar;
        return (TextUtils.isEmpty(str) || (zzfeVar = (com.google.android.gms.internal.measurement.zzfe) this.zzh.get(str)) == null || zzfeVar.zza() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzp(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzq(String str, String str2) {
        Boolean bool;
        zzg();
        zzC(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.zzc.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzr(String str, String str2) {
        Boolean bool;
        zzg();
        zzC(str);
        if (zzp(str) && zzlp.zzah(str2)) {
            return true;
        }
        if (zzs(str) && zzlp.zzai(str2)) {
            return true;
        }
        Map map = (Map) this.zzb.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzs(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_public"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzt(String str, byte[] bArr, String str2, String str3) {
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        com.google.android.gms.internal.measurement.zzfd zzfdVar = (com.google.android.gms.internal.measurement.zzfd) zzA(str, bArr).zzbB();
        if (zzfdVar == null) {
            return false;
        }
        zzB(str, zzfdVar);
        zzD(str, (com.google.android.gms.internal.measurement.zzfe) zzfdVar.zzaE());
        this.zzh.put(str, (com.google.android.gms.internal.measurement.zzfe) zzfdVar.zzaE());
        this.zzj.put(str, zzfdVar.zze());
        this.zzk.put(str, str2);
        this.zzl.put(str, str3);
        this.zzg.put(str, zzE((com.google.android.gms.internal.measurement.zzfe) zzfdVar.zzaE()));
        this.zzf.zzi().zzB(str, new ArrayList(zzfdVar.zzf()));
        try {
            zzfdVar.zzc();
            bArr = ((com.google.android.gms.internal.measurement.zzfe) zzfdVar.zzaE()).zzby();
        } catch (RuntimeException e10) {
            this.zzs.zzaz().zzk().zzc("Unable to serialize reduced-size config. Storing full config instead. appId", zzey.zzn(str), e10);
        }
        zzal zzi = this.zzf.zzi();
        Preconditions.checkNotEmpty(str);
        zzi.zzg();
        zzi.zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        if (zzi.zzs.zzf().zzs(null, zzel.zzaM)) {
            contentValues.put("e_tag", str3);
        }
        try {
            if (zzi.zzh().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                zzi.zzs.zzaz().zzd().zzb("Failed to update remote config (got 0). appId", zzey.zzn(str));
            }
        } catch (SQLiteException e11) {
            zzi.zzs.zzaz().zzd().zzc("Error storing remote config. appId", zzey.zzn(str), e11);
        }
        this.zzh.put(str, (com.google.android.gms.internal.measurement.zzfe) zzfdVar.zzaE());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzu(String str) {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("app_instance_id");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzv(String str) {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && (((Set) this.zza.get(str)).contains("device_model") || ((Set) this.zza.get(str)).contains("device_info"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzw(String str) {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("enhanced_user_id");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzx(String str) {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("google_signals");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzy(String str) {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && (((Set) this.zza.get(str)).contains("os_version") || ((Set) this.zza.get(str)).contains("device_info"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzz(String str) {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("user_id");
    }
}
