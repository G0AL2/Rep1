package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzabm extends zzacb {
    public static final Parcelable.Creator<zzabm> CREATOR = new zzabl();
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzabm(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i10 = zzeg.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readInt();
        this.zzd = (byte[]) zzeg.zzG(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzabm.class == obj.getClass()) {
            zzabm zzabmVar = (zzabm) obj;
            if (this.zzc == zzabmVar.zzc && zzeg.zzS(this.zza, zzabmVar.zza) && zzeg.zzS(this.zzb, zzabmVar.zzb) && Arrays.equals(this.zzd, zzabmVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.zzc + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.zza;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.zzb;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzacb
    public final String toString() {
        String str = this.zzf;
        String str2 = this.zza;
        String str3 = this.zzb;
        return str + ": mimeType=" + str2 + ", description=" + str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzacb, com.google.android.gms.internal.ads.zzbk
    public final void zza(zzbf zzbfVar) {
        zzbfVar.zza(this.zzd, this.zzc);
    }

    public zzabm(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = bArr;
    }
}
