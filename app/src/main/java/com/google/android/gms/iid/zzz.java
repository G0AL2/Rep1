package com.google.android.gms.iid;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzz<T> {
    final int what;
    final int zzcp;
    final TaskCompletionSource<T> zzcq = new TaskCompletionSource<>();
    final Bundle zzcr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzz(int i10, int i11, Bundle bundle) {
        this.zzcp = i10;
        this.what = i11;
        this.zzcr = bundle;
    }

    public String toString() {
        int i10 = this.what;
        int i11 = this.zzcp;
        zzw();
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Request { what=");
        sb2.append(i10);
        sb2.append(" id=");
        sb2.append(i11);
        sb2.append(" oneWay=false}");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(zzaa zzaaVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzaaVar);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb2.append("Failing ");
            sb2.append(valueOf);
            sb2.append(" with ");
            sb2.append(valueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.zzcq.setException(zzaaVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzh(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zzw();
}
