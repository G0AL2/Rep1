package c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;

/* compiled from: ActivityResultContract.java */
/* loaded from: classes.dex */
public abstract class a<I, O> {

    /* compiled from: ActivityResultContract.java */
    /* renamed from: c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0097a<T> {
        @SuppressLint({"UnknownNullness"})

        /* renamed from: a  reason: collision with root package name */
        private final T f5289a;

        public C0097a(@SuppressLint({"UnknownNullness"}) T t10) {
            this.f5289a = t10;
        }

        @SuppressLint({"UnknownNullness"})
        public T a() {
            return this.f5289a;
        }
    }

    public abstract Intent a(Context context, @SuppressLint({"UnknownNullness"}) I i10);

    public C0097a<O> b(Context context, @SuppressLint({"UnknownNullness"}) I i10) {
        return null;
    }

    @SuppressLint({"UnknownNullness"})
    public abstract O c(int i10, Intent intent);
}
