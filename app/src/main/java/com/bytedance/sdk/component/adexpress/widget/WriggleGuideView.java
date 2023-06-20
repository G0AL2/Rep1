package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.sdk.component.utils.t;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class WriggleGuideView extends View {

    /* renamed from: a  reason: collision with root package name */
    private int f9965a;

    /* renamed from: b  reason: collision with root package name */
    private int f9966b;

    /* renamed from: c  reason: collision with root package name */
    private Bitmap f9967c;

    /* renamed from: d  reason: collision with root package name */
    private Bitmap f9968d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f9969e;

    /* renamed from: f  reason: collision with root package name */
    private int f9970f;

    /* renamed from: g  reason: collision with root package name */
    private final List<b> f9971g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f9972h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f9973i;

    /* renamed from: j  reason: collision with root package name */
    private a f9974j;

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public float f9975a;

        /* renamed from: b  reason: collision with root package name */
        public float f9976b;

        /* renamed from: c  reason: collision with root package name */
        public float f9977c;

        b(float f10, float f11, float f12) {
            this.f9975a = f10;
            this.f9976b = f11;
            this.f9977c = f12;
        }
    }

    public WriggleGuideView(Context context) {
        this(context, null);
    }

    private Bitmap a(int i10, int i11) {
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(BitmapFactory.decodeResource(getContext().getResources(), t.d(getContext(), "tt_wriggle_union")), (Rect) null, new RectF(0.0f, 0.0f, i10, i11), this.f9969e);
        return createBitmap;
    }

    private Bitmap b(int i10, int i11) {
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(BitmapFactory.decodeResource(getContext().getResources(), t.d(getContext(), "tt_wriggle_union_white")), (Rect) null, new RectF(0.0f, 0.0f, i10, i11), new Paint(1));
        return createBitmap;
    }

    private Bitmap c(int i10, int i11) {
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        float f10 = this.f9970f / this.f9965a;
        if (f10 >= 0.5f) {
            f10 = Math.abs(f10 - 1.0f);
        }
        int i12 = this.f9966b;
        this.f9971g.add(new b(i10 - this.f9970f, i11 - ((f10 * 2.0f) * i12), Math.min(this.f9965a, i12) / 2.0f));
        for (b bVar : this.f9971g) {
            canvas.drawCircle(bVar.f9975a, bVar.f9976b, bVar.f9977c, paint);
        }
        return createBitmap;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f9974j != null) {
            this.f9974j = null;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f9972h) {
            this.f9965a = getWidth();
            int height = getHeight();
            this.f9966b = height;
            this.f9967c = a(this.f9965a, height);
            this.f9968d = b(this.f9965a, this.f9966b);
            this.f9972h = false;
        }
        canvas.drawBitmap(this.f9967c, 0.0f, 0.0f, this.f9969e);
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        canvas.drawBitmap(this.f9968d, 0.0f, 0.0f, this.f9969e);
        this.f9969e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(c(this.f9965a, this.f9966b), 0.0f, 0.0f, this.f9969e);
        this.f9969e.setXfermode(null);
        canvas.restoreToCount(saveLayer);
        if (this.f9973i) {
            this.f9970f += 2;
            invalidate();
            if (this.f9970f >= this.f9965a) {
                a aVar = this.f9974j;
                if (aVar != null) {
                    aVar.a();
                }
                this.f9973i = false;
            }
        }
    }

    public WriggleGuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WriggleGuideView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f9965a = 0;
        this.f9966b = 0;
        this.f9970f = 0;
        ArrayList arrayList = new ArrayList();
        this.f9971g = arrayList;
        this.f9972h = true;
        this.f9973i = false;
        setLayerType(1, null);
        this.f9969e = new Paint();
        this.f9969e = new Paint(1);
        arrayList.clear();
    }

    public void a(a aVar) {
        this.f9974j = aVar;
        this.f9970f = 0;
        this.f9973i = true;
        invalidate();
    }
}
