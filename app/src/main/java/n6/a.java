package n6;

import com.facebook.react.bridge.WritableMap;

/* compiled from: HeadlessJsTaskConfig.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f34646a;

    /* renamed from: b  reason: collision with root package name */
    private final WritableMap f34647b;

    /* renamed from: c  reason: collision with root package name */
    private final long f34648c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f34649d;

    /* renamed from: e  reason: collision with root package name */
    private final d f34650e;

    public a(String str, WritableMap writableMap, long j10, boolean z10, d dVar) {
        this.f34646a = str;
        this.f34647b = writableMap;
        this.f34648c = j10;
        this.f34649d = z10;
        this.f34650e = dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WritableMap a() {
        return this.f34647b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d b() {
        return this.f34650e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        return this.f34646a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long d() {
        return this.f34648c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return this.f34649d;
    }

    public a(a aVar) {
        this.f34646a = aVar.f34646a;
        this.f34647b = aVar.f34647b.copy();
        this.f34648c = aVar.f34648c;
        this.f34649d = aVar.f34649d;
        d dVar = aVar.f34650e;
        if (dVar != null) {
            this.f34650e = dVar.copy();
        } else {
            this.f34650e = null;
        }
    }
}
