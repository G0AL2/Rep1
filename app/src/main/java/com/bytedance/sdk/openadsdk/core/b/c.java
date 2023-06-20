package com.bytedance.sdk.openadsdk.core.b;

import android.graphics.Point;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.m;

/* compiled from: InteractionListener.java */
/* loaded from: classes.dex */
public abstract class c implements View.OnClickListener, View.OnTouchListener {
    protected static int B = 8;

    /* renamed from: a  reason: collision with root package name */
    private static float f11885a;

    /* renamed from: b  reason: collision with root package name */
    private static float f11886b;

    /* renamed from: c  reason: collision with root package name */
    private static float f11887c;

    /* renamed from: d  reason: collision with root package name */
    private static float f11888d;

    /* renamed from: e  reason: collision with root package name */
    private static long f11889e;
    protected View D;

    /* renamed from: s  reason: collision with root package name */
    protected float f11892s = -1.0f;

    /* renamed from: t  reason: collision with root package name */
    protected float f11893t = -1.0f;

    /* renamed from: u  reason: collision with root package name */
    protected float f11894u = -1.0f;

    /* renamed from: v  reason: collision with root package name */
    protected float f11895v = -1.0f;

    /* renamed from: w  reason: collision with root package name */
    protected long f11896w = -1;

    /* renamed from: x  reason: collision with root package name */
    protected long f11897x = -1;

    /* renamed from: y  reason: collision with root package name */
    protected int f11898y = -1;

    /* renamed from: z  reason: collision with root package name */
    protected int f11899z = -1024;
    protected int A = -1;
    protected boolean C = true;
    public SparseArray<a> E = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    private int f11890f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f11891g = 0;

    /* compiled from: InteractionListener.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f11900a;

        /* renamed from: b  reason: collision with root package name */
        public double f11901b;

        /* renamed from: c  reason: collision with root package name */
        public double f11902c;

        /* renamed from: d  reason: collision with root package name */
        public long f11903d;

        public a(int i10, double d10, double d11, long j10) {
            this.f11900a = -1;
            this.f11901b = -1.0d;
            this.f11902c = -1.0d;
            this.f11903d = -1L;
            this.f11900a = i10;
            this.f11901b = d10;
            this.f11902c = d11;
            this.f11903d = j10;
        }
    }

    static {
        if (ViewConfiguration.get(m.a()) != null) {
            B = ViewConfiguration.get(m.a()).getScaledTouchSlop();
        }
        f11885a = 0.0f;
        f11886b = 0.0f;
        f11887c = 0.0f;
        f11888d = 0.0f;
        f11889e = 0L;
    }

    private boolean a(View view, Point point) {
        int i10;
        int i11;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                View childAt = viewGroup.getChildAt(i12);
                if (b.c(childAt)) {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    return view.isShown() && (i10 = point.x) >= iArr[0] && i10 <= iArr[0] + childAt.getWidth() && (i11 = point.y) >= iArr[1] && i11 <= iArr[1] + childAt.getHeight();
                } else if (a(childAt, point)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(View view, float f10, float f11, float f12, float f13, SparseArray<a> sparseArray, boolean z10);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (com.bytedance.sdk.openadsdk.core.i.e.a()) {
            a(view, this.f11892s, this.f11893t, this.f11894u, this.f11895v, this.E, this.C);
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        int i11;
        this.f11899z = motionEvent.getDeviceId();
        this.f11898y = motionEvent.getToolType(0);
        this.A = motionEvent.getSource();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f11890f = (int) motionEvent.getRawX();
            this.f11891g = (int) motionEvent.getRawY();
            this.f11892s = motionEvent.getRawX();
            this.f11893t = motionEvent.getRawY();
            this.f11896w = System.currentTimeMillis();
            this.f11898y = motionEvent.getToolType(0);
            this.f11899z = motionEvent.getDeviceId();
            this.A = motionEvent.getSource();
            f11889e = System.currentTimeMillis();
            this.C = true;
            this.D = view;
            i10 = 0;
        } else if (actionMasked == 1) {
            this.f11894u = motionEvent.getRawX();
            this.f11895v = motionEvent.getRawY();
            this.f11897x = System.currentTimeMillis();
            if (Math.abs(this.f11894u - this.f11890f) >= m.f12516a || Math.abs(this.f11895v - this.f11891g) >= m.f12516a) {
                this.C = false;
            }
            Point point = new Point((int) this.f11894u, (int) this.f11895v);
            if (view != null && !b.c(view) && a((View) view.getParent(), point)) {
                return true;
            }
            i10 = 3;
        } else if (actionMasked != 2) {
            i10 = actionMasked != 3 ? -1 : 4;
        } else {
            f11887c += Math.abs(motionEvent.getX() - f11885a);
            f11888d += Math.abs(motionEvent.getY() - f11886b);
            f11885a = motionEvent.getX();
            f11886b = motionEvent.getY();
            if (System.currentTimeMillis() - f11889e > 200) {
                float f10 = f11887c;
                int i12 = B;
                if (f10 > i12 || f11888d > i12) {
                    i11 = 1;
                    this.f11894u = motionEvent.getRawX();
                    this.f11895v = motionEvent.getRawY();
                    if (Math.abs(this.f11894u - this.f11890f) < m.f12516a || Math.abs(this.f11895v - this.f11891g) >= m.f12516a) {
                        this.C = false;
                    }
                    i10 = i11;
                }
            }
            i11 = 2;
            this.f11894u = motionEvent.getRawX();
            this.f11895v = motionEvent.getRawY();
            if (Math.abs(this.f11894u - this.f11890f) < m.f12516a) {
            }
            this.C = false;
            i10 = i11;
        }
        this.E.put(motionEvent.getActionMasked(), new a(i10, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
        return false;
    }
}
