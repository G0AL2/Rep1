package com.google.android.gms.internal.p001authapi;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* compiled from: com.google.android.gms:play-services-auth@@20.1.0 */
/* renamed from: com.google.android.gms.internal.auth-api.zbai  reason: invalid package */
/* loaded from: classes2.dex */
public final class zbai extends zba {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zbai(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(zby zbyVar, BeginSignInRequest beginSignInRequest) throws RemoteException {
        Parcel zba = zba();
        zbc.zbc(zba, zbyVar);
        zbc.zbb(zba, beginSignInRequest);
        zbb(1, zba);
    }

    public final void zbd(zbab zbabVar, GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, String str) throws RemoteException {
        Parcel zba = zba();
        zbc.zbc(zba, zbabVar);
        zbc.zbb(zba, getPhoneNumberHintIntentRequest);
        zba.writeString(str);
        zbb(4, zba);
    }

    public final void zbe(zbad zbadVar, GetSignInIntentRequest getSignInIntentRequest) throws RemoteException {
        Parcel zba = zba();
        zbc.zbc(zba, zbadVar);
        zbc.zbb(zba, getSignInIntentRequest);
        zbb(3, zba);
    }

    public final void zbf(IStatusCallback iStatusCallback, String str) throws RemoteException {
        Parcel zba = zba();
        zbc.zbc(zba, iStatusCallback);
        zba.writeString(str);
        zbb(2, zba);
    }
}
