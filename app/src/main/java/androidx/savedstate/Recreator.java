package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class Recreator implements m {

    /* renamed from: a  reason: collision with root package name */
    private final c f4066a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a implements SavedStateRegistry.b {

        /* renamed from: a  reason: collision with root package name */
        final Set<String> f4067a = new HashSet();

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(SavedStateRegistry savedStateRegistry) {
            savedStateRegistry.d("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f4067a));
            return bundle;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b(String str) {
            this.f4067a.add(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Recreator(c cVar) {
        this.f4066a = cVar;
    }

    private void g(String str) {
        Class cls;
        try {
            try {
                Constructor declaredConstructor = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.a.class).getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    ((SavedStateRegistry.a) declaredConstructor.newInstance(new Object[0])).a(this.f4066a);
                } catch (Exception e10) {
                    throw new RuntimeException("Failed to instantiate " + str, e10);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Class " + str + " wasn't found", e12);
        }
    }

    @Override // androidx.lifecycle.m
    public void b(p pVar, i.b bVar) {
        if (bVar == i.b.ON_CREATE) {
            pVar.getLifecycle().c(this);
            Bundle a10 = this.f4066a.getSavedStateRegistry().a("androidx.savedstate.Restarter");
            if (a10 == null) {
                return;
            }
            ArrayList<String> stringArrayList = a10.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    g(it.next());
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
