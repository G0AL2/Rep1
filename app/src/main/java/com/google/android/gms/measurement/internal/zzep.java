package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzof;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzep extends zzf {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private final long zzg;
    private List zzh;
    private String zzi;
    private int zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private long zzn;
    private String zzo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzep(zzgi zzgiVar, long j10) {
        super(zzgiVar);
        this.zzn = 0L;
        this.zzo = null;
        this.zzg = j10;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|(1:3)(6:64|65|(1:67)(2:82|(1:84))|68|69|(20:71|(1:73)(1:80)|75|76|5|(1:63)(1:9)|10|11|13|(1:15)|16|17|(1:19)|20|(3:22|(1:24)(1:26)|25)|(3:28|(1:30)(1:33)|31)|34|(3:36|(1:38)(3:45|(3:48|(1:50)|46)|51)|(2:40|41)(2:43|44))|52|(0)(0)))|4|5|(1:7)|63|10|11|13|(0)|16|17|(0)|20|(0)|(0)|34|(0)|52|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01db, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01dc, code lost:
        r11.zzs.zzaz().zzd().zzc("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.zzey.zzn(r0), r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0194 A[Catch: IllegalStateException -> 0x01db, TryCatch #3 {IllegalStateException -> 0x01db, blocks: (B:46:0x0173, B:49:0x018c, B:51:0x0194, B:55:0x01b2, B:54:0x01ae, B:57:0x01bc, B:59:0x01d2, B:61:0x01d7, B:60:0x01d5), top: B:89:0x0173 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01bc A[Catch: IllegalStateException -> 0x01db, TryCatch #3 {IllegalStateException -> 0x01db, blocks: (B:46:0x0173, B:49:0x018c, B:51:0x0194, B:55:0x01b2, B:54:0x01ae, B:57:0x01bc, B:59:0x01d2, B:61:0x01d7, B:60:0x01d5), top: B:89:0x0173 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x024c  */
    @Override // com.google.android.gms.measurement.internal.zzf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void zzd() {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzep.zzd():void");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzh() {
        zza();
        return this.zzj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzi() {
        zza();
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzp zzj(java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzep.zzj(java.lang.String):com.google.android.gms.measurement.internal.zzp");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzk() {
        zza();
        return this.zzl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzl() {
        zza();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzm() {
        zzof.zzc();
        if (this.zzs.zzf().zzs(null, zzel.zzal)) {
            zzg();
        }
        zza();
        Preconditions.checkNotNull(this.zzk);
        return this.zzk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List zzn() {
        return this.zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzo() {
        String format;
        zzg();
        if (!this.zzs.zzm().zzc().zzi(zzag.ANALYTICS_STORAGE)) {
            this.zzs.zzaz().zzc().zza("Analytics Storage consent is not granted");
            format = null;
        } else {
            byte[] bArr = new byte[16];
            this.zzs.zzv().zzG().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        zzew zzc = this.zzs.zzaz().zzc();
        Object[] objArr = new Object[1];
        objArr[0] = format == null ? "null" : "not null";
        zzc.zza(String.format("Resetting session stitching token to %s", objArr));
        this.zzm = format;
        this.zzn = this.zzs.zzaw().currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzp(String str) {
        String str2 = this.zzo;
        boolean z10 = false;
        if (str2 != null && !str2.equals(str)) {
            z10 = true;
        }
        this.zzo = str;
        return z10;
    }
}
