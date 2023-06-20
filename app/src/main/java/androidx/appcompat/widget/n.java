package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: AppCompatEmojiTextHelper.java */
/* loaded from: classes.dex */
class n {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f1624a;

    /* renamed from: b  reason: collision with root package name */
    private final o0.f f1625b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(TextView textView) {
        this.f1624a = textView;
        this.f1625b = new o0.f(textView, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f1625b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f1625b.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f1624a.getContext().obtainStyledAttributes(attributeSet, d.j.f28811d0, i10, 0);
        try {
            int i11 = d.j.f28881r0;
            boolean z10 = obtainStyledAttributes.hasValue(i11) ? obtainStyledAttributes.getBoolean(i11, true) : true;
            obtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(boolean z10) {
        this.f1625b.c(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(boolean z10) {
        this.f1625b.d(z10);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.f1625b.e(transformationMethod);
    }
}
