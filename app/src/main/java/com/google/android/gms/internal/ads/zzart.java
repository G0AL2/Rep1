package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzart implements Parcelable {
    public static final Parcelable.Creator<zzart> CREATOR = new zzars();
    private int zzA;
    public final String zza;
    public final int zzb;
    public final String zzc;
    public final zzawe zzd;
    public final String zze;
    public final String zzf;
    public final int zzg;
    public final List zzh;
    public final zzats zzi;
    public final int zzj;
    public final int zzk;
    public final float zzl;
    public final int zzm;
    public final float zzn;
    public final int zzo;
    public final byte[] zzp;
    public final zzazr zzq;
    public final int zzr;
    public final int zzs;
    public final int zzt;
    public final int zzu;
    public final int zzv;
    public final long zzw;
    public final int zzx;
    public final String zzy;
    public final int zzz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzart(Parcel parcel) {
        this.zza = parcel.readString();
        this.zze = parcel.readString();
        this.zzf = parcel.readString();
        this.zzc = parcel.readString();
        this.zzb = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzj = parcel.readInt();
        this.zzk = parcel.readInt();
        this.zzl = parcel.readFloat();
        this.zzm = parcel.readInt();
        this.zzn = parcel.readFloat();
        this.zzp = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.zzo = parcel.readInt();
        this.zzq = (zzazr) parcel.readParcelable(zzazr.class.getClassLoader());
        this.zzr = parcel.readInt();
        this.zzs = parcel.readInt();
        this.zzt = parcel.readInt();
        this.zzu = parcel.readInt();
        this.zzv = parcel.readInt();
        this.zzx = parcel.readInt();
        this.zzy = parcel.readString();
        this.zzz = parcel.readInt();
        this.zzw = parcel.readLong();
        int readInt = parcel.readInt();
        this.zzh = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.zzh.add(parcel.createByteArray());
        }
        this.zzi = (zzats) parcel.readParcelable(zzats.class.getClassLoader());
        this.zzd = (zzawe) parcel.readParcelable(zzawe.class.getClassLoader());
    }

    public static zzart zzg(String str, String str2, String str3, int i10, int i11, int i12, int i13, List list, zzats zzatsVar, int i14, String str4) {
        return zzh(str, str2, null, -1, -1, i12, i13, -1, -1, -1, null, zzatsVar, 0, str4, null);
    }

    public static zzart zzh(String str, String str2, String str3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, List list, zzats zzatsVar, int i17, String str4, zzawe zzaweVar) {
        return new zzart(str, null, str2, null, -1, i11, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i12, i13, i14, -1, -1, i17, str4, -1, Long.MAX_VALUE, list, zzatsVar, null);
    }

    public static zzart zzi(String str, String str2, String str3, int i10, List list, String str4, zzats zzatsVar) {
        return new zzart(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, zzatsVar, null);
    }

    public static zzart zzj(String str, String str2, String str3, int i10, zzats zzatsVar) {
        return new zzart(str, null, "application/x-camera-motion", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, zzatsVar, null);
    }

    public static zzart zzk(String str, String str2, String str3, int i10, int i11, String str4, int i12, zzats zzatsVar, long j10, List list) {
        return new zzart(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i11, str4, -1, j10, list, zzatsVar, null);
    }

    public static zzart zzl(String str, String str2, String str3, int i10, int i11, int i12, int i13, float f10, List list, int i14, float f11, byte[] bArr, int i15, zzazr zzazrVar, zzats zzatsVar) {
        return new zzart(str, null, str2, null, -1, i11, i12, i13, -1.0f, i14, f11, bArr, i15, zzazrVar, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, zzatsVar, null);
    }

    @TargetApi(16)
    private static void zzm(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzart.class == obj.getClass()) {
            zzart zzartVar = (zzart) obj;
            if (this.zzb == zzartVar.zzb && this.zzg == zzartVar.zzg && this.zzj == zzartVar.zzj && this.zzk == zzartVar.zzk && this.zzl == zzartVar.zzl && this.zzm == zzartVar.zzm && this.zzn == zzartVar.zzn && this.zzo == zzartVar.zzo && this.zzr == zzartVar.zzr && this.zzs == zzartVar.zzs && this.zzt == zzartVar.zzt && this.zzu == zzartVar.zzu && this.zzv == zzartVar.zzv && this.zzw == zzartVar.zzw && this.zzx == zzartVar.zzx && zzazo.zzo(this.zza, zzartVar.zza) && zzazo.zzo(this.zzy, zzartVar.zzy) && this.zzz == zzartVar.zzz && zzazo.zzo(this.zze, zzartVar.zze) && zzazo.zzo(this.zzf, zzartVar.zzf) && zzazo.zzo(this.zzc, zzartVar.zzc) && zzazo.zzo(this.zzi, zzartVar.zzi) && zzazo.zzo(this.zzd, zzartVar.zzd) && zzazo.zzo(this.zzq, zzartVar.zzq) && Arrays.equals(this.zzp, zzartVar.zzp) && this.zzh.size() == zzartVar.zzh.size()) {
                for (int i10 = 0; i10 < this.zzh.size(); i10++) {
                    if (!Arrays.equals((byte[]) this.zzh.get(i10), (byte[]) zzartVar.zzh.get(i10))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzA;
        if (i10 == 0) {
            String str = this.zza;
            int hashCode = ((str == null ? 0 : str.hashCode()) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.zze;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.zzf;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.zzc;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.zzb) * 31) + this.zzj) * 31) + this.zzk) * 31) + this.zzr) * 31) + this.zzs) * 31;
            String str5 = this.zzy;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.zzz) * 31;
            zzats zzatsVar = this.zzi;
            int hashCode6 = (hashCode5 + (zzatsVar == null ? 0 : zzatsVar.hashCode())) * 31;
            zzawe zzaweVar = this.zzd;
            int hashCode7 = hashCode6 + (zzaweVar != null ? zzaweVar.hashCode() : 0);
            this.zzA = hashCode7;
            return hashCode7;
        }
        return i10;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zze;
        String str3 = this.zzf;
        int i10 = this.zzb;
        String str4 = this.zzy;
        int i11 = this.zzj;
        int i12 = this.zzk;
        float f10 = this.zzl;
        int i13 = this.zzr;
        int i14 = this.zzs;
        return "Format(" + str + ", " + str2 + ", " + str3 + ", " + i10 + ", " + str4 + ", [" + i11 + ", " + i12 + ", " + f10 + "], [" + i13 + ", " + i14 + "])";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zze);
        parcel.writeString(this.zzf);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzg);
        parcel.writeInt(this.zzj);
        parcel.writeInt(this.zzk);
        parcel.writeFloat(this.zzl);
        parcel.writeInt(this.zzm);
        parcel.writeFloat(this.zzn);
        parcel.writeInt(this.zzp != null ? 1 : 0);
        byte[] bArr = this.zzp;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.zzo);
        parcel.writeParcelable(this.zzq, i10);
        parcel.writeInt(this.zzr);
        parcel.writeInt(this.zzs);
        parcel.writeInt(this.zzt);
        parcel.writeInt(this.zzu);
        parcel.writeInt(this.zzv);
        parcel.writeInt(this.zzx);
        parcel.writeString(this.zzy);
        parcel.writeInt(this.zzz);
        parcel.writeLong(this.zzw);
        int size = this.zzh.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeByteArray((byte[]) this.zzh.get(i11));
        }
        parcel.writeParcelable(this.zzi, 0);
        parcel.writeParcelable(this.zzd, 0);
    }

    public final int zza() {
        int i10;
        int i11 = this.zzj;
        if (i11 == -1 || (i10 = this.zzk) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    public final MediaFormat zzb() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.zzf);
        String str = this.zzy;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        zzm(mediaFormat, "max-input-size", this.zzg);
        zzm(mediaFormat, "width", this.zzj);
        zzm(mediaFormat, "height", this.zzk);
        float f10 = this.zzl;
        if (f10 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f10);
        }
        zzm(mediaFormat, "rotation-degrees", this.zzm);
        zzm(mediaFormat, "channel-count", this.zzr);
        zzm(mediaFormat, "sample-rate", this.zzs);
        zzm(mediaFormat, "encoder-delay", this.zzu);
        zzm(mediaFormat, "encoder-padding", this.zzv);
        for (int i10 = 0; i10 < this.zzh.size(); i10++) {
            mediaFormat.setByteBuffer("csd-" + i10, ByteBuffer.wrap((byte[]) this.zzh.get(i10)));
        }
        zzazr zzazrVar = this.zzq;
        if (zzazrVar != null) {
            zzm(mediaFormat, "color-transfer", zzazrVar.zzc);
            zzm(mediaFormat, "color-standard", zzazrVar.zza);
            zzm(mediaFormat, "color-range", zzazrVar.zzb);
            byte[] bArr = zzazrVar.zzd;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public final zzart zzc(zzats zzatsVar) {
        return new zzart(this.zza, this.zze, this.zzf, this.zzc, this.zzb, this.zzg, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzx, this.zzy, this.zzz, this.zzw, this.zzh, zzatsVar, this.zzd);
    }

    public final zzart zzd(int i10, int i11) {
        return new zzart(this.zza, this.zze, this.zzf, this.zzc, this.zzb, this.zzg, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, i10, i11, this.zzx, this.zzy, this.zzz, this.zzw, this.zzh, this.zzi, this.zzd);
    }

    public final zzart zze(int i10) {
        return new zzart(this.zza, this.zze, this.zzf, this.zzc, this.zzb, i10, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzx, this.zzy, this.zzz, this.zzw, this.zzh, this.zzi, this.zzd);
    }

    public final zzart zzf(zzawe zzaweVar) {
        return new zzart(this.zza, this.zze, this.zzf, this.zzc, this.zzb, this.zzg, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzx, this.zzy, this.zzz, this.zzw, this.zzh, this.zzi, zzaweVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzart(String str, String str2, String str3, String str4, int i10, int i11, int i12, int i13, float f10, int i14, float f11, byte[] bArr, int i15, zzazr zzazrVar, int i16, int i17, int i18, int i19, int i20, int i21, String str5, int i22, long j10, List list, zzats zzatsVar, zzawe zzaweVar) {
        this.zza = str;
        this.zze = str2;
        this.zzf = str3;
        this.zzc = str4;
        this.zzb = i10;
        this.zzg = i11;
        this.zzj = i12;
        this.zzk = i13;
        this.zzl = f10;
        this.zzm = i14;
        this.zzn = f11;
        this.zzp = bArr;
        this.zzo = i15;
        this.zzq = zzazrVar;
        this.zzr = i16;
        this.zzs = i17;
        this.zzt = i18;
        this.zzu = i19;
        this.zzv = i20;
        this.zzx = i21;
        this.zzy = str5;
        this.zzz = i22;
        this.zzw = j10;
        this.zzh = list == null ? Collections.emptyList() : list;
        this.zzi = zzatsVar;
        this.zzd = zzaweVar;
    }
}
