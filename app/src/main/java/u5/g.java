package u5;

import com.google.android.gms.common.api.Api;
import java.util.Collections;
import java.util.List;
import w5.i;
import w5.j;
import y3.k;

/* compiled from: SimpleProgressiveJpegConfig.java */
/* loaded from: classes.dex */
public class g implements e {

    /* renamed from: a  reason: collision with root package name */
    private final c f37579a;

    /* compiled from: SimpleProgressiveJpegConfig.java */
    /* loaded from: classes.dex */
    private static class b implements c {
        private b() {
        }

        @Override // u5.g.c
        public List<Integer> a() {
            return Collections.EMPTY_LIST;
        }

        @Override // u5.g.c
        public int b() {
            return 0;
        }
    }

    /* compiled from: SimpleProgressiveJpegConfig.java */
    /* loaded from: classes.dex */
    public interface c {
        List<Integer> a();

        int b();
    }

    public g() {
        this(new b());
    }

    @Override // u5.e
    public int a(int i10) {
        List<Integer> a10 = this.f37579a.a();
        if (a10 == null || a10.isEmpty()) {
            return i10 + 1;
        }
        for (int i11 = 0; i11 < a10.size(); i11++) {
            if (a10.get(i11).intValue() > i10) {
                return a10.get(i11).intValue();
            }
        }
        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Override // u5.e
    public j b(int i10) {
        return i.d(i10, i10 >= this.f37579a.b(), false);
    }

    public g(c cVar) {
        this.f37579a = (c) k.g(cVar);
    }
}
