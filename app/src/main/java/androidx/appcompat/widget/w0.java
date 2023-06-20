package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: TintContextWrapper.java */
/* loaded from: classes.dex */
public class w0 extends ContextWrapper {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f1746c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static ArrayList<WeakReference<w0>> f1747d;

    /* renamed from: a  reason: collision with root package name */
    private final Resources f1748a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources.Theme f1749b;

    private w0(Context context) {
        super(context);
        if (f1.c()) {
            f1 f1Var = new f1(this, context.getResources());
            this.f1748a = f1Var;
            Resources.Theme newTheme = f1Var.newTheme();
            this.f1749b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f1748a = new y0(this, context.getResources());
        this.f1749b = null;
    }

    private static boolean a(Context context) {
        if ((context instanceof w0) || (context.getResources() instanceof y0) || (context.getResources() instanceof f1)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || f1.c();
    }

    public static Context b(Context context) {
        if (a(context)) {
            synchronized (f1746c) {
                ArrayList<WeakReference<w0>> arrayList = f1747d;
                if (arrayList == null) {
                    f1747d = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<w0> weakReference = f1747d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f1747d.remove(size);
                        }
                    }
                    for (int size2 = f1747d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<w0> weakReference2 = f1747d.get(size2);
                        w0 w0Var = weakReference2 != null ? weakReference2.get() : null;
                        if (w0Var != null && w0Var.getBaseContext() == context) {
                            return w0Var;
                        }
                    }
                }
                w0 w0Var2 = new w0(context);
                f1747d.add(new WeakReference<>(w0Var2));
                return w0Var2;
            }
        }
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1748a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1748a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1749b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.f1749b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
