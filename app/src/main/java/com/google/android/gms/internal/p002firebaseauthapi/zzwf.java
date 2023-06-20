package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwf  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzwf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = null;
        Long l10 = null;
        String str3 = null;
        Long l11 = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 3) {
                str2 = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 4) {
                l10 = SafeParcelReader.readLongObject(parcel, readHeader);
            } else if (fieldId == 5) {
                str3 = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId != 6) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                l11 = SafeParcelReader.readLongObject(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzwe(str, str2, l10, str3, l11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzwe[i10];
    }
}
