package r4;

import android.graphics.drawable.Animatable;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ForwardingControllerListener.java */
/* loaded from: classes.dex */
public class f<INFO> implements d<INFO> {

    /* renamed from: a  reason: collision with root package name */
    private final List<d<? super INFO>> f36230a = new ArrayList(2);

    private synchronized void d(String str, Throwable th) {
        Log.e("FdingControllerListener", str, th);
    }

    @Override // r4.d
    public void a(String str, INFO info) {
        int size = this.f36230a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                d<? super INFO> dVar = this.f36230a.get(i10);
                if (dVar != null) {
                    dVar.a(str, info);
                }
            } catch (Exception e10) {
                d("InternalListener exception in onIntermediateImageSet", e10);
            }
        }
    }

    public synchronized void b(d<? super INFO> dVar) {
        this.f36230a.add(dVar);
    }

    public synchronized void c() {
        this.f36230a.clear();
    }

    @Override // r4.d
    public synchronized void f(String str, Throwable th) {
        int size = this.f36230a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                d<? super INFO> dVar = this.f36230a.get(i10);
                if (dVar != null) {
                    dVar.f(str, th);
                }
            } catch (Exception e10) {
                d("InternalListener exception in onFailure", e10);
            }
        }
    }

    @Override // r4.d
    public synchronized void g(String str) {
        int size = this.f36230a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                d<? super INFO> dVar = this.f36230a.get(i10);
                if (dVar != null) {
                    dVar.g(str);
                }
            } catch (Exception e10) {
                d("InternalListener exception in onRelease", e10);
            }
        }
    }

    @Override // r4.d
    public synchronized void l(String str, INFO info, Animatable animatable) {
        int size = this.f36230a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                d<? super INFO> dVar = this.f36230a.get(i10);
                if (dVar != null) {
                    dVar.l(str, info, animatable);
                }
            } catch (Exception e10) {
                d("InternalListener exception in onFinalImageSet", e10);
            }
        }
    }

    @Override // r4.d
    public synchronized void p(String str, Object obj) {
        int size = this.f36230a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                d<? super INFO> dVar = this.f36230a.get(i10);
                if (dVar != null) {
                    dVar.p(str, obj);
                }
            } catch (Exception e10) {
                d("InternalListener exception in onSubmit", e10);
            }
        }
    }

    @Override // r4.d
    public void q(String str, Throwable th) {
        int size = this.f36230a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                d<? super INFO> dVar = this.f36230a.get(i10);
                if (dVar != null) {
                    dVar.q(str, th);
                }
            } catch (Exception e10) {
                d("InternalListener exception in onIntermediateImageFailed", e10);
            }
        }
    }
}
