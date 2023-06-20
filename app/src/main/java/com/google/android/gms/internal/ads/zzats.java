package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzats implements Comparator<zzatr>, Parcelable {
    public static final Parcelable.Creator<zzats> CREATOR = new zzatp();
    public final int zza;
    private final zzatr[] zzb;
    private int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzats(Parcel parcel) {
        zzatr[] zzatrVarArr = (zzatr[]) parcel.createTypedArray(zzatr.CREATOR);
        this.zzb = zzatrVarArr;
        this.zza = zzatrVarArr.length;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzatr zzatrVar, zzatr zzatrVar2) {
        UUID uuid;
        UUID uuid2;
        UUID uuid3;
        UUID uuid4;
        zzatr zzatrVar3 = zzatrVar;
        zzatr zzatrVar4 = zzatrVar2;
        UUID uuid5 = zzare.zzb;
        uuid = zzatrVar3.zze;
        if (uuid5.equals(uuid)) {
            uuid4 = zzatrVar4.zze;
            return !uuid5.equals(uuid4) ? 1 : 0;
        }
        uuid2 = zzatrVar3.zze;
        uuid3 = zzatrVar4.zze;
        return uuid2.compareTo(uuid3);
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
        if (obj == null || zzats.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzb, ((zzats) obj).zzb);
    }

    public final int hashCode() {
        int i10 = this.zzc;
        if (i10 == 0) {
            int hashCode = Arrays.hashCode(this.zzb);
            this.zzc = hashCode;
            return hashCode;
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedArray(this.zzb, 0);
    }

    public final zzatr zza(int i10) {
        return this.zzb[i10];
    }

    public zzats(List list) {
        this(false, (zzatr[]) list.toArray(new zzatr[list.size()]));
    }

    private zzats(boolean z10, zzatr... zzatrVarArr) {
        UUID uuid;
        UUID uuid2;
        UUID uuid3;
        zzatrVarArr = z10 ? (zzatr[]) zzatrVarArr.clone() : zzatrVarArr;
        Arrays.sort(zzatrVarArr, this);
        int i10 = 1;
        while (true) {
            int length = zzatrVarArr.length;
            if (i10 >= length) {
                this.zzb = zzatrVarArr;
                this.zza = length;
                return;
            }
            uuid = zzatrVarArr[i10 - 1].zze;
            uuid2 = zzatrVarArr[i10].zze;
            if (uuid.equals(uuid2)) {
                uuid3 = zzatrVarArr[i10].zze;
                throw new IllegalArgumentException("Duplicate data for uuid: ".concat(String.valueOf(uuid3)));
            }
            i10++;
        }
    }

    public zzats(zzatr... zzatrVarArr) {
        this(true, zzatrVarArr);
    }
}
