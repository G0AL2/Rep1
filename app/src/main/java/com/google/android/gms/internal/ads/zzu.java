package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzu implements Parcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new zzt();
    public final UUID zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;
    private int zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzu(Parcel parcel) {
        this.zza = new UUID(parcel.readLong(), parcel.readLong());
        this.zzb = parcel.readString();
        String readString = parcel.readString();
        int i10 = zzeg.zza;
        this.zzc = readString;
        this.zzd = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzu) {
            if (obj == this) {
                return true;
            }
            zzu zzuVar = (zzu) obj;
            return zzeg.zzS(this.zzb, zzuVar.zzb) && zzeg.zzS(this.zzc, zzuVar.zzc) && zzeg.zzS(this.zza, zzuVar.zza) && Arrays.equals(this.zzd, zzuVar.zzd);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zze;
        if (i10 == 0) {
            int hashCode = this.zza.hashCode() * 31;
            String str = this.zzb;
            int hashCode2 = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.zzc.hashCode()) * 31) + Arrays.hashCode(this.zzd);
            this.zze = hashCode2;
            return hashCode2;
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.zza.getMostSignificantBits());
        parcel.writeLong(this.zza.getLeastSignificantBits());
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzu(UUID uuid, String str, String str2, byte[] bArr) {
        Objects.requireNonNull(uuid);
        this.zza = uuid;
        this.zzb = null;
        this.zzc = str2;
        this.zzd = bArr;
    }
}
