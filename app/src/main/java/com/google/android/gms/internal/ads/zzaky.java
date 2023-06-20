package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaky extends zzgkq implements zzgmb {
    private static final zzaky zzb;
    private int zze;
    private long zzg;
    private long zzk;
    private long zzl;
    private long zzn;
    private int zzr;
    private String zzf = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzm = "";
    private String zzo = "";
    private String zzp = "";
    private zzgkz zzq = zzgkq.zzaJ();

    static {
        zzaky zzakyVar = new zzaky();
        zzb = zzakyVar;
        zzgkq.zzaP(zzaky.class, zzakyVar);
    }

    private zzaky() {
    }

    public static zzaku zza() {
        return (zzaku) zzb.zzay();
    }

    public static /* synthetic */ void zzd(zzaky zzakyVar, long j10) {
        zzakyVar.zze |= 2;
        zzakyVar.zzg = j10;
    }

    public static /* synthetic */ void zze(zzaky zzakyVar, String str) {
        str.getClass();
        zzakyVar.zze |= 4;
        zzakyVar.zzh = str;
    }

    public static /* synthetic */ void zzf(zzaky zzakyVar, String str) {
        str.getClass();
        zzakyVar.zze |= 8;
        zzakyVar.zzi = str;
    }

    public static /* synthetic */ void zzg(zzaky zzakyVar, String str) {
        zzakyVar.zze |= 16;
        zzakyVar.zzj = str;
    }

    public static /* synthetic */ void zzh(zzaky zzakyVar, String str) {
        zzakyVar.zze |= IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES;
        zzakyVar.zzp = str;
    }

    public static /* synthetic */ void zzi(zzaky zzakyVar, String str) {
        str.getClass();
        zzakyVar.zze |= 1;
        zzakyVar.zzf = str;
    }

    public static /* synthetic */ void zzj(zzaky zzakyVar, int i10) {
        zzakyVar.zzr = i10 - 1;
        zzakyVar.zze |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.zzgkq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzaku(null);
                }
                return new zzaky();
            }
            return zzgkq.zzaO(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", zzakw.class, "zzr", zzakx.zza});
        }
        return (byte) 1;
    }
}
