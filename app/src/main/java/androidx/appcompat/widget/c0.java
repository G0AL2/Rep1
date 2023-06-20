package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatTextViewAutoSizeHelper.java */
/* loaded from: classes.dex */
public class c0 {

    /* renamed from: l  reason: collision with root package name */
    private static final RectF f1451l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: m  reason: collision with root package name */
    private static ConcurrentHashMap<String, Method> f1452m = new ConcurrentHashMap<>();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: n  reason: collision with root package name */
    private static ConcurrentHashMap<String, Field> f1453n = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private int f1454a = 0;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1455b = false;

    /* renamed from: c  reason: collision with root package name */
    private float f1456c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f1457d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    private float f1458e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    private int[] f1459f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private boolean f1460g = false;

    /* renamed from: h  reason: collision with root package name */
    private TextPaint f1461h;

    /* renamed from: i  reason: collision with root package name */
    private final TextView f1462i;

    /* renamed from: j  reason: collision with root package name */
    private final Context f1463j;

    /* renamed from: k  reason: collision with root package name */
    private final c f1464k;

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    private static class a extends c {
        a() {
        }

        @Override // androidx.appcompat.widget.c0.c
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) c0.r(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    private static class b extends a {
        b() {
        }

        @Override // androidx.appcompat.widget.c0.a, androidx.appcompat.widget.c0.c
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.c0.c
        boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    public static class c {
        c() {
        }

        void a(StaticLayout.Builder builder, TextView textView) {
        }

        boolean b(TextView textView) {
            return ((Boolean) c0.r(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0(TextView textView) {
        this.f1462i = textView;
        this.f1463j = textView.getContext();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            this.f1464k = new b();
        } else if (i10 >= 23) {
            this.f1464k = new a();
        } else {
            this.f1464k = new c();
        }
    }

    private void A(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f1459f = c(iArr);
            B();
        }
    }

    private boolean B() {
        int[] iArr = this.f1459f;
        int length = iArr.length;
        boolean z10 = length > 0;
        this.f1460g = z10;
        if (z10) {
            this.f1454a = 1;
            this.f1457d = iArr[0];
            this.f1458e = iArr[length - 1];
            this.f1456c = -1.0f;
        }
        return z10;
    }

    private boolean C(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1462i.getText();
        TransformationMethod transformationMethod = this.f1462i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1462i)) != null) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f1462i.getMaxLines() : -1;
        q(i10);
        StaticLayout e10 = e(text, (Layout.Alignment) r(this.f1462i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (e10.getLineCount() <= maxLines && e10.getLineEnd(e10.getLineCount() - 1) == text.length())) && ((float) e10.getHeight()) <= rectF.bottom;
    }

    private boolean D() {
        return !(this.f1462i instanceof l);
    }

    private void E(float f10, float f11, float f12) throws IllegalArgumentException {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        } else if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        } else if (f12 > 0.0f) {
            this.f1454a = 1;
            this.f1457d = f10;
            this.f1458e = f11;
            this.f1456c = f12;
            this.f1460g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
    }

    private static <T> T a(Object obj, String str, T t10) {
        try {
            Field o10 = o(str);
            return o10 == null ? t10 : (T) o10.get(obj);
        } catch (IllegalAccessException e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e10);
            return t10;
        }
    }

    private int[] c(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    private void d() {
        this.f1454a = 0;
        this.f1457d = -1.0f;
        this.f1458e = -1.0f;
        this.f1456c = -1.0f;
        this.f1459f = new int[0];
        this.f1455b = false;
    }

    private StaticLayout f(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f1461h, i10);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f1462i.getLineSpacingExtra(), this.f1462i.getLineSpacingMultiplier()).setIncludePad(this.f1462i.getIncludeFontPadding()).setBreakStrategy(this.f1462i.getBreakStrategy()).setHyphenationFrequency(this.f1462i.getHyphenationFrequency());
        if (i11 == -1) {
            i11 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        hyphenationFrequency.setMaxLines(i11);
        try {
            this.f1464k.a(obtain, this.f1462i);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    private StaticLayout g(CharSequence charSequence, Layout.Alignment alignment, int i10) {
        return new StaticLayout(charSequence, this.f1461h, i10, alignment, ((Float) a(this.f1462i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) a(this.f1462i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) a(this.f1462i, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    private StaticLayout h(CharSequence charSequence, Layout.Alignment alignment, int i10) {
        return new StaticLayout(charSequence, this.f1461h, i10, alignment, this.f1462i.getLineSpacingMultiplier(), this.f1462i.getLineSpacingExtra(), this.f1462i.getIncludeFontPadding());
    }

    private int i(RectF rectF) {
        int length = this.f1459f.length;
        if (length != 0) {
            int i10 = length - 1;
            int i11 = 1;
            int i12 = 0;
            while (i11 <= i10) {
                int i13 = (i11 + i10) / 2;
                if (C(this.f1459f[i13], rectF)) {
                    int i14 = i13 + 1;
                    i12 = i11;
                    i11 = i14;
                } else {
                    i12 = i13 - 1;
                    i10 = i12;
                }
            }
            return this.f1459f[i12];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    private static Field o(String str) {
        try {
            Field field = f1453n.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f1453n.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e10);
            return null;
        }
    }

    private static Method p(String str) {
        try {
            Method method = f1452m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1452m.put(str, method);
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    static <T> T r(Object obj, String str, T t10) {
        try {
            return (T) p(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return t10;
        }
    }

    private void x(float f10) {
        if (f10 != this.f1462i.getPaint().getTextSize()) {
            this.f1462i.getPaint().setTextSize(f10);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f1462i.isInLayout() : false;
            if (this.f1462i.getLayout() != null) {
                this.f1455b = false;
                try {
                    Method p10 = p("nullLayouts");
                    if (p10 != null) {
                        p10.invoke(this.f1462i, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (!isInLayout) {
                    this.f1462i.requestLayout();
                } else {
                    this.f1462i.forceLayout();
                }
                this.f1462i.invalidate();
            }
        }
    }

    private boolean z() {
        if (D() && this.f1454a == 1) {
            if (!this.f1460g || this.f1459f.length == 0) {
                int floor = ((int) Math.floor((this.f1458e - this.f1457d) / this.f1456c)) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round(this.f1457d + (i10 * this.f1456c));
                }
                this.f1459f = c(iArr);
            }
            this.f1455b = true;
        } else {
            this.f1455b = false;
        }
        return this.f1455b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (s()) {
            if (this.f1455b) {
                if (this.f1462i.getMeasuredHeight() <= 0 || this.f1462i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f1464k.b(this.f1462i) ? 1048576 : (this.f1462i.getMeasuredWidth() - this.f1462i.getTotalPaddingLeft()) - this.f1462i.getTotalPaddingRight();
                int height = (this.f1462i.getHeight() - this.f1462i.getCompoundPaddingBottom()) - this.f1462i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f1451l;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float i10 = i(rectF);
                    if (i10 != this.f1462i.getTextSize()) {
                        y(0, i10);
                    }
                }
            }
            this.f1455b = true;
        }
    }

    StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 23) {
            return f(charSequence, alignment, i10, i11);
        }
        if (i12 >= 16) {
            return h(charSequence, alignment, i10);
        }
        return g(charSequence, alignment, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return Math.round(this.f1458e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return Math.round(this.f1457d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int l() {
        return Math.round(this.f1456c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] m() {
        return this.f1459f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int n() {
        return this.f1454a;
    }

    void q(int i10) {
        TextPaint textPaint = this.f1461h;
        if (textPaint == null) {
            this.f1461h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1461h.set(this.f1462i.getPaint());
        this.f1461h.setTextSize(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean s() {
        return D() && this.f1454a != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(AttributeSet attributeSet, int i10) {
        int resourceId;
        Context context = this.f1463j;
        int[] iArr = d.j.f28811d0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        TextView textView = this.f1462i;
        androidx.core.view.z.o0(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i10, 0);
        int i11 = d.j.f28836i0;
        if (obtainStyledAttributes.hasValue(i11)) {
            this.f1454a = obtainStyledAttributes.getInt(i11, 0);
        }
        int i12 = d.j.f28831h0;
        float dimension = obtainStyledAttributes.hasValue(i12) ? obtainStyledAttributes.getDimension(i12, -1.0f) : -1.0f;
        int i13 = d.j.f28821f0;
        float dimension2 = obtainStyledAttributes.hasValue(i13) ? obtainStyledAttributes.getDimension(i13, -1.0f) : -1.0f;
        int i14 = d.j.f28816e0;
        float dimension3 = obtainStyledAttributes.hasValue(i14) ? obtainStyledAttributes.getDimension(i14, -1.0f) : -1.0f;
        int i15 = d.j.f28826g0;
        if (obtainStyledAttributes.hasValue(i15) && (resourceId = obtainStyledAttributes.getResourceId(i15, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            A(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (D()) {
            if (this.f1454a == 1) {
                if (!this.f1460g) {
                    DisplayMetrics displayMetrics = this.f1463j.getResources().getDisplayMetrics();
                    if (dimension2 == -1.0f) {
                        dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    if (dimension3 == -1.0f) {
                        dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    if (dimension == -1.0f) {
                        dimension = 1.0f;
                    }
                    E(dimension2, dimension3, dimension);
                }
                z();
                return;
            }
            return;
        }
        this.f1454a = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (D()) {
            DisplayMetrics displayMetrics = this.f1463j.getResources().getDisplayMetrics();
            E(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (z()) {
                b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(int[] iArr, int i10) throws IllegalArgumentException {
        if (D()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1463j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                this.f1459f = c(iArr2);
                if (!B()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1460g = false;
            }
            if (z()) {
                b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(int i10) {
        if (D()) {
            if (i10 == 0) {
                d();
            } else if (i10 == 1) {
                DisplayMetrics displayMetrics = this.f1463j.getResources().getDisplayMetrics();
                E(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (z()) {
                    b();
                }
            } else {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(int i10, float f10) {
        Resources resources;
        Context context = this.f1463j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        x(TypedValue.applyDimension(i10, f10, resources.getDisplayMetrics()));
    }
}
