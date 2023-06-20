package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.savedstate.SavedStateRegistry;

/* loaded from: classes.dex */
final class SavedStateHandleController implements m {

    /* renamed from: a  reason: collision with root package name */
    private final String f3343a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f3344b = false;

    /* renamed from: c  reason: collision with root package name */
    private final b0 f3345c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a implements SavedStateRegistry.a {
        a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.a
        public void a(androidx.savedstate.c cVar) {
            if (cVar instanceof h0) {
                g0 viewModelStore = ((h0) cVar).getViewModelStore();
                SavedStateRegistry savedStateRegistry = cVar.getSavedStateRegistry();
                for (String str : viewModelStore.c()) {
                    SavedStateHandleController.g(viewModelStore.b(str), savedStateRegistry, cVar.getLifecycle());
                }
                if (viewModelStore.c().isEmpty()) {
                    return;
                }
                savedStateRegistry.e(a.class);
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    SavedStateHandleController(String str, b0 b0Var) {
        this.f3343a = str;
        this.f3345c = b0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(e0 e0Var, SavedStateRegistry savedStateRegistry, i iVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) e0Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.l()) {
            return;
        }
        savedStateHandleController.i(savedStateRegistry, iVar);
        m(savedStateRegistry, iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SavedStateHandleController j(SavedStateRegistry savedStateRegistry, i iVar, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, b0.a(savedStateRegistry.a(str), bundle));
        savedStateHandleController.i(savedStateRegistry, iVar);
        m(savedStateRegistry, iVar);
        return savedStateHandleController;
    }

    private static void m(final SavedStateRegistry savedStateRegistry, final i iVar) {
        i.c b10 = iVar.b();
        if (b10 != i.c.INITIALIZED && !b10.a(i.c.STARTED)) {
            iVar.a(new m() { // from class: androidx.lifecycle.SavedStateHandleController.1
                @Override // androidx.lifecycle.m
                public void b(p pVar, i.b bVar) {
                    if (bVar == i.b.ON_START) {
                        i.this.c(this);
                        savedStateRegistry.e(a.class);
                    }
                }
            });
        } else {
            savedStateRegistry.e(a.class);
        }
    }

    @Override // androidx.lifecycle.m
    public void b(p pVar, i.b bVar) {
        if (bVar == i.b.ON_DESTROY) {
            this.f3344b = false;
            pVar.getLifecycle().c(this);
        }
    }

    void i(SavedStateRegistry savedStateRegistry, i iVar) {
        if (!this.f3344b) {
            this.f3344b = true;
            iVar.a(this);
            savedStateRegistry.d(this.f3343a, this.f3345c.b());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0 k() {
        return this.f3345c;
    }

    boolean l() {
        return this.f3344b;
    }
}
