package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzabg implements zzbk {
    public static final Parcelable.Creator<zzabg> CREATOR = new zzabf();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzabg(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = i13;
        this.zzg = i14;
        this.zzh = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzabg(Parcel parcel) {
        this.zza = parcel.readInt();
        String readString = parcel.readString();
        int i10 = zzeg.zza;
        this.zzb = readString;
        this.zzc = parcel.readString();
        this.zzd = parcel.readInt();
        this.zze = parcel.readInt();
        this.zzf = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzh = (byte[]) zzeg.zzG(parcel.createByteArray());
    }

    public static zzabg zzb(zzdy zzdyVar) {
        int zze = zzdyVar.zze();
        String zzx = zzdyVar.zzx(zzdyVar.zze(), zzfoi.zza);
        String zzx2 = zzdyVar.zzx(zzdyVar.zze(), zzfoi.zzc);
        int zze2 = zzdyVar.zze();
        int zze3 = zzdyVar.zze();
        int zze4 = zzdyVar.zze();
        int zze5 = zzdyVar.zze();
        int zze6 = zzdyVar.zze();
        byte[] bArr = new byte[zze6];
        zzdyVar.zzB(bArr, 0, zze6);
        return new zzabg(zze, zzx, zzx2, zze2, zze3, zze4, zze5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzabg.class == obj.getClass()) {
            zzabg zzabgVar = (zzabg) obj;
            if (this.zza == zzabgVar.zza && this.zzb.equals(zzabgVar.zzb) && this.zzc.equals(zzabgVar.zzc) && this.zzd == zzabgVar.zzd && this.zze == zzabgVar.zze && this.zzf == zzabgVar.zzf && this.zzg == zzabgVar.zzg && Arrays.equals(this.zzh, zzabgVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.zza + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode()) * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + Arrays.hashCode(this.zzh);
    }

    public final String toString() {
        String str = this.zzb;
        String str2 = this.zzc;
        return "Picture: mimeType=" + str + ", description=" + str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzd);
        parcel.writeInt(this.zze);
        parcel.writeInt(this.zzf);
        parcel.writeInt(this.zzg);
        parcel.writeByteArray(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final void zza(zzbf zzbfVar) {
        zzbfVar.zza(this.zzh, this.zza);
    }
}
