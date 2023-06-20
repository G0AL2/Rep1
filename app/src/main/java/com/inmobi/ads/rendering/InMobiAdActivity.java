package com.inmobi.ads.rendering;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.inmobi.media.cp;
import com.inmobi.media.cr;
import com.inmobi.media.ct;
import com.inmobi.media.cu;
import com.inmobi.media.dd;
import com.inmobi.media.fq;
import com.inmobi.media.fr;
import com.inmobi.media.gg;
import com.inmobi.media.hg;
import com.inmobi.media.ho;
import com.inmobi.media.hu;
import com.inmobi.media.i;
import com.inmobi.media.ic;
import com.inmobi.media.j;
import com.inmobi.media.q;
import com.inmobi.media.s;

@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes3.dex */
public class InMobiAdActivity extends Activity {

    /* renamed from: c  reason: collision with root package name */
    private static final String f24409c = "InMobiAdActivity";

    /* renamed from: d  reason: collision with root package name */
    private static SparseArray<j> f24410d = new SparseArray<>();

    /* renamed from: e  reason: collision with root package name */
    private static q f24411e;

    /* renamed from: f  reason: collision with root package name */
    private static s f24412f;

    /* renamed from: a  reason: collision with root package name */
    public cu f24413a;

    /* renamed from: g  reason: collision with root package name */
    private ct f24415g;

    /* renamed from: h  reason: collision with root package name */
    private q f24416h;

    /* renamed from: i  reason: collision with root package name */
    private int f24417i;

    /* renamed from: b  reason: collision with root package name */
    public boolean f24414b = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean f24418j = false;

    @Override // android.app.Activity
    public void onBackPressed() {
        cr crVar;
        int i10 = this.f24417i;
        if (i10 != 102) {
            if (i10 == 100) {
                this.f24414b = true;
                finish();
                return;
            }
            return;
        }
        ct ctVar = this.f24415g;
        if (ctVar == null || (crVar = ctVar.f25013b) == null) {
            return;
        }
        crVar.f();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f24413a.a();
    }

    @Override // android.app.Activity
    @TargetApi(23)
    protected void onCreate(Bundle bundle) {
        fq fqVar;
        fq fqVar2;
        s sVar;
        super.onCreate(bundle);
        if (!ho.a()) {
            finish();
            hu.a((byte) 2, "InMobi", "Session not found, AdActivity will be closed");
            return;
        }
        this.f24418j = false;
        if (Build.VERSION.SDK_INT >= 29) {
            ic.a(this);
        }
        this.f24417i = getIntent().getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
        this.f24413a = new cu(this);
        int i10 = this.f24417i;
        if (i10 != 100) {
            if (i10 == 102) {
                ct ctVar = new ct(this);
                this.f24415g = ctVar;
                this.f24413a.a(ctVar);
                this.f24415g.a(getIntent(), f24410d);
                return;
            }
            return;
        }
        String stringExtra = getIntent().getStringExtra("com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL");
        long longExtra = getIntent().getLongExtra("placementId", Long.MIN_VALUE);
        boolean booleanExtra = getIntent().getBooleanExtra("allowAutoRedirection", false);
        String stringExtra2 = getIntent().getStringExtra("impressionId");
        String stringExtra3 = getIntent().getStringExtra("creativeId");
        s sVar2 = q.f25944a;
        q qVar = f24411e;
        try {
            if (qVar != null) {
                sVar2 = qVar.getListener();
                fqVar = f24411e.getAdConfig();
            } else {
                fqVar = (fq) fr.a("ads", ho.f());
                s sVar3 = f24412f;
                if (sVar3 != null) {
                    fqVar2 = fqVar;
                    sVar = sVar3;
                    q qVar2 = new q(this, (byte) 1, null, stringExtra2, Boolean.TRUE, "DEFAULT");
                    this.f24416h = qVar2;
                    qVar2.setPlacementId(longExtra);
                    this.f24416h.setCreativeId(stringExtra3);
                    this.f24416h.setAllowAutoRedirection(booleanExtra);
                    this.f24416h.setShouldFireRenderBeacon(false);
                    this.f24416h.a(sVar, fqVar2, false, false);
                    RelativeLayout relativeLayout = new RelativeLayout(this);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams.addRule(10);
                    layoutParams.addRule(2, i.f25720c);
                    relativeLayout.setBackgroundColor(-1);
                    relativeLayout.addView(this.f24416h, layoutParams);
                    float f10 = ic.a().f25747c;
                    LinearLayout linearLayout = new LinearLayout(this);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (48.0f * f10));
                    linearLayout.setOrientation(0);
                    linearLayout.setId(i.f25720c);
                    linearLayout.setWeightSum(100.0f);
                    linearLayout.setBackgroundResource(17301658);
                    linearLayout.setBackgroundColor(-7829368);
                    layoutParams2.addRule(12);
                    relativeLayout.addView(linearLayout, layoutParams2);
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
                    layoutParams3.weight = 25.0f;
                    cp cpVar = new cp(this, f10, (byte) 2);
                    cpVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.ads.rendering.InMobiAdActivity.1
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            if (motionEvent.getAction() == 1) {
                                view.setBackgroundColor(-7829368);
                                InMobiAdActivity inMobiAdActivity = InMobiAdActivity.this;
                                inMobiAdActivity.f24414b = true;
                                inMobiAdActivity.finish();
                                return true;
                            }
                            if (motionEvent.getAction() == 0) {
                                view.setBackgroundColor(-16711681);
                            }
                            return true;
                        }
                    });
                    linearLayout.addView(cpVar, layoutParams3);
                    cp cpVar2 = new cp(this, f10, (byte) 3);
                    cpVar2.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.ads.rendering.InMobiAdActivity.2
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            if (motionEvent.getAction() == 1) {
                                view.setBackgroundColor(-7829368);
                                InMobiAdActivity.this.f24416h.reload();
                                return true;
                            }
                            if (motionEvent.getAction() == 0) {
                                view.setBackgroundColor(-16711681);
                            }
                            return true;
                        }
                    });
                    linearLayout.addView(cpVar2, layoutParams3);
                    cp cpVar3 = new cp(this, f10, (byte) 4);
                    cpVar3.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.ads.rendering.InMobiAdActivity.3
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            if (motionEvent.getAction() == 1) {
                                view.setBackgroundColor(-7829368);
                                if (InMobiAdActivity.this.f24416h.canGoBack()) {
                                    InMobiAdActivity.this.f24416h.goBack();
                                } else {
                                    InMobiAdActivity inMobiAdActivity = InMobiAdActivity.this;
                                    inMobiAdActivity.f24414b = true;
                                    inMobiAdActivity.finish();
                                }
                                return true;
                            }
                            if (motionEvent.getAction() == 0) {
                                view.setBackgroundColor(-16711681);
                            }
                            return true;
                        }
                    });
                    linearLayout.addView(cpVar3, layoutParams3);
                    cp cpVar4 = new cp(this, f10, (byte) 6);
                    cpVar4.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.ads.rendering.InMobiAdActivity.4
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            if (motionEvent.getAction() == 1) {
                                view.setBackgroundColor(-7829368);
                                if (InMobiAdActivity.this.f24416h.canGoForward()) {
                                    InMobiAdActivity.this.f24416h.goForward();
                                }
                                return true;
                            }
                            if (motionEvent.getAction() == 0) {
                                view.setBackgroundColor(-16711681);
                            }
                            return true;
                        }
                    });
                    linearLayout.addView(cpVar4, layoutParams3);
                    setContentView(relativeLayout);
                    this.f24416h.loadUrl(stringExtra);
                    this.f24416h.setFullScreenActivityContext(this);
                    this.f24413a.a(this.f24416h);
                    return;
                }
            }
            q qVar22 = new q(this, (byte) 1, null, stringExtra2, Boolean.TRUE, "DEFAULT");
            this.f24416h = qVar22;
            qVar22.setPlacementId(longExtra);
            this.f24416h.setCreativeId(stringExtra3);
            this.f24416h.setAllowAutoRedirection(booleanExtra);
            this.f24416h.setShouldFireRenderBeacon(false);
            this.f24416h.a(sVar, fqVar2, false, false);
            RelativeLayout relativeLayout2 = new RelativeLayout(this);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams4.addRule(10);
            layoutParams4.addRule(2, i.f25720c);
            relativeLayout2.setBackgroundColor(-1);
            relativeLayout2.addView(this.f24416h, layoutParams4);
            float f102 = ic.a().f25747c;
            LinearLayout linearLayout2 = new LinearLayout(this);
            RelativeLayout.LayoutParams layoutParams22 = new RelativeLayout.LayoutParams(-1, (int) (48.0f * f102));
            linearLayout2.setOrientation(0);
            linearLayout2.setId(i.f25720c);
            linearLayout2.setWeightSum(100.0f);
            linearLayout2.setBackgroundResource(17301658);
            linearLayout2.setBackgroundColor(-7829368);
            layoutParams22.addRule(12);
            relativeLayout2.addView(linearLayout2, layoutParams22);
            LinearLayout.LayoutParams layoutParams32 = new LinearLayout.LayoutParams(-1, -1);
            layoutParams32.weight = 25.0f;
            cp cpVar5 = new cp(this, f102, (byte) 2);
            cpVar5.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.ads.rendering.InMobiAdActivity.1
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        view.setBackgroundColor(-7829368);
                        InMobiAdActivity inMobiAdActivity = InMobiAdActivity.this;
                        inMobiAdActivity.f24414b = true;
                        inMobiAdActivity.finish();
                        return true;
                    }
                    if (motionEvent.getAction() == 0) {
                        view.setBackgroundColor(-16711681);
                    }
                    return true;
                }
            });
            linearLayout2.addView(cpVar5, layoutParams32);
            cp cpVar22 = new cp(this, f102, (byte) 3);
            cpVar22.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.ads.rendering.InMobiAdActivity.2
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        view.setBackgroundColor(-7829368);
                        InMobiAdActivity.this.f24416h.reload();
                        return true;
                    }
                    if (motionEvent.getAction() == 0) {
                        view.setBackgroundColor(-16711681);
                    }
                    return true;
                }
            });
            linearLayout2.addView(cpVar22, layoutParams32);
            cp cpVar32 = new cp(this, f102, (byte) 4);
            cpVar32.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.ads.rendering.InMobiAdActivity.3
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        view.setBackgroundColor(-7829368);
                        if (InMobiAdActivity.this.f24416h.canGoBack()) {
                            InMobiAdActivity.this.f24416h.goBack();
                        } else {
                            InMobiAdActivity inMobiAdActivity = InMobiAdActivity.this;
                            inMobiAdActivity.f24414b = true;
                            inMobiAdActivity.finish();
                        }
                        return true;
                    }
                    if (motionEvent.getAction() == 0) {
                        view.setBackgroundColor(-16711681);
                    }
                    return true;
                }
            });
            linearLayout2.addView(cpVar32, layoutParams32);
            cp cpVar42 = new cp(this, f102, (byte) 6);
            cpVar42.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.ads.rendering.InMobiAdActivity.4
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        view.setBackgroundColor(-7829368);
                        if (InMobiAdActivity.this.f24416h.canGoForward()) {
                            InMobiAdActivity.this.f24416h.goForward();
                        }
                        return true;
                    }
                    if (motionEvent.getAction() == 0) {
                        view.setBackgroundColor(-16711681);
                    }
                    return true;
                }
            });
            linearLayout2.addView(cpVar42, layoutParams32);
            setContentView(relativeLayout2);
            this.f24416h.loadUrl(stringExtra);
            this.f24416h.setFullScreenActivityContext(this);
            this.f24413a.a(this.f24416h);
            return;
        } catch (Exception e10) {
            gg.a().a(new hg(e10));
            sVar.a();
            finish();
            return;
        }
        sVar = sVar2;
        fqVar2 = fqVar;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        if (this.f24414b) {
            int i10 = this.f24417i;
            if (100 == i10) {
                q qVar = this.f24416h;
                if (qVar != null && qVar.getFullScreenEventsListener() != null) {
                    try {
                        this.f24416h.getFullScreenEventsListener().b(this.f24416h);
                        this.f24416h.destroy();
                        this.f24413a.b(this.f24416h);
                        this.f24416h = null;
                    } catch (Exception unused) {
                    }
                }
            } else if (102 == i10) {
                ct ctVar = this.f24415g;
                if (ctVar != null) {
                    this.f24413a.b(ctVar);
                    this.f24415g.a();
                }
                this.f24415g = null;
            }
        } else {
            int i11 = this.f24417i;
            if (100 != i11 && 102 == i11) {
                ct ctVar2 = this.f24415g;
                if (ctVar2 != null) {
                    this.f24413a.b(ctVar2);
                    this.f24415g.a();
                }
                this.f24415g = null;
            }
        }
        cu cuVar = this.f24413a;
        if (cuVar != null) {
            cuVar.f25023a.clear();
            cuVar.disable();
            cuVar.f25024b = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        ct ctVar;
        super.onMultiWindowModeChanged(z10);
        if (z10 || (ctVar = this.f24415g) == null) {
            return;
        }
        j jVar = ctVar.f25014c;
        this.f24413a.a(jVar instanceof q ? ((q) jVar).getOrientationProperties() : null);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f24418j = false;
        this.f24416h = null;
        setIntent(intent);
        ct ctVar = this.f24415g;
        if (ctVar != null) {
            ctVar.a(intent, f24410d);
            cr crVar = ctVar.f25013b;
            if (crVar != null) {
                crVar.b();
            }
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        ct ctVar;
        cr crVar;
        super.onResume();
        if (this.f24414b) {
            return;
        }
        int i10 = this.f24417i;
        if (100 != i10) {
            if (102 != i10 || (ctVar = this.f24415g) == null || (crVar = ctVar.f25013b) == null) {
                return;
            }
            crVar.c();
            return;
        }
        q qVar = this.f24416h;
        if (qVar == null || qVar.getFullScreenEventsListener() == null) {
            return;
        }
        try {
            if (this.f24418j) {
                return;
            }
            this.f24418j = true;
            this.f24416h.getFullScreenEventsListener().a(this.f24416h);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        ct ctVar;
        cr crVar;
        super.onStart();
        if (this.f24414b || 102 != this.f24417i || (ctVar = this.f24415g) == null || (crVar = ctVar.f25013b) == null) {
            return;
        }
        crVar.b();
    }

    @Override // android.app.Activity
    public void onStop() {
        ct ctVar;
        cr crVar;
        super.onStop();
        if (this.f24414b || (ctVar = this.f24415g) == null || (crVar = ctVar.f25013b) == null) {
            return;
        }
        crVar.d();
    }

    public static int a(j jVar) {
        int hashCode = jVar.hashCode();
        f24410d.put(hashCode, jVar);
        return hashCode;
    }

    public static void a(Object obj) {
        f24410d.remove(obj.hashCode());
    }

    public static void a(q qVar) {
        f24411e = qVar;
    }

    public static void a(s sVar) {
        f24412f = sVar;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        super.onMultiWindowModeChanged(z10, configuration);
        onMultiWindowModeChanged(z10);
    }

    public final void a(dd ddVar) {
        this.f24413a.a(ddVar);
    }
}
