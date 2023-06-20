package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzatr implements Parcelable {
    public static final Parcelable.Creator<zzatr> CREATOR = new zzatq();
    public final String zza;
    public final byte[] zzb;
    public final boolean zzc;
    private int zzd;
    private final UUID zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzatr(Parcel parcel) {
        this.zze = new UUID(parcel.readLong(), parcel.readLong());
        this.zza = parcel.readString();
        this.zzb = parcel.createByteArray();
        this.zzc = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzatr) {
            if (obj == this) {
                return true;
            }
            zzatr zzatrVar = (zzatr) obj;
            return this.zza.equals(zzatrVar.zza) && zzazo.zzo(this.zze, zzatrVar.zze) && Arrays.equals(this.zzb, zzatrVar.zzb);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzd;
        if (i10 == 0) {
            int hashCode = (((this.zze.hashCode() * 31) + this.zza.hashCode()) * 31) + Arrays.hashCode(this.zzb);
            this.zzd = hashCode;
            return hashCode;
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.zze.getMostSignificantBits());
        parcel.writeLong(this.zze.getLeastSignificantBits());
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
        parcel.writeByte(this.zzc ? (byte) 1 : (byte) 0);
    }

    public zzatr(UUID uuid, String str, byte[] bArr, boolean z10) {
        Objects.requireNonNull(uuid);
        this.zze = uuid;
        this.zza = str;
        Objects.requireNonNull(bArr);
        this.zzb = bArr;
        this.zzc = false;
    }
}
