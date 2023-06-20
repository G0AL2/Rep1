package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a  reason: collision with root package name */
    private UUID f4388a;

    /* renamed from: b  reason: collision with root package name */
    private e f4389b;

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f4390c;

    /* renamed from: d  reason: collision with root package name */
    private a f4391d;

    /* renamed from: e  reason: collision with root package name */
    private int f4392e;

    /* renamed from: f  reason: collision with root package name */
    private Executor f4393f;

    /* renamed from: g  reason: collision with root package name */
    private q1.c f4394g;

    /* renamed from: h  reason: collision with root package name */
    private y f4395h;

    /* renamed from: i  reason: collision with root package name */
    private q f4396i;

    /* renamed from: j  reason: collision with root package name */
    private h f4397j;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public List<String> f4398a = Collections.emptyList();

        /* renamed from: b  reason: collision with root package name */
        public List<Uri> f4399b = Collections.emptyList();

        /* renamed from: c  reason: collision with root package name */
        public Network f4400c;
    }

    public WorkerParameters(UUID uuid, e eVar, Collection<String> collection, a aVar, int i10, int i11, Executor executor, q1.c cVar, y yVar, q qVar, h hVar) {
        this.f4388a = uuid;
        this.f4389b = eVar;
        this.f4390c = new HashSet(collection);
        this.f4391d = aVar;
        this.f4392e = i10;
        this.f4393f = executor;
        this.f4394g = cVar;
        this.f4395h = yVar;
        this.f4396i = qVar;
        this.f4397j = hVar;
    }

    public Executor a() {
        return this.f4393f;
    }

    public h b() {
        return this.f4397j;
    }

    public UUID c() {
        return this.f4388a;
    }

    public e d() {
        return this.f4389b;
    }

    public Network e() {
        return this.f4391d.f4400c;
    }

    public q f() {
        return this.f4396i;
    }

    public int g() {
        return this.f4392e;
    }

    public Set<String> h() {
        return this.f4390c;
    }

    public q1.c i() {
        return this.f4394g;
    }

    public List<String> j() {
        return this.f4391d.f4398a;
    }

    public List<Uri> k() {
        return this.f4391d.f4399b;
    }

    public y l() {
        return this.f4395h;
    }
}
