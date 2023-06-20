package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzaw implements Parcelable.Creator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(zzav zzavVar, Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, zzavVar.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 3, zzavVar.zzb, i10, false);
        SafeParcelWriter.writeString(parcel, 4, zzavVar.zzc, false);
        SafeParcelWriter.writeLong(parcel, 5, zzavVar.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        zzat zzatVar = null;
        String str2 = null;
        long j10 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 3) {
                zzatVar = (zzat) SafeParcelReader.createParcelable(parcel, readHeader, zzat.CREATOR);
            } else if (fieldId == 4) {
                str2 = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId != 5) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                j10 = SafeParcelReader.readLong(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzav(str, zzatVar, str2, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzav[i10];
    }
}
