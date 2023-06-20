package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.multipro.aidl.a.d;
import com.bytedance.sdk.openadsdk.multipro.aidl.a.e;
import com.bytedance.sdk.openadsdk.multipro.aidl.a.f;
import com.bytedance.sdk.openadsdk.multipro.aidl.a.g;
import com.bytedance.sdk.openadsdk.multipro.aidl.a.h;

/* loaded from: classes.dex */
public class BinderPoolService extends Service {

    /* renamed from: a  reason: collision with root package name */
    private Binder f13451a = new a();

    /* loaded from: classes.dex */
    public static class a extends IBinderPool.Stub {
        @Override // com.bytedance.sdk.openadsdk.IBinderPool
        public IBinder queryBinder(int i10) throws RemoteException {
            l.c("MultiProcess", "queryBinder...........binderCode=" + i10);
            if (i10 != 0) {
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
                                return e.a();
                            }
                            return g.a();
                        }
                        return d.a();
                    }
                    return com.bytedance.sdk.openadsdk.multipro.aidl.a.c.a();
                }
                return f.a();
            }
            return h.a();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        l.b("MultiProcess", "BinderPoolService onBind ! ");
        return this.f13451a;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        l.b("MultiProcess", "BinderPoolService has been created ! ");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        l.b("MultiProcess", "BinderPoolService is destroy ! ");
    }
}
