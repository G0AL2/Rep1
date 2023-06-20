package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.p;

/* loaded from: classes.dex */
class FragmentStateAdapter$5 implements m {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Handler f4321a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Runnable f4322b;

    @Override // androidx.lifecycle.m
    public void b(p pVar, i.b bVar) {
        if (bVar == i.b.ON_DESTROY) {
            this.f4321a.removeCallbacks(this.f4322b);
            pVar.getLifecycle().c(this);
        }
    }
}
