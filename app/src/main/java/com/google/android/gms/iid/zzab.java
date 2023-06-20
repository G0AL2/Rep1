package com.google.android.gms.iid;

import android.os.Bundle;
import android.util.Log;

/* loaded from: classes2.dex */
final class zzab extends zzz<Bundle> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzab(int i10, int i11, Bundle bundle) {
        super(i10, 1, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.iid.zzz
    public final void zzh(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(bundle2);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb2.append("Finishing ");
            sb2.append(valueOf);
            sb2.append(" with ");
            sb2.append(valueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.zzcq.setResult(bundle2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.iid.zzz
    public final boolean zzw() {
        return false;
    }
}
