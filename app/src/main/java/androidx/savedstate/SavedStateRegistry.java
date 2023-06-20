package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import androidx.savedstate.Recreator;
import java.util.Map;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class SavedStateRegistry {

    /* renamed from: b  reason: collision with root package name */
    private Bundle f4069b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4070c;

    /* renamed from: d  reason: collision with root package name */
    private Recreator.a f4071d;

    /* renamed from: a  reason: collision with root package name */
    private l.b<String, b> f4068a = new l.b<>();

    /* renamed from: e  reason: collision with root package name */
    boolean f4072e = true;

    /* loaded from: classes.dex */
    public interface a {
        void a(c cVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        Bundle a();
    }

    public Bundle a(String str) {
        if (this.f4070c) {
            Bundle bundle = this.f4069b;
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle(str);
                this.f4069b.remove(str);
                if (this.f4069b.isEmpty()) {
                    this.f4069b = null;
                }
                return bundle2;
            }
            return null;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(i iVar, Bundle bundle) {
        if (!this.f4070c) {
            if (bundle != null) {
                this.f4069b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            iVar.a(new m() { // from class: androidx.savedstate.SavedStateRegistry.1
                @Override // androidx.lifecycle.m
                public void b(p pVar, i.b bVar) {
                    if (bVar == i.b.ON_START) {
                        SavedStateRegistry.this.f4072e = true;
                    } else if (bVar == i.b.ON_STOP) {
                        SavedStateRegistry.this.f4072e = false;
                    }
                }
            });
            this.f4070c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f4069b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        l.b<String, b>.d g10 = this.f4068a.g();
        while (g10.hasNext()) {
            Map.Entry next = g10.next();
            bundle2.putBundle((String) next.getKey(), ((b) next.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public void d(String str, b bVar) {
        if (this.f4068a.j(str, bVar) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void e(Class<? extends a> cls) {
        if (this.f4072e) {
            if (this.f4071d == null) {
                this.f4071d = new Recreator.a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                this.f4071d.b(cls.getName());
                return;
            } catch (NoSuchMethodException e10) {
                throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
}
