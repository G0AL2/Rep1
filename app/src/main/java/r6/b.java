package r6;

import android.util.Pair;
import com.facebook.systrace.a;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SystraceRequestListener.java */
/* loaded from: classes.dex */
public class b extends y5.a {

    /* renamed from: a  reason: collision with root package name */
    int f36443a = 0;

    /* renamed from: b  reason: collision with root package name */
    Map<String, Pair<Integer, String>> f36444b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    Map<String, Pair<Integer, String>> f36445c = new HashMap();

    @Override // y5.a, y5.e
    public void a(b6.b bVar, Object obj, String str, boolean z10) {
        if (com.facebook.systrace.a.h(0L)) {
            Pair<Integer, String> create = Pair.create(Integer.valueOf(this.f36443a), "FRESCO_REQUEST_" + bVar.q().toString().replace(':', '_'));
            com.facebook.systrace.a.a(0L, (String) create.second, this.f36443a);
            this.f36445c.put(str, create);
            this.f36443a = this.f36443a + 1;
        }
    }

    @Override // y5.a, com.facebook.imagepipeline.producers.s0
    public void b(String str, String str2) {
        if (com.facebook.systrace.a.h(0L)) {
            Pair<Integer, String> create = Pair.create(Integer.valueOf(this.f36443a), "FRESCO_PRODUCER_" + str2.replace(':', '_'));
            com.facebook.systrace.a.a(0L, (String) create.second, this.f36443a);
            this.f36444b.put(str, create);
            this.f36443a = this.f36443a + 1;
        }
    }

    @Override // y5.a, com.facebook.imagepipeline.producers.s0
    public boolean c(String str) {
        return false;
    }

    @Override // y5.a, y5.e
    public void d(b6.b bVar, String str, Throwable th, boolean z10) {
        if (com.facebook.systrace.a.h(0L) && this.f36445c.containsKey(str)) {
            Pair<Integer, String> pair = this.f36445c.get(str);
            com.facebook.systrace.a.e(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f36445c.remove(str);
        }
    }

    @Override // y5.a, com.facebook.imagepipeline.producers.s0
    public void e(String str, String str2, Map<String, String> map) {
        if (com.facebook.systrace.a.h(0L) && this.f36444b.containsKey(str)) {
            Pair<Integer, String> pair = this.f36444b.get(str);
            com.facebook.systrace.a.e(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f36444b.remove(str);
        }
    }

    @Override // y5.a, com.facebook.imagepipeline.producers.s0
    public void f(String str, String str2, Throwable th, Map<String, String> map) {
        if (com.facebook.systrace.a.h(0L) && this.f36444b.containsKey(str)) {
            Pair<Integer, String> pair = this.f36444b.get(str);
            com.facebook.systrace.a.e(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f36444b.remove(str);
        }
    }

    @Override // y5.a, y5.e
    public void g(b6.b bVar, String str, boolean z10) {
        if (com.facebook.systrace.a.h(0L) && this.f36445c.containsKey(str)) {
            Pair<Integer, String> pair = this.f36445c.get(str);
            com.facebook.systrace.a.e(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f36445c.remove(str);
        }
    }

    @Override // y5.a, com.facebook.imagepipeline.producers.s0
    public void h(String str, String str2, Map<String, String> map) {
        if (com.facebook.systrace.a.h(0L) && this.f36444b.containsKey(str)) {
            Pair<Integer, String> pair = this.f36444b.get(str);
            com.facebook.systrace.a.e(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f36444b.remove(str);
        }
    }

    @Override // y5.a, com.facebook.imagepipeline.producers.s0
    public void j(String str, String str2, String str3) {
        if (com.facebook.systrace.a.h(0L)) {
            com.facebook.systrace.a.l(0L, "FRESCO_PRODUCER_EVENT_" + str.replace(':', '_') + "_" + str2.replace(':', '_') + "_" + str3.replace(':', '_'), a.EnumC0222a.THREAD);
        }
    }

    @Override // y5.a, y5.e
    public void k(String str) {
        if (com.facebook.systrace.a.h(0L) && this.f36445c.containsKey(str)) {
            Pair<Integer, String> pair = this.f36445c.get(str);
            com.facebook.systrace.a.e(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f36445c.remove(str);
        }
    }
}
