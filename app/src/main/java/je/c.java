package je;

import ee.o;
import ee.u;
import ie.g;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import pe.p;
import qe.k;
import qe.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IntrinsicsJvm.kt */
/* loaded from: classes3.dex */
public class c {

    /* compiled from: IntrinsicsJvm.kt */
    /* loaded from: classes3.dex */
    public static final class a extends j {

        /* renamed from: a  reason: collision with root package name */
        private int f33104a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f33105b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f33106c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ie.d dVar, p pVar, Object obj) {
            super(dVar);
            this.f33105b = pVar;
            this.f33106c = obj;
            k.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f33104a;
            if (i10 == 0) {
                this.f33104a = 1;
                o.b(obj);
                k.d(this.f33105b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1>, kotlin.Any?>");
                return ((p) w.b(this.f33105b, 2)).invoke(this.f33106c, this);
            } else if (i10 == 1) {
                this.f33104a = 2;
                o.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        private int f33107a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f33108b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f33109c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ie.d dVar, g gVar, p pVar, Object obj) {
            super(dVar, gVar);
            this.f33108b = pVar;
            this.f33109c = obj;
            k.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f33107a;
            if (i10 == 0) {
                this.f33107a = 1;
                o.b(obj);
                k.d(this.f33108b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1>, kotlin.Any?>");
                return ((p) w.b(this.f33108b, 2)).invoke(this.f33109c, this);
            } else if (i10 == 1) {
                this.f33107a = 2;
                o.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    public static <R, T> ie.d<u> a(p<? super R, ? super ie.d<? super T>, ? extends Object> pVar, R r10, ie.d<? super T> dVar) {
        k.f(pVar, "<this>");
        k.f(dVar, "completion");
        ie.d<?> a10 = h.a(dVar);
        if (pVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) pVar).create(r10, a10);
        }
        g context = a10.getContext();
        if (context == ie.h.f31938a) {
            return new a(a10, pVar, r10);
        }
        return new b(a10, context, pVar, r10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> ie.d<T> b(ie.d<? super T> dVar) {
        ie.d<T> dVar2;
        k.f(dVar, "<this>");
        kotlin.coroutines.jvm.internal.d dVar3 = dVar instanceof kotlin.coroutines.jvm.internal.d ? (kotlin.coroutines.jvm.internal.d) dVar : null;
        return (dVar3 == null || (dVar2 = (ie.d<T>) dVar3.intercepted()) == null) ? dVar : dVar2;
    }
}
