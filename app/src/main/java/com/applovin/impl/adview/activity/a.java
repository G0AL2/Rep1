package com.applovin.impl.adview.activity;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.adview.activity.b.a;
import com.applovin.impl.adview.o;
import com.applovin.impl.sdk.ad.d;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.e.p;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final m f6840a;

    /* renamed from: b  reason: collision with root package name */
    private final v f6841b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<AppLovinFullscreenActivity> f6842c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f6843d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    private Messenger f6844e;

    /* renamed from: com.applovin.impl.adview.activity.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private class C0109a implements AppLovinAdClickListener, AppLovinAdDisplayListener, AppLovinAdVideoPlaybackListener {
        private C0109a() {
        }

        private void a(Bundle bundle, FullscreenAdService.b bVar) {
            Message obtain = Message.obtain((Handler) null, bVar.a());
            if (bundle != null) {
                obtain.setData(bundle);
            }
            try {
                a.this.f6844e.send(obtain);
            } catch (RemoteException e10) {
                if (v.a()) {
                    v vVar = a.this.f6841b;
                    vVar.b("AppLovinFullscreenActivity", "Failed to forward callback (" + bVar.a() + ")", e10);
                }
            }
        }

        private void a(FullscreenAdService.b bVar) {
            a(null, bVar);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            a(FullscreenAdService.b.AD_CLICKED);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            a(FullscreenAdService.b.AD_DISPLAYED);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            a(FullscreenAdService.b.AD_HIDDEN);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            a(FullscreenAdService.b.AD_VIDEO_STARTED);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) {
            Bundle bundle = new Bundle();
            bundle.putDouble("percent_viewed", d10);
            bundle.putBoolean("fully_watched", z10);
            a(bundle, FullscreenAdService.b.AD_VIDEO_ENDED);
        }
    }

    /* loaded from: classes.dex */
    private static class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<a> f6856a;

        private b(a aVar) {
            this.f6856a = new WeakReference<>(aVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar;
            if (message.what != FullscreenAdService.b.AD.a() || (aVar = this.f6856a.get()) == null) {
                super.handleMessage(message);
            } else {
                aVar.a(com.applovin.impl.sdk.ad.b.a(message.getData().getInt(FullscreenAdService.DATA_KEY_AD_SOURCE)), message.getData().getString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE));
            }
        }
    }

    public a(AppLovinFullscreenActivity appLovinFullscreenActivity, m mVar) {
        this.f6840a = mVar;
        this.f6841b = mVar.A();
        this.f6842c = new WeakReference<>(appLovinFullscreenActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        AppLovinFullscreenActivity appLovinFullscreenActivity = this.f6842c.get();
        if (appLovinFullscreenActivity != null) {
            if (v.a()) {
                this.f6841b.b("AppLovinFullscreenActivity", "Dismissing...");
            }
            appLovinFullscreenActivity.dismiss();
        } else if (v.a()) {
            this.f6841b.e("AppLovinFullscreenActivity", "Unable to dismiss parent Activity");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.sdk.ad.b bVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f6840a.S().a((com.applovin.impl.sdk.e.a) new p(jSONObject, d.a(JsonUtils.getString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, "")), bVar, new AppLovinAdLoadListener() { // from class: com.applovin.impl.adview.activity.a.1
                @Override // com.applovin.sdk.AppLovinAdLoadListener
                public void adReceived(final AppLovinAd appLovinAd) {
                    final AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) a.this.f6842c.get();
                    boolean a10 = v.a();
                    if (appLovinFullscreenActivity != null) {
                        if (a10) {
                            a.this.f6841b.b("AppLovinFullscreenActivity", "Presenting ad...");
                        }
                        final C0109a c0109a = new C0109a();
                        com.applovin.impl.adview.activity.b.a.a((e) appLovinAd, c0109a, c0109a, c0109a, a.this.f6840a, appLovinFullscreenActivity, new a.InterfaceC0111a() { // from class: com.applovin.impl.adview.activity.a.1.1
                            @Override // com.applovin.impl.adview.activity.b.a.InterfaceC0111a
                            public void a(com.applovin.impl.adview.activity.b.a aVar) {
                                appLovinFullscreenActivity.setPresenter(aVar);
                                aVar.d();
                            }

                            @Override // com.applovin.impl.adview.activity.b.a.InterfaceC0111a
                            public void a(String str2, Throwable th) {
                                o.a((e) appLovinAd, c0109a, str2, th, appLovinFullscreenActivity);
                            }
                        });
                    } else if (a10) {
                        v vVar = a.this.f6841b;
                        vVar.e("AppLovinFullscreenActivity", "Unable to present ad, parent activity has been GC'd - " + appLovinAd);
                    }
                }

                @Override // com.applovin.sdk.AppLovinAdLoadListener
                public void failedToReceiveAd(int i10) {
                    a.this.a();
                }
            }, this.f6840a));
        } catch (JSONException e10) {
            if (v.a()) {
                v vVar = this.f6841b;
                vVar.b("AppLovinFullscreenActivity", "Unable to process ad: " + str, e10);
            }
            a();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f6843d.compareAndSet(false, true)) {
            if (v.a()) {
                v vVar = this.f6841b;
                vVar.b("AppLovinFullscreenActivity", "Fullscreen ad service connected to " + componentName);
            }
            this.f6844e = new Messenger(iBinder);
            Message obtain = Message.obtain((Handler) null, FullscreenAdService.b.AD.a());
            obtain.replyTo = new Messenger(new b());
            try {
                if (v.a()) {
                    this.f6841b.b("AppLovinFullscreenActivity", "Requesting ad from FullscreenAdService...");
                }
                this.f6844e.send(obtain);
            } catch (RemoteException e10) {
                if (v.a()) {
                    this.f6841b.b("AppLovinFullscreenActivity", "Failed to send ad request message to FullscreenAdService", e10);
                }
                a();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (this.f6843d.compareAndSet(true, false) && v.a()) {
            v vVar = this.f6841b;
            vVar.b("AppLovinFullscreenActivity", "FullscreenAdService disconnected from " + componentName);
        }
    }
}
