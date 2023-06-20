package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public abstract class zaj extends com.google.android.gms.internal.base.zab implements zak {
    public zaj() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    protected final boolean zaa(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zab(parcel.readInt());
            return true;
        }
        return false;
    }
}
