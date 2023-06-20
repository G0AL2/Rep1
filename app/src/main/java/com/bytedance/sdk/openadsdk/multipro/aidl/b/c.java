package com.bytedance.sdk.openadsdk.multipro.aidl.b;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;

/* compiled from: FullScreenVideoListenerImpl.java */
/* loaded from: classes.dex */
public class c extends IFullScreenVideoAdInteractionListener.Stub {

    /* renamed from: a  reason: collision with root package name */
    private TTFullScreenVideoAd.FullScreenVideoAdInteractionListener f13487a;

    /* renamed from: b  reason: collision with root package name */
    private Handler f13488b = new Handler(Looper.getMainLooper());

    public c(TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener) {
        this.f13487a = fullScreenVideoAdInteractionListener;
    }

    private Handler b() {
        Handler handler = this.f13488b;
        if (handler == null) {
            Handler handler2 = new Handler(Looper.getMainLooper());
            this.f13488b = handler2;
            return handler2;
        }
        return handler;
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdClose() throws RemoteException {
        b().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.b.c.3
            @Override // java.lang.Runnable
            public void run() {
                if (c.this.f13487a != null) {
                    c.this.f13487a.onAdClose();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdShow() throws RemoteException {
        b().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.b.c.1
            @Override // java.lang.Runnable
            public void run() {
                if (c.this.f13487a != null) {
                    c.this.f13487a.onAdShow();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdVideoBarClick() throws RemoteException {
        b().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.b.c.2
            @Override // java.lang.Runnable
            public void run() {
                if (c.this.f13487a != null) {
                    c.this.f13487a.onAdVideoBarClick();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onDestroy() throws RemoteException {
        a();
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onSkippedVideo() throws RemoteException {
        b().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.b.c.5
            @Override // java.lang.Runnable
            public void run() {
                if (c.this.f13487a != null) {
                    c.this.f13487a.onSkippedVideo();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onVideoComplete() throws RemoteException {
        b().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.b.c.4
            @Override // java.lang.Runnable
            public void run() {
                if (c.this.f13487a != null) {
                    c.this.f13487a.onVideoComplete();
                }
            }
        });
    }

    private void a() {
        this.f13487a = null;
        this.f13488b = null;
    }
}
