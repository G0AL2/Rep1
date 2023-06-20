package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgfw extends zzgkq implements zzgmb {
    private static final zzgfw zzb;
    private int zze;
    private zzgkz zzf = zzgkq.zzaJ();

    static {
        zzgfw zzgfwVar = new zzgfw();
        zzb = zzgfwVar;
        zzgkq.zzaP(zzgfw.class, zzgfwVar);
    }

    private zzgfw() {
    }

    public static zzgft zzd() {
        return (zzgft) zzb.zzay();
    }

    public static zzgfw zzf(InputStream inputStream, zzgkc zzgkcVar) throws IOException {
        return (zzgfw) zzgkq.zzaE(zzb, inputStream, zzgkcVar);
    }

    public static zzgfw zzg(byte[] bArr, zzgkc zzgkcVar) throws zzglc {
        return (zzgfw) zzgkq.zzaF(zzb, bArr, zzgkcVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzgfw zzgfwVar, zzgfv zzgfvVar) {
        zzgfvVar.getClass();
        zzgkz zzgkzVar = zzgfwVar.zzf;
        if (!zzgkzVar.zzc()) {
            zzgfwVar.zzf = zzgkq.zzaK(zzgkzVar);
        }
        zzgfwVar.zzf.add(zzgfvVar);
    }

    public final int zza() {
        return this.zzf.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
                    return new zzgft(null);
                }
                return new zzgfw();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzgfv.class});
        }
        return (byte) 1;
    }

    public final int zzc() {
        return this.zze;
    }

    public final List zzh() {
        return this.zzf;
    }
}
