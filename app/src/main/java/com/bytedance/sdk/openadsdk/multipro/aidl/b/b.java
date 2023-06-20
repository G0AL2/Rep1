package com.bytedance.sdk.openadsdk.multipro.aidl.b;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import com.bytedance.sdk.openadsdk.core.bannerexpress.a;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;

/* compiled from: DislikeClosedListenerImpl.java */
/* loaded from: classes.dex */
public class b extends IDislikeClosedListener.Stub {

    /* renamed from: a  reason: collision with root package name */
    private a.InterfaceC0169a f13483a;

    /* renamed from: b  reason: collision with root package name */
    private final String f13484b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f13485c = new Handler(Looper.getMainLooper());

    public b(String str, a.InterfaceC0169a interfaceC0169a) {
        this.f13484b = str;
        this.f13483a = interfaceC0169a;
    }

    @Override // com.bytedance.sdk.openadsdk.IDislikeClosedListener
    public void onItemClickClosed() throws RemoteException {
        a().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f13483a != null) {
                    b.this.f13483a.a();
                    TTDislikeListView.a(6, b.this.f13484b);
                }
            }
        });
    }

    private Handler a() {
        Handler handler = this.f13485c;
        if (handler == null) {
            Handler handler2 = new Handler(Looper.getMainLooper());
            this.f13485c = handler2;
            return handler2;
        }
        return handler;
    }
}
