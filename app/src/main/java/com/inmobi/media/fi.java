package com.inmobi.media;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: NativeVideoController.java */
/* loaded from: classes3.dex */
public class fi extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    private static final String f25386b = fi.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    boolean f25387a;

    /* renamed from: c  reason: collision with root package name */
    private o f25388c;

    /* renamed from: d  reason: collision with root package name */
    private a f25389d;

    /* renamed from: e  reason: collision with root package name */
    private fj f25390e;

    /* renamed from: f  reason: collision with root package name */
    private cp f25391f;

    /* renamed from: g  reason: collision with root package name */
    private cp f25392g;

    /* renamed from: h  reason: collision with root package name */
    private ProgressBar f25393h;

    /* renamed from: i  reason: collision with root package name */
    private RelativeLayout f25394i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f25395j;

    /* renamed from: k  reason: collision with root package name */
    private float f25396k;

    /* renamed from: l  reason: collision with root package name */
    private final View.OnClickListener f25397l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NativeVideoController.java */
    /* loaded from: classes3.dex */
    public static final class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<fi> f25399a;

        a(fi fiVar) {
            this.f25399a = new WeakReference<>(fiVar);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what != 2) {
                super.handleMessage(message);
                return;
            }
            fi fiVar = this.f25399a.get();
            if (fiVar != null) {
                fiVar.g();
                if (fiVar.f25387a && fiVar.f25390e.isPlaying()) {
                    sendMessageDelayed(obtainMessage(2), 200L);
                }
            }
        }
    }

    public fi(Context context) {
        this(context, (byte) 0);
    }

    private void e() {
        float f10 = this.f25396k;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (f10 * 30.0f), (int) (f10 * 30.0f));
        layoutParams.addRule(9, -1);
        layoutParams.addRule(12, -1);
        this.f25394i.addView(this.f25391f, layoutParams);
        this.f25391f.setOnClickListener(this.f25397l);
    }

    private void f() {
        float f10 = this.f25396k;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (f10 * 30.0f), (int) (f10 * 30.0f));
        layoutParams.addRule(9, -1);
        layoutParams.addRule(12, -1);
        this.f25394i.addView(this.f25392g, layoutParams);
        this.f25392g.setOnClickListener(this.f25397l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        fj fjVar = this.f25390e;
        if (fjVar == null) {
            return;
        }
        int currentPosition = fjVar.getCurrentPosition();
        int duration = this.f25390e.getDuration();
        ProgressBar progressBar = this.f25393h;
        if (progressBar == null || duration == 0) {
            return;
        }
        progressBar.setProgress((currentPosition * 100) / duration);
    }

    public final void c() {
        if (this.f25390e != null) {
            this.f25395j = false;
            this.f25394i.removeView(this.f25392g);
            this.f25394i.removeView(this.f25391f);
            e();
        }
    }

    public final void d() {
        if (this.f25390e != null) {
            this.f25395j = true;
            this.f25394i.removeView(this.f25391f);
            this.f25394i.removeView(this.f25392g);
            f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        boolean z10 = keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0;
        if (keyCode == 79 || keyCode == 85 || keyCode == 62) {
            if (z10) {
                if (this.f25390e.isPlaying()) {
                    this.f25390e.pause();
                } else {
                    this.f25390e.start();
                }
                a();
            }
            return true;
        } else if (keyCode == 126) {
            if (z10 && !this.f25390e.isPlaying()) {
                this.f25390e.start();
                a();
            }
            return true;
        } else if (keyCode == 86 || keyCode == 127) {
            if (z10 && this.f25390e.isPlaying()) {
                this.f25390e.pause();
                a();
            }
            return true;
        } else if (keyCode != 25 && keyCode != 24 && keyCode != 164 && keyCode != 27) {
            a();
            return super.dispatchKeyEvent(keyEvent);
        } else {
            return super.dispatchKeyEvent(keyEvent);
        }
    }

    public Map<View, FriendlyObstructionPurpose> getFriendlyViews() {
        HashMap hashMap = new HashMap();
        ProgressBar progressBar = this.f25393h;
        FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.VIDEO_CONTROLS;
        hashMap.put(progressBar, friendlyObstructionPurpose);
        hashMap.put(this.f25391f, friendlyObstructionPurpose);
        hashMap.put(this.f25392g, friendlyObstructionPurpose);
        return hashMap;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(fi.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(fi.class.getName());
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        fj fjVar = this.f25390e;
        if (fjVar == null || !fjVar.f()) {
            return false;
        }
        if (this.f25387a) {
            b();
            return false;
        }
        a();
        return false;
    }

    public void setMediaPlayer(fj fjVar) {
        this.f25390e = fjVar;
        cg cgVar = (cg) fjVar.getTag();
        if (cgVar == null || !cgVar.B || cgVar.a()) {
            return;
        }
        this.f25395j = true;
        this.f25394i.removeView(this.f25392g);
        this.f25394i.removeView(this.f25391f);
        f();
    }

    public void setVideoAd(o oVar) {
        this.f25388c = oVar;
    }

    private fi(Context context, byte b10) {
        this(context, (char) 0);
    }

    public final void a() {
        if (!this.f25387a) {
            g();
            this.f25387a = true;
            cg cgVar = (cg) this.f25390e.getTag();
            if (cgVar != null) {
                this.f25391f.setVisibility(cgVar.B ? 0 : 4);
                this.f25393h.setVisibility(cgVar.D ? 0 : 4);
            }
            setVisibility(0);
        }
        this.f25389d.sendEmptyMessage(2);
    }

    public final void b() {
        if (this.f25387a) {
            try {
                this.f25389d.removeMessages(2);
                setVisibility(8);
            } catch (IllegalArgumentException e10) {
                gg.a().a(new hg(e10));
            }
            this.f25387a = false;
        }
    }

    private fi(Context context, char c10) {
        super(context, null, 0);
        this.f25395j = false;
        this.f25397l = new View.OnClickListener() { // from class: com.inmobi.media.fi.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fi.c(fi.this);
            }
        };
        this.f25394i = new RelativeLayout(getContext());
        addView(this.f25394i, new RelativeLayout.LayoutParams(-1, -1));
        this.f25394i.setPadding(0, 0, 0, 0);
        if (this.f25394i != null) {
            this.f25396k = ic.a().f25747c;
            this.f25391f = new cp(getContext(), this.f25396k, (byte) 9);
            this.f25392g = new cp(getContext(), this.f25396k, (byte) 11);
            ProgressBar progressBar = new ProgressBar(getContext(), null, 16842872);
            this.f25393h = progressBar;
            progressBar.setScaleY(0.8f);
            e();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12, -1);
            float f10 = ic.a().f25747c;
            layoutParams.setMargins(0, (int) ((-6.0f) * f10), 0, (int) (f10 * (-8.0f)));
            LayerDrawable layerDrawable = (LayerDrawable) this.f25393h.getProgressDrawable();
            if (layerDrawable != null) {
                layerDrawable.getDrawable(0).setColorFilter(-1, PorterDuff.Mode.SRC_IN);
                layerDrawable.getDrawable(2).setColorFilter(-327674, PorterDuff.Mode.SRC_IN);
            }
            this.f25394i.addView(this.f25393h, layoutParams);
        }
        this.f25389d = new a(this);
    }

    static /* synthetic */ void c(fi fiVar) {
        o oVar;
        o oVar2;
        fj fjVar = fiVar.f25390e;
        if (fjVar != null) {
            cg cgVar = (cg) fjVar.getTag();
            if (fiVar.f25395j) {
                fiVar.f25390e.i();
                fiVar.f25395j = false;
                fiVar.f25394i.removeView(fiVar.f25392g);
                fiVar.f25394i.removeView(fiVar.f25391f);
                fiVar.e();
                if (cgVar == null || (oVar2 = fiVar.f25388c) == null) {
                    return;
                }
                try {
                    oVar2.f(cgVar);
                    cgVar.A = true;
                    return;
                } catch (Exception e10) {
                    gg.a().a(new hg(e10));
                    return;
                }
            }
            fiVar.f25390e.h();
            fiVar.f25395j = true;
            fiVar.f25394i.removeView(fiVar.f25391f);
            fiVar.f25394i.removeView(fiVar.f25392g);
            fiVar.f();
            if (cgVar == null || (oVar = fiVar.f25388c) == null) {
                return;
            }
            try {
                oVar.e(cgVar);
                cgVar.A = false;
            } catch (Exception e11) {
                gg.a().a(new hg(e11));
            }
        }
    }
}
