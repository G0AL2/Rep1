package com.fyber.inneractive.sdk.player.ui;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.features.j;
import com.fyber.inneractive.sdk.config.y;
import com.fyber.inneractive.sdk.ui.IAsmoothProgressBar;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.p0;
import com.fyber.inneractive.sdk.util.q0;
import com.fyber.inneractive.sdk.util.w0;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class i extends com.fyber.inneractive.sdk.player.ui.c {
    public static final p0 K;
    public q0 A;
    public q0 B;
    public int C;
    public int D;
    public Runnable E;
    public w0 F;
    public boolean G;
    public ObjectAnimator H;
    public boolean I;
    public q0 J;

    /* renamed from: i  reason: collision with root package name */
    public ImageView f19773i;

    /* renamed from: j  reason: collision with root package name */
    public ViewGroup f19774j;

    /* renamed from: k  reason: collision with root package name */
    public TextView f19775k;

    /* renamed from: l  reason: collision with root package name */
    public Button f19776l;

    /* renamed from: m  reason: collision with root package name */
    public ImageView f19777m;

    /* renamed from: n  reason: collision with root package name */
    public TextView f19778n;

    /* renamed from: o  reason: collision with root package name */
    public TextView f19779o;

    /* renamed from: p  reason: collision with root package name */
    public View f19780p;

    /* renamed from: q  reason: collision with root package name */
    public int f19781q;

    /* renamed from: r  reason: collision with root package name */
    public int f19782r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f19783s;

    /* renamed from: t  reason: collision with root package name */
    public ImageView f19784t;

    /* renamed from: u  reason: collision with root package name */
    public ImageView f19785u;

    /* renamed from: v  reason: collision with root package name */
    public IAsmoothProgressBar f19786v;

    /* renamed from: w  reason: collision with root package name */
    public View f19787w;

    /* renamed from: x  reason: collision with root package name */
    public View f19788x;

    /* renamed from: y  reason: collision with root package name */
    public ViewGroup f19789y;

    /* renamed from: z  reason: collision with root package name */
    public View f19790z;

    /* loaded from: classes2.dex */
    public class a implements w0.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f19791a;

        public a(int i10) {
            this.f19791a = i10;
        }

        @Override // com.fyber.inneractive.sdk.util.w0.b
        public void a(w0 w0Var) {
            if (!i.this.f19771h) {
                IAlog.a("Autoclick is triggered", new Object[0]);
                ((com.fyber.inneractive.sdk.player.controller.k) i.this.f19770g).a(this.f19791a, i.K);
            } else {
                IAlog.a("Autoclick is aborted - app in background", new Object[0]);
            }
            i.this.e();
        }
    }

    /* loaded from: classes2.dex */
    public class b implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bitmap f19793a;

        public b(Bitmap bitmap) {
            this.f19793a = bitmap;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            if (i.this.getWidth() <= 0 || i.this.getHeight() <= 0) {
                return;
            }
            i.this.b(true);
            i.this.removeOnLayoutChangeListener(this);
            i.this.a(this.f19793a);
        }
    }

    /* loaded from: classes2.dex */
    public class c extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f19795a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int[] f19796b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f19797c;

        public c(View view, int[] iArr, int i10) {
            this.f19795a = view;
            this.f19796b = iArr;
            this.f19797c = i10;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            onSingleTapConfirmed(motionEvent);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.f19795a.getRootView().getLocationOnScreen(this.f19796b);
                float rawX = motionEvent.getRawX() - this.f19796b[0];
                float rawY = motionEvent.getRawY() - this.f19796b[1];
                p0 p0Var = i.this.f19764a;
                p0Var.f20315a = rawX;
                p0Var.f20316b = rawY;
            }
            i iVar = i.this;
            h hVar = iVar.f19770g;
            if (hVar != null) {
                ((com.fyber.inneractive.sdk.player.controller.k) hVar).a(this.f19797c, iVar.f19764a);
            }
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public class d implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ GestureDetector f19799a;

        public d(i iVar, GestureDetector gestureDetector) {
            this.f19799a = gestureDetector;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return this.f19799a.onTouchEvent(motionEvent);
        }
    }

    static {
        p0 a10 = p0.a();
        a10.f20317c = true;
        K = a10;
    }

    public i(Context context) {
        this(context, null);
    }

    public void a(boolean z10, boolean z11, String str) {
        TextView textView = this.f19775k;
        if (textView != null) {
            textView.setAllCaps(z11);
            if (!TextUtils.isEmpty(str)) {
                this.f19775k.setText(str);
            } else {
                this.f19775k.setText(R.string.ia_video_install_now_text);
            }
            this.f19775k.setVisibility(z10 ? 0 : 4);
        }
    }

    public void b(boolean z10) {
        if (this.f19773i != null) {
            ViewGroup viewGroup = this.f19789y;
            if (viewGroup != null && viewGroup.getVisibility() == 0) {
                IAlog.a("end card is visible and requested to show last frame image with value of %s", Boolean.valueOf(z10));
                this.f19773i.setVisibility(8);
                return;
            }
            this.f19773i.setVisibility(z10 ? 0 : 8);
        }
    }

    public void c(boolean z10) {
        View view = this.f19787w;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    public void d(boolean z10) {
        TextView textView = this.f19779o;
        if (textView != null) {
            textView.setVisibility(z10 ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.c, com.fyber.inneractive.sdk.player.ui.g
    public void destroy() {
        super.destroy();
        IAlog.a("%sdestroyed called", IAlog.a(this));
        Runnable runnable = this.E;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.E = null;
        }
        e();
        ViewGroup viewGroup = this.f19774j;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    public final void e() {
        if (this.F != null) {
            IAlog.a("Autoclick is removed ", new Object[0]);
            this.F.f20351e = null;
            this.F = null;
        }
    }

    public void f() {
        ImageView imageView = this.f19785u;
        if (imageView != null) {
            imageView.setVisibility(0);
            this.f19785u.setSelected(true);
        }
    }

    public abstract void g();

    public View getEndCardView() {
        return this.f19780p;
    }

    public ViewGroup getTextureHost() {
        return this.f19774j;
    }

    public View[] getTrackingFriendlyView() {
        return new View[]{this.f19775k, this.f19778n, this.f19779o, this.f19784t, this.f19786v};
    }

    public int getVideoHeight() {
        return this.f19782r;
    }

    public int getVideoWidth() {
        return this.f19781q;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        a(this.J, size, size2);
        q0 q0Var = this.J;
        int i12 = q0Var.f20323a;
        if (i12 > 0 && q0Var.f20324b > 0) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            i11 = View.MeasureSpec.makeMeasureSpec(this.J.f20324b, 1073741824);
            i10 = makeMeasureSpec;
        } else {
            q0Var.f20323a = size;
            q0Var.f20324b = size2;
        }
        if (!this.A.equals(this.J)) {
            q0 q0Var2 = this.A;
            q0 q0Var3 = this.J;
            q0Var2.getClass();
            q0Var2.f20323a = q0Var3.f20323a;
            q0Var2.f20324b = q0Var3.f20324b;
            g();
        }
        super.onMeasure(i10, i11);
    }

    public void setLastFrameBitmap(Bitmap bitmap) {
        IAlog.a("%ssetLastFrameBitmap - %s", IAlog.a(this), bitmap);
        ImageView imageView = this.f19773i;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        q0 q0Var = this.A;
        if (q0Var.f20323a != 0 && q0Var.f20324b != 0) {
            a(bitmap);
            return;
        }
        b(false);
        addOnLayoutChangeListener(new b(bitmap));
    }

    public void setLastFrameBitmapBlurred(Bitmap bitmap) {
        if (this.f19773i == null || bitmap == null) {
            return;
        }
        com.fyber.inneractive.sdk.util.c cVar = new com.fyber.inneractive.sdk.util.c();
        cVar.f20239c = 20;
        cVar.f20240d = 1;
        cVar.f20237a = bitmap.getWidth();
        cVar.f20238b = bitmap.getHeight();
        this.f19773i.setImageBitmap(com.fyber.inneractive.sdk.util.b.a(getContext(), bitmap, cVar));
    }

    public void setMuteButtonState(boolean z10) {
        this.f19784t.setSelected(z10);
    }

    public void setRemainingTime(String str) {
        TextView textView = this.f19778n;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setSkipText(String str) {
        TextView textView = this.f19779o;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public i(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    public i(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19781q = -1;
        this.f19782r = -1;
        this.f19783s = false;
        this.A = new q0(0, 0);
        this.G = false;
        this.I = false;
        this.J = new q0(0, 0);
        IAlog.a("%sctor called", a());
        LayoutInflater.from(context).inflate(R.layout.ia_video_view, (ViewGroup) this, true);
        setBackgroundColor(getResources().getColor(R.color.ia_video_background_color));
        c();
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    }

    public void c() {
        this.f19773i = (ImageView) findViewById(R.id.ia_iv_last_frame);
        this.f19774j = (ViewGroup) findViewById(R.id.ia_texture_view_host);
        this.f19784t = (ImageView) findViewById(R.id.ia_iv_mute_button);
        this.f19775k = (TextView) findViewById(R.id.ia_tv_call_to_action);
        this.f19785u = (ImageView) findViewById(R.id.ia_iv_expand_collapse_button);
        this.f19778n = (TextView) findViewById(R.id.ia_tv_remaining_time);
        this.f19786v = (IAsmoothProgressBar) findViewById(R.id.ia_video_progressbar);
        int i10 = R.id.ia_default_endcard_video_overlay;
        this.f19788x = findViewById(i10);
        this.f19789y = (ViewGroup) findViewById(R.id.ia_endcard_video_overlay);
        this.f19787w = findViewById(R.id.ia_paused_video_overlay);
        this.f19790z = findViewById(R.id.ia_buffering_overlay);
        this.f19779o = (TextView) findViewById(R.id.ia_tv_skip);
        this.f19776l = (Button) findViewById(R.id.ia_b_end_card_call_to_action);
        this.f19777m = (ImageView) findViewById(R.id.hand_animation);
        a(this, 7);
        a(this.f19784t, 1);
        a(this.f19775k, 3);
        a(this.f19776l, 8);
        a(this.f19785u, 5);
        a(this.f19774j, 7);
        a(this.f19779o, 6);
        a(this.f19787w, 9);
        a(findViewById(i10), -1);
    }

    public boolean d() {
        return this.f19788x.getVisibility() == 0 || this.f19789y.getChildCount() > 0;
    }

    public void a(com.fyber.inneractive.sdk.player.ui.a aVar) {
        View view = this.f19788x;
        if (view != null) {
            if (aVar.f19744a) {
                if (!j.c.NONE.equals(aVar.f19752i)) {
                    a(this.f19788x, aVar.f19752i, aVar.f19753j);
                } else {
                    this.f19788x.setVisibility(0);
                }
            } else {
                view.setVisibility(8);
            }
            this.f19776l.setAllCaps(aVar.f19745b);
            if (!TextUtils.isEmpty(aVar.f19746c)) {
                this.f19776l.setText(aVar.f19746c);
            } else {
                this.f19776l.setText(R.string.ia_video_install_now_text);
            }
            UnitDisplayType unitDisplayType = ((y) this.f19766c).f17077f.f16908j;
            if (aVar.f19750g) {
                this.f19776l.setBackgroundResource(R.drawable.bg_green);
                this.f19777m.setVisibility(0);
                ImageView imageView = this.f19777m;
                float f10 = aVar.f19751h;
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofFloat(View.SCALE_X, f10), PropertyValuesHolder.ofFloat(View.SCALE_Y, f10));
                ofPropertyValuesHolder.setRepeatCount(-1);
                ofPropertyValuesHolder.setRepeatMode(2);
                ofPropertyValuesHolder.setDuration(700L);
                ofPropertyValuesHolder.start();
            } else if (!unitDisplayType.equals(UnitDisplayType.LANDSCAPE) && !unitDisplayType.equals(UnitDisplayType.MRECT)) {
                this.f19776l.setBackgroundResource(R.drawable.bg_green);
                this.f19776l.setTextSize(0, getResources().getDimension(R.dimen.ia_video_overlay_text_large_plus));
            } else {
                this.f19776l.setBackgroundResource(R.drawable.bg_green_medium);
                this.f19776l.setTextSize(0, getResources().getDimension(R.dimen.ia_video_overlay_text_large));
            }
            this.f19776l.setVisibility(0);
            if (aVar.f19744a) {
                Integer num = aVar.f19747d;
                if (num != null) {
                    a(8, num.intValue());
                }
            }
        }
    }

    public final void a(int i10, int i11) {
        if (this.G || this.F != null) {
            return;
        }
        IAlog.a("Start Autoclick timer - %d seconds", Integer.valueOf(i11));
        w0 w0Var = new w0(TimeUnit.SECONDS, i11);
        this.F = w0Var;
        w0Var.f20351e = new a(i10);
        w0Var.c();
    }

    public final void a(View view, j.c cVar, int i10) {
        if (this.I || !j.c.ZOOM_IN.equals(cVar)) {
            return;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.SCALE_X, 0.0f, 1.0f), PropertyValuesHolder.ofFloat(View.SCALE_Y, 0.0f, 1.0f));
        this.H = ofPropertyValuesHolder;
        ofPropertyValuesHolder.setDuration(i10);
    }

    public final void a(Bitmap bitmap) {
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            q0 q0Var = this.A;
            int i10 = q0Var.f20323a;
            int i11 = q0Var.f20324b;
            if (width > 0 && height > 0) {
                float f10 = width;
                float f11 = height;
                float f12 = f10 / f11;
                if (this.f19767d == UnitDisplayType.SQUARE) {
                    i10 = (int) (i11 * f12);
                } else {
                    if (Math.abs(f12 - 1.7777778f) >= 0.1f) {
                        Math.abs(f12 - 1.3333334f);
                    }
                    float min = Math.min(i10 / f10, 10.0f);
                    float f13 = i11;
                    float f14 = min * f11;
                    if (f13 > f14) {
                        i10 = (int) (min * f10);
                        i11 = (int) f14;
                    } else {
                        float min2 = Math.min(f13 / f11, 10.0f);
                        i10 = (int) (f10 * min2);
                        i11 = (int) (min2 * f11);
                    }
                }
            }
            ImageView imageView = this.f19773i;
            if (imageView != null) {
                imageView.getLayoutParams().width = i10;
                this.f19773i.getLayoutParams().height = i11;
            }
        }
    }

    public void a(boolean z10) {
        View view = this.f19790z;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    public final void a(View view, int i10) {
        if (view != null) {
            view.setOnTouchListener(new d(this, new GestureDetector(view.getContext(), new c(view, new int[2], i10))));
        }
    }

    public void a(q0 q0Var, int i10, int i11, int i12, int i13) {
        if (i10 > 0 && i11 > 0) {
            float f10 = i10;
            float f11 = i11;
            float f12 = f10 / f11;
            if (this.f19767d == UnitDisplayType.SQUARE) {
                i12 = (int) (i13 * f12);
            } else {
                if (Math.abs(f12 - 1.7777778f) >= 0.1f) {
                    Math.abs(f12 - 1.3333334f);
                }
                float min = Math.min(i12 / f10, 10.0f);
                float f13 = i13;
                float f14 = min * f11;
                if (f13 > f14) {
                    i12 = (int) (min * f10);
                    i13 = (int) f14;
                } else {
                    float min2 = Math.min(f13 / f11, 10.0f);
                    i13 = (int) (min2 * f11);
                    i12 = (int) (f10 * min2);
                }
            }
        }
        q0Var.f20323a = i12;
        q0Var.f20324b = i13;
    }
}
