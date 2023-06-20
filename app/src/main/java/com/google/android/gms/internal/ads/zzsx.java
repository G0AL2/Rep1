package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzsx implements zzwf, zzrp {
    final /* synthetic */ zztc zza;
    private final Uri zzc;
    private final zzfr zzd;
    private final zzst zze;
    private final zzyu zzf;
    private final zzcz zzg;
    private volatile boolean zzi;
    private long zzk;
    private zzzy zzn;
    private boolean zzo;
    private final zzzr zzh = new zzzr();
    private boolean zzj = true;
    private long zzm = -1;
    private final long zzb = zzrr.zza();
    private zzev zzl = zzj(0);

    public zzsx(zztc zztcVar, Uri uri, zzeq zzeqVar, zzst zzstVar, zzyu zzyuVar, zzcz zzczVar) {
        this.zza = zztcVar;
        this.zzc = uri;
        this.zzd = new zzfr(zzeqVar);
        this.zze = zzstVar;
        this.zzf = zzyuVar;
        this.zzg = zzczVar;
    }

    public static /* bridge */ /* synthetic */ long zzb(zzsx zzsxVar) {
        return zzsxVar.zzm;
    }

    public static /* bridge */ /* synthetic */ long zzc(zzsx zzsxVar) {
        return zzsxVar.zzb;
    }

    public static /* bridge */ /* synthetic */ long zzd(zzsx zzsxVar) {
        return zzsxVar.zzk;
    }

    public static /* bridge */ /* synthetic */ zzev zze(zzsx zzsxVar) {
        return zzsxVar.zzl;
    }

    public static /* bridge */ /* synthetic */ zzfr zzf(zzsx zzsxVar) {
        return zzsxVar.zzd;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzsx zzsxVar, long j10, long j11) {
        zzsxVar.zzh.zza = j10;
        zzsxVar.zzk = j11;
        zzsxVar.zzj = true;
        zzsxVar.zzo = false;
    }

    private final zzev zzj(long j10) {
        Map map;
        zzet zzetVar = new zzet();
        zzetVar.zzd(this.zzc);
        zzetVar.zzc(j10);
        zzetVar.zza(6);
        map = zztc.zzb;
        zzetVar.zzb(map);
        return zzetVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final void zza(zzdy zzdyVar) {
        long zzO;
        long max;
        if (this.zzo) {
            zzO = this.zza.zzO();
            max = Math.max(zzO, this.zzk);
        } else {
            max = this.zzk;
        }
        int zza = zzdyVar.zza();
        zzzy zzzyVar = this.zzn;
        Objects.requireNonNull(zzzyVar);
        zzzw.zzb(zzzyVar, zzdyVar, zza);
        zzzyVar.zzs(max, 1, zza, 0, null);
        this.zzo = true;
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final void zzh() {
        this.zzi = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0083 A[Catch: all -> 0x01e3, TryCatch #3 {all -> 0x01e3, blocks: (B:126:0x000c, B:128:0x0022, B:129:0x0025, B:132:0x003a, B:133:0x0040, B:143:0x0078, B:145:0x0083, B:147:0x008f, B:149:0x0099, B:151:0x00a5, B:153:0x00af, B:155:0x00bb, B:157:0x00c5, B:159:0x00d7, B:161:0x00e1, B:162:0x00e7, B:172:0x0116, B:173:0x011c, B:175:0x0129, B:177:0x0131, B:179:0x014d, B:181:0x016c, B:182:0x0171, B:184:0x0175, B:165:0x00ef, B:169:0x0106, B:137:0x004a, B:141:0x0064), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0099 A[Catch: all -> 0x01e3, TryCatch #3 {all -> 0x01e3, blocks: (B:126:0x000c, B:128:0x0022, B:129:0x0025, B:132:0x003a, B:133:0x0040, B:143:0x0078, B:145:0x0083, B:147:0x008f, B:149:0x0099, B:151:0x00a5, B:153:0x00af, B:155:0x00bb, B:157:0x00c5, B:159:0x00d7, B:161:0x00e1, B:162:0x00e7, B:172:0x0116, B:173:0x011c, B:175:0x0129, B:177:0x0131, B:179:0x014d, B:181:0x016c, B:182:0x0171, B:184:0x0175, B:165:0x00ef, B:169:0x0106, B:137:0x004a, B:141:0x0064), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00af A[Catch: all -> 0x01e3, TryCatch #3 {all -> 0x01e3, blocks: (B:126:0x000c, B:128:0x0022, B:129:0x0025, B:132:0x003a, B:133:0x0040, B:143:0x0078, B:145:0x0083, B:147:0x008f, B:149:0x0099, B:151:0x00a5, B:153:0x00af, B:155:0x00bb, B:157:0x00c5, B:159:0x00d7, B:161:0x00e1, B:162:0x00e7, B:172:0x0116, B:173:0x011c, B:175:0x0129, B:177:0x0131, B:179:0x014d, B:181:0x016c, B:182:0x0171, B:184:0x0175, B:165:0x00ef, B:169:0x0106, B:137:0x004a, B:141:0x0064), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00c5 A[Catch: all -> 0x01e3, TryCatch #3 {all -> 0x01e3, blocks: (B:126:0x000c, B:128:0x0022, B:129:0x0025, B:132:0x003a, B:133:0x0040, B:143:0x0078, B:145:0x0083, B:147:0x008f, B:149:0x0099, B:151:0x00a5, B:153:0x00af, B:155:0x00bb, B:157:0x00c5, B:159:0x00d7, B:161:0x00e1, B:162:0x00e7, B:172:0x0116, B:173:0x011c, B:175:0x0129, B:177:0x0131, B:179:0x014d, B:181:0x016c, B:182:0x0171, B:184:0x0175, B:165:0x00ef, B:169:0x0106, B:137:0x004a, B:141:0x0064), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00e1 A[Catch: all -> 0x01e3, TRY_LEAVE, TryCatch #3 {all -> 0x01e3, blocks: (B:126:0x000c, B:128:0x0022, B:129:0x0025, B:132:0x003a, B:133:0x0040, B:143:0x0078, B:145:0x0083, B:147:0x008f, B:149:0x0099, B:151:0x00a5, B:153:0x00af, B:155:0x00bb, B:157:0x00c5, B:159:0x00d7, B:161:0x00e1, B:162:0x00e7, B:172:0x0116, B:173:0x011c, B:175:0x0129, B:177:0x0131, B:179:0x014d, B:181:0x016c, B:182:0x0171, B:184:0x0175, B:165:0x00ef, B:169:0x0106, B:137:0x004a, B:141:0x0064), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0116 A[Catch: all -> 0x01e3, TryCatch #3 {all -> 0x01e3, blocks: (B:126:0x000c, B:128:0x0022, B:129:0x0025, B:132:0x003a, B:133:0x0040, B:143:0x0078, B:145:0x0083, B:147:0x008f, B:149:0x0099, B:151:0x00a5, B:153:0x00af, B:155:0x00bb, B:157:0x00c5, B:159:0x00d7, B:161:0x00e1, B:162:0x00e7, B:172:0x0116, B:173:0x011c, B:175:0x0129, B:177:0x0131, B:179:0x014d, B:181:0x016c, B:182:0x0171, B:184:0x0175, B:165:0x00ef, B:169:0x0106, B:137:0x004a, B:141:0x0064), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0129 A[Catch: all -> 0x01e3, TryCatch #3 {all -> 0x01e3, blocks: (B:126:0x000c, B:128:0x0022, B:129:0x0025, B:132:0x003a, B:133:0x0040, B:143:0x0078, B:145:0x0083, B:147:0x008f, B:149:0x0099, B:151:0x00a5, B:153:0x00af, B:155:0x00bb, B:157:0x00c5, B:159:0x00d7, B:161:0x00e1, B:162:0x00e7, B:172:0x0116, B:173:0x011c, B:175:0x0129, B:177:0x0131, B:179:0x014d, B:181:0x016c, B:182:0x0171, B:184:0x0175, B:165:0x00ef, B:169:0x0106, B:137:0x004a, B:141:0x0064), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x016c A[Catch: all -> 0x01e3, TryCatch #3 {all -> 0x01e3, blocks: (B:126:0x000c, B:128:0x0022, B:129:0x0025, B:132:0x003a, B:133:0x0040, B:143:0x0078, B:145:0x0083, B:147:0x008f, B:149:0x0099, B:151:0x00a5, B:153:0x00af, B:155:0x00bb, B:157:0x00c5, B:159:0x00d7, B:161:0x00e1, B:162:0x00e7, B:172:0x0116, B:173:0x011c, B:175:0x0129, B:177:0x0131, B:179:0x014d, B:181:0x016c, B:182:0x0171, B:184:0x0175, B:165:0x00ef, B:169:0x0106, B:137:0x004a, B:141:0x0064), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0175 A[Catch: all -> 0x01e3, TRY_LEAVE, TryCatch #3 {all -> 0x01e3, blocks: (B:126:0x000c, B:128:0x0022, B:129:0x0025, B:132:0x003a, B:133:0x0040, B:143:0x0078, B:145:0x0083, B:147:0x008f, B:149:0x0099, B:151:0x00a5, B:153:0x00af, B:155:0x00bb, B:157:0x00c5, B:159:0x00d7, B:161:0x00e1, B:162:0x00e7, B:172:0x0116, B:173:0x011c, B:175:0x0129, B:177:0x0131, B:179:0x014d, B:181:0x016c, B:182:0x0171, B:184:0x0175, B:165:0x00ef, B:169:0x0106, B:137:0x004a, B:141:0x0064), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0182 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x01c3 A[EDGE_INSN: B:233:0x01c3->B:198:0x01c3 ?: BREAK  , SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzwf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsx.zzi():void");
    }
}
