package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: FragmentHostCallback.java */
/* loaded from: classes.dex */
public abstract class j<E> extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f3153a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f3154b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f3155c;

    /* renamed from: d  reason: collision with root package name */
    final FragmentManager f3156d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(d dVar) {
        this(dVar, dVar, new Handler(), 0);
    }

    @Override // androidx.fragment.app.f
    public View c(int i10) {
        return null;
    }

    @Override // androidx.fragment.app.f
    public boolean d() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Activity e() {
        return this.f3153a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context f() {
        return this.f3154b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Handler g() {
        return this.f3155c;
    }

    public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract E i();

    public LayoutInflater j() {
        return LayoutInflater.from(this.f3154b);
    }

    @Deprecated
    public void k(Fragment fragment, String[] strArr, int i10) {
    }

    public boolean l(Fragment fragment) {
        return true;
    }

    public boolean m(String str) {
        return false;
    }

    public void n(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            androidx.core.content.b.k(this.f3154b, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    @Deprecated
    public void o(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        if (i10 == -1) {
            androidx.core.app.a.v(this.f3153a, intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    }

    public void p() {
    }

    j(Activity activity, Context context, Handler handler, int i10) {
        this.f3156d = new m();
        this.f3153a = activity;
        this.f3154b = (Context) h0.g.g(context, "context == null");
        this.f3155c = (Handler) h0.g.g(handler, "handler == null");
    }
}
