package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f698a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayDeque<b> f699b = new ArrayDeque<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements m, androidx.activity.a {

        /* renamed from: a  reason: collision with root package name */
        private final i f700a;

        /* renamed from: b  reason: collision with root package name */
        private final b f701b;

        /* renamed from: c  reason: collision with root package name */
        private androidx.activity.a f702c;

        LifecycleOnBackPressedCancellable(i iVar, b bVar) {
            this.f700a = iVar;
            this.f701b = bVar;
            iVar.a(this);
        }

        @Override // androidx.lifecycle.m
        public void b(p pVar, i.b bVar) {
            if (bVar == i.b.ON_START) {
                this.f702c = OnBackPressedDispatcher.this.b(this.f701b);
            } else if (bVar == i.b.ON_STOP) {
                androidx.activity.a aVar = this.f702c;
                if (aVar != null) {
                    aVar.cancel();
                }
            } else if (bVar == i.b.ON_DESTROY) {
                cancel();
            }
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f700a.c(this);
            this.f701b.e(this);
            androidx.activity.a aVar = this.f702c;
            if (aVar != null) {
                aVar.cancel();
                this.f702c = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements androidx.activity.a {

        /* renamed from: a  reason: collision with root package name */
        private final b f704a;

        a(b bVar) {
            this.f704a = bVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.f699b.remove(this.f704a);
            this.f704a.e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f698a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    public void a(p pVar, b bVar) {
        i lifecycle = pVar.getLifecycle();
        if (lifecycle.b() == i.c.DESTROYED) {
            return;
        }
        bVar.a(new LifecycleOnBackPressedCancellable(lifecycle, bVar));
    }

    androidx.activity.a b(b bVar) {
        this.f699b.add(bVar);
        a aVar = new a(bVar);
        bVar.a(aVar);
        return aVar;
    }

    public void c() {
        Iterator<b> descendingIterator = this.f699b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.c()) {
                next.b();
                return;
            }
        }
        Runnable runnable = this.f698a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
