package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.bytedance.sdk.component.f.e;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.b;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAppOpenAd;
import com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.t;
import com.bytedance.sdk.openadsdk.utils.l;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: TTAppOpenAdImpl.java */
/* loaded from: classes.dex */
public class b implements TTAppOpenAd {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11339a;

    /* renamed from: b  reason: collision with root package name */
    private final n f11340b;

    /* renamed from: c  reason: collision with root package name */
    private TTAppOpenAd.AppOpenAdInteractionListener f11341c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f11342d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    private final String f11343e = l.a();

    /* renamed from: f  reason: collision with root package name */
    private final boolean f11344f;

    public b(Context context, n nVar, boolean z10) {
        this.f11339a = context;
        this.f11340b = nVar;
        this.f11344f = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAppOpenAd
    public void setOpenAdInteractionListener(TTAppOpenAd.AppOpenAdInteractionListener appOpenAdInteractionListener) {
        this.f11341c = appOpenAdInteractionListener;
        a();
    }

    @Override // com.bytedance.sdk.openadsdk.TTAppOpenAd
    public void showAppOpenAd(Activity activity) {
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        if (this.f11342d.getAndSet(true)) {
            return;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            Context context = activity != null ? activity : this.f11339a;
            if (context == null) {
                context = m.a();
            }
            int i10 = 0;
            try {
                i10 = activity.getWindowManager().getDefaultDisplay().getRotation();
            } catch (Exception unused) {
            }
            Intent intent = new Intent(context, TTAppOpenAdActivity.class);
            intent.putExtra("orientation_angle", i10);
            intent.putExtra(FullscreenAdService.DATA_KEY_AD_SOURCE, this.f11344f ? 1 : 2);
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, this.f11340b.ar().toString());
                intent.putExtra(TTAdConstant.MULTI_PROCESS_META_MD5, this.f11343e);
            } else {
                t.a().h();
                t.a().a(this.f11340b);
                t.a().a(this.f11341c);
                this.f11341c = null;
            }
            com.bytedance.sdk.component.utils.b.a(context, intent, new b.a() { // from class: com.bytedance.sdk.openadsdk.component.b.2
                @Override // com.bytedance.sdk.component.utils.b.a
                public void a() {
                    com.bytedance.sdk.component.utils.l.b("TTAppOpenAdImpl", "app open ad startActivitySuccess");
                }

                @Override // com.bytedance.sdk.component.utils.b.a
                public void a(Throwable th) {
                    com.bytedance.sdk.component.utils.l.b("TTAppOpenAdImpl", "app open ad startActivityFail");
                }
            });
            return;
        }
        com.bytedance.sdk.component.utils.l.e("TTAppOpenAdImpl", "showTTAppOpenAd error: not main looper");
        throw new IllegalStateException("Cannot be called in a child thread ---- TTAppOpenAdImpl.showAppOpenAd");
    }

    private void a() {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            e.c(new g("AppOpenAd_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.b.1
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.a a10 = com.bytedance.sdk.openadsdk.multipro.aidl.a.a(b.this.f11339a);
                    if (b.this.f11341c != null) {
                        com.bytedance.sdk.component.utils.l.b("MultiProcess", "start registerAppOpenListener ! ");
                        IListenerManager asInterface = IListenerManager.Stub.asInterface(a10.a(7));
                        if (asInterface != null) {
                            try {
                                asInterface.registerAppOpenAdListener(b.this.f11343e, new com.bytedance.sdk.openadsdk.multipro.aidl.b.a(b.this.f11341c));
                                b.this.f11341c = null;
                                com.bytedance.sdk.component.utils.l.b("MultiProcess", "end registerAppOpenAdListener ! ");
                            } catch (RemoteException e10) {
                                e10.printStackTrace();
                            }
                        }
                    }
                }
            }, 5);
        }
    }
}
