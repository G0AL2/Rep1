package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import androidx.work.l;
import androidx.work.n;
import androidx.work.v;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4544a = l.i("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        l.e().a(f4544a, "Requesting diagnostics");
        try {
            v.g(context).c(n.e(DiagnosticsWorker.class));
        } catch (IllegalStateException e10) {
            l.e().d(f4544a, "WorkManager is not initialized", e10);
        }
    }
}
