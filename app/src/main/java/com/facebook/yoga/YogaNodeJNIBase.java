package com.facebook.yoga;

import com.facebook.yoga.p;
import java.util.ArrayList;
import java.util.List;

@g6.a
/* loaded from: classes.dex */
public abstract class YogaNodeJNIBase extends p implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private YogaNodeJNIBase f16581a;
    @g6.a
    private float[] arr;

    /* renamed from: b  reason: collision with root package name */
    private List<YogaNodeJNIBase> f16582b;

    /* renamed from: c  reason: collision with root package name */
    private m f16583c;

    /* renamed from: d  reason: collision with root package name */
    private b f16584d;

    /* renamed from: e  reason: collision with root package name */
    protected long f16585e;

    /* renamed from: f  reason: collision with root package name */
    private Object f16586f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f16587g;
    @g6.a
    private int mLayoutDirection;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f16588a;

        static {
            int[] iArr = new int[j.values().length];
            f16588a = iArr;
            try {
                iArr[j.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16588a[j.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16588a[j.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16588a[j.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16588a[j.START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16588a[j.END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private YogaNodeJNIBase(long j10) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.f16587g = true;
        if (j10 != 0) {
            this.f16585e = j10;
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }

    private void j0(p pVar) {
        Object k02 = k0();
        if (k02 instanceof p.a) {
            ((p.a) k02).a(this, pVar);
        }
    }

    private static v m0(long j10) {
        return new v(Float.intBitsToFloat((int) j10), (int) (j10 >> 32));
    }

    @g6.a
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i10) {
        List<YogaNodeJNIBase> list = this.f16582b;
        if (list != null) {
            list.remove(i10);
            this.f16582b.add(i10, yogaNodeJNIBase);
            yogaNodeJNIBase.f16581a = this;
            return yogaNodeJNIBase.f16585e;
        }
        throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
    }

    @Override // com.facebook.yoga.p
    public void A(h hVar) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.f16585e, hVar.f());
    }

    @Override // com.facebook.yoga.p
    public void B(i iVar) {
        YogaNative.jni_YGNodeStyleSetDisplayJNI(this.f16585e, iVar.f());
    }

    @Override // com.facebook.yoga.p
    public void C(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexJNI(this.f16585e, f10);
    }

    @Override // com.facebook.yoga.p
    public void D(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.f16585e, f10);
    }

    @Override // com.facebook.yoga.p
    public void E() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.f16585e);
    }

    @Override // com.facebook.yoga.p
    public void F(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(this.f16585e, f10);
    }

    @Override // com.facebook.yoga.p
    public void G(k kVar) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.f16585e, kVar.f());
    }

    @Override // com.facebook.yoga.p
    public void H(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.f16585e, f10);
    }

    @Override // com.facebook.yoga.p
    public void I(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.f16585e, f10);
    }

    @Override // com.facebook.yoga.p
    public void J(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.f16585e, f10);
    }

    @Override // com.facebook.yoga.p
    public void K() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.f16585e);
    }

    @Override // com.facebook.yoga.p
    public void L(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.f16585e, f10);
    }

    @Override // com.facebook.yoga.p
    public void M(l lVar) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.f16585e, lVar.f());
    }

    @Override // com.facebook.yoga.p
    public void N(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.f16585e, jVar.f(), f10);
    }

    @Override // com.facebook.yoga.p
    public void O(j jVar) {
        YogaNative.jni_YGNodeStyleSetMarginAutoJNI(this.f16585e, jVar.f());
    }

    @Override // com.facebook.yoga.p
    public void P(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetMarginPercentJNI(this.f16585e, jVar.f(), f10);
    }

    @Override // com.facebook.yoga.p
    public void Q(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.f16585e, f10);
    }

    @Override // com.facebook.yoga.p
    public void R(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(this.f16585e, f10);
    }

    @Override // com.facebook.yoga.p
    public void S(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.f16585e, f10);
    }

    @Override // com.facebook.yoga.p
    public void T(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(this.f16585e, f10);
    }

    @Override // com.facebook.yoga.p
    public void U(m mVar) {
        this.f16583c = mVar;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.f16585e, mVar != null);
    }

    @Override // com.facebook.yoga.p
    public void V(float f10) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.f16585e, f10);
    }

    @Override // com.facebook.yoga.p
    public void W(float f10) {
        YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(this.f16585e, f10);
    }

    @Override // com.facebook.yoga.p
    public void X(float f10) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.f16585e, f10);
    }

    @Override // com.facebook.yoga.p
    public void Y(float f10) {
        YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(this.f16585e, f10);
    }

    @Override // com.facebook.yoga.p
    public void Z(s sVar) {
        YogaNative.jni_YGNodeStyleSetOverflowJNI(this.f16585e, sVar.f());
    }

    @Override // com.facebook.yoga.p
    public void a(p pVar, int i10) {
        if (pVar instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) pVar;
            if (yogaNodeJNIBase.f16581a == null) {
                if (this.f16582b == null) {
                    this.f16582b = new ArrayList(4);
                }
                this.f16582b.add(i10, yogaNodeJNIBase);
                yogaNodeJNIBase.f16581a = this;
                YogaNative.jni_YGNodeInsertChildJNI(this.f16585e, yogaNodeJNIBase.f16585e, i10);
                return;
            }
            throw new IllegalStateException("Child already has a parent, it must be removed first.");
        }
    }

    @Override // com.facebook.yoga.p
    public void a0(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.f16585e, jVar.f(), f10);
    }

    @Override // com.facebook.yoga.p
    public void b(float f10, float f11) {
        j0(null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i10);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.f16582b;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.j0(yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i11 = 0; i11 < yogaNodeJNIBaseArr.length; i11++) {
            jArr[i11] = yogaNodeJNIBaseArr[i11].f16585e;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.f16585e, f10, f11, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.facebook.yoga.p
    public void b0(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(this.f16585e, jVar.f(), f10);
    }

    @g6.a
    public final float baseline(float f10, float f11) {
        return this.f16584d.a(this, f10, f11);
    }

    @Override // com.facebook.yoga.p
    public void c() {
        YogaNative.jni_YGNodeMarkDirtyJNI(this.f16585e);
    }

    @Override // com.facebook.yoga.p
    public void c0(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.f16585e, jVar.f(), f10);
    }

    @Override // com.facebook.yoga.p
    public v d() {
        return m0(YogaNative.jni_YGNodeStyleGetHeightJNI(this.f16585e));
    }

    @Override // com.facebook.yoga.p
    public void d0(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPositionPercentJNI(this.f16585e, jVar.f(), f10);
    }

    @Override // com.facebook.yoga.p
    public h e() {
        float[] fArr = this.arr;
        return h.a(fArr != null ? (int) fArr[5] : this.mLayoutDirection);
    }

    @Override // com.facebook.yoga.p
    public void e0(t tVar) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.f16585e, tVar.f());
    }

    @Override // com.facebook.yoga.p
    public float f() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.p
    public void f0(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.f16585e, f10);
    }

    @Override // com.facebook.yoga.p
    public float g(j jVar) {
        float[] fArr = this.arr;
        if (fArr != null) {
            if ((((int) fArr[0]) & 2) == 2) {
                int i10 = 10 - ((((int) fArr[0]) & 1) != 1 ? 4 : 0);
                switch (a.f16588a[jVar.ordinal()]) {
                    case 1:
                        return this.arr[i10];
                    case 2:
                        return this.arr[i10 + 1];
                    case 3:
                        return this.arr[i10 + 2];
                    case 4:
                        return this.arr[i10 + 3];
                    case 5:
                        if (e() == h.RTL) {
                            return this.arr[i10 + 2];
                        }
                        return this.arr[i10];
                    case 6:
                        if (e() == h.RTL) {
                            return this.arr[i10];
                        }
                        return this.arr[i10 + 2];
                    default:
                        throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
                }
            }
            return 0.0f;
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.p
    public void g0() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.f16585e);
    }

    @Override // com.facebook.yoga.p
    public void h0(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.f16585e, f10);
    }

    @Override // com.facebook.yoga.p
    public float i() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.p
    public void i0(w wVar) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.f16585e, wVar.f());
    }

    @Override // com.facebook.yoga.p
    public float j() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.p
    public float k() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    public Object k0() {
        return this.f16586f;
    }

    @Override // com.facebook.yoga.p
    /* renamed from: l0 */
    public YogaNodeJNIBase r(int i10) {
        List<YogaNodeJNIBase> list = this.f16582b;
        if (list != null) {
            YogaNodeJNIBase remove = list.remove(i10);
            remove.f16581a = null;
            YogaNative.jni_YGNodeRemoveChildJNI(this.f16585e, remove.f16585e);
            return remove;
        }
        throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
    }

    @Override // com.facebook.yoga.p
    public v m() {
        return m0(YogaNative.jni_YGNodeStyleGetWidthJNI(this.f16585e));
    }

    @g6.a
    public final long measure(float f10, int i10, float f11, int i11) {
        if (p()) {
            return this.f16583c.c(this, f10, n.a(i10), f11, n.a(i11));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    @Override // com.facebook.yoga.p
    public boolean n() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return (((int) fArr[0]) & 16) == 16;
        }
        return this.f16587g;
    }

    @Override // com.facebook.yoga.p
    public boolean o() {
        return YogaNative.jni_YGNodeIsDirtyJNI(this.f16585e);
    }

    @Override // com.facebook.yoga.p
    public boolean p() {
        return this.f16583c != null;
    }

    @Override // com.facebook.yoga.p
    public void q() {
        float[] fArr = this.arr;
        if (fArr != null) {
            fArr[0] = ((int) fArr[0]) & (-17);
        }
        this.f16587g = false;
    }

    @Override // com.facebook.yoga.p
    public void s() {
        this.f16583c = null;
        this.f16584d = null;
        this.f16586f = null;
        this.arr = null;
        this.f16587g = true;
        this.mLayoutDirection = 0;
        YogaNative.jni_YGNodeResetJNI(this.f16585e);
    }

    @Override // com.facebook.yoga.p
    public void t(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.f16585e, aVar.f());
    }

    @Override // com.facebook.yoga.p
    public void u(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.f16585e, aVar.f());
    }

    @Override // com.facebook.yoga.p
    public void v(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.f16585e, aVar.f());
    }

    @Override // com.facebook.yoga.p
    public void w(float f10) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.f16585e, f10);
    }

    @Override // com.facebook.yoga.p
    public void x(b bVar) {
        this.f16584d = bVar;
        YogaNative.jni_YGNodeSetHasBaselineFuncJNI(this.f16585e, bVar != null);
    }

    @Override // com.facebook.yoga.p
    public void y(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetBorderJNI(this.f16585e, jVar.f(), f10);
    }

    @Override // com.facebook.yoga.p
    public void z(Object obj) {
        this.f16586f = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public YogaNodeJNIBase(c cVar) {
        this(YogaNative.jni_YGNodeNewWithConfigJNI(((e) cVar).f16599a));
    }
}
