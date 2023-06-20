package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzawm extends zzawk {
    public static final Parcelable.Creator<zzawm> CREATOR = new zzawl();
    public final String zza;
    public final String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawm(Parcel parcel) {
        super(parcel.readString());
        this.zza = parcel.readString();
        this.zzb = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzawm.class == obj.getClass()) {
            zzawm zzawmVar = (zzawm) obj;
            if (this.zze.equals(zzawmVar.zze) && zzazo.zzo(this.zza, zzawmVar.zza) && zzazo.zzo(this.zzb, zzawmVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.zze.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.zza;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.zzb;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zze);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    public zzawm(String str, String str2, String str3) {
        super(str);
        this.zza = null;
        this.zzb = str3;
    }
}
