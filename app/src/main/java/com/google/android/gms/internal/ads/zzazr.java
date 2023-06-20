package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzazr implements Parcelable {
    public static final Parcelable.Creator<zzazr> CREATOR = new zzazq();
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final byte[] zzd;
    private int zze;

    public zzazr(int i10, int i11, int i12, byte[] bArr) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzazr(Parcel parcel) {
        this.zza = parcel.readInt();
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzazr.class == obj.getClass()) {
            zzazr zzazrVar = (zzazr) obj;
            if (this.zza == zzazrVar.zza && this.zzb == zzazrVar.zzb && this.zzc == zzazrVar.zzc && Arrays.equals(this.zzd, zzazrVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zze;
        if (i10 == 0) {
            int hashCode = ((((((this.zza + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb) * 31) + this.zzc) * 31) + Arrays.hashCode(this.zzd);
            this.zze = hashCode;
            return hashCode;
        }
        return i10;
    }

    public final String toString() {
        int i10 = this.zza;
        int i11 = this.zzb;
        int i12 = this.zzc;
        boolean z10 = this.zzd != null;
        return "ColorInfo(" + i10 + ", " + i11 + ", " + i12 + ", " + z10 + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeInt(this.zzd != null ? 1 : 0);
        byte[] bArr = this.zzd;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
