package androidx.work;

import android.annotation.SuppressLint;

/* compiled from: Operation.java */
/* loaded from: classes.dex */
public interface o {
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: a  reason: collision with root package name */
    public static final b.c f4726a = new b.c();
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: b  reason: collision with root package name */
    public static final b.C0089b f4727b = new b.C0089b();

    /* compiled from: Operation.java */
    /* loaded from: classes.dex */
    public static abstract class b {

        /* compiled from: Operation.java */
        /* loaded from: classes.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f4728a;

            public a(Throwable th) {
                this.f4728a = th;
            }

            public Throwable a() {
                return this.f4728a;
            }

            public String toString() {
                return "FAILURE (" + this.f4728a.getMessage() + ")";
            }
        }

        /* compiled from: Operation.java */
        /* renamed from: androidx.work.o$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0089b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C0089b() {
            }
        }

        /* compiled from: Operation.java */
        /* loaded from: classes.dex */
        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }

        b() {
        }
    }

    com.google.common.util.concurrent.c<b.c> a();
}
