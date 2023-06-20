package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzawe implements Parcelable {
    public static final Parcelable.Creator<zzawe> CREATOR = new zzawc();
    private final zzawd[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawe(Parcel parcel) {
        this.zza = new zzawd[parcel.readInt()];
        int i10 = 0;
        while (true) {
            zzawd[] zzawdVarArr = this.zza;
            if (i10 >= zzawdVarArr.length) {
                return;
            }
            zzawdVarArr[i10] = (zzawd) parcel.readParcelable(zzawd.class.getClassLoader());
            i10++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzawe.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zza, ((zzawe) obj).zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.zza.length);
        for (zzawd zzawdVar : this.zza) {
            parcel.writeParcelable(zzawdVar, 0);
        }
    }

    public final int zza() {
        return this.zza.length;
    }

    public final zzawd zzb(int i10) {
        return this.zza[i10];
    }

    public zzawe(List list) {
        zzawd[] zzawdVarArr = new zzawd[list.size()];
        this.zza = zzawdVarArr;
        list.toArray(zzawdVarArr);
    }
}
