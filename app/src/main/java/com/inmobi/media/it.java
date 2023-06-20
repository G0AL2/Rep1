package com.inmobi.media;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IceCollector.java */
/* loaded from: classes3.dex */
public class it {

    /* renamed from: b  reason: collision with root package name */
    private static final String f25789b = "it";

    /* renamed from: a  reason: collision with root package name */
    a f25790a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IceCollector.java */
    /* loaded from: classes3.dex */
    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private boolean f25791a;

        a(Looper looper) {
            super(looper);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ boolean a(a aVar, boolean z10) {
            aVar.f25791a = z10;
            return z10;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                String unused = it.f25789b;
                sendEmptyMessage(3);
            } else if (i10 == 2) {
                String unused2 = it.f25789b;
                removeMessages(3);
            } else if (i10 != 3) {
                String unused3 = it.f25789b;
            } else {
                String unused4 = it.f25789b;
                if (this.f25791a) {
                    sendEmptyMessage(2);
                    return;
                }
                jc.a();
                iw.a();
                sendEmptyMessageDelayed(3, iw.e().sampleInterval * 1000);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public it() {
        HandlerThread handlerThread = new HandlerThread("DataCollectionHandler");
        handlerThread.start();
        this.f25790a = new a(handlerThread.getLooper());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043 A[Catch: all -> 0x005d, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000a, B:7:0x0022, B:10:0x002f, B:12:0x0034, B:21:0x0043, B:23:0x0050), top: B:29:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a() {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = com.inmobi.media.ho.a()     // Catch: java.lang.Throwable -> L5d
            r1 = 3
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3e
            java.lang.String r0 = "android.permission.ACCESS_WIFI_STATE"
            java.lang.String r4 = "android.permission.CHANGE_WIFI_STATE"
            java.lang.String r5 = "android.permission.ACCESS_COARSE_LOCATION"
            java.lang.String[] r0 = new java.lang.String[]{r0, r4, r5}     // Catch: java.lang.Throwable -> L5d
            android.content.Context r4 = com.inmobi.media.ho.c()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r5 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r4 = com.inmobi.media.hw.a(r4, r5)     // Catch: java.lang.Throwable -> L5d
            r5 = 0
            r6 = 1
        L20:
            if (r5 >= r1) goto L32
            r7 = r0[r5]     // Catch: java.lang.Throwable -> L5d
            android.content.Context r8 = com.inmobi.media.ho.c()     // Catch: java.lang.Throwable -> L5d
            boolean r7 = com.inmobi.media.hw.a(r8, r7)     // Catch: java.lang.Throwable -> L5d
            if (r7 != 0) goto L2f
            r6 = 0
        L2f:
            int r5 = r5 + 1
            goto L20
        L32:
            if (r6 == 0) goto L3e
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L5d
            r5 = 29
            if (r0 < r5) goto L3c
            if (r4 == 0) goto L3e
        L3c:
            r0 = 1
            goto L3f
        L3e:
            r0 = 0
        L3f:
            if (r0 != 0) goto L43
            monitor-exit(r9)
            return
        L43:
            com.inmobi.media.it$a r0 = r9.f25790a     // Catch: java.lang.Throwable -> L5d
            com.inmobi.media.it.a.a(r0, r3)     // Catch: java.lang.Throwable -> L5d
            com.inmobi.media.it$a r0 = r9.f25790a     // Catch: java.lang.Throwable -> L5d
            boolean r0 = r0.hasMessages(r1)     // Catch: java.lang.Throwable -> L5d
            if (r0 != 0) goto L5b
            com.inmobi.media.it$a r0 = r9.f25790a     // Catch: java.lang.Throwable -> L5d
            r1 = 2
            r0.removeMessages(r1)     // Catch: java.lang.Throwable -> L5d
            com.inmobi.media.it$a r0 = r9.f25790a     // Catch: java.lang.Throwable -> L5d
            r0.sendEmptyMessage(r2)     // Catch: java.lang.Throwable -> L5d
        L5b:
            monitor-exit(r9)
            return
        L5d:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.it.a():void");
    }
}
