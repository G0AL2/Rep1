package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzty {
    public static final zzty zza = new zzty(new zzck[0]);
    public static final zzl zzb = new zzl() { // from class: com.google.android.gms.internal.ads.zztx
    };
    public final int zzc;
    private final zzfrj zzd;
    private int zze;

    public zzty(zzck... zzckVarArr) {
        this.zzd = zzfrj.zzn(zzckVarArr);
        this.zzc = zzckVarArr.length;
        int i10 = 0;
        while (i10 < this.zzd.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.zzd.size(); i12++) {
                if (((zzck) this.zzd.get(i10)).equals(this.zzd.get(i12))) {
                    zzdn.zza("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzty.class == obj.getClass()) {
            zzty zztyVar = (zzty) obj;
            if (this.zzc == zztyVar.zzc && this.zzd.equals(zztyVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zze;
        if (i10 == 0) {
            int hashCode = this.zzd.hashCode();
            this.zze = hashCode;
            return hashCode;
        }
        return i10;
    }

    public final int zza(zzck zzckVar) {
        int indexOf = this.zzd.indexOf(zzckVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final zzck zzb(int i10) {
        return (zzck) this.zzd.get(i10);
    }
}
