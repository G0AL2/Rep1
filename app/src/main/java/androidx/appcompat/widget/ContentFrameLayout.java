package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private TypedValue f1265a;

    /* renamed from: b  reason: collision with root package name */
    private TypedValue f1266b;

    /* renamed from: c  reason: collision with root package name */
    private TypedValue f1267c;

    /* renamed from: d  reason: collision with root package name */
    private TypedValue f1268d;

    /* renamed from: e  reason: collision with root package name */
    private TypedValue f1269e;

    /* renamed from: f  reason: collision with root package name */
    private TypedValue f1270f;

    /* renamed from: g  reason: collision with root package name */
    private final Rect f1271g;

    /* renamed from: h  reason: collision with root package name */
    private a f1272h;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public void a(Rect rect) {
        fitSystemWindows(rect);
    }

    public void b(int i10, int i11, int i12, int i13) {
        this.f1271g.set(i10, i11, i12, i13);
        if (androidx.core.view.z.U(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1269e == null) {
            this.f1269e = new TypedValue();
        }
        return this.f1269e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1270f == null) {
            this.f1270f = new TypedValue();
        }
        return this.f1270f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1267c == null) {
            this.f1267c = new TypedValue();
        }
        return this.f1267c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1268d == null) {
            this.f1268d = new TypedValue();
        }
        return this.f1268d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1265a == null) {
            this.f1265a = new TypedValue();
        }
        return this.f1265a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1266b == null) {
            this.f1266b = new TypedValue();
        }
        return this.f1266b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f1272h;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f1272h;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f1272h = aVar;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1271g = new Rect();
    }
}
