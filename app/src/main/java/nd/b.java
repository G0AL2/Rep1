package nd;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.Arrays;
import nd.b;

/* compiled from: GestureHandler.java */
/* loaded from: classes3.dex */
public class b<T extends b> {
    private static short A = 0;

    /* renamed from: x  reason: collision with root package name */
    private static int f34748x = 12;

    /* renamed from: y  reason: collision with root package name */
    private static MotionEvent.PointerProperties[] f34749y;

    /* renamed from: z  reason: collision with root package name */
    private static MotionEvent.PointerCoords[] f34750z;

    /* renamed from: c  reason: collision with root package name */
    private int f34753c;

    /* renamed from: d  reason: collision with root package name */
    private View f34754d;

    /* renamed from: f  reason: collision with root package name */
    private float f34756f;

    /* renamed from: g  reason: collision with root package name */
    private float f34757g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f34758h;

    /* renamed from: j  reason: collision with root package name */
    private float[] f34760j;

    /* renamed from: k  reason: collision with root package name */
    private short f34761k;

    /* renamed from: l  reason: collision with root package name */
    private float f34762l;

    /* renamed from: m  reason: collision with root package name */
    private float f34763m;

    /* renamed from: n  reason: collision with root package name */
    private float f34764n;

    /* renamed from: o  reason: collision with root package name */
    private float f34765o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f34766p;

    /* renamed from: r  reason: collision with root package name */
    private d f34768r;

    /* renamed from: s  reason: collision with root package name */
    private i<T> f34769s;

    /* renamed from: t  reason: collision with root package name */
    private c f34770t;

    /* renamed from: u  reason: collision with root package name */
    int f34771u;

    /* renamed from: v  reason: collision with root package name */
    boolean f34772v;

    /* renamed from: w  reason: collision with root package name */
    boolean f34773w;

    /* renamed from: a  reason: collision with root package name */
    private final int[] f34751a = new int[f34748x];

    /* renamed from: b  reason: collision with root package name */
    private int f34752b = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f34755e = 0;

    /* renamed from: i  reason: collision with root package name */
    private boolean f34759i = true;

    /* renamed from: q  reason: collision with root package name */
    private int f34767q = 0;

    /* compiled from: GestureHandler.java */
    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.d();
        }
    }

    private boolean A(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != this.f34752b) {
            return true;
        }
        int i10 = 0;
        while (true) {
            int[] iArr = this.f34751a;
            if (i10 >= iArr.length) {
                return false;
            }
            if (iArr[i10] != -1 && iArr[i10] != i10) {
                return true;
            }
            i10++;
        }
    }

    private MotionEvent b(MotionEvent motionEvent) {
        int i10;
        if (A(motionEvent)) {
            int actionMasked = motionEvent.getActionMasked();
            int i11 = 2;
            if (actionMasked == 0 || actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (this.f34751a[motionEvent.getPointerId(actionIndex)] != -1) {
                    i11 = this.f34752b == 1 ? 0 : 5;
                }
                int i12 = i11;
                i10 = actionIndex;
                actionMasked = i12;
            } else if (actionMasked == 1 || actionMasked == 6) {
                int actionIndex2 = motionEvent.getActionIndex();
                if (this.f34751a[motionEvent.getPointerId(actionIndex2)] != -1) {
                    i10 = actionIndex2;
                    actionMasked = this.f34752b == 1 ? 1 : 6;
                } else {
                    i10 = actionIndex2;
                    actionMasked = 2;
                }
            } else {
                i10 = -1;
            }
            v(this.f34752b);
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            motionEvent.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
            int pointerCount = motionEvent.getPointerCount();
            int i13 = actionMasked;
            int i14 = 0;
            for (int i15 = 0; i15 < pointerCount; i15++) {
                int pointerId = motionEvent.getPointerId(i15);
                if (this.f34751a[pointerId] != -1) {
                    motionEvent.getPointerProperties(i15, f34749y[i14]);
                    f34749y[i14].id = this.f34751a[pointerId];
                    motionEvent.getPointerCoords(i15, f34750z[i14]);
                    if (i15 == i10) {
                        i13 |= i14 << 8;
                    }
                    i14++;
                }
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), i13, i14, f34749y, f34750z, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
            motionEvent.setLocation(x10, y10);
            obtain.setLocation(x10, y10);
            return obtain;
        }
        return motionEvent;
    }

    private int i() {
        int[] iArr;
        int i10 = 0;
        while (i10 < this.f34752b) {
            int i11 = 0;
            while (true) {
                iArr = this.f34751a;
                if (i11 >= iArr.length || iArr[i11] == i10) {
                    break;
                }
                i11++;
            }
            if (i11 == iArr.length) {
                return i10;
            }
            i10++;
        }
        return i10;
    }

    private static boolean u(float f10) {
        return !Float.isNaN(f10);
    }

    private static void v(int i10) {
        if (f34749y == null) {
            int i11 = f34748x;
            f34749y = new MotionEvent.PointerProperties[i11];
            f34750z = new MotionEvent.PointerCoords[i11];
        }
        while (i10 > 0) {
            MotionEvent.PointerProperties[] pointerPropertiesArr = f34749y;
            int i12 = i10 - 1;
            if (pointerPropertiesArr[i12] != null) {
                return;
            }
            pointerPropertiesArr[i12] = new MotionEvent.PointerProperties();
            f34750z[i12] = new MotionEvent.PointerCoords();
            i10--;
        }
    }

    private void z(int i10) {
        UiThreadUtil.assertOnUiThread();
        int i11 = this.f34755e;
        if (i11 == i10) {
            return;
        }
        this.f34755e = i10;
        if (i10 == 4) {
            short s10 = A;
            A = (short) (s10 + 1);
            this.f34761k = s10;
        }
        this.f34768r.r(this, i10, i11);
        E(i10, i11);
    }

    protected void B() {
    }

    protected void C(MotionEvent motionEvent) {
        z(1);
    }

    protected void D() {
    }

    protected void E(int i10, int i11) {
    }

    public final void F(View view, d dVar) {
        if (this.f34754d == null && this.f34768r == null) {
            Arrays.fill(this.f34751a, -1);
            this.f34752b = 0;
            this.f34755e = 0;
            this.f34754d = view;
            this.f34768r = dVar;
            return;
        }
        throw new IllegalStateException("Already prepared or hasn't been reset");
    }

    public final void G() {
        this.f34754d = null;
        this.f34768r = null;
        Arrays.fill(this.f34751a, -1);
        this.f34752b = 0;
        D();
    }

    public T H(boolean z10) {
        if (this.f34754d != null) {
            UiThreadUtil.runOnUiThread(new a());
        }
        this.f34759i = z10;
        return this;
    }

    public T I(float f10, float f11, float f12, float f13, float f14, float f15) {
        if (this.f34760j == null) {
            this.f34760j = new float[6];
        }
        float[] fArr = this.f34760j;
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        fArr[3] = f13;
        fArr[4] = f14;
        fArr[5] = f15;
        if (u(f14) && u(f10) && u(f12)) {
            throw new IllegalArgumentException("Cannot have all of left, right and width defined");
        }
        if (u(f14) && !u(f10) && !u(f12)) {
            throw new IllegalArgumentException("When width is set one of left or right pads need to be defined");
        }
        if (u(f15) && u(f13) && u(f11)) {
            throw new IllegalArgumentException("Cannot have all of top, bottom and height defined");
        }
        if (!u(f15) || u(f13) || u(f11)) {
            return this;
        }
        throw new IllegalArgumentException("When height is set one of top or bottom pads need to be defined");
    }

    public T J(c cVar) {
        this.f34770t = cVar;
        return this;
    }

    public b K(i<T> iVar) {
        this.f34769s = iVar;
        return this;
    }

    public T L(boolean z10) {
        this.f34766p = z10;
        return this;
    }

    public void M(int i10) {
        this.f34753c = i10;
    }

    public boolean N(b bVar) {
        c cVar;
        if (bVar == this || (cVar = this.f34770t) == null) {
            return false;
        }
        return cVar.d(this, bVar);
    }

    public boolean O(b bVar) {
        if (bVar == this) {
            return true;
        }
        c cVar = this.f34770t;
        if (cVar != null) {
            return cVar.a(this, bVar);
        }
        return false;
    }

    public boolean P(b bVar) {
        c cVar;
        if (bVar == this || (cVar = this.f34770t) == null) {
            return false;
        }
        return cVar.b(this, bVar);
    }

    public boolean Q(b bVar) {
        c cVar;
        if (bVar == this || (cVar = this.f34770t) == null) {
            return false;
        }
        return cVar.c(this, bVar);
    }

    public void R(int i10) {
        int[] iArr = this.f34751a;
        if (iArr[i10] == -1) {
            iArr[i10] = i();
            this.f34752b++;
        }
    }

    public void S(int i10) {
        int[] iArr = this.f34751a;
        if (iArr[i10] != -1) {
            iArr[i10] = -1;
            this.f34752b--;
        }
    }

    public boolean T() {
        int i10;
        return (!this.f34759i || (i10 = this.f34755e) == 1 || i10 == 3 || i10 == 5 || this.f34752b <= 0) ? false : true;
    }

    public final void a() {
        int i10 = this.f34755e;
        if (i10 == 0 || i10 == 2) {
            z(4);
        }
    }

    public final void c() {
        if (this.f34755e == 0) {
            z(2);
        }
    }

    public final void d() {
        int i10 = this.f34755e;
        if (i10 == 4 || i10 == 0 || i10 == 2) {
            B();
            z(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(int i10, int i11) {
        i<T> iVar = this.f34769s;
        if (iVar != null) {
            iVar.a(this, i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(MotionEvent motionEvent) {
        i<T> iVar = this.f34769s;
        if (iVar != null) {
            iVar.b(this, motionEvent);
        }
    }

    public final void g() {
        int i10 = this.f34755e;
        if (i10 == 2 || i10 == 4) {
            z(5);
        }
    }

    public final void h() {
        int i10 = this.f34755e;
        if (i10 == 4 || i10 == 0 || i10 == 2) {
            z(1);
        }
    }

    public short j() {
        return this.f34761k;
    }

    public float k() {
        return this.f34762l;
    }

    public float l() {
        return this.f34763m;
    }

    public float m() {
        return this.f34762l - this.f34764n;
    }

    public float n() {
        return this.f34763m - this.f34765o;
    }

    public int o() {
        return this.f34767q;
    }

    public int p() {
        return this.f34755e;
    }

    public int q() {
        return this.f34753c;
    }

    public View r() {
        return this.f34754d;
    }

    public final void s(MotionEvent motionEvent) {
        int i10;
        if (!this.f34759i || (i10 = this.f34755e) == 3 || i10 == 1 || i10 == 5 || this.f34752b < 1) {
            return;
        }
        MotionEvent b10 = b(motionEvent);
        this.f34756f = b10.getX();
        this.f34757g = b10.getY();
        this.f34767q = b10.getPointerCount();
        boolean y10 = y(this.f34754d, this.f34756f, this.f34757g);
        this.f34758h = y10;
        if (this.f34766p && !y10) {
            int i11 = this.f34755e;
            if (i11 == 4) {
                d();
                return;
            } else if (i11 == 2) {
                h();
                return;
            } else {
                return;
            }
        }
        this.f34762l = f.a(b10, true);
        this.f34763m = f.b(b10, true);
        this.f34764n = b10.getRawX() - b10.getX();
        this.f34765o = b10.getRawY() - b10.getY();
        C(b10);
        if (b10 != motionEvent) {
            b10.recycle();
        }
    }

    public boolean t(b bVar) {
        int i10 = 0;
        while (true) {
            int[] iArr = this.f34751a;
            if (i10 >= iArr.length) {
                return false;
            }
            if (iArr[i10] != -1 && bVar.f34751a[i10] != -1) {
                return true;
            }
            i10++;
        }
    }

    public String toString() {
        View view = this.f34754d;
        String simpleName = view == null ? null : view.getClass().getSimpleName();
        return getClass().getSimpleName() + "@[" + this.f34753c + "]:" + simpleName;
    }

    public boolean w() {
        return this.f34759i;
    }

    public boolean x() {
        return this.f34758h;
    }

    public boolean y(View view, float f10, float f11) {
        float f12;
        float width = view.getWidth();
        float height = view.getHeight();
        float[] fArr = this.f34760j;
        if (fArr != null) {
            float f13 = fArr[0];
            float f14 = fArr[1];
            float f15 = fArr[2];
            float f16 = fArr[3];
            float f17 = u(f13) ? 0.0f - f13 : 0.0f;
            r4 = u(f14) ? 0.0f - f14 : 0.0f;
            if (u(f15)) {
                width += f15;
            }
            if (u(f16)) {
                height += f16;
            }
            float[] fArr2 = this.f34760j;
            float f18 = fArr2[4];
            float f19 = fArr2[5];
            if (u(f18)) {
                if (!u(f13)) {
                    f17 = width - f18;
                } else if (!u(f15)) {
                    width = f18 + f17;
                }
            }
            if (u(f19)) {
                if (!u(f14)) {
                    r4 = height - f19;
                } else if (!u(f16)) {
                    height = r4 + f19;
                }
            }
            f12 = r4;
            r4 = f17;
        } else {
            f12 = 0.0f;
        }
        return f10 >= r4 && f10 <= width && f11 >= f12 && f11 <= height;
    }
}
