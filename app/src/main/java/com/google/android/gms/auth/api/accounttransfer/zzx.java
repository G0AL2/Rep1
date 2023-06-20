package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes2.dex */
public final class zzx implements Parcelable.Creator<DeviceMetaData> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DeviceMetaData createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j10 = 0;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                i10 = SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId == 2) {
                z10 = SafeParcelReader.readBoolean(parcel, readHeader);
            } else if (fieldId == 3) {
                j10 = SafeParcelReader.readLong(parcel, readHeader);
            } else if (fieldId != 4) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                z11 = SafeParcelReader.readBoolean(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new DeviceMetaData(i10, z10, j10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DeviceMetaData[] newArray(int i10) {
        return new DeviceMetaData[i10];
    }
}
