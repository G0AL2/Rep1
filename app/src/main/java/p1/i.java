package p1;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;

/* compiled from: LiveDataUtils.java */
/* loaded from: classes.dex */
public class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [In] */
    /* compiled from: LiveDataUtils.java */
    /* loaded from: classes.dex */
    public class a<In> implements androidx.lifecycle.x<In> {

        /* renamed from: a  reason: collision with root package name */
        Out f35449a = null;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q1.c f35450b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f35451c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m.a f35452d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.u f35453e;

        /* compiled from: LiveDataUtils.java */
        /* renamed from: p1.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0473a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Object f35454a;

            RunnableC0473a(Object obj) {
                this.f35454a = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, Out] */
            @Override // java.lang.Runnable
            public void run() {
                synchronized (a.this.f35451c) {
                    ?? apply = a.this.f35452d.apply(this.f35454a);
                    a aVar = a.this;
                    Out out = aVar.f35449a;
                    if (out == 0 && apply != 0) {
                        aVar.f35449a = apply;
                        aVar.f35453e.m(apply);
                    } else if (out != 0 && !out.equals(apply)) {
                        a aVar2 = a.this;
                        aVar2.f35449a = apply;
                        aVar2.f35453e.m(apply);
                    }
                }
            }
        }

        a(q1.c cVar, Object obj, m.a aVar, androidx.lifecycle.u uVar) {
            this.f35450b = cVar;
            this.f35451c = obj;
            this.f35452d = aVar;
            this.f35453e = uVar;
        }

        @Override // androidx.lifecycle.x
        public void a(In in) {
            this.f35450b.c(new RunnableC0473a(in));
        }
    }

    @SuppressLint({"LambdaLast"})
    public static <In, Out> LiveData<Out> a(LiveData<In> liveData, m.a<In, Out> aVar, q1.c cVar) {
        Object obj = new Object();
        androidx.lifecycle.u uVar = new androidx.lifecycle.u();
        uVar.p(liveData, new a(cVar, obj, aVar, uVar));
        return uVar;
    }
}
