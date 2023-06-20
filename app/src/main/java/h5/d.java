package h5;

import android.util.Log;
import h5.b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ForwardingControllerListener2.java */
/* loaded from: classes.dex */
public class d<I> extends a<I> {

    /* renamed from: a  reason: collision with root package name */
    private final List<b<I>> f31103a = new ArrayList(2);

    private synchronized void w(String str, Throwable th) {
        Log.e("FwdControllerListener2", str, th);
    }

    @Override // h5.a, h5.b
    public void b(String str, b.a aVar) {
        int size = this.f31103a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                b<I> bVar = this.f31103a.get(i10);
                if (bVar != null) {
                    bVar.b(str, aVar);
                }
            } catch (Exception e10) {
                w("ForwardingControllerListener2 exception in onRelease", e10);
            }
        }
    }

    @Override // h5.a, h5.b
    public void d(String str, Object obj, b.a aVar) {
        int size = this.f31103a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                b<I> bVar = this.f31103a.get(i10);
                if (bVar != null) {
                    bVar.d(str, obj, aVar);
                }
            } catch (Exception e10) {
                w("ForwardingControllerListener2 exception in onSubmit", e10);
            }
        }
    }

    @Override // h5.a, h5.b
    public void e(String str, Throwable th, b.a aVar) {
        int size = this.f31103a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                b<I> bVar = this.f31103a.get(i10);
                if (bVar != null) {
                    bVar.e(str, th, aVar);
                }
            } catch (Exception e10) {
                w("ForwardingControllerListener2 exception in onFailure", e10);
            }
        }
    }

    @Override // h5.a, h5.b
    public void h(String str, I i10, b.a aVar) {
        int size = this.f31103a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                b<I> bVar = this.f31103a.get(i11);
                if (bVar != null) {
                    bVar.h(str, i10, aVar);
                }
            } catch (Exception e10) {
                w("ForwardingControllerListener2 exception in onFinalImageSet", e10);
            }
        }
    }

    public synchronized void q(b<I> bVar) {
        this.f31103a.add(bVar);
    }

    public synchronized void y(b<I> bVar) {
        int indexOf = this.f31103a.indexOf(bVar);
        if (indexOf != -1) {
            this.f31103a.remove(indexOf);
        }
    }
}
