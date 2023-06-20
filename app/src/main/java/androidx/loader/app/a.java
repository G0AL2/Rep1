package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.h0;
import androidx.lifecycle.p;
import androidx.loader.content.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: LoaderManager.java */
/* loaded from: classes.dex */
public abstract class a {

    /* compiled from: LoaderManager.java */
    /* renamed from: androidx.loader.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0062a<D> {
        c<D> onCreateLoader(int i10, Bundle bundle);

        void onLoadFinished(c<D> cVar, D d10);

        void onLoaderReset(c<D> cVar);
    }

    public static <T extends p & h0> a b(T t10) {
        return new b(t10, t10.getViewModelStore());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract <D> c<D> c(int i10, Bundle bundle, InterfaceC0062a<D> interfaceC0062a);

    public abstract void d();
}
