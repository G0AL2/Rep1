package com.google.android.gms.internal.p001authapi;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;

/* compiled from: com.google.android.gms:play-services-auth@@20.1.0 */
/* renamed from: com.google.android.gms.internal.auth-api.zbz  reason: invalid package */
/* loaded from: classes2.dex */
public final class zbz extends zba {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zbz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    public final void zbc(zbaf zbafVar, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) throws RemoteException {
        Parcel zba = zba();
        zbc.zbc(zba, zbafVar);
        zbc.zbb(zba, saveAccountLinkingTokenRequest);
        zbb(1, zba);
    }

    public final void zbd(zbah zbahVar, SavePasswordRequest savePasswordRequest) throws RemoteException {
        Parcel zba = zba();
        zbc.zbc(zba, zbahVar);
        zbc.zbb(zba, savePasswordRequest);
        zbb(2, zba);
    }
}
