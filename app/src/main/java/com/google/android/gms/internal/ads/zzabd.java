package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzabd implements zzbk {
    public static final Parcelable.Creator<zzabd> CREATOR;
    private static final zzad zzf;
    private static final zzad zzg;
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzh;

    static {
        zzab zzabVar = new zzab();
        zzabVar.zzS("application/id3");
        zzf = zzabVar.zzY();
        zzab zzabVar2 = new zzab();
        zzabVar2.zzS("application/x-scte35");
        zzg = zzabVar2.zzY();
        CREATOR = new zzabc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzabd(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = zzeg.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = (byte[]) zzeg.zzG(parcel.createByteArray());
    }

    public zzabd(String str, String str2, long j10, long j11, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzabd.class == obj.getClass()) {
            zzabd zzabdVar = (zzabd) obj;
            if (this.zzc == zzabdVar.zzc && this.zzd == zzabdVar.zzd && zzeg.zzS(this.zza, zzabdVar.zza) && zzeg.zzS(this.zzb, zzabdVar.zzb) && Arrays.equals(this.zze, zzabdVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzh;
        if (i10 == 0) {
            String str = this.zza;
            int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.zzb;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j10 = this.zzc;
            long j11 = this.zzd;
            int hashCode3 = ((((((hashCode + hashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31) + Arrays.hashCode(this.zze);
            this.zzh = hashCode3;
            return hashCode3;
        }
        return i10;
    }

    public final String toString() {
        String str = this.zza;
        long j10 = this.zzd;
        long j11 = this.zzc;
        String str2 = this.zzb;
        return "EMSG: scheme=" + str + ", id=" + j10 + ", durationMs=" + j11 + ", value=" + str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeByteArray(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final /* synthetic */ void zza(zzbf zzbfVar) {
    }
}
