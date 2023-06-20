package com.facebook.react.views.textinput;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.core.view.z;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.x0;

/* compiled from: ReactTextInputShadowNode.java */
@TargetApi(23)
/* loaded from: classes.dex */
public class m extends com.facebook.react.views.text.f implements com.facebook.yoga.m {
    private int Z;

    /* renamed from: a0  reason: collision with root package name */
    private EditText f16373a0;

    /* renamed from: b0  reason: collision with root package name */
    private k f16374b0;

    /* renamed from: c0  reason: collision with root package name */
    private String f16375c0;

    /* renamed from: d0  reason: collision with root package name */
    private String f16376d0;

    /* renamed from: e0  reason: collision with root package name */
    private int f16377e0;

    /* renamed from: f0  reason: collision with root package name */
    private int f16378f0;

    public m(com.facebook.react.views.text.p pVar) {
        super(pVar);
        this.Z = -1;
        this.f16375c0 = null;
        this.f16376d0 = null;
        this.f16377e0 = -1;
        this.f16378f0 = -1;
        this.H = Build.VERSION.SDK_INT < 23 ? 0 : 1;
        v1();
    }

    private void v1() {
        T0(this);
    }

    @Override // com.facebook.react.uimanager.e0
    public void V0(int i10, float f10) {
        super.V0(i10, f10);
        x0();
    }

    @Override // com.facebook.yoga.m
    public long c(com.facebook.yoga.p pVar, float f10, com.facebook.yoga.n nVar, float f11, com.facebook.yoga.n nVar2) {
        EditText editText = (EditText) f6.a.c(this.f16373a0);
        k kVar = this.f16374b0;
        if (kVar != null) {
            kVar.a(editText);
        } else {
            editText.setTextSize(0, this.A.c());
            int i10 = this.F;
            if (i10 != -1) {
                editText.setLines(i10);
            }
            if (Build.VERSION.SDK_INT >= 23) {
                int breakStrategy = editText.getBreakStrategy();
                int i11 = this.H;
                if (breakStrategy != i11) {
                    editText.setBreakStrategy(i11);
                }
            }
        }
        editText.setHint(t1());
        editText.measure(com.facebook.react.views.view.c.a(f10, nVar), com.facebook.react.views.view.c.a(f11, nVar2));
        return com.facebook.yoga.o.b(editText.getMeasuredWidth(), editText.getMeasuredHeight());
    }

    protected EditText s1() {
        return new EditText(U());
    }

    @w6.a(name = "mostRecentEventCount")
    public void setMostRecentEventCount(int i10) {
        this.Z = i10;
    }

    @w6.a(name = "placeholder")
    public void setPlaceholder(String str) {
        this.f16376d0 = str;
        x0();
    }

    @w6.a(name = "selection")
    public void setSelection(ReadableMap readableMap) {
        this.f16378f0 = -1;
        this.f16377e0 = -1;
        if (readableMap != null && readableMap.hasKey("start") && readableMap.hasKey("end")) {
            this.f16377e0 = readableMap.getInt("start");
            this.f16378f0 = readableMap.getInt("end");
            x0();
        }
    }

    @w6.a(name = "text")
    public void setText(String str) {
        this.f16375c0 = str;
        if (str != null) {
            if (this.f16377e0 > str.length()) {
                this.f16377e0 = str.length();
            }
            if (this.f16378f0 > str.length()) {
                this.f16378f0 = str.length();
            }
        } else {
            this.f16377e0 = -1;
            this.f16378f0 = -1;
        }
        x0();
    }

    @Override // com.facebook.react.views.text.f
    public void setTextBreakStrategy(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        if (str != null && !"simple".equals(str)) {
            if ("highQuality".equals(str)) {
                this.H = 1;
                return;
            } else if ("balanced".equals(str)) {
                this.H = 2;
                return;
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid textBreakStrategy: " + str);
            }
        }
        this.H = 0;
    }

    @Override // com.facebook.react.uimanager.e0, com.facebook.react.uimanager.d0
    public void t(n0 n0Var) {
        super.t(n0Var);
        EditText s12 = s1();
        H0(4, z.H(s12));
        H0(1, s12.getPaddingTop());
        H0(5, z.G(s12));
        H0(3, s12.getPaddingBottom());
        this.f16373a0 = s12;
        s12.setPadding(0, 0, 0, 0);
        this.f16373a0.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    public String t1() {
        return this.f16376d0;
    }

    @Override // com.facebook.react.uimanager.e0
    public boolean u0() {
        return true;
    }

    public String u1() {
        return this.f16375c0;
    }

    @Override // com.facebook.react.uimanager.e0
    public boolean v0() {
        return true;
    }

    @Override // com.facebook.react.uimanager.e0, com.facebook.react.uimanager.d0
    public void w(Object obj) {
        f6.a.a(obj instanceof k);
        this.f16374b0 = (k) obj;
        K();
    }

    @Override // com.facebook.react.uimanager.e0
    public void z0(x0 x0Var) {
        super.z0(x0Var);
        if (this.Z != -1) {
            x0Var.Q(O(), new com.facebook.react.views.text.n(r1(this, u1(), false, null), this.Z, this.X, k0(0), k0(1), k0(2), k0(3), this.G, this.H, this.J, this.f16377e0, this.f16378f0));
        }
    }

    public m() {
        this(null);
    }
}
