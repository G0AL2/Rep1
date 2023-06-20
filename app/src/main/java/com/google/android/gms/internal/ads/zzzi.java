package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzzi {
    private final zzdy zza = new zzdy(10);

    public final zzbl zza(zzys zzysVar, zzaby zzabyVar) throws IOException {
        zzbl zzblVar = null;
        int i10 = 0;
        while (true) {
            try {
                ((zzyl) zzysVar).zzm(this.zza.zzH(), 0, 10, false);
                this.zza.zzF(0);
                if (this.zza.zzm() != 4801587) {
                    break;
                }
                this.zza.zzG(3);
                int zzj = this.zza.zzj();
                int i11 = zzj + 10;
                if (zzblVar == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.zza.zzH(), 0, bArr, 0, 10);
                    ((zzyl) zzysVar).zzm(bArr, 10, zzj, false);
                    zzblVar = zzaca.zza(bArr, i11, zzabyVar, new zzabb());
                } else {
                    ((zzyl) zzysVar).zzl(zzj, false);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        zzysVar.zzj();
        ((zzyl) zzysVar).zzl(i10, false);
        return zzblVar;
    }
}
