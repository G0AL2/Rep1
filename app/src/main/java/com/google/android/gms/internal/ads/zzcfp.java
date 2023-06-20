package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcfp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 3) {
                i10 = SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId == 4) {
                i11 = SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId == 5) {
                z10 = SafeParcelReader.readBoolean(parcel, readHeader);
            } else if (fieldId != 6) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                z11 = SafeParcelReader.readBoolean(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzcfo(str, i10, i11, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzcfo[i10];
    }
}
