package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: RemoteMessageCreator.java */
/* loaded from: classes3.dex */
public class m0 implements Parcelable.Creator<RemoteMessage> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(RemoteMessage remoteMessage, Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, remoteMessage.f23436a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RemoteMessage createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(readHeader) != 2) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                bundle = SafeParcelReader.createBundle(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new RemoteMessage(bundle);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b */
    public RemoteMessage[] newArray(int i10) {
        return new RemoteMessage[i10];
    }
}
