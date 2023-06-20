package com.applovin.impl.adview.activity;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.o;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.j;
import com.applovin.impl.sdk.v;

/* loaded from: classes.dex */
public class FullscreenAdService extends Service {
    public static final String DATA_KEY_AD_SOURCE = "ad_source";
    public static final String DATA_KEY_RAW_FULL_AD_RESPONSE = "raw_full_ad_response";
    private static final String TAG = "FullscreenAdService";

    /* loaded from: classes.dex */
    private static class a extends Handler {
        private a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                o oVar = AppLovinFullscreenActivity.parentInterstitialWrapper;
                if (oVar == null) {
                    if (!Utils.getBooleanForProbability(1)) {
                        super.handleMessage(message);
                        return;
                    }
                    throw new RuntimeException("parentWrapper is null for " + message.what);
                }
                e a10 = oVar.a();
                int i10 = message.what;
                b bVar = b.AD;
                if (i10 == bVar.a()) {
                    Bundle bundle = new Bundle();
                    bundle.putString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE, a10.getRawFullResponse());
                    bundle.putInt(FullscreenAdService.DATA_KEY_AD_SOURCE, a10.getSource().a());
                    Message obtain = Message.obtain((Handler) null, bVar.a());
                    obtain.setData(bundle);
                    try {
                        message.replyTo.send(obtain);
                    } catch (RemoteException e10) {
                        if (v.a()) {
                            v.c(FullscreenAdService.TAG, "Failed to respond to Fullscreen Activity in another process with ad", e10);
                        }
                    }
                } else if (message.what == b.AD_DISPLAYED.a()) {
                    j.a(oVar.c(), a10);
                } else if (message.what == b.AD_CLICKED.a()) {
                    j.a(oVar.d(), a10);
                } else if (message.what == b.AD_VIDEO_STARTED.a()) {
                    j.a(oVar.b(), a10);
                } else if (message.what == b.AD_VIDEO_ENDED.a()) {
                    Bundle data = message.getData();
                    j.a(oVar.b(), a10, data.getDouble("percent_viewed"), data.getBoolean("fully_watched"));
                } else if (message.what == b.AD_HIDDEN.a()) {
                    j.b(oVar.c(), a10);
                } else {
                    super.handleMessage(message);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        AD(0),
        AD_DISPLAYED(1),
        AD_CLICKED(2),
        AD_VIDEO_STARTED(3),
        AD_VIDEO_ENDED(4),
        AD_HIDDEN(5);
        

        /* renamed from: g  reason: collision with root package name */
        private final int f6839g;

        b(int i10) {
            this.f6839g = i10;
        }

        public int a() {
            return this.f6839g;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return new Messenger(new a()).getBinder();
    }
}
