package com.inmobi.media;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* compiled from: NativeTimerView.java */
/* loaded from: classes3.dex */
public class ce extends View {

    /* renamed from: a  reason: collision with root package name */
    public long f24902a;

    /* renamed from: b  reason: collision with root package name */
    public long f24903b;

    /* renamed from: c  reason: collision with root package name */
    public ValueAnimator f24904c;

    /* renamed from: d  reason: collision with root package name */
    private Bitmap f24905d;

    /* renamed from: e  reason: collision with root package name */
    private Canvas f24906e;

    /* renamed from: f  reason: collision with root package name */
    private RectF f24907f;

    /* renamed from: g  reason: collision with root package name */
    private RectF f24908g;

    /* renamed from: h  reason: collision with root package name */
    private Rect f24909h;

    /* renamed from: i  reason: collision with root package name */
    private Paint f24910i;

    /* renamed from: j  reason: collision with root package name */
    private Paint f24911j;

    /* renamed from: k  reason: collision with root package name */
    private Paint f24912k;

    /* renamed from: l  reason: collision with root package name */
    private Paint f24913l;

    /* renamed from: m  reason: collision with root package name */
    private Paint f24914m;

    /* renamed from: n  reason: collision with root package name */
    private float f24915n;

    /* renamed from: o  reason: collision with root package name */
    private b f24916o;

    /* compiled from: NativeTimerView.java */
    /* loaded from: classes3.dex */
    public static class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<ce> f24917a;

        public a(ce ceVar) {
            this.f24917a = new WeakReference<>(ceVar);
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ce ceVar = this.f24917a.get();
            if (ceVar == null) {
                return;
            }
            int visibility = ceVar.getVisibility();
            if (visibility != 4 && visibility != 8) {
                ceVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
            } else if (((Float) valueAnimator.getAnimatedValue()).floatValue() >= 1.0d) {
                ceVar.c();
            }
        }
    }

    /* compiled from: NativeTimerView.java */
    /* loaded from: classes3.dex */
    public interface b {
        void a();
    }

    public ce(Context context) {
        this(context, (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        b bVar = this.f24916o;
        if (bVar != null) {
            bVar.a();
            this.f24904c.cancel();
            this.f24904c = null;
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f24904c;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.f24903b = this.f24904c.getCurrentPlayTime();
        this.f24904c.cancel();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        this.f24906e.drawColor(0, PorterDuff.Mode.CLEAR);
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        int min = Math.min(width, height);
        int a10 = ic.a((int) (getWidth() * 7.0f * 0.007f));
        float f10 = width;
        float f11 = height;
        canvas.drawCircle(f10, f11, min, this.f24910i);
        canvas.drawCircle(f10, f11, min - a10, this.f24913l);
        ValueAnimator valueAnimator = this.f24904c;
        if (valueAnimator != null) {
            int currentPlayTime = (int) (this.f24902a - (valueAnimator.getCurrentPlayTime() / 1000));
            if (((Float) this.f24904c.getAnimatedValue()).floatValue() >= 1.0d) {
                currentPlayTime = 0;
            }
            Paint paint = this.f24914m;
            Rect rect = this.f24909h;
            String valueOf = String.valueOf(currentPlayTime);
            paint.getTextBounds(valueOf, 0, valueOf.length(), rect);
            canvas.drawText(valueOf, getWidth() / 2, (getHeight() / 2) + (((paint.descent() - paint.ascent()) / 2.0f) - paint.descent()), paint);
            if (((Float) this.f24904c.getAnimatedValue()).floatValue() >= 1.0d) {
                c();
            }
        }
        float f12 = this.f24915n;
        if (f12 > 0.0f) {
            this.f24906e.drawArc(this.f24907f, 270.0f, f12, true, this.f24911j);
            this.f24906e.drawOval(this.f24908g, this.f24912k);
        }
        canvas.drawBitmap(this.f24905d, 0.0f, 0.0f, (Paint) null);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i10);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (i10 != i12 || i11 != i13) {
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            this.f24905d = createBitmap;
            createBitmap.eraseColor(0);
            this.f24906e = new Canvas(this.f24905d);
        }
        super.onSizeChanged(i10, i11, i12, i13);
        float a10 = ic.a((int) (getWidth() * 4.0f * 0.007f));
        float a11 = ic.a((int) (getWidth() * 5.0f * 0.007f));
        this.f24907f = new RectF(a11, a11, getWidth() - a11, getHeight() - a11);
        RectF rectF = this.f24907f;
        this.f24908g = new RectF(rectF.left + a10, rectF.top + a10, rectF.right - a10, rectF.bottom - a10);
        this.f24913l.setStrokeWidth(ic.a((int) (getWidth() * 1.5f * 0.007f)));
        this.f24914m.setTextSize(ic.a((int) (getWidth() * 14.0f * 0.007f)));
        invalidate();
    }

    public void setTimerEventsListener(b bVar) {
        this.f24916o = bVar;
    }

    public void setTimerValue(long j10) {
        this.f24902a = j10;
    }

    private ce(Context context, byte b10) {
        this(context, (char) 0);
    }

    private ce(Context context, char c10) {
        super(context, null, 0);
        this.f24902a = 0L;
        Paint paint = new Paint();
        this.f24910i = paint;
        paint.setAntiAlias(true);
        this.f24910i.setColor(-723724);
        Paint paint2 = new Paint();
        this.f24914m = paint2;
        paint2.setAntiAlias(true);
        this.f24914m.setColor(-16777216);
        this.f24914m.setTextAlign(Paint.Align.CENTER);
        this.f24914m.setAntiAlias(true);
        this.f24909h = new Rect();
        Paint paint3 = new Paint();
        this.f24911j = paint3;
        paint3.setAntiAlias(true);
        this.f24911j.setColor(-16777216);
        Paint paint4 = new Paint();
        this.f24912k = paint4;
        paint4.setAntiAlias(true);
        this.f24912k.setColor(0);
        this.f24912k.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint5 = new Paint();
        this.f24913l = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        this.f24913l.setAntiAlias(true);
        this.f24913l.setColor(-16777216);
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f24904c = ofFloat;
        ofFloat.setDuration(TimeUnit.SECONDS.toMillis(this.f24902a));
        this.f24904c.setInterpolator(new LinearInterpolator());
        this.f24904c.addUpdateListener(new a(this));
        this.f24904c.start();
    }

    public final void a(float f10) {
        this.f24915n = f10 * 360.0f;
        invalidate();
    }
}
