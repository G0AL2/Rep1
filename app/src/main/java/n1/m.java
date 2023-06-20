package n1;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: StorageNotLowTracker.kt */
/* loaded from: classes.dex */
public final class m extends e<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, q1.c cVar) {
        super(context, cVar);
        qe.k.f(context, "context");
        qe.k.f(cVar, "taskExecutor");
    }

    @Override // n1.e
    public IntentFilter j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // n1.e
    public void k(Intent intent) {
        String str;
        qe.k.f(intent, "intent");
        if (intent.getAction() == null) {
            return;
        }
        androidx.work.l e10 = androidx.work.l.e();
        str = n.f34619a;
        e10.a(str, "Received " + intent.getAction());
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode == -1181163412) {
                if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                    g(Boolean.FALSE);
                }
            } else if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                g(Boolean.TRUE);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (r0.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L14;
     */
    @Override // n1.h
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Boolean e() {
        /*
            r5 = this;
            android.content.Context r0 = r5.d()
            android.content.IntentFilter r1 = r5.j()
            r2 = 0
            android.content.Intent r0 = r0.registerReceiver(r2, r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L3d
            java.lang.String r3 = r0.getAction()
            if (r3 != 0) goto L18
            goto L3d
        L18:
            java.lang.String r0 = r0.getAction()
            if (r0 == 0) goto L3e
            int r3 = r0.hashCode()
            r4 = -1181163412(0xffffffffb998e06c, float:-2.9158907E-4)
            if (r3 == r4) goto L36
            r4 = -730838620(0xffffffffd47049a4, float:-4.1281105E12)
            if (r3 == r4) goto L2d
            goto L3e
        L2d:
            java.lang.String r3 = "android.intent.action.DEVICE_STORAGE_OK"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L3d
            goto L3e
        L36:
            java.lang.String r2 = "android.intent.action.DEVICE_STORAGE_LOW"
            boolean r0 = r0.equals(r2)
            goto L3e
        L3d:
            r1 = 1
        L3e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.m.e():java.lang.Boolean");
    }
}
