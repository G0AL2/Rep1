package i0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.ads.AdRequest;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import i0.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: AccessibilityNodeInfoCompat.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: d  reason: collision with root package name */
    private static int f31486d;

    /* renamed from: a  reason: collision with root package name */
    private final AccessibilityNodeInfo f31487a;

    /* renamed from: b  reason: collision with root package name */
    public int f31488b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f31489c = -1;

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: e  reason: collision with root package name */
        public static final a f31490e = new a(1, null);

        /* renamed from: f  reason: collision with root package name */
        public static final a f31491f = new a(2, null);

        /* renamed from: g  reason: collision with root package name */
        public static final a f31492g;

        /* renamed from: h  reason: collision with root package name */
        public static final a f31493h;

        /* renamed from: i  reason: collision with root package name */
        public static final a f31494i;

        /* renamed from: j  reason: collision with root package name */
        public static final a f31495j;

        /* renamed from: k  reason: collision with root package name */
        public static final a f31496k;

        /* renamed from: l  reason: collision with root package name */
        public static final a f31497l;

        /* renamed from: m  reason: collision with root package name */
        public static final a f31498m;

        /* renamed from: n  reason: collision with root package name */
        public static final a f31499n;

        /* renamed from: o  reason: collision with root package name */
        public static final a f31500o;

        /* renamed from: p  reason: collision with root package name */
        public static final a f31501p;

        /* renamed from: a  reason: collision with root package name */
        final Object f31502a;

        /* renamed from: b  reason: collision with root package name */
        private final int f31503b;

        /* renamed from: c  reason: collision with root package name */
        private final Class<? extends f.a> f31504c;

        /* renamed from: d  reason: collision with root package name */
        protected final f f31505d;

        static {
            new a(4, null);
            new a(8, null);
            f31492g = new a(16, null);
            f31493h = new a(32, null);
            new a(64, null);
            new a(128, null);
            new a(256, null, f.b.class);
            new a(AdRequest.MAX_CONTENT_URL_LENGTH, null, f.b.class);
            new a(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES, null, f.c.class);
            new a(2048, null, f.c.class);
            f31494i = new a(4096, null);
            f31495j = new a(Constants.BUFFER_SIZE, null);
            new a(16384, null);
            new a(32768, null);
            new a(Constants.MIN_PROGRESS_STEP, null);
            new a(131072, null, f.g.class);
            f31496k = new a(262144, null);
            f31497l = new a(524288, null);
            f31498m = new a(1048576, null);
            new a(2097152, null, f.h.class);
            int i10 = Build.VERSION.SDK_INT;
            new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null, null, null);
            new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null, null, f.e.class);
            f31499n = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
            new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
            f31500o = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
            new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
            new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null, null, null);
            f31501p = new a(i10 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, f.C0403f.class);
            new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, f.d.class);
            new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, null, null, null);
            new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, null, null, null);
            new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        public a a(CharSequence charSequence, f fVar) {
            return new a(null, this.f31503b, charSequence, fVar, this.f31504c);
        }

        public int b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f31502a).getId();
            }
            return 0;
        }

        public CharSequence c() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f31502a).getLabel();
            }
            return null;
        }

        public boolean d(View view, Bundle bundle) {
            if (this.f31505d != null) {
                f.a aVar = null;
                Class<? extends f.a> cls = this.f31504c;
                if (cls != null) {
                    try {
                        f.a newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        try {
                            newInstance.a(bundle);
                            aVar = newInstance;
                        } catch (Exception e10) {
                            e = e10;
                            aVar = newInstance;
                            Class<? extends f.a> cls2 = this.f31504c;
                            String name = cls2 == null ? "null" : cls2.getName();
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + name, e);
                            return this.f31505d.a(view, aVar);
                        }
                    } catch (Exception e11) {
                        e = e11;
                    }
                }
                return this.f31505d.a(view, aVar);
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof a)) {
                a aVar = (a) obj;
                Object obj2 = this.f31502a;
                return obj2 == null ? aVar.f31502a == null : obj2.equals(aVar.f31502a);
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f31502a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i10, CharSequence charSequence, Class<? extends f.a> cls) {
            this(null, i10, charSequence, null, cls);
        }

        a(Object obj, int i10, CharSequence charSequence, f fVar, Class<? extends f.a> cls) {
            this.f31503b = i10;
            this.f31505d = fVar;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                this.f31502a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f31502a = obj;
            }
            this.f31504c = cls;
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final Object f31506a;

        b(Object obj) {
            this.f31506a = obj;
        }

        public static b a(int i10, int i11, boolean z10, int i12) {
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 21) {
                return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
            }
            if (i13 >= 19) {
                return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10));
            }
            return new b(null);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* renamed from: i0.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0402c {

        /* renamed from: a  reason: collision with root package name */
        final Object f31507a;

        C0402c(Object obj) {
            this.f31507a = obj;
        }

        public static C0402c a(int i10, int i11, int i12, int i13, boolean z10) {
            if (Build.VERSION.SDK_INT >= 19) {
                return new C0402c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10));
            }
            return new C0402c(null);
        }

        public static C0402c b(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 21) {
                return new C0402c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
            }
            if (i14 >= 19) {
                return new C0402c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10));
            }
            return new C0402c(null);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        final Object f31508a;

        d(Object obj) {
            this.f31508a = obj;
        }

        public static d a(int i10, float f10, float f11, float f12) {
            if (Build.VERSION.SDK_INT >= 19) {
                return new d(AccessibilityNodeInfo.RangeInfo.obtain(i10, f10, f11, f12));
            }
            return new d(null);
        }
    }

    private c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f31487a = accessibilityNodeInfo;
    }

    public static c F0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new c(accessibilityNodeInfo);
    }

    public static c N() {
        return F0(AccessibilityNodeInfo.obtain());
    }

    public static c O(View view) {
        return F0(AccessibilityNodeInfo.obtain(view));
    }

    public static c P(c cVar) {
        return F0(AccessibilityNodeInfo.obtain(cVar.f31487a));
    }

    private void T(View view) {
        SparseArray<WeakReference<ClickableSpan>> v10 = v(view);
        if (v10 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < v10.size(); i10++) {
                if (v10.valueAt(i10).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                v10.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    private void V(int i10, boolean z10) {
        Bundle s10 = s();
        if (s10 != null) {
            int i11 = s10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            s10.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    private void e(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
    }

    private void g() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f31487a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f31487a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f31487a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f31487a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    private List<Integer> h(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f31487a.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.f31487a.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    private static String j(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                switch (i10) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case 32:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case AdRequest.MAX_CONTENT_URL_LENGTH /* 512 */:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES /* 1024 */:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case 2048:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case 4096:
                        return "ACTION_SCROLL_FORWARD";
                    case Constants.BUFFER_SIZE /* 8192 */:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case Constants.MIN_PROGRESS_STEP /* 65536 */:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case 16908354:
                        return "ACTION_MOVE_WINDOW";
                    case 16908372:
                        return "ACTION_IME_ENTER";
                    default:
                        switch (i10) {
                            case 16908342:
                                return "ACTION_SHOW_ON_SCREEN";
                            case 16908343:
                                return "ACTION_SCROLL_TO_POSITION";
                            case 16908344:
                                return "ACTION_SCROLL_UP";
                            case 16908345:
                                return "ACTION_SCROLL_LEFT";
                            case 16908346:
                                return "ACTION_SCROLL_DOWN";
                            case 16908347:
                                return "ACTION_SCROLL_RIGHT";
                            case 16908348:
                                return "ACTION_CONTEXT_CLICK";
                            case 16908349:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i10) {
                                    case 16908356:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case 16908357:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case 16908358:
                                        return "ACTION_PAGE_UP";
                                    case 16908359:
                                        return "ACTION_PAGE_DOWN";
                                    case 16908360:
                                        return "ACTION_PAGE_LEFT";
                                    case 16908361:
                                        return "ACTION_PAGE_RIGHT";
                                    case 16908362:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    private boolean l(int i10) {
        Bundle s10 = s();
        return s10 != null && (s10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10;
    }

    public static ClickableSpan[] q(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> t(View view) {
        SparseArray<WeakReference<ClickableSpan>> v10 = v(view);
        if (v10 == null) {
            SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
            view.setTag(w.c.f38108c, sparseArray);
            return sparseArray;
        }
        return v10;
    }

    private SparseArray<WeakReference<ClickableSpan>> v(View view) {
        return (SparseArray) view.getTag(w.c.f38108c);
    }

    private boolean y() {
        return !h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int z(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals(sparseArray.valueAt(i10).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f31486d;
        f31486d = i11 + 1;
        return i11;
    }

    public boolean A() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f31487a.isAccessibilityFocused();
        }
        return false;
    }

    public void A0(CharSequence charSequence) {
        if (e0.a.b()) {
            this.f31487a.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.f31487a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean B() {
        return this.f31487a.isCheckable();
    }

    public void B0(CharSequence charSequence) {
        this.f31487a.setText(charSequence);
    }

    public boolean C() {
        return this.f31487a.isChecked();
    }

    public void C0(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            this.f31487a.setViewIdResourceName(str);
        }
    }

    public boolean D() {
        return this.f31487a.isClickable();
    }

    public void D0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f31487a.setVisibleToUser(z10);
        }
    }

    public boolean E() {
        return this.f31487a.isEnabled();
    }

    public AccessibilityNodeInfo E0() {
        return this.f31487a;
    }

    public boolean F() {
        return this.f31487a.isFocusable();
    }

    public boolean G() {
        return this.f31487a.isFocused();
    }

    public boolean H() {
        return this.f31487a.isLongClickable();
    }

    public boolean I() {
        return this.f31487a.isPassword();
    }

    public boolean J() {
        return this.f31487a.isScrollable();
    }

    public boolean K() {
        return this.f31487a.isSelected();
    }

    public boolean L() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f31487a.isShowingHintText();
        }
        return l(4);
    }

    public boolean M() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f31487a.isVisibleToUser();
        }
        return false;
    }

    public boolean Q(int i10, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f31487a.performAction(i10, bundle);
        }
        return false;
    }

    public void R() {
        this.f31487a.recycle();
    }

    public boolean S(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f31487a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f31502a);
        }
        return false;
    }

    public void U(boolean z10) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f31487a.setAccessibilityFocused(z10);
        }
    }

    @Deprecated
    public void W(Rect rect) {
        this.f31487a.setBoundsInParent(rect);
    }

    public void X(Rect rect) {
        this.f31487a.setBoundsInScreen(rect);
    }

    public void Y(boolean z10) {
        this.f31487a.setCheckable(z10);
    }

    public void Z(boolean z10) {
        this.f31487a.setChecked(z10);
    }

    public void a(int i10) {
        this.f31487a.addAction(i10);
    }

    public void a0(CharSequence charSequence) {
        this.f31487a.setClassName(charSequence);
    }

    public void b(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f31487a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f31502a);
        }
    }

    public void b0(boolean z10) {
        this.f31487a.setClickable(z10);
    }

    public void c(View view) {
        this.f31487a.addChild(view);
    }

    public void c0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f31487a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f31506a);
        }
    }

    public void d(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f31487a.addChild(view, i10);
        }
    }

    public void d0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f31487a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C0402c) obj).f31507a);
        }
    }

    public void e0(CharSequence charSequence) {
        this.f31487a.setContentDescription(charSequence);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof c)) {
            c cVar = (c) obj;
            AccessibilityNodeInfo accessibilityNodeInfo = this.f31487a;
            if (accessibilityNodeInfo == null) {
                if (cVar.f31487a != null) {
                    return false;
                }
            } else if (!accessibilityNodeInfo.equals(cVar.f31487a)) {
                return false;
            }
            return this.f31489c == cVar.f31489c && this.f31488b == cVar.f31488b;
        }
        return false;
    }

    public void f(CharSequence charSequence, View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 19 || i10 >= 26) {
            return;
        }
        g();
        T(view);
        ClickableSpan[] q10 = q(charSequence);
        if (q10 == null || q10.length <= 0) {
            return;
        }
        s().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", w.c.f38106a);
        SparseArray<WeakReference<ClickableSpan>> t10 = t(view);
        for (int i11 = 0; i11 < q10.length; i11++) {
            int z10 = z(q10[i11], t10);
            t10.put(z10, new WeakReference<>(q10[i11]));
            e(q10[i11], (Spanned) charSequence, z10);
        }
    }

    public void f0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f31487a.setContentInvalid(z10);
        }
    }

    public void g0(boolean z10) {
        this.f31487a.setEnabled(z10);
    }

    public void h0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f31487a.setError(charSequence);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f31487a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public List<a> i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.f31487a.getActionList() : null;
        if (actionList != null) {
            ArrayList arrayList = new ArrayList();
            int size = actionList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(new a(actionList.get(i10)));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public void i0(boolean z10) {
        this.f31487a.setFocusable(z10);
    }

    public void j0(boolean z10) {
        this.f31487a.setFocused(z10);
    }

    public int k() {
        return this.f31487a.getActions();
    }

    public void k0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f31487a.setHeading(z10);
        } else {
            V(2, z10);
        }
    }

    public void l0(CharSequence charSequence) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            this.f31487a.setHintText(charSequence);
        } else if (i10 >= 19) {
            this.f31487a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    @Deprecated
    public void m(Rect rect) {
        this.f31487a.getBoundsInParent(rect);
    }

    public void m0(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f31487a.setLabeledBy(view);
        }
    }

    public void n(Rect rect) {
        this.f31487a.getBoundsInScreen(rect);
    }

    public void n0(boolean z10) {
        this.f31487a.setLongClickable(z10);
    }

    public int o() {
        return this.f31487a.getChildCount();
    }

    public void o0(CharSequence charSequence) {
        this.f31487a.setPackageName(charSequence);
    }

    public CharSequence p() {
        return this.f31487a.getClassName();
    }

    public void p0(CharSequence charSequence) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            this.f31487a.setPaneTitle(charSequence);
        } else if (i10 >= 19) {
            this.f31487a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void q0(View view) {
        this.f31488b = -1;
        this.f31487a.setParent(view);
    }

    public CharSequence r() {
        return this.f31487a.getContentDescription();
    }

    public void r0(View view, int i10) {
        this.f31488b = i10;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f31487a.setParent(view, i10);
        }
    }

    public Bundle s() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f31487a.getExtras();
        }
        return new Bundle();
    }

    public void s0(d dVar) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f31487a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) dVar.f31508a);
        }
    }

    public void t0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f31487a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        m(rect);
        sb2.append("; boundsInParent: " + rect);
        n(rect);
        sb2.append("; boundsInScreen: " + rect);
        sb2.append("; packageName: ");
        sb2.append(u());
        sb2.append("; className: ");
        sb2.append(p());
        sb2.append("; text: ");
        sb2.append(w());
        sb2.append("; contentDescription: ");
        sb2.append(r());
        sb2.append("; viewId: ");
        sb2.append(x());
        sb2.append("; checkable: ");
        sb2.append(B());
        sb2.append("; checked: ");
        sb2.append(C());
        sb2.append("; focusable: ");
        sb2.append(F());
        sb2.append("; focused: ");
        sb2.append(G());
        sb2.append("; selected: ");
        sb2.append(K());
        sb2.append("; clickable: ");
        sb2.append(D());
        sb2.append("; longClickable: ");
        sb2.append(H());
        sb2.append("; enabled: ");
        sb2.append(E());
        sb2.append("; password: ");
        sb2.append(I());
        sb2.append("; scrollable: " + J());
        sb2.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<a> i10 = i();
            for (int i11 = 0; i11 < i10.size(); i11++) {
                a aVar = i10.get(i11);
                String j10 = j(aVar.b());
                if (j10.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                    j10 = aVar.c().toString();
                }
                sb2.append(j10);
                if (i11 != i10.size() - 1) {
                    sb2.append(", ");
                }
            }
        } else {
            int k10 = k();
            while (k10 != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(k10);
                k10 &= ~numberOfTrailingZeros;
                sb2.append(j(numberOfTrailingZeros));
                if (k10 != 0) {
                    sb2.append(", ");
                }
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public CharSequence u() {
        return this.f31487a.getPackageName();
    }

    public void u0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f31487a.setScreenReaderFocusable(z10);
        } else {
            V(1, z10);
        }
    }

    public void v0(boolean z10) {
        this.f31487a.setScrollable(z10);
    }

    public CharSequence w() {
        if (y()) {
            List<Integer> h10 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> h11 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> h12 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> h13 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f31487a.getText(), 0, this.f31487a.getText().length()));
            for (int i10 = 0; i10 < h10.size(); i10++) {
                spannableString.setSpan(new i0.a(h13.get(i10).intValue(), this, s().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), h10.get(i10).intValue(), h11.get(i10).intValue(), h12.get(i10).intValue());
            }
            return spannableString;
        }
        return this.f31487a.getText();
    }

    public void w0(boolean z10) {
        this.f31487a.setSelected(z10);
    }

    public String x() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f31487a.getViewIdResourceName();
        }
        return null;
    }

    public void x0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f31487a.setShowingHintText(z10);
        } else {
            V(4, z10);
        }
    }

    public void y0(View view) {
        this.f31489c = -1;
        this.f31487a.setSource(view);
    }

    public void z0(View view, int i10) {
        this.f31489c = i10;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f31487a.setSource(view, i10);
        }
    }
}
