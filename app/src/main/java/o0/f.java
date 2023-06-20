package o0;

import android.os.Build;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: EmojiTextViewHelper.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final b f34853a;

    /* compiled from: EmojiTextViewHelper.java */
    /* loaded from: classes.dex */
    private static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final TextView f34854a;

        /* renamed from: b  reason: collision with root package name */
        private final d f34855b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f34856c = true;

        a(TextView textView) {
            this.f34854a = textView;
            this.f34855b = new d(textView);
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f34855b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f34855b;
            return inputFilterArr2;
        }

        private SparseArray<InputFilter> g(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                if (inputFilterArr[i10] instanceof d) {
                    sparseArray.put(i10, inputFilterArr[i10]);
                }
            }
            return sparseArray;
        }

        private InputFilter[] h(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> g10 = g(inputFilterArr);
            if (g10.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - g10.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (g10.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        private void k() {
            this.f34854a.setFilters(a(this.f34854a.getFilters()));
        }

        private TransformationMethod m(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod);
        }

        @Override // o0.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.f34856c) {
                return h(inputFilterArr);
            }
            return f(inputFilterArr);
        }

        @Override // o0.f.b
        public boolean b() {
            return this.f34856c;
        }

        @Override // o0.f.b
        void c(boolean z10) {
            if (z10) {
                l();
            }
        }

        @Override // o0.f.b
        void d(boolean z10) {
            this.f34856c = z10;
            l();
            k();
        }

        @Override // o0.f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            if (this.f34856c) {
                return m(transformationMethod);
            }
            return j(transformationMethod);
        }

        void i(boolean z10) {
            this.f34856c = z10;
        }

        void l() {
            this.f34854a.setTransformationMethod(e(this.f34854a.getTransformationMethod()));
        }
    }

    /* compiled from: EmojiTextViewHelper.java */
    /* loaded from: classes.dex */
    static class b {
        b() {
        }

        InputFilter[] a(InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        public boolean b() {
            return false;
        }

        void c(boolean z10) {
        }

        void d(boolean z10) {
        }

        TransformationMethod e(TransformationMethod transformationMethod) {
            return transformationMethod;
        }
    }

    /* compiled from: EmojiTextViewHelper.java */
    /* loaded from: classes.dex */
    private static class c extends b {

        /* renamed from: a  reason: collision with root package name */
        private final a f34857a;

        c(TextView textView) {
            this.f34857a = new a(textView);
        }

        private boolean f() {
            return !androidx.emoji2.text.d.h();
        }

        @Override // o0.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.f34857a.a(inputFilterArr);
        }

        @Override // o0.f.b
        public boolean b() {
            return this.f34857a.b();
        }

        @Override // o0.f.b
        void c(boolean z10) {
            if (f()) {
                return;
            }
            this.f34857a.c(z10);
        }

        @Override // o0.f.b
        void d(boolean z10) {
            if (f()) {
                this.f34857a.i(z10);
            } else {
                this.f34857a.d(z10);
            }
        }

        @Override // o0.f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.f34857a.e(transformationMethod);
        }
    }

    public f(TextView textView, boolean z10) {
        h0.g.g(textView, "textView cannot be null");
        if (Build.VERSION.SDK_INT < 19) {
            this.f34853a = new b();
        } else if (!z10) {
            this.f34853a = new c(textView);
        } else {
            this.f34853a = new a(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f34853a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f34853a.b();
    }

    public void c(boolean z10) {
        this.f34853a.c(z10);
    }

    public void d(boolean z10) {
        this.f34853a.d(z10);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.f34853a.e(transformationMethod);
    }
}
