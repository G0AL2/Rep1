package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzac implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        String str = null;
        String str2 = null;
        zzll zzllVar = null;
        String str3 = null;
        zzav zzavVar = null;
        zzav zzavVar2 = null;
        zzav zzavVar3 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    zzllVar = (zzll) SafeParcelReader.createParcelable(parcel, readHeader, zzll.CREATOR);
                    break;
                case 5:
                    j10 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 6:
                    z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 7:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 8:
                    zzavVar = (zzav) SafeParcelReader.createParcelable(parcel, readHeader, zzav.CREATOR);
                    break;
                case 9:
                    j11 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 10:
                    zzavVar2 = (zzav) SafeParcelReader.createParcelable(parcel, readHeader, zzav.CREATOR);
                    break;
                case 11:
                    j12 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 12:
                    zzavVar3 = (zzav) SafeParcelReader.createParcelable(parcel, readHeader, zzav.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzab(str, str2, zzllVar, j10, z10, str3, zzavVar, j11, zzavVar2, j12, zzavVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzab[i10];
    }
}
