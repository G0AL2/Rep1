package o0;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.m;

/* compiled from: EmojiEditableFactory.java */
/* loaded from: classes.dex */
final class b extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f34842a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static volatile Editable.Factory f34843b;

    /* renamed from: c  reason: collision with root package name */
    private static Class<?> f34844c;

    @SuppressLint({"PrivateApi"})
    private b() {
        try {
            f34844c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f34843b == null) {
            synchronized (f34842a) {
                if (f34843b == null) {
                    f34843b = new b();
                }
            }
        }
        return f34843b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f34844c;
        if (cls != null) {
            return m.c(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
