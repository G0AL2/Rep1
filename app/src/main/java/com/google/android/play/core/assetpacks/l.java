package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes3.dex */
final class l extends k<ParcelFileDescriptor> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public l(p pVar, gb.p<ParcelFileDescriptor> pVar2) {
        super(pVar, pVar2);
    }

    @Override // com.google.android.play.core.assetpacks.k, cb.p0
    public final void h(Bundle bundle, Bundle bundle2) throws RemoteException {
        super.h(bundle, bundle2);
        this.f22889a.e((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
