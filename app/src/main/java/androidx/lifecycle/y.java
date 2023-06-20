package androidx.lifecycle;

import androidx.lifecycle.i;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: OnLifecycleEvent.java */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Deprecated
/* loaded from: classes.dex */
public @interface y {
    i.b value();
}
