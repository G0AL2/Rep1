package com.fyber.inneractive.sdk.activities;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.a0;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.y;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.l;
import com.fyber.inneractive.sdk.flow.s;
import com.fyber.inneractive.sdk.interfaces.c;
import com.fyber.inneractive.sdk.network.r;
import com.fyber.inneractive.sdk.renderers.k;
import com.fyber.inneractive.sdk.ui.CloseButtonFlowManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.n;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public class InneractiveFullscreenAdActivity extends Activity implements c.a {
    public static final String EXTRA_KEY_SPOT_ID = "spotId";

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f16670a;

    /* renamed from: b  reason: collision with root package name */
    public InneractiveAdSpot f16671b;

    /* renamed from: c  reason: collision with root package name */
    public com.fyber.inneractive.sdk.interfaces.c f16672c;

    /* renamed from: d  reason: collision with root package name */
    public int f16673d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f16674e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f16675f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f16676g = false;

    /* renamed from: h  reason: collision with root package name */
    public CloseButtonFlowManager f16677h;

    /* loaded from: classes.dex */
    public interface FullScreenRendererProvider {
        com.fyber.inneractive.sdk.interfaces.c getFullscreenRenderer();
    }

    /* loaded from: classes.dex */
    public interface OnInneractiveFullscreenAdDestroyListener {
        void onActivityDestroyed(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity);
    }

    /* loaded from: classes.dex */
    public class a implements View.OnSystemUiVisibilityChangeListener {

        /* renamed from: com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0224a implements Runnable {
            public RunnableC0224a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (InneractiveFullscreenAdActivity.this.isFinishing()) {
                    return;
                }
                InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity = InneractiveFullscreenAdActivity.this;
                String str = InneractiveFullscreenAdActivity.EXTRA_KEY_SPOT_ID;
                inneractiveFullscreenAdActivity.a();
            }
        }

        public a() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i10) {
            if ((i10 & 2) == 0) {
                n.f20310b.postDelayed(new RunnableC0224a(), 3000L);
            }
        }
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 19) {
            View decorView = getWindow().getDecorView();
            if ((decorView.getSystemUiVisibility() & 2) == 0) {
                decorView.setSystemUiVisibility(2818);
            }
            decorView.setOnSystemUiVisibilityChangeListener(new a());
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public void destroy() {
        if (isFinishing() || this.f16670a == null) {
            return;
        }
        finish();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public void disableCloseButton() {
        CloseButtonFlowManager closeButtonFlowManager = this.f16677h;
        closeButtonFlowManager.f20199c.setVisibility(8);
        closeButtonFlowManager.f20197a.setVisibility(8);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public void dismissAd(boolean z10) {
        this.f16676g = z10;
        com.fyber.inneractive.sdk.interfaces.c cVar = this.f16672c;
        if (cVar != null) {
            cVar.c(z10);
        }
        finish();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public View getCloseButton() {
        return this.f16677h.f20201e;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public ViewGroup getLayout() {
        return this.f16670a;
    }

    public void initWindowFeatures(com.fyber.inneractive.sdk.interfaces.c cVar) {
        requestWindowFeature(1);
        getWindow().addFlags(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
        getWindow().addFlags(128);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            getWindow().addFlags(2);
        }
        if (cVar != null && (((l) cVar) instanceof k)) {
            setTheme(16973831);
            if (i10 >= 19) {
                requestWindowFeature(67108864);
                requestWindowFeature(134217728);
            }
            if (i10 >= 21) {
                requestWindowFeature(RecyclerView.UNDEFINED_DURATION);
            }
        }
        a();
        a0 a0Var = ((y) this.f16671b.getAdContent().f17242d).f17077f;
        if (a0Var != null) {
            Orientation orientation = a0Var.f16903e;
            setActivityOrientation(orientation.allowOrientationChange, orientation);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public boolean isCloseButtonDisplay() {
        return this.f16677h.f20200d.getVisibility() == 0;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        com.fyber.inneractive.sdk.interfaces.c cVar = this.f16672c;
        if (cVar == null || !cVar.u()) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.fyber.inneractive.sdk.interfaces.c cVar = this.f16672c;
        if (cVar != null) {
            int i10 = configuration.orientation;
            if (i10 != this.f16673d) {
                this.f16673d = i10;
                cVar.b();
                return;
            }
            int i11 = this.f16674e;
            int i12 = configuration.screenHeightDp;
            if (i11 == i12 && this.f16675f == configuration.screenWidthDp) {
                return;
            }
            this.f16674e = i12;
            this.f16675f = configuration.screenWidthDp;
            cVar.b();
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [AdContent extends com.fyber.inneractive.sdk.flow.j, com.fyber.inneractive.sdk.flow.j] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.fyber.inneractive.sdk.external.InneractiveUnitController$EventsListener, EventsListener extends com.fyber.inneractive.sdk.external.InneractiveUnitController$EventsListener] */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("spotId");
        InneractiveAdSpot inneractiveAdSpot = null;
        if (TextUtils.isEmpty(stringExtra)) {
            IAlog.e("%sSpot id must be provided as an extra before calling createActivity with InneractiveInterstitialAdActivty", IAlog.a(this));
        } else {
            InneractiveAdSpot spot = InneractiveAdSpotManager.get().getSpot(stringExtra);
            if (spot == null) {
                IAlog.b("%sSpot id %s cannot be found in spot manager!", IAlog.a(this), stringExtra);
            }
            if (spot != null && spot.getAdContent() == null) {
                IAlog.a("%sSpot does not have a content. Cannot start activity", IAlog.a(this));
            }
            if (spot != null && spot.getAdContent() != null) {
                inneractiveAdSpot = spot;
            }
        }
        this.f16671b = inneractiveAdSpot;
        if (inneractiveAdSpot == null || inneractiveAdSpot.getAdContent() == null || this.f16671b.getAdContent().f17242d == null) {
            super.onCreate(bundle);
            finish();
            return;
        }
        InneractiveUnitController selectedUnitController = this.f16671b.getSelectedUnitController();
        if (selectedUnitController != null && (selectedUnitController instanceof FullScreenRendererProvider)) {
            com.fyber.inneractive.sdk.interfaces.c fullscreenRenderer = ((FullScreenRendererProvider) selectedUnitController).getFullscreenRenderer();
            this.f16672c = fullscreenRenderer;
            initWindowFeatures(fullscreenRenderer);
            super.onCreate(bundle);
            IAlog.a("%sInterstitial for spot id %s created", IAlog.a(this), this.f16671b.getLocalUniqueId());
            this.f16673d = getResources().getConfiguration().orientation;
            this.f16674e = getResources().getConfiguration().screenHeightDp;
            this.f16675f = getResources().getConfiguration().screenWidthDp;
            if (this.f16672c != null) {
                try {
                    setContentView(R.layout.ia_fullscreen_activity);
                    this.f16670a = (ViewGroup) findViewById(R.id.ia_ad_content);
                    this.f16677h = new CloseButtonFlowManager(this);
                    com.fyber.inneractive.sdk.interfaces.c cVar = this.f16672c;
                    InneractiveAdSpot inneractiveAdSpot2 = this.f16671b;
                    s sVar = (s) cVar;
                    sVar.f17246a = inneractiveAdSpot2;
                    sVar.f17247b = inneractiveAdSpot2.getAdContent();
                    sVar.f17248c = inneractiveAdSpot2.getSelectedUnitController().getEventsListener();
                    sVar.f17292u.f20225a = inneractiveAdSpot2;
                    try {
                        this.f16672c.a(this, this);
                        this.f16671b.getAdContent().f17243e = true;
                        return;
                    } catch (Resources.NotFoundException e10) {
                        IAlog.e("Interstitial Activity: %s", e10.getMessage());
                        finish();
                        return;
                    } catch (InneractiveUnitController.AdDisplayError e11) {
                        IAlog.e("Interstitial Activity: %s", e11.getMessage());
                        finish();
                        return;
                    }
                } catch (Throwable th) {
                    r.a(th, this.f16671b.getAdContent().f17239a, this.f16671b.getAdContent().c());
                    finish();
                    return;
                }
            }
            IAlog.e("Interstitial Activity: Could not find an appropriate full screen ad renderer for content!", new Object[0]);
            finish();
            return;
        }
        IAlog.e("%sno appropriate unit controller found for full screen ad. Aborting", IAlog.a(this));
        super.onCreate(bundle);
        finish();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        ViewGroup viewGroup = this.f16670a;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f16670a = null;
        }
        InneractiveAdSpot inneractiveAdSpot = this.f16671b;
        InneractiveUnitController selectedUnitController = inneractiveAdSpot == null ? null : inneractiveAdSpot.getSelectedUnitController();
        if (selectedUnitController != null && (selectedUnitController instanceof OnInneractiveFullscreenAdDestroyListener)) {
            ((OnInneractiveFullscreenAdDestroyListener) selectedUnitController).onActivityDestroyed(this);
        }
        com.fyber.inneractive.sdk.interfaces.c cVar = this.f16672c;
        if (cVar != null) {
            cVar.m();
            this.f16672c.destroy();
            this.f16672c = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            com.fyber.inneractive.sdk.interfaces.c cVar = this.f16672c;
            if (cVar != null) {
                cVar.m();
                this.f16672c.destroy();
                this.f16672c = null;
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.interfaces.c cVar2 = this.f16672c;
        if (cVar2 != null) {
            cVar2.s();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        com.fyber.inneractive.sdk.interfaces.c cVar = this.f16672c;
        if (cVar != null) {
            cVar.o();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            a();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public void setActivityOrientation(boolean z10, Orientation orientation) {
        if (z10 && orientation.equals(Orientation.USER)) {
            setRequestedOrientation(13);
        } else if (z10 && orientation.equals(Orientation.NONE)) {
            setRequestedOrientation(getRequestedOrientation());
        } else if (orientation.equals(Orientation.LANDSCAPE)) {
            setRequestedOrientation(6);
        } else if (orientation.equals(Orientation.PORTRAIT)) {
            setRequestedOrientation(7);
        } else {
            int i10 = getResources().getConfiguration().orientation;
            if (i10 == 1) {
                setRequestedOrientation(7);
            } else if (i10 == 2) {
                setRequestedOrientation(6);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public void showCloseButton(boolean z10, int i10, int i11) {
        int i12;
        int i13;
        CloseButtonFlowManager closeButtonFlowManager = this.f16677h;
        if (z10) {
            closeButtonFlowManager.f20197a.setAlpha(0.0f);
            closeButtonFlowManager.f20200d.setAlpha(0.0f);
        }
        closeButtonFlowManager.f20198b.setText("");
        closeButtonFlowManager.f20198b.setVisibility(8);
        if (i10 >= 5) {
            int a10 = com.fyber.inneractive.sdk.util.l.a(i10);
            closeButtonFlowManager.f20200d.getLayoutParams().width = a10;
            closeButtonFlowManager.f20200d.getLayoutParams().height = a10;
        }
        if (i11 >= 5) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) closeButtonFlowManager.f20197a.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) closeButtonFlowManager.f20199c.getLayoutParams();
            int a11 = com.fyber.inneractive.sdk.util.l.a(i11);
            int i14 = ((FrameLayout.LayoutParams) closeButtonFlowManager.f20200d.getLayoutParams()).width;
            int i15 = a11 - i14;
            if (a11 > i14 && i15 > (i13 = layoutParams.rightMargin)) {
                int i16 = (a11 / 2) + (i14 / 2) + i13;
                layoutParams2.width = i16;
                layoutParams2.height = i16;
                layoutParams.gravity = 53;
                i12 = 0;
            } else {
                layoutParams2.width = a11;
                layoutParams2.height = a11;
                i12 = layoutParams.rightMargin;
                if (i15 < i12) {
                    i12 -= i15 / 2;
                }
            }
            layoutParams2.setMargins(i12, i12, i12, i12);
            layoutParams2.gravity = 17;
        }
        closeButtonFlowManager.f20197a.setVisibility(0);
        closeButtonFlowManager.f20200d.setVisibility(0);
        closeButtonFlowManager.f20199c.setVisibility(0);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public void showCloseCountdown() {
        CloseButtonFlowManager closeButtonFlowManager = this.f16677h;
        closeButtonFlowManager.f20198b.setBackgroundResource(R.drawable.ia_round_overlay_bg);
        closeButtonFlowManager.f20197a.setVisibility(0);
        closeButtonFlowManager.f20198b.setVisibility(0);
        closeButtonFlowManager.f20200d.setVisibility(8);
        closeButtonFlowManager.f20199c.setVisibility(8);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public void updateCloseCountdown(int i10) {
        CloseButtonFlowManager closeButtonFlowManager = this.f16677h;
        closeButtonFlowManager.getClass();
        if (i10 > 0) {
            closeButtonFlowManager.f20198b.setText(Integer.toString(i10));
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c.a
    public boolean wasDismissedByUser() {
        return this.f16676g;
    }
}
