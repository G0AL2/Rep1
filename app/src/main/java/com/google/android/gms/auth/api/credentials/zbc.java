package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth@@20.1.0 */
/* loaded from: classes2.dex */
public final class zbc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String[] strArr = null;
        CredentialPickerConfig credentialPickerConfig = null;
        CredentialPickerConfig credentialPickerConfig2 = null;
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
                        z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                        continue;
                    case 2:
                        strArr = SafeParcelReader.createStringArray(parcel, readHeader);
                        continue;
                    case 3:
                        credentialPickerConfig = (CredentialPickerConfig) SafeParcelReader.createParcelable(parcel, readHeader, CredentialPickerConfig.CREATOR);
                        continue;
                    case 4:
                        credentialPickerConfig2 = (CredentialPickerConfig) SafeParcelReader.createParcelable(parcel, readHeader, CredentialPickerConfig.CREATOR);
                        continue;
                    case 5:
                        z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                        continue;
                    case 6:
                        str = SafeParcelReader.createString(parcel, readHeader);
                        continue;
                    case 7:
                        str2 = SafeParcelReader.createString(parcel, readHeader);
                        continue;
                    case 8:
                        z12 = SafeParcelReader.readBoolean(parcel, readHeader);
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
        return new CredentialRequest(i10, z10, strArr, credentialPickerConfig, credentialPickerConfig2, z11, str, str2, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new CredentialRequest[i10];
    }
}
