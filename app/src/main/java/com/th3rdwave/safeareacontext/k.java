package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.f1;
import com.facebook.react.uimanager.o;
import com.facebook.react.uimanager.r;
import java.util.EnumSet;

/* compiled from: SafeAreaViewShadowNode.java */
/* loaded from: classes3.dex */
public class k extends com.facebook.react.uimanager.j {
    private float[] A;
    private float[] B;
    private boolean C = false;

    /* renamed from: z  reason: collision with root package name */
    private i f28475z;

    public k() {
        int[] iArr = f1.f15853b;
        this.A = new float[iArr.length];
        this.B = new float[iArr.length];
        for (int i10 = 0; i10 < f1.f15853b.length; i10++) {
            this.A[i10] = Float.NaN;
            this.B[i10] = Float.NaN;
        }
    }

    private void q1(j jVar) {
        if (jVar == j.PADDING) {
            super.V0(1, this.A[1]);
            super.V0(2, this.A[1]);
            super.V0(3, this.A[3]);
            super.V0(0, this.A[0]);
            return;
        }
        super.Q0(1, this.B[1]);
        super.Q0(2, this.B[1]);
        super.Q0(3, this.B[3]);
        super.Q0(0, this.B[0]);
    }

    private void r1() {
        float f10;
        float f11;
        float f12;
        i iVar = this.f28475z;
        if (iVar == null) {
            return;
        }
        j c10 = iVar.c();
        j jVar = j.PADDING;
        float[] fArr = c10 == jVar ? this.A : this.B;
        float f13 = fArr[8];
        if (Float.isNaN(f13)) {
            f13 = 0.0f;
            f10 = 0.0f;
            f11 = 0.0f;
            f12 = 0.0f;
        } else {
            f10 = f13;
            f11 = f10;
            f12 = f11;
        }
        float f14 = fArr[7];
        if (!Float.isNaN(f14)) {
            f13 = f14;
            f11 = f13;
        }
        float f15 = fArr[6];
        if (!Float.isNaN(f15)) {
            f10 = f15;
            f12 = f10;
        }
        float f16 = fArr[1];
        if (!Float.isNaN(f16)) {
            f13 = f16;
        }
        float f17 = fArr[2];
        if (!Float.isNaN(f17)) {
            f10 = f17;
        }
        float f18 = fArr[3];
        if (!Float.isNaN(f18)) {
            f11 = f18;
        }
        float f19 = fArr[0];
        if (!Float.isNaN(f19)) {
            f12 = f19;
        }
        float c11 = r.c(f13);
        float c12 = r.c(f10);
        float c13 = r.c(f11);
        float c14 = r.c(f12);
        EnumSet<h> a10 = this.f28475z.a();
        a b10 = this.f28475z.b();
        float f20 = a10.contains(h.TOP) ? b10.f28446a : 0.0f;
        float f21 = a10.contains(h.RIGHT) ? b10.f28447b : 0.0f;
        float f22 = a10.contains(h.BOTTOM) ? b10.f28448c : 0.0f;
        float f23 = a10.contains(h.LEFT) ? b10.f28449d : 0.0f;
        if (this.f28475z.c() == jVar) {
            super.V0(1, f20 + c11);
            super.V0(2, f21 + c12);
            super.V0(3, f22 + c13);
            super.V0(0, f23 + c14);
            return;
        }
        super.Q0(1, f20 + c11);
        super.Q0(2, f21 + c12);
        super.Q0(3, f22 + c13);
        super.Q0(0, f23 + c14);
    }

    @Override // com.facebook.react.uimanager.e0, com.facebook.react.uimanager.d0
    public void a0(o oVar) {
        if (this.C) {
            this.C = false;
            r1();
        }
    }

    @Override // com.facebook.react.uimanager.j
    @w6.b(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i10, Dynamic dynamic) {
        this.B[f1.f15853b[i10]] = dynamic.getType() == ReadableType.Number ? (float) dynamic.asDouble() : Float.NaN;
        super.setMargins(i10, dynamic);
        this.C = true;
    }

    @Override // com.facebook.react.uimanager.j
    @w6.b(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i10, Dynamic dynamic) {
        this.A[f1.f15853b[i10]] = dynamic.getType() == ReadableType.Number ? (float) dynamic.asDouble() : Float.NaN;
        super.setPaddings(i10, dynamic);
        this.C = true;
    }

    @Override // com.facebook.react.uimanager.e0, com.facebook.react.uimanager.d0
    public void w(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            i iVar2 = this.f28475z;
            if (iVar2 != null && iVar2.c() != iVar.c()) {
                q1(this.f28475z.c());
            }
            this.f28475z = iVar;
            this.C = false;
            r1();
        }
    }
}
