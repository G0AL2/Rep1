package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzawg extends zzawk {
    public static final Parcelable.Creator<zzawg> CREATOR = new zzawf();
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawg(Parcel parcel) {
        super("APIC");
        this.zza = parcel.readString();
        this.zzb = parcel.readString();
        this.zzc = parcel.readInt();
        this.zzd = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzawg.class == obj.getClass()) {
            zzawg zzawgVar = (zzawg) obj;
            if (this.zzc == zzawgVar.zzc && zzazo.zzo(this.zza, zzawgVar.zza) && zzazo.zzo(this.zzb, zzawgVar.zzb) && Arrays.equals(this.zzd, zzawgVar.zzd)) {
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

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzawg(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = null;
        this.zzc = 3;
        this.zzd = bArr;
    }
}
