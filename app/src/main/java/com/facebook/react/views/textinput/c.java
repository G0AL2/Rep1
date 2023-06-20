package com.facebook.react.views.textinput;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.QwertyKeyListener;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.z;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.d;
import com.facebook.react.uimanager.t;
import com.facebook.react.uimanager.t0;
import com.facebook.react.views.text.ReactAbsoluteSizeSpan;
import com.facebook.react.views.text.q;
import com.facebook.react.views.text.u;
import com.facebook.react.views.text.v;
import com.facebook.react.views.text.x;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ReactEditText.java */
/* loaded from: classes.dex */
public class c extends androidx.appcompat.widget.l implements d.a {
    private static final KeyListener L = QwertyKeyListener.getInstanceForFullKeyboard();
    private boolean A;
    private String B;
    private int C;
    private int D;
    private boolean E;
    private boolean F;
    private com.facebook.react.views.view.f G;
    private final com.facebook.react.uimanager.d H;
    protected boolean I;
    protected boolean J;
    private com.facebook.react.uimanager.events.d K;

    /* renamed from: f  reason: collision with root package name */
    private final InputMethodManager f16328f;

    /* renamed from: g  reason: collision with root package name */
    private final String f16329g;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f16330h;

    /* renamed from: i  reason: collision with root package name */
    protected boolean f16331i;

    /* renamed from: j  reason: collision with root package name */
    private int f16332j;

    /* renamed from: k  reason: collision with root package name */
    private int f16333k;

    /* renamed from: l  reason: collision with root package name */
    protected int f16334l;

    /* renamed from: m  reason: collision with root package name */
    private ArrayList<TextWatcher> f16335m;

    /* renamed from: n  reason: collision with root package name */
    private C0219c f16336n;

    /* renamed from: o  reason: collision with root package name */
    private int f16337o;

    /* renamed from: p  reason: collision with root package name */
    protected boolean f16338p;

    /* renamed from: q  reason: collision with root package name */
    private Boolean f16339q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f16340r;

    /* renamed from: s  reason: collision with root package name */
    private String f16341s;

    /* renamed from: t  reason: collision with root package name */
    private p f16342t;

    /* renamed from: u  reason: collision with root package name */
    private com.facebook.react.views.textinput.a f16343u;

    /* renamed from: v  reason: collision with root package name */
    private o f16344v;

    /* renamed from: w  reason: collision with root package name */
    private final b f16345w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f16346x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f16347y;

    /* renamed from: z  reason: collision with root package name */
    private u f16348z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactEditText.java */
    /* loaded from: classes.dex */
    public class a extends t {
        a() {
        }

        @Override // com.facebook.react.uimanager.t, androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 == 16) {
                int length = c.this.getText().length();
                if (length > 0) {
                    c.this.setSelection(length);
                }
                return c.this.z();
            }
            return super.j(view, i10, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReactEditText.java */
    /* loaded from: classes.dex */
    public static class b implements KeyListener {

        /* renamed from: a  reason: collision with root package name */
        private int f16350a = 0;

        public void a(int i10) {
            this.f16350a = i10;
        }

        @Override // android.text.method.KeyListener
        public void clearMetaKeyState(View view, Editable editable, int i10) {
            c.L.clearMetaKeyState(view, editable, i10);
        }

        @Override // android.text.method.KeyListener
        public int getInputType() {
            return this.f16350a;
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
            return c.L.onKeyDown(view, editable, i10, keyEvent);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
            return c.L.onKeyOther(view, editable, keyEvent);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
            return c.L.onKeyUp(view, editable, i10, keyEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReactEditText.java */
    /* renamed from: com.facebook.react.views.textinput.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0219c implements TextWatcher {
        private C0219c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            c cVar = c.this;
            if (cVar.f16331i || cVar.f16330h || cVar.f16335m == null) {
                return;
            }
            Iterator it = c.this.f16335m.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).afterTextChanged(editable);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            c cVar = c.this;
            if (cVar.f16331i || cVar.f16330h || cVar.f16335m == null) {
                return;
            }
            Iterator it = c.this.f16335m.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).beforeTextChanged(charSequence, i10, i11, i12);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            c cVar = c.this;
            if (!cVar.f16331i) {
                if (!cVar.f16330h && cVar.f16335m != null) {
                    Iterator it = c.this.f16335m.iterator();
                    while (it.hasNext()) {
                        ((TextWatcher) it.next()).onTextChanged(charSequence, i10, i11, i12);
                    }
                }
                c cVar2 = c.this;
                cVar2.G(!cVar2.f16330h && !cVar2.J && i10 == 0 && i11 == 0);
            }
            c.this.x();
        }

        /* synthetic */ C0219c(c cVar, a aVar) {
            this();
        }
    }

    public c(Context context) {
        super(context);
        this.f16329g = c.class.getSimpleName();
        this.f16331i = false;
        this.f16346x = false;
        this.f16347y = false;
        this.A = false;
        this.B = null;
        this.C = -1;
        this.D = -1;
        this.E = false;
        this.F = false;
        this.H = new com.facebook.react.uimanager.d();
        this.I = false;
        this.J = false;
        setFocusableInTouchMode(false);
        this.G = new com.facebook.react.views.view.f(this);
        this.f16328f = (InputMethodManager) f6.a.c(context.getSystemService("input_method"));
        this.f16332j = getGravity() & 8388615;
        this.f16333k = getGravity() & 112;
        this.f16334l = 0;
        this.f16330h = false;
        this.f16339q = null;
        this.f16340r = false;
        this.f16335m = null;
        this.f16336n = null;
        this.f16337o = getInputType();
        this.f16345w = new b();
        this.f16344v = null;
        this.f16348z = new u();
        i();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && i10 <= 27) {
            setLayerType(1, null);
        }
        z.q0(this, new a());
    }

    private static boolean A(Editable editable, SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
        if (i10 > spannableStringBuilder.length() || i11 > spannableStringBuilder.length()) {
            return false;
        }
        while (i10 < i11) {
            if (editable.charAt(i10) != spannableStringBuilder.charAt(i10)) {
                return false;
            }
            i10++;
        }
        return true;
    }

    private void E() {
        ReactContext d10 = t0.d(this);
        com.facebook.react.uimanager.d dVar = this.H;
        if (dVar == null || dVar.b() || d10.isBridgeless()) {
            return;
        }
        k kVar = new k(this);
        UIManagerModule uIManagerModule = (UIManagerModule) d10.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.setViewLocalData(getId(), kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(boolean z10) {
        com.facebook.react.uimanager.d dVar = this.H;
        if ((dVar == null || dVar.b()) && getId() != -1) {
            boolean z11 = true;
            if (z10) {
                this.f16331i = true;
                h(getText());
                this.f16331i = false;
            }
            Editable text = getText();
            z11 = (text == null || text.length() <= 0) ? false : false;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (z11) {
                try {
                    spannableStringBuilder.append(text.subSequence(0, text.length()));
                } catch (IndexOutOfBoundsException e10) {
                    ReactSoftExceptionLogger.logSoftException(this.f16329g, e10);
                }
            }
            if (!z11) {
                if (getHint() != null && getHint().length() > 0) {
                    spannableStringBuilder.append(getHint());
                } else {
                    spannableStringBuilder.append((CharSequence) "I");
                }
                h(spannableStringBuilder);
            }
            x.i(getId(), spannableStringBuilder);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void H() {
        /*
            r9 = this;
            java.lang.String r0 = r9.f16341s
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 6
            if (r0 == 0) goto L70
            r0.hashCode()
            r7 = -1
            int r8 = r0.hashCode()
            switch(r8) {
                case -1273775369: goto L58;
                case -906336856: goto L4d;
                case 3304: goto L42;
                case 3089282: goto L37;
                case 3377907: goto L2c;
                case 3387192: goto L21;
                case 3526536: goto L16;
                default: goto L15;
            }
        L15:
            goto L62
        L16:
            java.lang.String r8 = "send"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L1f
            goto L62
        L1f:
            r7 = 6
            goto L62
        L21:
            java.lang.String r8 = "none"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L2a
            goto L62
        L2a:
            r7 = 5
            goto L62
        L2c:
            java.lang.String r8 = "next"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L35
            goto L62
        L35:
            r7 = 4
            goto L62
        L37:
            java.lang.String r8 = "done"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L40
            goto L62
        L40:
            r7 = 3
            goto L62
        L42:
            java.lang.String r8 = "go"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L4b
            goto L62
        L4b:
            r7 = 2
            goto L62
        L4d:
            java.lang.String r8 = "search"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L56
            goto L62
        L56:
            r7 = 1
            goto L62
        L58:
            java.lang.String r8 = "previous"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L61
            goto L62
        L61:
            r7 = 0
        L62:
            switch(r7) {
                case 0: goto L6e;
                case 1: goto L6c;
                case 2: goto L6a;
                case 3: goto L70;
                case 4: goto L71;
                case 5: goto L68;
                case 6: goto L66;
                default: goto L65;
            }
        L65:
            goto L70
        L66:
            r1 = 4
            goto L71
        L68:
            r1 = 1
            goto L71
        L6a:
            r1 = 2
            goto L71
        L6c:
            r1 = 3
            goto L71
        L6e:
            r1 = 7
            goto L71
        L70:
            r1 = 6
        L71:
            boolean r0 = r9.f16340r
            if (r0 == 0) goto L7c
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r0 = r0 | r1
            r9.setImeOptions(r0)
            goto L7f
        L7c:
            r9.setImeOptions(r1)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.c.H():void");
    }

    private C0219c getTextWatcherDelegator() {
        if (this.f16336n == null) {
            this.f16336n = new C0219c(this, null);
        }
        return this.f16336n;
    }

    private void h(Spannable spannable) {
        Object[] spans;
        if (this.H.b()) {
            boolean z10 = this.I;
            this.I = true;
            int length = spannable.length();
            int i10 = 0;
            for (Object obj : spannable.getSpans(0, length(), Object.class)) {
                int spanFlags = spannable.getSpanFlags(obj);
                if (((spanFlags & 18) == 18 || (spanFlags & 17) == 17) && (obj instanceof com.facebook.react.views.text.j) && spannable.getSpanStart(obj) == 0 && spannable.getSpanEnd(obj) == length) {
                    spannable.removeSpan(obj);
                }
            }
            ArrayList<x.a> arrayList = new ArrayList();
            if (!Float.isNaN(this.f16348z.i())) {
                arrayList.add(new x.a(0, length, new com.facebook.react.views.text.a(this.f16348z.i())));
            }
            arrayList.add(new x.a(0, length, new ReactAbsoluteSizeSpan(this.f16348z.c())));
            if (this.D != -1 || this.C != -1 || this.B != null) {
                arrayList.add(new x.a(0, length, new com.facebook.react.views.text.c(this.D, this.C, null, this.B, t0.d(this).getAssets())));
            }
            if (!Float.isNaN(this.f16348z.e())) {
                arrayList.add(new x.a(0, length, new com.facebook.react.views.text.b(this.f16348z.e())));
            }
            for (x.a aVar : arrayList) {
                aVar.a(spannable, i10);
                i10++;
            }
            this.I = z10;
        }
    }

    private int k(int i10) {
        return Math.max(0, Math.min(i10, getText() == null ? 0 : getText().length()));
    }

    private boolean q() {
        return (getInputType() & 144) != 0;
    }

    private void r(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        Object[] spans;
        for (Object obj : getText().getSpans(0, length(), Object.class)) {
            int spanFlags = getText().getSpanFlags(obj);
            boolean z11 = (spanFlags & 33) == 33;
            if (obj instanceof com.facebook.react.views.text.j) {
                getText().removeSpan(obj);
            }
            if (z11) {
                int spanStart = getText().getSpanStart(obj);
                int spanEnd = getText().getSpanEnd(obj);
                getText().removeSpan(obj);
                if (A(getText(), spannableStringBuilder, spanStart, spanEnd)) {
                    spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags);
                }
            }
        }
        if (z10) {
            return;
        }
        h(getText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        com.facebook.react.views.textinput.a aVar = this.f16343u;
        if (aVar != null) {
            aVar.a();
        }
        E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean z() {
        setFocusableInTouchMode(true);
        boolean requestFocus = super.requestFocus(130, null);
        if (getShowSoftInputOnFocus()) {
            F();
        }
        return requestFocus;
    }

    public void B(int i10, float f10, float f11) {
        this.G.c(i10, f10, f11);
    }

    public void C(float f10, int i10) {
        this.G.e(f10, i10);
    }

    public void D(int i10, float f10) {
        this.G.g(i10, f10);
    }

    protected boolean F() {
        return this.f16328f.showSoftInput(this, 0);
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(TextWatcher textWatcher) {
        if (this.f16335m == null) {
            this.f16335m = new ArrayList<>();
            super.addTextChangedListener(getTextWatcherDelegator());
        }
        this.f16335m.add(textWatcher);
    }

    @Override // android.view.View
    public void clearFocus() {
        setFocusableInTouchMode(false);
        super.clearFocus();
        n();
    }

    protected void finalize() {
        x.d(getId());
    }

    public boolean getBlurOnSubmit() {
        Boolean bool = this.f16339q;
        if (bool == null) {
            return !p();
        }
        return bool.booleanValue();
    }

    public boolean getDisableFullscreenUI() {
        return this.f16340r;
    }

    @Override // com.facebook.react.uimanager.d.a
    public com.facebook.react.uimanager.d getFabricViewStateManager() {
        return this.H;
    }

    public String getReturnKeyType() {
        return this.f16341s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getStagedInputType() {
        return this.f16337o;
    }

    protected void i() {
        setTextSize(0, this.f16348z.c());
        float d10 = this.f16348z.d();
        if (Float.isNaN(d10)) {
            return;
        }
        setLetterSpacing(d10);
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.f16338p) {
            Editable text = getText();
            for (v vVar : (v[]) text.getSpans(0, text.length(), v.class)) {
                if (vVar.a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.view.View
    public boolean isLayoutRequested() {
        return false;
    }

    public boolean j(int i10) {
        return i10 >= this.f16334l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        clearFocus();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m() {
        if (getInputType() != this.f16337o) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            setInputType(this.f16337o);
            setSelection(selectionStart, selectionEnd);
        }
    }

    protected void n() {
        this.f16328f.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public int o() {
        int i10 = this.f16334l + 1;
        this.f16334l = i10;
        return i10;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        super.setTextIsSelectable(true);
        if (this.f16338p) {
            Editable text = getText();
            for (v vVar : (v[]) text.getSpans(0, text.length(), v.class)) {
                vVar.c();
            }
        }
        if (this.E && !this.F) {
            z();
        }
        this.F = true;
    }

    @Override // androidx.appcompat.widget.l, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        ReactContext d10 = t0.d(this);
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && this.f16347y) {
            onCreateInputConnection = new d(onCreateInputConnection, d10, this, this.K);
        }
        if (p() && getBlurOnSubmit()) {
            editorInfo.imeOptions &= -1073741825;
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f16338p) {
            Editable text = getText();
            for (v vVar : (v[]) text.getSpans(0, text.length(), v.class)) {
                vVar.d();
            }
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.f16338p) {
            Editable text = getText();
            for (v vVar : (v[]) text.getSpans(0, text.length(), v.class)) {
                vVar.e();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        p pVar;
        super.onFocusChanged(z10, i10, rect);
        if (!z10 || (pVar = this.f16342t) == null) {
            return;
        }
        pVar.a(getSelectionStart(), getSelectionEnd());
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 == 66 && !p()) {
            n();
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        x();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        o oVar = this.f16344v;
        if (oVar != null) {
            oVar.a(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        if (this.f16331i || this.f16342t == null || !hasFocus()) {
            return;
        }
        this.f16342t.a(i10, i11);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.f16338p) {
            Editable text = getText();
            for (v vVar : (v[]) text.getSpans(0, text.length(), v.class)) {
                vVar.f();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2 && this.f16346x) {
                if (!canScrollVertically(-1) && !canScrollVertically(1) && !canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                this.f16346x = false;
            }
        } else {
            this.f16346x = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        return (getInputType() & 131072) != 0;
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(TextWatcher textWatcher) {
        ArrayList<TextWatcher> arrayList = this.f16335m;
        if (arrayList != null) {
            arrayList.remove(textWatcher);
            if (this.f16335m.isEmpty()) {
                this.f16335m = null;
                super.removeTextChangedListener(getTextWatcherDelegator());
            }
        }
    }

    @Override // android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        return isFocused();
    }

    public void s(int i10, int i11, int i12) {
        if (!j(i10) || i11 == -1 || i12 == -1) {
            return;
        }
        setSelection(k(i11), k(i12));
    }

    public void setAllowFontScaling(boolean z10) {
        if (this.f16348z.b() != z10) {
            this.f16348z.m(z10);
            i();
        }
    }

    public void setAutoFocus(boolean z10) {
        this.E = z10;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.G.b(i10);
    }

    public void setBlurOnSubmit(Boolean bool) {
        this.f16339q = bool;
    }

    public void setBorderRadius(float f10) {
        this.G.d(f10);
    }

    public void setBorderStyle(String str) {
        this.G.f(str);
    }

    public void setContentSizeWatcher(com.facebook.react.views.textinput.a aVar) {
        this.f16343u = aVar;
    }

    public void setDisableFullscreenUI(boolean z10) {
        this.f16340r = z10;
        H();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEventDispatcher(com.facebook.react.uimanager.events.d dVar) {
        this.K = dVar;
    }

    public void setFontFamily(String str) {
        this.B = str;
        this.A = true;
    }

    public void setFontSize(float f10) {
        this.f16348z.n(f10);
        i();
    }

    public void setFontStyle(String str) {
        int b10 = q.b(str);
        if (b10 != this.D) {
            this.D = b10;
            this.A = true;
        }
    }

    public void setFontWeight(String str) {
        int d10 = q.d(str);
        if (d10 != this.C) {
            this.C = d10;
            this.A = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setGravityHorizontal(int i10) {
        if (i10 == 0) {
            i10 = this.f16332j;
        }
        setGravity(i10 | (getGravity() & (-8) & (-8388616)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setGravityVertical(int i10) {
        if (i10 == 0) {
            i10 = this.f16333k;
        }
        setGravity(i10 | (getGravity() & (-113)));
    }

    @Override // android.widget.TextView
    public void setInputType(int i10) {
        Typeface typeface = super.getTypeface();
        super.setInputType(i10);
        this.f16337o = i10;
        super.setTypeface(typeface);
        if (p()) {
            setSingleLine(false);
        }
        this.f16345w.a(i10);
        setKeyListener(this.f16345w);
    }

    public void setLetterSpacingPt(float f10) {
        this.f16348z.p(f10);
        i();
    }

    public void setMaxFontSizeMultiplier(float f10) {
        if (f10 != this.f16348z.k()) {
            this.f16348z.r(f10);
            i();
        }
    }

    public void setOnKeyPress(boolean z10) {
        this.f16347y = z10;
    }

    public void setReturnKeyType(String str) {
        this.f16341s = str;
        H();
    }

    public void setScrollWatcher(o oVar) {
        this.f16344v = oVar;
    }

    @Override // android.widget.EditText
    public void setSelection(int i10, int i11) {
        super.setSelection(i10, i11);
    }

    public void setSelectionWatcher(p pVar) {
        this.f16342t = pVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStagedInputType(int i10) {
        this.f16337o = i10;
    }

    public void t(com.facebook.react.views.text.n nVar) {
        if (!(q() && TextUtils.equals(getText(), nVar.k())) && j(nVar.c())) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(nVar.k());
            r(spannableStringBuilder, nVar.f16224m);
            this.f16338p = nVar.b();
            this.I = true;
            if (nVar.k().length() == 0) {
                setText((CharSequence) null);
            } else {
                getText().replace(0, length(), spannableStringBuilder);
            }
            this.I = false;
            if (Build.VERSION.SDK_INT >= 23 && getBreakStrategy() != nVar.m()) {
                setBreakStrategy(nVar.m());
            }
            G(false);
        }
    }

    public void u(com.facebook.react.views.text.n nVar) {
        this.f16330h = true;
        t(nVar);
        this.f16330h = false;
    }

    public void v(com.facebook.react.views.text.n nVar) {
        this.J = true;
        t(nVar);
        this.J = false;
    }

    @Override // android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (this.f16338p) {
            Editable text = getText();
            for (v vVar : (v[]) text.getSpans(0, text.length(), v.class)) {
                if (vVar.a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    public void w() {
        if (this.A) {
            this.A = false;
            setTypeface(q.a(getTypeface(), this.D, this.C, this.B, getContext().getAssets()));
        }
    }

    public void y() {
        z();
    }
}
