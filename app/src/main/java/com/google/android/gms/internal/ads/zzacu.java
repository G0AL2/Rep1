package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzacu implements zzbk {
    public static final Parcelable.Creator<zzacu> CREATOR = new zzacs();
    public final float zza;
    public final int zzb;

    public zzacu(float f10, int i10) {
        this.zza = f10;
        this.zzb = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzacu(Parcel parcel, zzact zzactVar) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacu.class == obj.getClass()) {
            zzacu zzacuVar = (zzacu) obj;
            if (this.zza == zzacuVar.zza && this.zzb == zzacuVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.zza).hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb;
    }

    public final String toString() {
        float f10 = this.zza;
        int i10 = this.zzb;
        return "smta: captureFrameRate=" + f10 + ", svcTemporalLayerCount=" + i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.zza);
        parcel.writeInt(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final /* synthetic */ void zza(zzbf zzbfVar) {
    }
}
