package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth@@20.1.0 */
/* loaded from: classes2.dex */
public final class zbe implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        CredentialPickerConfig credentialPickerConfig = null;
        String[] strArr = null;
        String str = null;
        String str2 = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1000) {
                switch (fieldId) {
                    case 1:
                        credentialPickerConfig = (CredentialPickerConfig) SafeParcelReader.createParcelable(parcel, readHeader, CredentialPickerConfig.CREATOR);
                        continue;
                    case 2:
                        z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                        continue;
                    case 3:
                        z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                        continue;
                    case 4:
                        strArr = SafeParcelReader.createStringArray(parcel, readHeader);
                        continue;
                    case 5:
                        z12 = SafeParcelReader.readBoolean(parcel, readHeader);
                        continue;
                    case 6:
                        str = SafeParcelReader.createString(parcel, readHeader);
                        continue;
                    case 7:
                        str2 = SafeParcelReader.createString(parcel, readHeader);
                        continue;
                    default:
                        SafeParcelReader.skipUnknownField(parcel, readHeader);
                        continue;
                }
            } else {
                i10 = SafeParcelReader.readInt(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new HintRequest(i10, credentialPickerConfig, z10, z11, strArr, z12, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new HintRequest[i10];
    }
}
