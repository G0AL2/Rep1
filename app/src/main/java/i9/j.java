package i9;

import android.content.Context;
import da.l;
import da.t;
import i9.u;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: DefaultMediaSourceFactory.java */
/* loaded from: classes2.dex */
public final class j implements u.a {

    /* renamed from: a  reason: collision with root package name */
    private final l.a f31674a;

    /* compiled from: DefaultMediaSourceFactory.java */
    /* loaded from: classes2.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final l.a f31675a;

        public a(l.a aVar, p8.n nVar) {
            this.f31675a = aVar;
            new HashMap();
            new HashSet();
            new HashMap();
        }
    }

    public j(Context context, p8.n nVar) {
        this(new t.a(context), nVar);
    }

    public j(l.a aVar, p8.n nVar) {
        this.f31674a = aVar;
        new a(aVar, nVar);
    }
}
