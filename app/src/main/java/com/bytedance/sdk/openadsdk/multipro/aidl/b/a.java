package com.bytedance.sdk.openadsdk.multipro.aidl.b;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.TTAppOpenAd;

/* compiled from: AppOpenAdListenerImpl.java */
/* loaded from: classes.dex */
public class a extends IAppOpenAdInteractionListener.Stub {

    /* renamed from: a  reason: collision with root package name */
    private TTAppOpenAd.AppOpenAdInteractionListener f13477a;

    /* renamed from: b  reason: collision with root package name */
    private Handler f13478b = new Handler(Looper.getMainLooper());

    public a(TTAppOpenAd.AppOpenAdInteractionListener appOpenAdInteractionListener) {
        this.f13477a = appOpenAdInteractionListener;
    }

    private Handler b() {
        Handler handler = this.f13478b;
        if (handler == null) {
            Handler handler2 = new Handler(Looper.getMainLooper());
            this.f13478b = handler2;
            return handler2;
        }
        return handler;
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdClicked() throws RemoteException {
        b().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.b.a.2
            @Override // java.lang.Runnable
            public void run() {
                if (a.this.f13477a != null) {
                    a.this.f13477a.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdShow() throws RemoteException {
        b().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.b.a.1
            @Override // java.lang.Runnable
            public void run() {
                if (a.this.f13477a != null) {
                    a.this.f13477a.onAdShow();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdSkip() throws RemoteException {
        b().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.b.a.3
            @Override // java.lang.Runnable
            public void run() {
                if (a.this.f13477a != null) {
                    a.this.f13477a.onAdSkip();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdTimeOver() throws RemoteException {
        b().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.b.a.4
            @Override // java.lang.Runnable
            public void run() {
                if (a.this.f13477a != null) {
                    a.this.f13477a.onAdCountdownToZero();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onDestroy() throws RemoteException {
        a();
    }

    private void a() {
        this.f13477a = null;
        this.f13478b = null;
    }
}
