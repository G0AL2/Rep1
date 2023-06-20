package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzv implements Comparator<zzu>, Parcelable {
    public static final Parcelable.Creator<zzv> CREATOR = new zzs();
    public final String zza;
    public final int zzb;
    private final zzu[] zzc;
    private int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzv(Parcel parcel) {
        this.zza = parcel.readString();
        zzu[] zzuVarArr = (zzu[]) zzeg.zzG((zzu[]) parcel.createTypedArray(zzu.CREATOR));
        this.zzc = zzuVarArr;
        this.zzb = zzuVarArr.length;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzu zzuVar, zzu zzuVar2) {
        zzu zzuVar3 = zzuVar;
        zzu zzuVar4 = zzuVar2;
        UUID uuid = zzm.zza;
        if (uuid.equals(zzuVar3.zza)) {
            return !uuid.equals(zzuVar4.zza) ? 1 : 0;
        }
        return zzuVar3.zza.compareTo(zzuVar4.zza);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzv.class == obj.getClass()) {
            zzv zzvVar = (zzv) obj;
            if (zzeg.zzS(this.zza, zzvVar.zza) && Arrays.equals(this.zzc, zzvVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzd;
        if (i10 == 0) {
            String str = this.zza;
            int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.zzc);
            this.zzd = hashCode;
            return hashCode;
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeTypedArray(this.zzc, 0);
    }

    public final zzu zza(int i10) {
        return this.zzc[i10];
    }

    public final zzv zzb(String str) {
        return zzeg.zzS(this.zza, str) ? this : new zzv(str, false, this.zzc);
    }

    private zzv(String str, boolean z10, zzu... zzuVarArr) {
        this.zza = str;
        zzuVarArr = z10 ? (zzu[]) zzuVarArr.clone() : zzuVarArr;
        this.zzc = zzuVarArr;
        this.zzb = zzuVarArr.length;
        Arrays.sort(zzuVarArr, this);
    }

    public zzv(String str, zzu... zzuVarArr) {
        this(null, true, zzuVarArr);
    }

    public zzv(List list) {
        this(null, false, (zzu[]) list.toArray(new zzu[0]));
    }
}
