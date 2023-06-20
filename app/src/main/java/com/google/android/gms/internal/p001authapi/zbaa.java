package com.google.android.gms.internal.p001authapi;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@20.1.0 */
/* renamed from: com.google.android.gms.internal.auth-api.zbaa  reason: invalid package */
/* loaded from: classes2.dex */
public abstract class zbaa extends zbb implements zbab {
    public zbaa() {
        super("com.google.android.gms.auth.api.identity.internal.IGetPhoneNumberHintIntentCallback");
    }

    @Override // com.google.android.gms.internal.p001authapi.zbb
    protected final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zbb((Status) zbc.zba(parcel, Status.CREATOR), (PendingIntent) zbc.zba(parcel, PendingIntent.CREATOR));
            return true;
        }
        return false;
    }
}
