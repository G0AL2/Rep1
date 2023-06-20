package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzabk implements zzbk {
    public static final Parcelable.Creator<zzabk> CREATOR = new zzabj();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final boolean zze;
    public final int zzf;

    public zzabk(int i10, String str, String str2, String str3, boolean z10, int i11) {
        boolean z11 = true;
        if (i11 != -1 && i11 <= 0) {
            z11 = false;
        }
        zzcw.zzd(z11);
        this.zza = i10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z10;
        this.zzf = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzabk.class == obj.getClass()) {
            zzabk zzabkVar = (zzabk) obj;
            if (this.zza == zzabkVar.zza && zzeg.zzS(this.zzb, zzabkVar.zzb) && zzeg.zzS(this.zzc, zzabkVar.zzc) && zzeg.zzS(this.zzd, zzabkVar.zzd) && this.zze == zzabkVar.zze && this.zzf == zzabkVar.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.zza + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.zzb;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.zzc;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.zzd;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.zze ? 1 : 0)) * 31) + this.zzf;
    }

    public final String toString() {
        String str = this.zzc;
        String str2 = this.zzb;
        int i10 = this.zza;
        int i11 = this.zzf;
        return "IcyHeaders: name=\"" + str + "\", genre=\"" + str2 + "\", bitrate=" + i10 + ", metadataInterval=" + i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeString(this.zzd);
        zzeg.zzR(parcel, this.zze);
        parcel.writeInt(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final void zza(zzbf zzbfVar) {
        String str = this.zzc;
        if (str != null) {
            zzbfVar.zzq(str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            zzbfVar.zzj(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzabk(Parcel parcel) {
        this.zza = parcel.readInt();
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = parcel.readString();
        this.zze = zzeg.zzY(parcel);
        this.zzf = parcel.readInt();
    }
}
