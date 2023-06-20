package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaxf implements zzaxb {
    private final zzaxb[] zza;
    private final ArrayList zzb;
    private zzaxa zzd;
    private zzase zze;
    private zzaxe zzg;
    private final zzasd zzc = new zzasd();
    private int zzf = -1;

    public zzaxf(zzaxb... zzaxbVarArr) {
        this.zza = zzaxbVarArr;
        this.zzb = new ArrayList(Arrays.asList(zzaxbVarArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzf(zzaxf zzaxfVar, int i10, zzase zzaseVar, Object obj) {
        zzaxe zzaxeVar;
        if (zzaxfVar.zzg == null) {
            for (int i11 = 0; i11 <= 0; i11++) {
                zzaseVar.zzg(i11, zzaxfVar.zzc, false);
            }
            int i12 = zzaxfVar.zzf;
            if (i12 == -1) {
                zzaxfVar.zzf = 1;
            } else if (i12 != 1) {
                zzaxeVar = new zzaxe(1);
                zzaxfVar.zzg = zzaxeVar;
            }
            zzaxeVar = null;
            zzaxfVar.zzg = zzaxeVar;
        }
        if (zzaxfVar.zzg != null) {
            return;
        }
        zzaxfVar.zzb.remove(zzaxfVar.zza[i10]);
        if (i10 == 0) {
            zzaxfVar.zze = zzaseVar;
        }
        if (zzaxfVar.zzb.isEmpty()) {
            zzaxfVar.zzd.zzg(zzaxfVar.zze, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final void zza() throws IOException {
        zzaxe zzaxeVar = this.zzg;
        if (zzaxeVar != null) {
            throw zzaxeVar;
        }
        for (zzaxb zzaxbVar : this.zza) {
            zzaxbVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final void zzb(zzarj zzarjVar, boolean z10, zzaxa zzaxaVar) {
        this.zzd = zzaxaVar;
        int i10 = 0;
        while (true) {
            zzaxb[] zzaxbVarArr = this.zza;
            if (i10 >= zzaxbVarArr.length) {
                return;
            }
            zzaxbVarArr[i10].zzb(zzarjVar, false, new zzaxd(this, i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final void zzc(zzawz zzawzVar) {
        zzaxc zzaxcVar = (zzaxc) zzawzVar;
        int i10 = 0;
        while (true) {
            zzaxb[] zzaxbVarArr = this.zza;
            if (i10 >= zzaxbVarArr.length) {
                return;
            }
            zzaxbVarArr[i10].zzc(zzaxcVar.zza[i10]);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final void zzd() {
        for (zzaxb zzaxbVar : this.zza) {
            zzaxbVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final zzawz zze(int i10, zzaym zzaymVar) {
        int length = this.zza.length;
        zzawz[] zzawzVarArr = new zzawz[length];
        for (int i11 = 0; i11 < length; i11++) {
            zzawzVarArr[i11] = this.zza[i11].zze(i10, zzaymVar);
        }
        return new zzaxc(zzawzVarArr);
    }
}
