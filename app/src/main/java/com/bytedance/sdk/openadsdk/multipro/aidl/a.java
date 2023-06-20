package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.sdk.component.f.e;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.multipro.aidl.a.d;
import com.bytedance.sdk.openadsdk.multipro.aidl.a.f;
import com.bytedance.sdk.openadsdk.multipro.aidl.a.h;
import com.bytedance.sdk.openadsdk.utils.u;

/* compiled from: BinderPool.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    private static a f13452c = new a();

    /* renamed from: d  reason: collision with root package name */
    private static b f13453d;

    /* renamed from: b  reason: collision with root package name */
    private IBinderPool f13455b;

    /* renamed from: e  reason: collision with root package name */
    private long f13456e = 0;

    /* renamed from: f  reason: collision with root package name */
    private ServiceConnection f13457f = new ServiceConnection() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.a.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            e.a(new g("onServiceConnected") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.a.1.1
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f13455b = IBinderPool.Stub.asInterface(iBinder);
                    try {
                        a.this.f13455b.asBinder().linkToDeath(a.this.f13458g, 0);
                    } catch (RemoteException e10) {
                        l.c("MultiProcess", "onServiceConnected throws :", e10);
                    }
                    l.b("MultiProcess", "onServiceConnected - binderService consume time ：" + (System.currentTimeMillis() - a.this.f13456e));
                    if (a.f13453d != null) {
                        a.f13453d.a();
                    }
                }
            }, 5);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            l.c("MultiProcess", "BinderPool......onServiceDisconnected");
        }
    };

    /* renamed from: g  reason: collision with root package name */
    private IBinder.DeathRecipient f13458g = new IBinder.DeathRecipient() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.a.2
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            e.a(new g("binderDied") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.a.2.1
                @Override // java.lang.Runnable
                public void run() {
                    l.d("MultiProcess", "binder died.");
                    a.this.f13455b.asBinder().unlinkToDeath(a.this.f13458g, 0);
                    a.this.f13455b = null;
                    a.this.c();
                }
            }, 5);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private Context f13454a = m.a().getApplicationContext();

    private a() {
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            l.c("MultiProcess", "BinderPool......connectBinderPoolService");
            a();
        }
    }

    public static a a(Context context) {
        return f13452c;
    }

    public void a() {
        this.f13454a.bindService(new Intent(this.f13454a, BinderPoolService.class), this.f13457f, 1);
        this.f13456e = System.currentTimeMillis();
    }

    public static void a(b bVar) {
        f13453d = bVar;
    }

    public IBinder a(int i10) {
        try {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                try {
                    IBinderPool iBinderPool = this.f13455b;
                    if (iBinderPool != null) {
                        return iBinderPool.queryBinder(i10);
                    }
                    return null;
                } catch (RemoteException e10) {
                    e10.printStackTrace();
                    u.l("queryBinder error");
                    return null;
                }
            } else if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                if (i10 != 6) {
                                    if (i10 != 7) {
                                        return null;
                                    }
                                    return com.bytedance.sdk.openadsdk.multipro.aidl.a.b.a();
                                }
                                return com.bytedance.sdk.openadsdk.multipro.aidl.a.e.a();
                            }
                            return com.bytedance.sdk.openadsdk.multipro.aidl.a.g.a();
                        }
                        return d.a();
                    }
                    return com.bytedance.sdk.openadsdk.multipro.aidl.a.c.a();
                }
                return f.a();
            } else {
                return h.a();
            }
        } catch (Throwable unused) {
            return null;
        }
    }
}
