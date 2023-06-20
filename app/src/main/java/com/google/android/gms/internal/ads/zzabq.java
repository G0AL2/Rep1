package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzabq extends zzacb {
    public static final Parcelable.Creator<zzabq> CREATOR = new zzabp();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzacb[] zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzabq(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i10 = zzeg.zza;
        this.zza = readString;
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
        int readInt = parcel.readInt();
        this.zzg = new zzacb[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.zzg[i11] = (zzacb) parcel.readParcelable(zzacb.class.getClassLoader());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacb, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzabq.class == obj.getClass()) {
            zzabq zzabqVar = (zzabq) obj;
            if (this.zzb == zzabqVar.zzb && this.zzc == zzabqVar.zzc && this.zzd == zzabqVar.zzd && this.zze == zzabqVar.zze && zzeg.zzS(this.zza, zzabqVar.zza) && Arrays.equals(this.zzg, zzabqVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((((((this.zzb + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 31;
        String str = this.zza;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
        parcel.writeInt(this.zzg.length);
        for (zzacb zzacbVar : this.zzg) {
            parcel.writeParcelable(zzacbVar, 0);
        }
    }

    public zzabq(String str, int i10, int i11, long j10, long j11, zzacb[] zzacbVarArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j10;
        this.zze = j11;
        this.zzg = zzacbVarArr;
    }
}
